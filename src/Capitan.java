public class Capitan {
    private String atrNombre;
    private String atrApellido;
    private String atrMatriculaNaveg;

    public Capitan(String nombre, String apellido, String matriculaNaveg){
        this.atrNombre = nombre;
        this.atrApellido = apellido;
        this.atrMatriculaNaveg = matriculaNaveg;
    }
    public String toString(){
        return "Nombre: "+ this.atrNombre + "\nApellido: "+ this.atrApellido + "\nMatricula navegación: "+ this.atrMatriculaNaveg;
    }
}
