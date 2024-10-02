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

    public void  addBook(){
        System.out.println("Enter the serial no. of the new book you want to add to library:");
        books.add(sc.nextLine());
    }
    public void issueBook(){
        System.out.println("Enter the serial no. of the book you want to issue:");
        String s= sc.nextLine();
        books.remove(s);
    }
    public void returnBook(){
        System.out.println("Enter the serial no. of the book you want to return:");
        String r= sc.nextLine();
        books.add(r);
    }
    public void showAvailableBooks(){
        System.out.println("Serial no. of Availbale books are: "+books);
    }
}
public class code {
    public static void main(String[] args) {
        Library L1= new Library();
    }
}
