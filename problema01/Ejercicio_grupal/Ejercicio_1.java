package Ejercicio_grupal;

import java.util.Scanner;

public class Ejercicio_1{
        public static void main(String[] args) {
            Scanner teclado=new Scanner(System.in);
            System.out.println("Ingrese el precio del producto y la cantidad del prodcuto");
            Producto producto1=new Producto(teclado.nextDouble(), teclado.nextInt());
            producto1.calcularDescuento();
            producto1.calcularPrecioFinal();
            System.out.println(producto1);
        }
}

