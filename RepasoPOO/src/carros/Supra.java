package carros;

import transmision.Transmision;

/**
 *
 * @author VARGAS
 */
public class Supra extends Carro {

    public Supra(Transmision t) {
        super(t);
        t.mostrarTipo();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando el Supra...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando el Supra...");
    }

}
