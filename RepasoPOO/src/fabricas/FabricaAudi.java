package fabricas;

import carros.A4;
import carros.Carro;
import transmision.Transmision;

/**
 *
 * @author PC
 */
public class FabricaAudi extends Fabrica {

    @Override
    public Carro crearCarro(Transmision t) {
        return new A4(t);
    }

}
