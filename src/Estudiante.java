import java.util.ArrayList;

public class Estudiante extends Persona {
    
    private String matricula;
    private int edad;
    private String carrera;
    private String fechaInscripcion;
    private ArrayList<Materia> materias;
    private ArrayList<Double> calificaciones;

    public Estudiante (String nombre, String apellido, String matricula, int edad, String carrera, String fechaInscripcion){
        super(nombre, apellido);

        this.matricula = matricula;
        this.edad = edad;
        this.carrera = carrera;
        this.fechaInscripcion = fechaInscripcion;


        materias = new ArrayList<>();
        calificaciones = new ArrayList<>();

    }

    public String getMatricula(){
        return matricula;
    }

    public int getEdad(){
        return edad;
    }

    public String getCarrera(){
        return carrera;
    }

    public String getFechaInscripcion(){
        return fechaInscripcion;
    }


    public ArrayList<Materia> getMaterias(){
        return materias;
    }

    public ArrayList<Double> getCalificaciones(){
        return calificaciones;
    }

    public void asignarMateria(Materia materia){
        materias.add(materia);
    }

    public void registrarCalificacion(double calificacion){

        calificaciones.add(calificacion);
    }

    public double calcularPromedio(){
        if(calificaciones.isEmpty()){
            return 0;
        }

        double suma = 0;

        for(double nota : calificaciones){
            suma += nota;
        }

        return suma/ calificaciones.size();
    }
    @Override
    public void mostrarInfo(){
        
        System.out.println("=== Estudiante ===");

        System.out.println("Matricula: " + matricula);
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Fecha de Inscripcion: " + fechaInscripcion);

    }
}
