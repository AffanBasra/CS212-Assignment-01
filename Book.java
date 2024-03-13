public class Book{
    int BookID;
    String title,author,genre;
    Boolean availabilityStatus=true;

    public Book(int BookID,String title,String author,String genre){
        this.BookID=BookID;
        this.title=title;
        this.author=author;
        this.genre=genre;
    }
    public String toString() {
        return "Book ID: " + BookID + ", Title: " + title + ", Author: " + author + ", Genre: " + genre;
    }

}