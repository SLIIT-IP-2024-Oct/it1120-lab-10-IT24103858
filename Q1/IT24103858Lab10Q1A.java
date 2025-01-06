import java.util.Scanner; 

  

public class IT24103858Lab10Q1A{ 

    public static void main(String[] args) { 

        Scanner num= new Scanner(System.in); 

        System.out.print("Enter the mark (0-100): "); 

        int mark = num.nextInt(); 

        assert(mark>=0 && mark<=100) : "Invalid Mark"; 

        System.out.println("Mark is Validated"); 

    } 

} 