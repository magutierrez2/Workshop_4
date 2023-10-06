public class Yate extends Embarcacion implements Validacion {
    private int cantYates;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantYates) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantYates = cantYates;
    }
    @Override
    public String validar() {
        if (cantYates > 7){
            return "El yate es de lujo";
        }
        return "El yate es estandar" ;
    }
}
