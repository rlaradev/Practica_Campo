
package practica_campo;

public class Practica_Campo {

    public static void main(String[] args) {
        // TODO code application logic here
        Producto producto = new Producto();
        
        producto.agregar_producto(01, "Laptop", "Tecnolog�a", 4150, 40);
        producto.agregar_producto(01, "Iphone", "Tecnolog�a", 2500, 75);
        producto.agregar_producto(01, "Tablet", "Tecnolog�a", 840, 200);
        
        producto.mostrar_producto();
    }
    
}
