import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class StudentMarks here.
 *
 * @author (Viran Pravinda)
 * @version (2022/03/14)
 */
public class StudentMarks
{
    // instance variables
    private String unitName;
    private double studentMark;
    private static final int noOfStudents=25;
    private double[] studentMarksArray;

    /**
     * Constructor for objects of class StudentMarks
     */
    public StudentMarks()
    {
        studentMarksArray=new double[25];
        getInputs();
        printDetails();
    }

    // get inputs from the user
    public void getInputs() {
        System.out.println("Please, enter unit name: ");
        unitName=(new Scanner(System.in)).nextLine();
        
        for(int i=0; i<noOfStudents; i++) {
            boolean correctMark=false;
            
            while(!correctMark) {
                System.out.println("Please, enter student's mark: ");
                studentMark=(new Scanner(System.in)).nextDouble();
            
                //Checking whether the entered mark is between 0 and 100
                if(studentMark>=0 && studentMark<=100) {
                    correctMark=true;
                    studentMarksArray[i]=studentMark;
                } else {
                    System.out.println("Please, enter a value between 0 and 100!!");
                }
            }
        }
    }
    
    // print unit name and marks
    public void printDetails() {
        System.out.println("--------------------------");
        System.out.println("Unit name: "+unitName);
        System.out.println("--------------------------");
        System.out.println("Unit marks:");
        
        for(int j=0; j<studentMarksArray.length; j++) {
            System.out.println(studentMarksArray[j]);
        }
        
        System.out.println("--------------------------");
    }
    
    public static void main(String[] args) {
        StudentMarks obj = new StudentMarks();
    }
}
