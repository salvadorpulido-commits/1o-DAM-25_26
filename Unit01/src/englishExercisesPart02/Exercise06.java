package englishExercisesPart02;

import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {
    	
    	/*
    	 * A group of students has been told to get into teams of a specific size 
    	 * for their coursework. 
    	 * Design and implement a program that prompts for the number of students 
    	 * in the group and the size of the teams to be formed, 
    	 * and displays how many teams can be formed and how many students 
    	 * are left without a team.
    	 */

        
        // Creamos Scanner
        Scanner sc = new Scanner(System.in);
        
        //Variable total de estudiantes
        
        int totalStudents;
        
        //Variable tamaño de cada equipo
        
        int teamSize;
        
        //Variable equipos completos
        
        int fullTeams;
        
        //Variable estudiantes sin equipo
        
        int studentsLeft;
                       
        // Pedimos al usuario que introduzca el número total de estudiantes
        
        System.out.print("Enter the total number of students: ");
        totalStudents = sc.nextInt();
        
        // Pedimos al usuario que introduzca el tamaño de cada equipo
        
        System.out.print("Enter the desired team size: ");
        teamSize = sc.nextInt(); 
        
        // Calculamos cuántos equipos completos se pueden formar
        
        fullTeams = totalStudents / teamSize;
        
        // Calculamos cuántos estudiantes quedan sin equipo (resto de la división)
        
        studentsLeft = totalStudents % teamSize;
        
        // Mostramos los resultados al usuario
        
        System.out.println("Number of full teams that can be formed: " + fullTeams);
        System.out.println("Number of students without a team: " + studentsLeft);
        
        // Cerramos Scanner
        sc.close();
    }
}

