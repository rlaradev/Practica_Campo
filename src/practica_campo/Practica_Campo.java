
package practica_campo;

public class Practica_Campo {

    public static void main(String[] args) {
        // TODO code application logic here
        Producto producto = new Producto();
        
        producto.agregar_producto(01, "Laptop", "Tecnología", 4150, 40);
        producto.agregar_producto(01, "Iphone", "Tecnología", 2500, 75);
        producto.agregar_producto(01, "Tablet", "Tecnología", 840, 200);
        
        producto.mostrar_producto();
    }
    
}
