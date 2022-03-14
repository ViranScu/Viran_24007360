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
    // instance variables - replace the example below with your own
    private String unitName;
    private double studentMark;
    private static final int noOfStudents=25;
    private ArrayList<Double> studentMarksArray=new ArrayList<>();

    /**
     * Constructor for objects of class StudentMarks
     */
    public StudentMarks()
    {
        getInputs();
        printDetails();
    }

    // get inputs from the user
    public void getInputs() {
        System.out.println("Please, enter unit name: ");
        unitName=(new Scanner(System.in)).nextLine();
        
        int i=0;
        while(i<noOfStudents) {
            boolean correctMark=false;
            
            do {
                System.out.println("Please, enter student's mark: ");
                studentMark=(new Scanner(System.in)).nextDouble();
                
                if(studentMark>=0 && studentMark<=100) {
                    correctMark=true;
                    studentMarksArray.add(studentMark);
                    i++;
                } else {
                    System.out.println("Please, enter a value between 0 and 100!!");
                }
                
            } while(!correctMark);
        }
    }
    
    // print unit name and marks
    public void printDetails() {
        System.out.println("--------------------------");
        System.out.println("Unit name: "+unitName);
        System.out.println("--------------------------");
        System.out.println("Unit marks:");
        
        for(int j=0; j<studentMarksArray.size(); j++) {
            System.out.println(studentMarksArray.get(j));
        }
        
        System.out.println("--------------------------");
    }
    
    public static void main(String[] args) {
        StudentMarks obj = new StudentMarks();
    }
}
