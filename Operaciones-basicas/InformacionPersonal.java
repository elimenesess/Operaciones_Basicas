
package informacionpersonal;

/**
 *
 * @author maryse
 * 
 * Programa para imprimir cadenas en Java 
 * 
 */

public class InformacionPersonal {

    String nombre = "Elizabeth",
           apellido_paterno = "Meneses",
           apellido_materno = "Mendoza";
    int no_cuenta = 1712577;
    String semestre = "2do";
    String dia1 = "LUNES, MIERCOLES",
           materia1_1 = "Teoria de sistemas -- 7:00 a 8:30. ",
           materia1_2 = "Circuitos -- 9:00 a 11:00. ",
           materia1_3 = "Teoria de algoritmos -- 11:30 a 13:00. ",
           dia2 = "MARTES, JUEVES",
           materia2_1 = "Calculo diferencial e integral -- 7:00 a 9:00. ",
           materia2_2 = "Programacion -- 10:00 a 12:30. ";
    
    
    public void Informacion(){        
        System.out.println("El nombre completo del alumno es: " + nombre +" "+ apellido_paterno +" "+ apellido_materno );
        System.out.println("Su numero de cuenta es: " + no_cuenta );
        System.out.println("Su semestre en curso es: " + semestre);
        System.out.println("Su horario inscrito es: ");
        System.out.println(dia1);
        System.out.println(materia1_1 + materia1_2 + materia1_3);
        System.out.println(dia2);
        System.out.println(materia2_1 + materia2_2 );
    }
    
    public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
                
    }
    
}
