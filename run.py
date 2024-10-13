import os

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

def open_process_file(project_directory):
    """Run the process.py file using python3 after changing to the project directory."""
    process_file_path = os.path.join(project_directory, 'process.py')
    if os.path.isfile(process_file_path):
        print(f"\nChanging directory to {project_directory} and running {process_file_path}...")
        os.chdir(project_directory)  # Change to the project directory
        os.system(f"python3 {process_file_path}")
    else:
        print(f"No process.py file found in {project_directory}.")

# Specify the current directory
current_directory = os.getcwd()  # Get the current working directory

print("Searching for Java projects...")
projects = list_java_projects(current_directory)

if not projects:
    print("No Java projects starting with 'Class' found in the current directory.")
else:
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