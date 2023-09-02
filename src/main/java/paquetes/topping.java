package paquetes;

import java.util.ArrayList;

public class topping {
    private String nombreTopping;
    private double precioTopping;
    private final ArrayList<String> ingredienteToppings = new ArrayList<>();

    public void addIngredienteTopping(String ingredienteTopping, double precioTopping){
        this.ingredienteToppings.add(ingredienteTopping);
        this.precioTopping=precioTopping;
    }

    //constructor
    public topping(String nombreTopping, double precioTopping) {
        this.ingredienteToppings.add(nombreTopping);
        this.precioTopping = precioTopping;
    }
    @Override
    public String toString() {
       return "Ingrediente: " + ingredienteToppings;
    }

    //getters and setters

    public String getNombreTopping() {
        return nombreTopping;
    }

    public double getPrecioTopping() {
        return precioTopping;
    }

    public void setPrecioTopping(double precioTopping) {
        this.precioTopping = precioTopping;
    }

    public void setNombreTopping(String nombreTopping) {
        this.nombreTopping = nombreTopping;
    }
}
