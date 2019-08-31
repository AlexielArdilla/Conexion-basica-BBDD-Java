package ar.com.unpaz.database;

import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
	
		AlumnoDAO miAlumnoDAO = new AlumnoDAO();
		
		LinkedList<Alumno> misQueriesTruchangas=  miAlumnoDAO.getQuery();
		
       for(Alumno p: misQueriesTruchangas){
    	   
			System.out.println("ID: " + p.getId() + " Apel_Nombre: " + p.getApel_nom() + "Materia: "
					+ p.getDescripcion() + " Nota: " + p.getNota());

		}
      
	}

}
