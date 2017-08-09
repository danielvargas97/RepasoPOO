package fabricas;

import carros.Carro;
import carros.F40;
import transmision.Transmision;

/**
 *
 * @author VARGAS
 */
public class FabricaFerrari extends Fabrica {

    @Override
    public Carro crearCarro(Transmision t) {
        return new F40(t);
    }

    
}
