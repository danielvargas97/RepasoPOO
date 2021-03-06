package carros;

import transmision.Transmision;

/**
 *
 * @author VARGAS
 */
public class F40 extends Carro {

    public F40(Transmision transmision) {
        super(transmision);
        transmision.mostrarTipo();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando el F40...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando el F40...");
    }

}
