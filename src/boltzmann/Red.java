/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boltzmann;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Víctor
 */
class Red {

    Random r = new Random();
    int[] neuronas;
    int nneuronas;
    
    ArrayList<Conexion> conexiones = new ArrayList<Conexion>();

    Red(){}
    
    Red(int nneuronas) {
        init(nneuronas);
    }

    private void init(int nneuronas) {
        this.nneuronas = nneuronas;
        neuronas = new int[nneuronas];
        
        llenarPesosAleatorios();
        
    }

    Red Ejecutar() {

        Red respuesta = null;

        Red actual = this;

        //Inicializar Temperatura
        double temperatura = 10;

        //Mientras la temperatura sea mayor que el mínimo
        while (temperatura > 0) {

            //Hacer tantas veces como neuronas
            for (int i = 0; i < this.nneuronas; i++) {

                //Calcular función de consenso
                double consenso = actual.consenso();
                //Elegir una neurona al azar
                int npos = r.nextInt(nneuronas);

                //Copiar la red
                Red nueva = actual.copiar();

                //Modificarla
                if (nueva.neuronas[npos] == 1) {
                    nueva.neuronas[npos] = 0;
                } else {
                    nueva.neuronas[npos] = 1;
                }
                //Calcular la función de consenso
                double consenso2 = nueva.consenso();

                //Si es mejor -> estado = nuevo_estado
                if (consenso2 > consenso) {
                    actual = nueva;
                } //Sino ->
                else {
                    //Obtener probabilidad según la distribución de Boltzmann y la temperatura
                    if(Boltzmann(temperatura)){
                        //si procede aceptar -> estado = nuevo_estado
                        actual = nueva;
                    }
                }
                //fin_hacer
            }
            //Modificar la temperatura
            temperatura -= 0.3;
            //fin_mientras
        }
        return respuesta;
    }

    private Red copiar() {
        Red copia = new Red();
        
        copia.neuronas = Arrays.copyOf(neuronas, neuronas.length);
        copia.nneuronas = neuronas.length;
        
        //Copiar los elementos de las conexiones
        for(Conexion c : conexiones){
            copia.conexiones.add(c.copia());
        }
        
        return copia;
    }

    private void llenarPesosAleatorios() {
        
    }
}
