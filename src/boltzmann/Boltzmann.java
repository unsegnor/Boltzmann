/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boltzmann;

/**
 *
 * @author Víctor
 */
public class Boltzmann {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Leer la configuración de la red de un archivo
        //Configuracion configuracion = new Configuracion("archivoRed");
        
        //cargar red (neuronas y pesos)
        Red red = new Red(nneuronas);
        //Red red = new Red(neuronas, conexiones);
        Red red = new Red(configuracion);
        
        //mostrar red
        //Graficos.muestra(null);
        
        //Definir el algoritmo de ejecución Enfriamiento simulado
        
        
        //Ejecutar red y obtener una red estable
        Red estable = red.Ejecutar();
        
        
        //Guardar red estable
        
        
        //Mostrar red estable
        
        
    }
}
