package estudiantes;
import java.util.Scanner;
public class Estudiantes {
    String name;
    String lastName;
    double grade1;
    double grade2;
    double grade3;
    double gpa;
    public static double getGpa(double g1, double g2, double g3 ){
        double gpa  = (g1+g2+g3)/3;
        return gpa;
    }
    public static void printStudents(Estudiantes [] vectorDeEstudiantes){
            for (int i = 0; i < vectorDeEstudiantes.length; i++) {
            // %-12s = texto alineado a la izquierda en un espacio de 12 caracteres
            // %-10.2f = número decimal alineado a la izquierda con 2 decimales
            System.out.printf("%-12s %-12s %-10.2f %-10.2f %-10.2f %-10.2f\n", 
            vectorDeEstudiantes[i].name, 
            vectorDeEstudiantes[i].lastName, 
            vectorDeEstudiantes[i].grade1, 
            vectorDeEstudiantes[i].grade2, 
            vectorDeEstudiantes[i].grade3,
            vectorDeEstudiantes[i].gpa
            );
            }
    }
    public static void printBestGpu(int bestGpu, Estudiantes [] vectorDeEstudiantes){
        System.out.println("Estudiante con mejor promedio: ");
        System.out.printf("%-12s %-12s %-10.2f %-10.2f %-10.2f %-10.2f\n", 
            vectorDeEstudiantes[bestGpu].name, 
            vectorDeEstudiantes[bestGpu].lastName, 
            vectorDeEstudiantes[bestGpu].gpa
            );
        
    }
    public static int bestgpu(Estudiantes [] vectorDeEstudiantes){
        int best = 0;
        for (int i = 0; i < vectorDeEstudiantes.length; i++ ){
            if ( vectorDeEstudiantes[i].gpa > best){
                best = i;
                
            }
        }
        return best;
    }
    public static void main(String[] args) {
    
    
        Scanner s = new Scanner(System.in);
        Estudiantes [] vectorDeEstudiantes = new Estudiantes[3];
        for (int i = 0; i< 3 ; i++){
            vectorDeEstudiantes[i] = new Estudiantes();
            System.out.println("Ingrese los datos del estudiante "+ (i+1)+ " :") ;
            System.out.print("Nombre: ") ;
            vectorDeEstudiantes[i].name = s.nextLine();
            System.out.print("Apellido: ") ;
            vectorDeEstudiantes[i].lastName = s.nextLine();
            System.out.print("Nota 1: ") ;
            vectorDeEstudiantes[i].grade1= s.nextDouble();
            System.out.print("Nota 2: ") ;
            vectorDeEstudiantes[i].grade2= s.nextDouble();
            System.out.print("Nota 3: ") ;
            vectorDeEstudiantes[i].grade3 = s.nextDouble();
            s.nextLine();
            vectorDeEstudiantes[i].gpa = getGpa( vectorDeEstudiantes[i].grade1, vectorDeEstudiantes[i].grade2, vectorDeEstudiantes[i].grade3);
        }
        printStudents(vectorDeEstudiantes);
        printBestGpu(bestgpu(vectorDeEstudiantes),vectorDeEstudiantes);

}
        
                

}

