package fabricas;

import carros.Carro;
import carros.Supra;
import transmision.Transmision;

/**
 *
 * @author VARGAS
 */
public class FabricaToyota extends Fabrica {

    @Override
    public Carro crearCarro(Transmision t) {
        return new Supra(t);
    }

    
}
