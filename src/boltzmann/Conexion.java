/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boltzmann;

/**
 *
 * @author Victor
 */
class Conexion {
    int neurona1;
    int neurona2;
    double peso;

    Conexion copia() {
        Conexion c = new Conexion();
        
        c.neurona1 = this.neurona1;
        c.neurona2 = this.neurona2;
        c.peso = this.peso;
        
        return c;
    }
}
