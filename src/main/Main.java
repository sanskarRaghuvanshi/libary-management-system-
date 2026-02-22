package main;
import model.Book;
import service.Libraryservice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libraryservice L1 = new Libraryservice();
         while (true) {
            System.out.println(" ---  Library Management System ---");
System.out.println("1. Add Book");
System.out.println("2. View Books");
System.out.println("3. Issue Book");
System.out.println("4. Return Book");
// adding comnments in test branch
System.out.println("5. Exit");
System.out.print("Choose option: ");
int choice =  sc.nextInt();

switch (
    choice
) {
    case 1:
        System.out.print("Enter book ID: ");
        int id = sc.nextInt();
        sc.nextLine();  // Consume newline
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        L1.addBook(new Book(id, title));
        break;
    case 2:
        L1.viewBooks();
        break;
    case 3:
        System.out.print("Enter book ID to issue: ");
        int issueId = sc.nextInt();
        L1.issueBook(issueId);
        break;
    case 4:
        System.out.print("Enter book ID to return: ");
       L1.returnBook(sc.nextInt());
      break;
    case 5:
        System.out.println("Exiting...");
        return;

    default: System.out.println("Invalid choice. Please try again.");
        break;
}
}   
}
}
