import java.util.Scanner; 


public class IT24103858Lab10Q1B{ 

    public static void main(String[] args) {        

        Scanner num = new Scanner(System.in); 

        System.out.print("Enter a mark (0-100): "); 

        int mark = num.nextInt(); 

     
        assert( mark>= 0 && mark<= 100 ): "Incorrect Grade Assigned"; 
         

        char grade; 

        if (mark >= 75) { 

            grade = 'A'; 

        } else if (mark >= 60) { 

            grade = 'B'; 

        } else if (mark >= 50) { 

            grade = 'C'; 

        } else if (mark >= 40) { 

            grade = 'D'; 

        } else { 

            grade = 'F'; 

        } 

         assert (grade == 'A' && mark >= 75) || 

               (grade == 'B' && mark >= 60 && mark < 74) || 

               (grade == 'C' && mark >= 50 && mark < 59) || 

               (grade == 'D' && mark >= 40 && mark < 49) || 

               (grade == 'F' && mark < 40);
         
        System.out.println();
             
        System.out.println("Mark is Validated"); 

        System.out.println("The Grade for the Entered Mark is: " + grade); 

    } 

} 