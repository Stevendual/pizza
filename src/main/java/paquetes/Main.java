package paquetes;

public class Main {
    public static void main(String[] args) {

        pizza pizza1 = new pizza("Margarita", 100);
        topping to = new topping("Queso", 10);
        System.out.println(pizza1.toString());
        pizza.addIngrediente("Queso",10);
        pizza.addIngrediente("Tomate",15);
        pizza.addIngrediente("Albahaca",20);

        pizza1.preparar();
        pizza1.addTopping(new topping(to.getNombreTopping(), to.getPrecioTopping()));

        System.out.println(to.toString());
        pizza1.addTopping(to);
        pizza1.imprimirDatos();


    }
}