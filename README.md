## Library Management System
## Brief Description
This project is a simple library management system implemented in Java. It allows users to add books, add users, check out books, return books, search for books by title or ID, and display all available books. The system is designed to run through the command line interface (CLI).

Instructions for Setting Up and Running the Project Locally
To run the project locally, follow these steps:

## Prerequisites:

Java Development Kit (JDK) installed on your system.
An integrated development environment (IDE) such as IntelliJ IDEA, Eclipse, or NetBeans.
Clone the Repository:
Clone this repository to your local machine using the following command:

bash
Copy code
git clone <repository-url>
Open the Project in IDE:
Open the cloned project in your preferred IDE.

Run the Project:
Run the LibraryManagementSystem class which contains the main method. This will execute the program and allow you to interact with the library management system through the console.

Key Features and Functionalities Implemented
Adding Users: Users can be added to the library system with their unique user ID, username, and contact information.
Adding Books: Users can add new books to the library by providing the book ID, title, author, and genre.
Searching for Books: Users can search for books by title or ID, and the system displays relevant information about the books.
Checking Out Books: Users can check out books by providing the book title and ID. The system updates the availability status of the book and records the borrower.
Returning Books: Users can return books to the library, and the system updates the availability status accordingly.
Displaying All Books: The system can display a list of all available books in the library.
User Input Validation: The system ensures proper input validation to handle errors gracefully.
Note:
Ensure that the Library, Book, User, and LibraryManagementSystem classes are properly compiled and linked in your IDE.
The project utilizes simple file handling to store book information in a text file named "Library Books.txt". Make sure the file is created in the project directory or modify the file path accordingly.