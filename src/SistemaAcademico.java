import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAcademico {
    
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Profesor> profesores;
    private ArrayList<Materia> materias;

    private Scanner scan;

    public SistemaAcademico(){

        estudiantes = new ArrayList<>();
        profesores = new ArrayList<>();
        materias = new ArrayList<>();

        scan = new Scanner(System.in);
    }

    public void registrarEstudiante(){
        System.out.print("\n=== Registrar Estudiante ===");

        System.out.print("Matricula: ");
        String matricula = scan.nextLine();

        System.out.print("Nombre: ");
        String nombre = scan.nextLine();

        System.out.print("Apellido: ");
        String apellido = scan.nextLine();

        System.out.print("Edad: ");
        int edad = Integer.parseInt(scan.nextLine());

        System.out.print("Carrera: ");
        String carrera = scan.nextLine();

        System.out.print("Fecha de inscripcion: ");
        String fecha = scan.nextLine();


        Estudiante estudiante = new Estudiante(nombre ,apellido ,matricula ,edad ,carrera ,fecha);

        estudiantes.add(estudiante);

        System.out.println("Estudiante registrado correctamente");
    }

    public void registrarProfesor(){

        System.out.println("\n ==== Registrar Profesor ===");
        
        System.out.print("Codigo: ");
        String codigo = scan.nextLine();

        System.out.print("Nombre: ");
        String nombre = scan.nextLine();

        System.out.print("Apellido: ");
        String apellido = scan.nextLine();

        System.out.print("Asignaturas: ");
        String asignaturas = scan.nextLine();

        Profesor profesor = new Profesor(nombre, apellido, codigo, asignaturas);

        profesores.add(profesor);

        System.out.println("Profesor registrado");

    }

    public void registrarMateria(){

        System.out.println("\n=== Registrar Materia ===");

        System.out.print("Codigo: ");
        String codigo = scan.nextLine();

        System.out.print("Nombre: ");
        String nombre = scan.nextLine();

        System.out.print("Creditos: " );
        int creditos = Integer.parseInt(scan.nextLine());

        Materia materia = new Materia(codigo, nombre, creditos);

        materias.add(materia);

        System.out.println("Materia registrada");
    }

    public void mostrarEstudiantes(){

        if(estudiantes.isEmpty()){
            System.out.println("No hay estudiantes registrados ");

            return;
        }

        System.out.println("=== Lista de Estudiantes ===");

        for(Estudiante estudiante : estudiantes){
            estudiante.mostrarInfo();
        }
    }

    public void mostrarMaterias(){

        if(materias.isEmpty()){
            System.out.println("No hay materias registradas ");
            return;
        }

        System.out.println("=== Lista de Materias ===");
        
        for(Materia materia : materias){
            materia.mostrarInformacion();
        }
    }

    public void buscarEstudiante(){
        if(estudiantes.isEmpty()){
            System.out.println("No hay estudiantes registrados ");
            return;
        }

        System.out.print("Ingrese matricula o nombre: ");
        String busqueda = scan.nextLine();

        for(Estudiante estudiante : estudiantes){

            if(estudiante.getMatricula().equalsIgnoreCase(busqueda) || estudiante.getNombre().equalsIgnoreCase(busqueda)){
                System.out.println("Estudiante encontrado: ");
                estudiante.mostrarInfo();

                return;
            }
        }

        System.out.println("No se encontro ningun estudiante con esas credenciales");
    }

    public void asignarMateriaEstudiante(){

        System.out.println("Matricula del estudiante: ");
        String matricula = scan.nextLine();

        Estudiante estudianteEncontrado = null;

        for(Estudiante estudiante : estudiantes){

            if(estudiante.getMatricula().equalsIgnoreCase(matricula)){

                estudianteEncontrado = estudiante;
                break;
            }
        }

        if(estudianteEncontrado == null){

            System.out.println("Estudiante no encontrado ");
            return;
        }

        System.out.print("Codigo de materia: ");
        String codigo = scan.nextLine();

        Materia materiaEncontrada = null;

        for(Materia materia : materias){

            if(materia.getCodigo().equalsIgnoreCase(codigo)){
                materiaEncontrada = materia;
                break;
            }
        }

        if(materiaEncontrada == null){
            System.out.println("Materia no encontrada ");
        }

        estudianteEncontrado.asignarMateria(materiaEncontrada);

        System.out.println("Materia asignada ");
    }

    public void registrarCalificacion(){

        System.out.print("Matricula del estudiante: ");
        String matricula = scan.nextLine();

        Estudiante estudianteEncontrado = null;

        for(Estudiante estudiante : estudiantes) {

            if(estudiante.getMatricula().equalsIgnoreCase(matricula)) {

                estudianteEncontrado = estudiante;
                break;
            }
        }
        
        if(estudianteEncontrado == null){

            System.out.println("Estudiante no encontrado ");
            return;
        }
        
        System.out.print("Calificacion: ");
        double nota = Double.parseDouble(scan.nextLine());

        estudianteEncontrado.registrarCalificacion(nota);

        System.out.println("\nCalificacion registrada ");
        

    }

    public void mostrarReportePromedios(){

        if(estudiantes.isEmpty()){
            System.out.println("No hay estudiantes registrados");
            return;
        }

        System.out.println("=== Reporte de Promedios ===");

        for(Estudiante estudiante : estudiantes){
            double promedio = estudiante.calcularPromedio();

            System.out.println("Estudiante: " + estudiante.getNombre()+ " " + estudiante.getApellido());

            System.out.println("Promedio: " + promedio);

            if(promedio >= 70){
                System.out.println("Estado: APROBADO");
            }
            else{
                 System.out.println("Estado: REPROBADO");
            }
        }
    }

}
