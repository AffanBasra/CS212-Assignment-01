import java.util.Scanner;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library lib=new Library();
        Scanner input=new Scanner(System.in);
        int UserChoice;
        char ContinueChoice;

        String username;
        int UserID;
        String contactinfo;

        if(Library.UserList.isEmpty()){
            System.out.println("There are currently no users. Please register atleast one user before using the LMS.");
            System.out.println("Enter username:");
            username=input.nextLine();
            System.out.println("Enter User ID:");
            UserID=input.nextInt();
            input.nextLine();
            System.out.println("Enter phone number:");
            contactinfo= input.nextLine();
            
            lib.AddUser(UserID,username,contactinfo);
        }

        System.out.println("Welcome to Library Management System.");
        while(true){
        System.out.println("Choose Option:");
        System.out.println("1.Add New User.");
        System.out.println("2.Add New Book.");
        System.out.println("3.Search for Books.");
        System.out.println("4.Checkout a Book.");
        System.out.println("5.Return a Book.");
        System.out.println("6.Display All Available Books.");
        UserChoice=input.nextInt();
        input.nextLine();

        switch (UserChoice){
            case 1:
            System.out.println("Enter username:");
            username=input.nextLine();

            System.out.println("Enter User ID:");
            UserID=input.nextInt();
            input.nextLine();

            System.out.println("Enter phone number:");
            contactinfo= input.nextLine();
            
            lib.AddUser(UserID,username,contactinfo);
           
            break;

        case 2:
            System.out.println("Enter title of Book:");
            String inputTitle=input.nextLine();

            System.out.println("Enter Book ID:");
            int inputBookID=input.nextInt();
            input.nextLine();

            System.out.println("Enter author of Book:");
            String inputBookAuthor=input.nextLine();

            System.out.println("Enter genre of Book:");
            String inputBookGenre=input.nextLine();

            lib.AddBook(inputBookID,inputTitle,inputBookAuthor,inputBookGenre);
            break;

            case 3:
            System.out.println("Enter T to search by Title, I to search by Book ID");
            char userSearchChoice=input.next().charAt(0);
            input.nextLine();
            if((userSearchChoice=='T')||(userSearchChoice=='t')){
            System.out.println("Enter title of book you want to find:");
            String searchTitle=input.nextLine();
            lib.BookSearchByTitle(searchTitle);}
                else{
            System.out.println("Enter ID of book you want to find:");
            int searchID=input.nextInt();
            input.nextLine();
            lib.BookSearchByID(searchID);}
            break;

            case 4:
            System.out.println("Enter the title of the book you want to checkout:");
            String inputBookTitle=input.nextLine();
            
            System.out.println("ENter the Book ID:");
            int inputBOOKID=input.nextInt();
            input.nextLine();

            lib.Checkout(inputBookTitle, inputBOOKID);
            break;

            case 5:
            System.out.println("Enter the title of the book you want to return:");
            String returnTitle=input.nextLine();

            System.out.println("Enter the BookID:");
            int returnBookID=input.nextInt();
            input.nextLine();

            lib.ReturnBooks(returnTitle, returnBookID);
            break;

            case 6:
            lib.DisplayAllBooks();
            break;

            default:
            System.err.println("Error! Choose option between 1 and 6.");
            break;

        }
        System.out.println("Do you want to continue?(Y\\N)");
        ContinueChoice=input.next().charAt(0);
        if((ContinueChoice=='n')||(ContinueChoice=='N')){
            System.out.println("Exiting the LMS.");
            break;
        }
        
    }
    input.close();}

}

