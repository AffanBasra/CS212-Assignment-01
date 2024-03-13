import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Library{
    //ArrayLists for storing instances of "Book" class and "User" class dynamically

    static ArrayList<Book> BookList=new ArrayList<>();
    static ArrayList<User> UserList=new ArrayList<>();
    /*private String line;
    BufferedReader filereader=new BufferedReader(new FileReader("Library Books.txt"));
    while((line=filereader.readLine())!=null){

    }*/
        
    
 

    /*Function that uses user arguments to create a new instance 
    of the book class, store it in the arrayList and display a message on completion*/
    public void AddBook(int BookId,String title,String author,String genre){
        Book NewBook=new Book(BookId,title,author,genre);
        BookList.add(NewBook);
        System.out.println("New Book has been added Sucessfully.");
        BufferedWriter filewriter=null;
        try{
          filewriter=new BufferedWriter(new FileWriter("Library Books.txt",true));
         filewriter.write(NewBook.toString());
         filewriter.write("\n");}
         catch(IOException  e){
            System.out.println("Error writing to file."+e.getMessage());
         }finally{
            if(filewriter!=null){
                try{filewriter.close();}
                catch(IOException e){
                    System.err.println("Error in file handling"+e.getMessage());
                }
            }
         }
    }

        /*Function that takes user arguments to create a new instance 
    of the User class, store it in the arrayList "UserList"
    and display a message on completion*/
    public void AddUser(int UserID,String UserName, String ContactInfo){
        User NewUser= new User(UserID, UserName, ContactInfo);
        UserList.add(NewUser);
        System.out.println("New User has been added successfully.");

    }
    public void Checkout (String BookTitle, int InputBookID){
        Boolean bookFound=false;
        for(Book book:BookList){
            if((book.title.equalsIgnoreCase(BookTitle))&&(book.BookID==InputBookID)){
                bookFound=true;
                if (book.availabilityStatus){
                book.availabilityStatus=false;
                System.out.println("Title\tID\tAuthor\tGenre");
                System.out.printf("%s\t%d\t%s\t%s\n",book.title,book.BookID,book.author,book.genre);
                //User.BorrowedBooks.add(book); FIX THIS!!
                }
                else{
                    System.err.println("Book Not available currently.\nCheck again later.");
                    
                    
                }
            }
        }
            if(bookFound==false){
                System.err.println("Error!Book Not Found!Try again");
                
            }
        
    }

    public void ReturnBooks(String BookTitle2,int BookID2){
        boolean returnBookFound=false;
        for(Book book:BookList){
            if((book.title.equalsIgnoreCase(BookTitle2))&&(book.BookID==BookID2)){
                book.availabilityStatus=true;
                returnBookFound=true;
                System.out.println("Book returned successfully.");

            }
        }
        if(returnBookFound==false){
            System.err.println("Error, Book not found.");
        }
        
    }
    public void BookSearchByTitle(String BookTitle){
        boolean bookFound=false;
        for(Book book:BookList){
            if((book.title.equalsIgnoreCase(BookTitle))){
                bookFound=true;
                
                
                System.out.println("Title\tID\tAuthor\tGenre");
                System.out.printf("%s\t%d\t%s\t%s",book.title,book.BookID,book.author,book.genre);
                System.out.println("Available: "+book.availabilityStatus);
                }
            }
            if(bookFound==false){
                System.out.println("Book Not found!");
            }
}
public void BookSearchByID(int InputBookID){
    boolean bookFound=false;
    for(Book book:BookList){
        if(book.BookID==InputBookID){
            bookFound=true;
            
            
            System.out.println("Title\tID\tAuthor\tGenre");
            System.out.printf("%s\t%d\t%s\t%s",book.title,book.BookID,book.author,book.genre);
            System.out.println("Available: "+book.availabilityStatus);
            }
        }
        if(bookFound==false){
            System.out.println("Book Not found!");
        }
    }
        public void DisplayAllBooks(){
            int index=1;
            if(BookList.isEmpty()){
                System.err.println("No Books found. Please add Books first.");
                return;
            }
            System.out.println("Book ID\tTitle\tAuthor\tGenre");

            for(Book book:BookList){
                if(book.availabilityStatus){
                System.out.printf("%d. %d\t%s\t%s\t%s\n",index,book.BookID,book.title,book.author,book.genre);
                index++;
            }}
        }

}