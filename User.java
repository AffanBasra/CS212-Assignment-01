import java.util.ArrayList;
public class User{
     int UserID;
     String UserName;
     String ContactInfo;
     ArrayList<Book> BorrowedBooks;
    

    public User(int UserID,String UserName, String ContactInfo){
        this.UserID=UserID;
        this.UserName=UserName;
        this.ContactInfo=ContactInfo;
        this.BorrowedBooks=new ArrayList<>();
    }
}