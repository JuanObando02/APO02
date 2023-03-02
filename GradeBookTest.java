package codigos;
import java.util.Scanner;

public class GradeBookTest
{
   // main method begins program execution
   public static void main( String args[] )
   { 
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      // create a GradeBook object and assign it to myGradeBook
      GradeBook myGradeBook = new GradeBook("null","juan"); 

      // display initial value of courseName
      System.out.printf( "Nombre inicial del curso es: %s\n\n",
         myGradeBook.obtenerCourseName() );

      // prompt for and read course name
      System.out.println( "Porfavor escriba el nombre del curso:" );
      String theName = input.nextLine(); // read a line of text
      myGradeBook.ponerCourseName( theName ); // set the course name
      System.out.println(); // outputs a blank line

      // display welcome message after specifying course name
      myGradeBook.displayMessage();
   } // end main

}
