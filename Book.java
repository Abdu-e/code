/***
* Esau
* Abdu-Raziq
* 4270797
* CSC211 2023 Practical 3
* Book.java
*/

public class Book 
{
    //List of attributes variblaes go here
    private String title;
    private String author;
    private String publisher;
    private int bookID;

    //List of default constructors
    public Book()
    {
        String title = "";
        String author = "";
        String publisher = "";
        int bookID = 0;
    }
    //List of accessor methods
    public String getTitle()
    {
        return this.title;
    }
    public String getAuthor()
    {
        return this.author;
    }
    public String getPublisher()
    {
        return this.publisher;
    }
    public Integer getBookID()
    {
        return this.bookID;
    }
    

    //List of mutator methods
    public void setTitle(String string)
    {
        this.title = title;
    }
    public void setAuthor(String string)
    {
        this.author = author;
    }
    public void setPublisher()
    {
        this.publisher = publisher;
    }
    public void setBookID()
    {
        this.bookID = bookID;
    }
    

    //Format your toString
    public String toString() 
    {
        return title+ ", by " +author+ ", published by: " +publisher+ ", ID: " +bookID;
    }
    public void setId(int nextInt) {
    }
}