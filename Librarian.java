import java.util.Scanner;

public class Librarian
{
    int bookID;
    public static void main(String[] args)
    {
        System.out.println("Please enter the title, author and publisher of the book (In that order): ");
        Scanner inputT = new Scanner(System.in);
        String title = inputT.nextLine();
        String author = inputT.nextLine();
        String publisher = inputT.nextLine();

        System.out.println("Please present the unique 4 digit Book ID: ");
        Scanner inputID = new Scanner(System.in);
        int bookID = inputID.nextInt();
        


        System.out.println("The title of your book is: " + title);
        System.out.println("The author of your book is: " + author);
        System.out.println("The publisher of your book is: " + publisher);
        System.out.println("The ID code of your book is: " + bookID);
    }
}
import java.util.Scanner;

public class LibraryManagementSystem {
    private Node headNode;

    // implementation of insertBook(), insertBefore(), searchBook(), deleteBook(), listAllBooks(), and totalBooks() methods

    public void run() 
    {
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
                    if (insertBefore(bookBefore, beforeBookID)) {
                        System.out.println("Book added successfully.");
                    } else {
                        System.out.println("Book could not be added.");
                    }
                    break;

                case 3:
                    System.out.println("Searching for a book by ID...");
                    System.out.print("Enter book ID: ");
                    int searchBookID = inputScanner.nextInt();
                    Book searchBook = searchBook(searchBookID);
                    if (searchBook != null) {
                        System.out.println("Book found:");
                        System.out.println(searchBook.toString());
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.println("Deleting a book by ID...");
                    System.out.print("Enter book ID: ");
                    int deleteBookID = inputScanner.nextInt();
                    if (deleteBook(deleteBookID)) {
                        System.out.println("Book deleted successfully.");
                    } else 
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
                    isRunning = false

                }
        }
    }

}