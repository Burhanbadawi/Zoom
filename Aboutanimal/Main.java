package Aboutanimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Allprint allprint = new Allprint(scanner);
        
        System.out.println("Welcome to the Animal Information System!");
        allprint.animals();
       
     
     
    }
    
}