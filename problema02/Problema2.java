package problema2;

import java.util.ArrayList;
import java.util.Scanner;
    class Empleado{
        private  String nombre;
        private double salario;
        private  int edad;
        private String mostrarInformacion;
        public Empleado(String nombre,int edad, double salario) {
            this.nombre = nombre;
            this.edad = edad;
            this.salario = salario;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public double getSalario() {
            return salario;
        }
        public void setSalario(double salario) {
            this.salario = salario;
        }
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        @Override
        public String toString(){
            return String.format("===== Empleado ====="
                            +"\nNombre del Empleado: %s"
                            +"\nSalario del Empleado: %.2f $"
                            +"\nEdad del Empleado: %d años"
                    ,nombre,salario,edad);
        }
    }
    class Ejecutor {
        public static void main(String[] args) {
            boolean bandera;
            Scanner teclado = new Scanner(System.in);
            ArrayList<Empleado> empleado = new ArrayList<>(); //para almacenar una lista con varios objetos :p
            bandera = true;
            while(bandera){
                System.out.println("===== Menú =====");
                System.out.println("Digite 1. Agregar empleado");
                System.out.println("Digite 2. Mostrar información de los empleados");
                System.out.println("Digite 3. Calcular aumento de salario");
                System.out.println("Digite 4. Salir\n");
                System.out.print("Ingrese una opción: ");
                int opcion = teclado.nextInt();
                System.out.print("\n");
                if(opcion == 1){
                    System.out.println("Ingrese el nombre del empleado: ");
                    String nombre = teclado.next();
                    System.out.println("Ingrese el salario del empleado: ");
                    double salario = teclado.nextDouble();
                    System.out.println("Ingrese la edad del empleado: ");
                    int edad = teclado.nextInt();
                    teclado.nextLine();
                    empleado.add(new Empleado(nombre,edad, salario));

                    System.out.print("\n");
                } else if(opcion == 2){
                    for(Empleado trabajador:empleado){
                        System.out.println(trabajador);
                    }
                }else if(opcion==3){
                    System.out.println("Ingrese la cantidad de porcentaje para aumento del salario: ");
                    double porcentajeAumento = teclado.nextInt();
                    double salarioPromedio= 495.8;
                    for (Empleado empl:empleado){
                        salarioPromedio =salarioPromedio +empl.getSalario();
                    }
                    salarioPromedio=salarioPromedio/empleado.size();
                    for (Empleado empl : empleado) {
                        if (empl.getSalario() <= salarioPromedio) {
                            double nuevoProcentaje = empl.getSalario() * (porcentajeAumento /100);
                            double nuevoSalario = empl.getSalario() + nuevoProcentaje;
                            empl.setSalario(nuevoSalario);
                            System.out.println("El nuevo salario de Empleado "+empl.getNombre()
                                    +" es de: "+ nuevoSalario+"$");
                        }
                    }
                }else if(opcion == 4){
                    bandera = false;
                }else System.out.println("Error Vuelva digite");
            }
        }
    }

