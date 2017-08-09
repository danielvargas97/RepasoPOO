package fabricas;

import carros.Carro;
import transmision.Transmision;

/**
 *
 * @author VARGAS
 */
public abstract class Fabrica {

    public abstract Carro crearCarro(Transmision t);

}
