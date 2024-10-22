/***
* Esau
* Abdu-Raziq
* 4270797
* CSC211 2023 Practical 3
* LibraryManagementSystem
*/

//Import Java modules and other libraries go here
import java.util.Scanner;

public class LibraryManagementSystem 
{
    //List of attributes variblaes go here
    private static Node headNode;
    private Book book;
    private Node newNode;
    
    //List of default constructors
    public LibraryManagementSystem() 
    {
        class Node 
        {
        Book book;
        Node next;
        
        public Node(Book book) 
        {
            this.book = book;
            this.next = null;
        }
    }
    }
    //Question 3.1
    public static void insertBook(Book newBook) 
    {
        Node newNode = new Node(newBook, newNode);
        if(headNode == null) 
        {
            headNode = newNode;
        } else 
        {
            Node currentNode = headNode;
            while(currentNode.next != null) 
            {
                currentNode = (Node) currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
    //Question 3.2
    public static boolean insertBefore(Book newBook, int bookID) 
    {
        Node newNode = new Node(newBook, newNode);
        if(headNode == null) 
        {
            headNode = newNode;
        } else 
        {
            Node currentNode = headNode;
            while(currentNode.next != null && currentNode.book.getBookID() != bookID) 
            {
                currentNode = (Node) currentNode.next;
            }
            if(currentNode.book.getBookID() == bookID) 
            {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            } else 
            {
                System.out.println("Book with ID " + bookID + " not found.");
            }
        }
        return false;
    }
    //Question 3.3
    public static Book searchBook(int bookID) 
    {
        Node currentNode = headNode;
        while(currentNode != null) 
        {
            if(currentNode.book.getBookID() == bookID) 
            {
                return currentNode.book;
            }
            currentNode = (Node) currentNode.next;
        }
        System.out.println("Book with ID " + bookID + " not found.");
        return null;
    }
    //Question 3.4
    public static void deleteBook(int bookID) 
    {
        if(headNode == null) 
        {
            System.out.println("Library is empty.");
            return;
        }
        if(headNode.book.getBookID() == bookID) 
        {
            headNode = (Node) headNode.next;
        } else 
        {
            Node currentNode = headNode;
            while(currentNode.next != null && currentNode.next.book.getBookID() != bookID) 
            {
                currentNode = (Node) currentNode.next;
            }
            if(currentNode.next == null) 
            {
                System.out.println("Book with ID " + bookID + " not found.");
            } else 
            {
                currentNode.next = currentNode.next;
            }
        }
    }
    //Question 3.5
    public static void listAllBooks() 
    {
        if(headNode == null) {
            System.out.println("Library is empty.");
        } else {
            Node currentNode = headNode;
            while(currentNode != null) {
                System.out.println(currentNode.book.toString());
                currentNode = (Node) currentNode.next;
            }
        }
    }
    //Question 3.6
    public static void sortLibrary() 
    {
        if(headNode == null) {
            System.out.println("Library is empty.");
        } else {
            Node currentNode = headNode;
            while(currentNode != null) 
            {
                Node nextNode = (Node) currentNode.next;
                while(nextNode != null) 
                {
                    if(currentNode.book.getBookID() > nextNode.book.getBookID()) 
                    {
                        Book tempBook = currentNode.book;
                        currentNode.book = nextNode.book;
                        nextNode.book = tempBook;
                    }
                    nextNode = (Node) nextNode.next;
                }
                currentNode = (Node) currentNode.next;
            }
        }
    }
    //Question 3.7
    public static int totalBooks() 
    {
        int count = 0;
    Node currentNode = headNode;
    while(currentNode != null) {
        count++;
        currentNode = (Node) currentNode.next;
    }
    return count;
    }
    //Driver
    public static void main(String[] args)
    {
        Node headNode;

        // implementation of insertBook(), insertBefore(), searchBook(), deleteBook(), listAllBooks(), and totalBooks() methods
    
        Scanner inputScanner = new Scanner(System.in);
        boolean isRunning = true;
    
        while (isRunning) 
        {
            System.out.println("Welcome to the Library Management System. Please select an option:");
            System.out.println("1. Add a new book");
            System.out.println("2. Add a book before another book");
            System.out.println("3. Search for a book by ID");
            System.out.println("4. Delete a book by ID");
            System.out.println("5. List all books");
            System.out.println("6. Sort all books by ID");
            System.out.println("7. Count total number of books");
            System.out.println("8. Exit");
    
            int option = inputScanner.nextInt();
    
            switch (option) 
            {
                case 1:
                    System.out.println("Adding a new book...");
                    Book newBook = new Book();
                    System.out.print("Enter book ID: ");

                    newBook.setId(inputScanner.nextInt());
                    
                    inputScanner.nextLine();
                    System.out.print("Enter book title: ");
                    newBook.setTitle(inputScanner.nextLine());

                    System.out.print("Enter book author: ");
                    newBook.setAuthor(inputScanner.nextLine());
                    
                    insertBook(newBook);
                    System.out.println("Book added successfully.");
                    break;
    
                case 2:
                    System.out.println("Adding a book before another book...");
                    Book bookBefore = new Book();
                    System.out.print("Enter the book ID of the book you want to add before: ");
                    int beforeBookID = inputScanner.nextInt();
                    System.out.print("Enter book ID: ");
                    bookBefore.setId(inputScanner.nextInt());
                    inputScanner.nextLine();
                    System.out.print("Enter book title: ");
                    bookBefore.setTitle(inputScanner.nextLine());
                    System.out.print("Enter book author: ");
                    bookBefore.setAuthor(inputScanner.nextLine());
                    if (insertBefore(bookBefore, beforeBookID)) 
                    {
                        System.out.println("Book successfully added.");
                    } 
                    else 
                    {
                        System.out.println("Book could not be added.");
                    }
                    break;
    
                case 3:
                    System.out.println("Searching for a book by ID.");
                    System.out.print("Enter book ID: ");
                    int searchBookID = inputScanner.nextInt();
                    Book searchBook = searchBook(searchBookID);
                    if (searchBook != null) 
                    {
                        System.out.println("Book found:");
                        System.out.println(searchBook.toString());
                    } 
                    else 
                    {
                        System.out.println("Book not found.");
                    }
                    break;
    
                case 4:
                    System.out.println("Deleting a book by ID...");
                    System.out.print("Enter book ID: ");
                    int deleteBookID = inputScanner.nextInt();
                    if (deleteBook(deleteBookID)) 
                    {
                        System.out.println("Book deleted successfully.");
                    } 
                    else 
                    {
                        System.out.println("Book could not be deleted.");
                    }
                    break;
    
                case 5:
                    System.out.println("Listing all books...");
                    listAllBooks();
                    break;
    
                case 6:
                    System.out.println("Sorting all books by ID...");
                    sortLibrary();
                    System.out.println("Books sorted successfully.");
                    break;
    
                case 7:
                    System.out.println("Counting total number of books...");
                    System.out.println("Total number of books: " + totalBooks());
                    break;
    
                case 8:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    isRunning = false;
    
            }
        }       
    }
} 
  