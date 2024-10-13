import os
import subprocess

def list_problem_files_in_directory(directory):
    """List all 'Problem_' Java files in the specified directory."""
    try:
        print("Listing files in the directory...\n")
        files = os.listdir(directory)
        problem_files = [
            f for f in files
            if f.startswith('Problem_') and f.endswith('.java') and os.path.isfile(os.path.join(directory, f))
        ]
        return problem_files
    except Exception as e:
        print(f"An error occurred while listing files: {e}")
        return []

def list_java_files_in_subfolder(directory):
    """List all .java files in the specified subfolder."""
    try:
        print("Listing other classes in the subfolder...\n")  # Updated message
        files = os.listdir(directory)
        java_files = [
            f for f in files
            if f.endswith('.java') and os.path.isfile(os.path.join(directory, f))
        ]
        return java_files
    except Exception as e:
        print(f"An error occurred while listing files in the subfolder: {e}")
        return []

def display_files(file_list):
    """Display a numbered list of files for user selection."""
    print("Choose a file by entering the corresponding number:\n")
    for index, file in enumerate(file_list):
        print(f"{index + 1}: {file}")
    print()  # Add a newline for spacing

def execute_java_program(class_name, current_directory):
    """Execute the specified Java program."""
    try:
        print("Changing directory to 'bin'...\n")
        os.chdir(os.path.join(current_directory, 'bin'))
        command = ["java", "academy.teenfuture.crse." + class_name]
        print("Running Java program...\n")
        subprocess.run(command)  # Execute the command without capturing output
        print("Java program has finished running.\n")
    except Exception as e:
        print(f"An error occurred while executing the file: {e}")

def admin_mode(target_directory):
    """Admin mode for displaying and checking files."""
    while True:
        print("\n=================== Admin Mode ===================")
        print("Choose a file to display or type 'exit' to quit:\n")
        problem_file_list = list_problem_files_in_directory(target_directory)
        
        if not problem_file_list:
            print("No files starting with 'Problem_' found.\n")
            break

        display_files(problem_file_list)

        choice = input("Enter the number of the file to display or 'exit': ")
        
        if choice.lower() == 'exit':
            print("Exiting admin mode...\n")
            break
        elif choice.isdigit() and 1 <= int(choice) <= len(problem_file_list):
            selected_file = problem_file_list[int(choice) - 1]
            display_file_contents(os.path.join(target_directory, selected_file))
            
            # Create the expected subfolder name
            subfolder_name = selected_file[8:-5]  # Extract the portion between 'Problem_' and '.java'
            subfolder_path = os.path.join(target_directory, f'problem_{subfolder_name}')  # Construct the subfolder path
            
            # Inform the user about checking for other classes without showing the subfolder name
            print("Checking if there are any other classes in the subfolder...\n")
            
            if os.path.isdir(subfolder_path):
                print("Subfolder found. Some other classes may be present. Listing contents:\n")
                subfolder_files = list_java_files_in_subfolder(subfolder_path)
                
                if subfolder_files:
                    for subfile in subfolder_files:
                        display_file_contents(os.path.join(subfolder_path, subfile))
                else:
                    print("No Java files found in the subfolder.\n")
            else:
                print("No subfolder found.\n")

            # Prompt for further action after displaying subfolder contents
            action_choice = input("Press 1 to continue processing or 0 to exit: ")
            if action_choice == '0':
                print("Exiting admin mode...\n")
                break  # Exit admin mode
        else:
            print("Invalid choice. Please try again.\n")

def display_file_contents(file_path):
    """Display the contents of the specified file."""
    file_name = os.path.basename(file_path)  # Get only the file name
    print(f"\n=================== Displaying Contents of {file_name} ===================\n")
    try:
        with open(file_path, 'r') as file:
            contents = file.read()
            print(contents)
            print(f"\n=================== End of {file_name} ===================\n")
    except Exception as e:
        print(f"An error occurred while reading the file: {e}\n")

# Specify the base directory (adjust this to your actual path)
base_directory = os.getcwd()  # or specify the path like 'Class_6/src/academy/teenfuture/crse'
target_directory = os.path.join(base_directory, 'src', 'academy', 'teenfuture', 'crse')

print("Searching for 'Problem_' Java files...\n")
problem_file_list = list_problem_files_in_directory(target_directory)

if not problem_file_list:
    print("No files starting with 'Problem_' found.\n")
else:
    display_files(problem_file_list)
    choice = input("Enter the number of your choice: ")
    
    # Directly check for the admin mode input without showing it to the user
    if choice == '99':  # Admin mode trigger
        admin_mode(target_directory)
    elif choice.isdigit() and 1 <= int(choice) <= len(problem_file_list):
        selected_file = problem_file_list[int(choice) - 1]
        print(f"You selected: {selected_file}\n")
        
        class_name = selected_file[:-5]  # Remove '.java'
        execute_java_program(class_name, base_directory)
    else:
        print("Invalid choice. Please enter a number corresponding to the list.\n")