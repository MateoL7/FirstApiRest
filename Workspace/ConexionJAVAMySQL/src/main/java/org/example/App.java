package org.example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        MySQLConnection connection = new MySQLConnection();
        //connection.createTableVehiculo();
        //connection.insertEstudiante(new Estudiante(-1,"Fernando", "Fernandez", 25));
        //connection.updateEstudiante(new Estudiante(2,"Bob","Baron",26));
        //connection.deleteEstudianteByID(9);
        //ArrayList<Estudiante> estudiantes = connection.getAllEstudiante();
        ArrayList<Estudiante> estudiantes = connection.getEstudiantesByCursoID(3);
        System.out.println(estudiantes.size());
        for(int i = 0; i<estudiantes.size(); i++){
            System.out.println(estudiantes.get(i).getNombre()) ;
        }
       // System.out.println(Arrays.deepToString(estudiantes.toArray()));
        connection.close();
    }
}
