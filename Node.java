/***
* Esau
* Abdu-Raziq
* 4270797
* CSC211 2023 Practical 3
* Node.java
*/

public class Node 
{
    //List of attributes variblaes go here
    Book book;
    private Node nextNode;
    public Object next;

    //List of default constructors
    public Node(Book book, Node nextNode)
    {
        this.book = book;
        this.nextNode = nextNode;
    }
    //List of accessor methods
    public Book getBook()
    {
        return book;
    }
    public Node getNextNode()
    {
        return nextNode;
    }

    //List of mutator methods
    public void setBook(Book book)
    {
        this.book = book;
    }
    public void setNode(Node nextNode)
    {
        this.nextNode = nextNode;
    }

    //Format your toString
    public String toString() {
        //Make use of the Book object
        return "book = " +book+ "and nextNode = " +nextNode;
    }
}