
package Student;


public class Student {
    
    private String firstName, lastName, status;
    private int age;
    private boolean isMinor;
    
    public Student(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMinor = age<18;
    }

    public String getName(){
        return lastName + ", " + firstName;
    }
    
    public void increaseAge(){
        age ++;
        
        if(age >= 18){
            isMinor = false;
        }
    }
    
    public String toStatus(){
        if(isMinor == true){
            status = "minor";
        } else{
            status = "adult";
        }
        return status;
    }
    
    
    @Override
    public String toString(){
        return  getName() + " - " + age + " - " + toStatus();
    }
        
}
