package lab.activity.pkg1;

import java.util.Scanner;

public class LABACTIVITY1 {

    static Scanner input = new Scanner(System.in);
    static Scanner inputint = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.print("Input name: ");
        String name = input.nextLine();
        System.out.print("Input age: ");
        int age = inputint.nextInt();
        System.out.print("Input gender: ");
        String gender = input.nextLine();
        System.out.print("Input address: ");
        String address = input.nextLine();
        System.out.print("Input civil status: ");
        String civil = input.nextLine();
        System.out.print("Input # of brothers/sisters: ");
        int num = inputint.nextInt();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Civil status: " + civil);
        System.out.println("Number of brothers/sisters:: " + num);
    }
    
}

