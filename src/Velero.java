public class Velero extends Embarcacion implements Validacion{

    private int cantMastil;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantMastil) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantMastil = cantMastil;
    }
    @Override
    public String validar() {
        if (cantMastil > 4){
            return "El velero es grande";
        }
        return "El velero es tamaño normal";
    }
}
