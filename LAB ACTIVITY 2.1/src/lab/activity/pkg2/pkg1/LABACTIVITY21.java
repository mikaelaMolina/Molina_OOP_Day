
package lab.activity.pkg2.pkg1;

import Student.Student;
import java.util.Scanner;


public class LABACTIVITY21 {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Enter test case number: ");
        int testCase = input.nextInt();
        
        
        switch(testCase){
            case 1:
                Student student1 = new Student("Jemar Jude", "Maranga", 17);
                System.out.println("Test Case 1: Student under 18");
                System.out.println(student1.toString());
                break;
            case 2:
                Student student2 = new Student("Jemar Jude", "Maranga", 17);
                System.out.println("Test Case 2: Increase age of student1");
                student2.increaseAge();
                System.out.println(student2.toString());
                break;
            case 3:
                Student student3 = new Student("Jose", "Cruz", 19);
                System.out.println("Test Case 3: Student over 18");
                System.out.println(student3.toString());
                break;
        }   
        
    }
    
}
