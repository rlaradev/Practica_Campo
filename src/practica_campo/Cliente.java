
package practica_campo;

import java.util.ArrayList;

public class Cliente {
 
    public class Persona {
    private String nombre;
  
    
    //Persona puede ser propietario de 0 a muchos equipos informaticos
    private ArrayList<EquipoInformatico> propietario = new ArrayList();
    

    
    public void encender_televisor() {
        System.out.println("TV encendida");
    }
    }
}
