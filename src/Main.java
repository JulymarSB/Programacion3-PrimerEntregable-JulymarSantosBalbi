import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        SistemaAcademico sistema = new SistemaAcademico();

        int opcion;

        do{
        
            System.out.println("=== Sistema de Gestion Academica ===");

            System.out.println("1. Registrar estudiante");
            System.out.println("2. Registrar profesor");
            System.out.println("3. Registrar materia");
            System.out.println("4. Asignar materia a estudiante");
            System.out.println("5. Registrar calificacion");
            System.out.println("6. Buscar estudiante");
            System.out.println("7. Mostrar estudiantes");
            System.out.println("8. Mostrar materias");
            System.out.println("9. Mostrar reporte de promedios");
            System.out.println("10. Salir");


            System.out.print("Seleccione una opcion: ");

            opcion = Integer.parseInt(scan.nextLine());


            switch(opcion) {

                case 1:
                    sistema.registrarEstudiante();
                    break;

                case 2:
                    sistema.registrarProfesor();
                    break;

                case 3:
                    sistema.registrarMateria();
                    break;

                case 4:
                    sistema.asignarMateriaEstudiante();
                    break;

                case 5:
                    sistema.registrarCalificacion();
                    break;

                case 6:
                    sistema.buscarEstudiante();
                    break;

                case 7:
                    sistema.mostrarEstudiantes();
                    break;

                case 8:
                    sistema.mostrarMaterias();
                    break;

                case 9:
                    sistema.mostrarReportePromedios();
                    break;

                case 10:
                    System.out.println("Saliendo del sistema");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion != 10);

        scan.close();
    }
}