public class Estudiante extends Persona {
    
    private String matricula;
    private int edad;
    private String carrera;
    private String fechaInscripcion;

    public Estudiante (String nombre, String apellido, String matricula, int edad, String carrera, String fechaInscripcion){
        super(nombre, apellido);

        this.matricula = matricula;
        this.edad = edad;
        this.carrera = carrera;
        this.fechaInscripcion = fechaInscripcion;
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
