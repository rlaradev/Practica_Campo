/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_campo;

/**
 *
 * @author renzo
 */
public class Practica_Campo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto producto = new Producto();
        
        producto.agregar_producto(01, "Laptop", "Tecnolog�a", 4150, 40);
        producto.agregar_producto(01, "Iphone", "Tecnolog�a", 2500, 75);
        producto.agregar_producto(01, "Tablet", "Tecnolog�a", 840, 200);
        
        producto.mostrar_producto();
    }
    
}
