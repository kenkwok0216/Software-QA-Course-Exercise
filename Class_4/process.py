import os
import subprocess
import time

def list_problem_files_in_directory(directory):
    try:
        print("Listing files in the directory...")
        files = os.listdir(directory)
        problem_files = [f for f in files if f.startswith('Problem_') and f.endswith('.java') and os.path.isfile(os.path.join(directory, f))]
        return problem_files
    except Exception as e:
        print(f"An error occurred while listing files: {e}")
        return []

# Specify the directory to search
current_directory = os.getcwd()  # Get the current working directory
target_directory = os.path.join(current_directory, 'src', 'academy', 'teenfuture', 'crse')

print("Searching for 'Problem_' Java files...")
problem_file_list = list_problem_files_in_directory(target_directory)

if not problem_file_list:
    print("No files starting with 'Problem_' found.")
else:
    print("Choose a file by entering the corresponding number:")
    for index, file in enumerate(problem_file_list):
        print(f"{index + 1}: {file}")

    choice = input("Enter the number of your choice: ")

    if choice.isdigit() and 1 <= int(choice) <= len(problem_file_list):
        selected_file = problem_file_list[int(choice) - 1]
        print(f"You selected: {selected_file}")
        
        class_name = selected_file[:-5]  # Remove '.java'
        
        try:
            print("Changing directory to 'bin'...")
            os.chdir(os.path.join(current_directory, 'bin'))
            command = f"java academy.teenfuture.crse.{class_name}"
            print("Running Java program...")  # Indicate that the Java program is running
            subprocess.run(command, shell=True)  # Execute the command without capturing output
            
            # After the Java program finishes, you can indicate completion if needed
            print("Java program has finished running.")
            
        except Exception as e:
            print(f"An error occurred while executing the file: {e}")
    else:
        print("Invalid choice. Please enter a number corresponding to the list.")