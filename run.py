import os
import subprocess
import shutil

def list_java_projects(directory):
    """List all directories (projects) in the specified directory that start with 'Class'."""
    try:
        print("Listing Java projects starting with 'Class' in the directory...")
        projects = [d for d in os.listdir(directory) 
                    if os.path.isdir(os.path.join(directory, d)) and d.startswith('Class')]
        return projects
    except Exception as e:
        print(f"An error occurred while listing projects: {e}")
        return []

def compile_java_files(base_dir):
    """Compile all Java files in the specified project directory, excluding .git directories."""
    print(f"Compiling Java files, Please wait a moment...") # Start Compilation process
    for class_folder in os.listdir(base_dir):
        class_folder_path = os.path.join(base_dir, class_folder)

        # Check if it is a directory and not .git
        if os.path.isdir(class_folder_path) and class_folder != '.git':
            src_path = os.path.join(class_folder_path, 'src', 'academy', 'teenfuture', 'crse')
            bin_path = os.path.join(class_folder_path, 'bin')

            # Remove existing bin directory if it exists
            if os.path.exists(bin_path):
                shutil.rmtree(bin_path)

            # Create the bin directory
            os.makedirs(bin_path)

            # Collect all Java files to compile
            all_java_files = []
            for root, _, files in os.walk(src_path):
                # Skip any .git directories
                if '.git' in root.split(os.path.sep):
                    continue
                for file in files:
                    if file.endswith('.java'):
                        file_path = os.path.join(root, file)
                        all_java_files.append(file_path)
                        #print(f"Found Java file: {file_path}")  # Log found files

            # Compile all Java files together to ensure dependencies are resolved
            if all_java_files:
                #print(f"Compiling Java files in {class_folder}...")  # Start message
                try:
                    subprocess.run(['javac', '-d', bin_path] + all_java_files, check=True)
                    #print("Compilation completed for project:", class_folder)  # End message
                except subprocess.CalledProcessError as e:
                    print(f"Error compiling Java files in {class_folder}: {e}")
    print("Compilation completed for all project")

def open_process_file(project_directory):
    """Run the process.py file using python3 after changing to the project directory."""
    process_file_path = os.path.join(project_directory, 'process.py')
    if os.path.isfile(process_file_path):
        print(f"\nChanging directory to {project_directory} and running {process_file_path}...")
        os.chdir(project_directory)  # Change to the project directory
        os.system(f"python3 {process_file_path}")
    else:
        print(f"No process.py file found in {project_directory}.")

if __name__ == "__main__":
    # Specify the current directory
    current_directory = os.getcwd()  # Get the current working directory

    print("Searching for Java projects...")
    projects = list_java_projects(current_directory)

    if not projects:
        print("No Java projects starting with 'Class' found in the current directory.")
    else:
        # Compile Java files in all found projects
        compile_java_files(current_directory)

        print("\nChoose a project to run process.py:")
        for index, project in enumerate(projects):
            print(f"{index + 1}: {project}")

        choice = input("\nEnter the number of your choice: ")

        if choice.isdigit() and 1 <= int(choice) <= len(projects):
            selected_project = projects[int(choice) - 1]
            project_directory = os.path.join(current_directory, selected_project)

            # Run process.py in the selected project
            open_process_file(project_directory)
        else:
            print("Invalid choice. Please enter a number corresponding to the list.")