package paquetes;

import java.util.ArrayList;
import java.util.List;

public class pizza {
    private String nombre;
    private double precio;
    private List<topping> toppings =new ArrayList<>();

    //constructor
    public pizza(String nombre, double precio, topping...toppings) {
        this.nombre = nombre;
        this.precio = precio;
        for (topping to : toppings) {
            this.toppings.add(to);
        }
    }

    public static void addIngrediente(String ingrediente, double precio){
        System.out.println("Agregando ingrediente: "+ingrediente);
        System.out.println("Precio: "+precio);
        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
            System.out.printf("Error: %s", ex.getMessage());
        }

    }

    public void addTopping(topping topping){
        this.toppings.add(topping);
    }

    public void removeTopping(topping topping){
        this.toppings.remove(topping);
    }
    @Override
    public String toString() {
        return "Pizza " + nombre + " precio = " + precio;

    }

    //getters and setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<topping> getToppings() {
        return toppings;
    }

    public void preparar(){
        System.out.println("Preparando pizza ...."+this.nombre);
        System.out.println("Agregando toppings: ");
        for (topping topping : toppings) {
            System.out.println(" -- "+topping.getNombreTopping());
            try {
                Thread.sleep(3000);
            } catch (Exception ex) {
                System.out.printf("Error: %s", ex.getMessage());
            }
        }

    }

    public double calcularPrecio() {
        double precioTotal = precio;
        for (topping topping : toppings) {
            precioTotal = precio+ topping.getPrecioTopping();
        }
        return precioTotal;
    }

    public void imprimirDatos(){
        System.out.println("Pizza lista");
        System.out.println("Pizza: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Toppings: ");
        for (topping topping : toppings) {
            System.out.println(" -- "+topping.getNombreTopping());
        }
        System.out.println("Precio total: "+this.calcularPrecio());
    }
}
