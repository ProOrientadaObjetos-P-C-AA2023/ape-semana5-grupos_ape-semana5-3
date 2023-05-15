package Ejercicio_grupal;
public class Producto {
    private double precioProd;
    private int cantidadProd;
    private double descuento;
    private double precioFinal;

    public Producto(double precioProducto, int nProducto) {
        this.precioProd = precioProducto;
        this.cantidadProd = nProducto;
    }

    public void setCantidadProd(int cantidadProd) {
        this.cantidadProd = cantidadProd;
    }
    public int getCantidadProd() {
        return cantidadProd;
    }

    public double getPrecioProd() {
        return precioProd;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }
    public void setPrecioProd(int precioProd) {
        this.precioProd = precioProd;
    }
    public double calcularDescuento(){
        if(precioProd >= 1000 && cantidadProd > 10){
            return 0.10;
        } else {
            return 0.005;
            }
    }
    public void calcularPrecioFinal(){
        double calcu;
        calcu = precioProd * cantidadProd;
        this.descuento = calcu * calcularDescuento();
        this.precioFinal = calcu -(this.descuento);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "\nprecioProd=" + precioProd +
                "\ncantidadProd=" + cantidadProd +
                "\ndescuento=" + descuento +
                "\nprecioFinal=" + precioFinal +
                '}';
    }
}
