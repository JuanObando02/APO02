package codigos;

public class GradeBook
{
   private String courseName; // course name for this GradeBook
   private String instructorcurso;
   
   // el constructor inica el nombre del curso con el objeto para este LIBRO. 
   public GradeBook(String nombre,String n1 ) {
	   courseName = nombre;
	   instructorcurso = n1;
   }
// method to set the course name
   public void ponerCourseName( String name )
   {
      courseName = name; // store the course name
   } // end method setCourseName
   public void getintructorname( String name )
   {
	   instructorcurso = name; // store the course name
   }

   // method to retrieve the course name
   public String obtenerCourseName()
   {
      return courseName;
   } // end method getCourseName
   public String obtenerintructor()
   {
      return instructorcurso;
   }

   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      // this statement calls getCourseName to get the 
      // name of the course this GradeBook represents
      System.out.printf( "Bienvenido el libro de calificaciones:\n%s!\n", 
         obtenerCourseName() );
      System.out.printf( "Este cuso es presentado por:\n%s!\n", 
    		  obtenerintructor() );
   } // end method displayMessage

} // end class GradeBook
