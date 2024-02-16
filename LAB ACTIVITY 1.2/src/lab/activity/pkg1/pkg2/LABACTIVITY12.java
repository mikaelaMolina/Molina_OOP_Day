package lab.activity.pkg1.pkg2;

import java.util.Scanner;


public class LABACTIVITY12 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the message: ");
        String message = input.nextLine();
        
        String[] resultWords = message.split("\\s+");
        
        boolean multiCapital = false;
        
        for(String word: resultWords){
            for(int j = 1; j < word.length(); j++){
                if(Character.isUpperCase(word.charAt(j))){ //detect capital letter after 1st letter
                    multiCapital = true;
                    break;
                }
            }
        }
        
        if(multiCapital){
            System.out.println("JEJE!");
        } else{
            System.out.println("uWu");
        }
    }
    
}