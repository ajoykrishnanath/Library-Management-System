/*
You have to implement a library using Java Class Library
Methods: addBook, issueBook, returnBook, showAvailableBooks
Properties: Array to store the available books
 */
import java.util.Scanner;

class Library{
    Scanner sc = new Scanner(System.in);
    String []books={"B20315H","N564A","DO97GK","BLR459I","UHB780"};
    public void  addBook(String s){

    }
    public void issueBook(){
        System.out.println("Enter the serial no. of the book you want to issue:");
        String s= sc.nextLine();
        addBook(s);
    }
    public void returnBook(){

    }
    public void showAvailableBooks(){

    }
}
public class code {
    public static void main(String[] args) {
        Library L1= new Library();
    }
}
