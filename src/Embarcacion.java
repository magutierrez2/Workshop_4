public class Embarcacion {
    protected Capitan atrCapitan;
    protected double atrPrecioBase;
    protected double atrValorAdicional;
    protected int atrAnioFabricacion;
    protected double atrEslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora){
        this.atrCapitan = capitan;
        this.atrPrecioBase = precioBase;
        this.atrValorAdicional = valorAdicional;
        this.atrAnioFabricacion = anioFabricacion;
        this.atrEslora = eslora;
    }
    public double calcularAlquiler(){
        double montoAlquiler = atrPrecioBase;
        if (atrAnioFabricacion > 2020){
            montoAlquiler = montoAlquiler + atrValorAdicional;
        }
        return montoAlquiler;
    }
}
