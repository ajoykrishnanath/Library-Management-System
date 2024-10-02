/*
You have to implement a library using Java Class Library
Methods: addBook, issueBook, returnBook, showAvailableBooks
Properties: Array to store the available books
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Library{
    Scanner sc = new Scanner(System.in);
    ArrayList<String> books= new ArrayList<>(Arrays.asList("B20315H","N564A","DO97GK","BLR459I","UHB780"));
    ArrayList<String> ib= new ArrayList<>();

    public void  addBook(){
        while (true){
            System.out.println("Do you want to add new book in library? (y/n):");
            String i = sc.nextLine();
            if(i.equals("y")){
                System.out.println("Enter the serial no. of the new book you want to add to library:");
                books.add(sc.nextLine());
                showAvailableBooks();
                break;
            }else if (i.equals("n")){
                System.out.println("Ok");
                break;
            }
            else{
                System.out.println("Invalid input");
            }
        }
    }
    public void issueBook(){
        while (!books.isEmpty()){
            System.out.println("Do you want to issue book? (y/n):");
            String i=sc.nextLine();
            if(i.equals("y")){
                showAvailableBooks();
                System.out.println("Enter the serial no. of the book you want to issue:");
                String s= sc.nextLine();
                ib.add(s);
                books.remove(s);
                showAvailableBooks();
            }
            else if (i.equals("n")){
                System.out.println("Ok");
                break;
            }
            else{
                System.out.println("Invalid input!");
            }
        }
    }
    public void issuedBooks(){
        System.out.println("Your issued books are: "+ib);
    }
    public void returnBook(){
        while (!ib.isEmpty()){
            System.out.println("Do you want to return book? (y/n):");
            String i=sc.nextLine();
            if(i.equals("y")){
                issuedBooks();
                System.out.println("Enter the serial no. of the book you want to return:");
                String r= sc.nextLine();
                books.add(r);
                ib.remove(r);
                showAvailableBooks();
            }
            else if (i.equals("n")){
                System.out.println("Ok");
                break;
            }
            else{
                System.out.println("Invalid input!");
            }
        }
    }
    public void showAvailableBooks(){
        System.out.println("Serial no. of Availbale books are: "+books);
    }
}
public class code {
    public static void main(String[] args) {
        Library L1= new Library();
        L1.showAvailableBooks();
        L1.addBook();
        L1.issueBook();
        L1.returnBook();
    }
}
