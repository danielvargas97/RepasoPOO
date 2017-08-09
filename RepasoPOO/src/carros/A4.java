package carros;

import transmision.Transmision;

/**
 *
 * @author PC
 */
public class A4 extends Carro {

    public A4(Transmision transmision) {
        super(transmision);
        transmision.mostrarTipo();
    }

    @Override
    public void acelerar() {
        
        System.out.println("Acelerando el A4 ...");
        
        
    }

    @Override
    public void frenar() {
        System.out.println("Frenando el A4...");
    }
}
