# Java Project Runner

## Overview

This repository contains a script to execute `process.py` files located within Java project directories. The script searches for directories that start with "Class" and allows users to run the corresponding `process.py` file for each project.

## Requirements

- Python 3.x
- Access to a terminal

## Usage

### Usage for Linux Users
1. Open a terminal.
2. Navigate to the directory where `run.py` is located.
3. Run the script:
   ```
   python3 run.py
   ```
4. The script will list all available "Class" projects.
5. Choose the number corresponding to the project you want to run.
6. **Normal Flow**: Enter the problem you wish to execute when prompted. The Java code will then run accordingly.
7. **Admin Flow**: Enter 99 to activate admin mode, which will display all available classes. After that, select a class and choose the specific problem you want to see.

### Usage for Windows Users
1. Double-click on run.bat to execute the script.
2. The script will list all available "Class" projects.
5. Choose the number corresponding to the project you want to run.
6. **Normal Flow**: Enter the problem you wish to execute when prompted. The Java code will then run accordingly.
7. **Admin Flow**: Enter 99 to activate admin mode, which will display all available classes. After that, select a class and choose the specific problem you want to see.

## Troubleshooting
- Ensure you are using Python 3.
- Verify that the directory structure matches the expected format.
- Confirm that `process.py` files exist in the respective project directories.

