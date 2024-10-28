import os
import subprocess
import shutil

try:
    from tqdm import tqdm
    tqdm_installed = True
except ImportError:
    tqdm_installed = False

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
    print("Compiling Java files, please wait...")  # Start Compilation process

    for class_folder in sorted(os.listdir(base_dir)):
        class_folder_path = os.path.join(base_dir, class_folder)

        if os.path.isdir(class_folder_path) and class_folder != '.git':
            # Change to the Class project directory
            os.chdir(class_folder_path)

            bin_path = os.path.join(class_folder_path, 'bin')

            if os.path.exists(bin_path):
                shutil.rmtree(bin_path)

            os.makedirs(bin_path)

            # Compile all .java files using wildcard
            try:
                subprocess.run(f'javac -d bin -sourcepath src src/academy/teenfuture/crse/*.java', shell=True, check=True)
                print(f"Compiled all Java files in {class_folder}")
            except subprocess.CalledProcessError as e:
                print(f"Error compiling Java files in {class_folder}: {e}")

    print("Compilation completed for all projects")

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
    current_directory = os.getcwd()  # Get the current working directory

    print("Searching for Java projects...")
    projects = list_java_projects(current_directory)

    if not projects:
        print("No Java projects starting with 'Class' found in the current directory.")
    else:
        compile_choice = input("Do you want to compile the Java files? (yes/no): ").strip().lower()
        if compile_choice in ['yes', 'y']:
            compile_java_files(current_directory)
        else:
            print("Skipping compilation.")

        print("\nChoose a project to run process.py:")
        for index, project in enumerate(projects):
            print(f"{index + 1}: {project}")

        choice = input("\nEnter the number of your choice: ")
        if choice.isdigit() and 1 <= int(choice) <= len(projects):
            selected_project = projects[int(choice) - 1]
            project_directory = os.path.join(current_directory, selected_project)
            open_process_file(project_directory)
        else:
            print("Invalid choice. Please enter a number corresponding to the list.")