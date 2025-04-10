/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_campo;

/**
 *
 * @author renzo
 */
public class Producto {
    private int cod_prod;
    private String nombre_prod;
    private String categoria_prod;
    private float precio_prod;
    private int stock_prod;
 
    public void agregar_producto(int cod_prod, String nombre_prod, String categoria_prod, float precio_prod, int stock_prod){
        
        this.cod_prod = cod_prod;
        this.nombre_prod = nombre_prod;
        this.categoria_prod = categoria_prod;
        this.precio_prod = precio_prod;
        this.stock_prod = stock_prod;
        
        System.out.println("Se agreg  el producto correctamente");   
    }
    
    public void mostrar_producto(){
        
        System.out.println("Lista de productos agregados al almac n");
        System.out.println("Codigo: " + cod_prod + "\nNombre: " + nombre_prod + "\nCategor a: " + categoria_prod + "\nPrecio: " + precio_prod + "\nStock: " + stock_prod);
    }
}
