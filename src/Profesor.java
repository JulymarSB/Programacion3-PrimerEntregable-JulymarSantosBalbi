public class Profesor extends Persona {
    private String codigo;
    private String asignaturas;

    public Profesor(String nombre, String apellido, String codigo, String asignaturas){
        super(nombre, apellido);

        this.codigo = codigo;
        this.asignaturas = asignaturas;

    }

    public String getCodigo(){
        return codigo;
    }

    public String getAsignaturas(){
        return asignaturas;
    }

    @Override
    public void mostrarInfo(){

        System.out.println("=== Profesor ===");

        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Asignaturas: " + asignaturas);

    }
}
