package carros;

import transmision.Transmision;

/**
 *
 * @author VARGAS
 */
public class Supra extends Carro {

    public Supra(Transmision t){
        super(t);
    }
    
    @Override
    public void acelerar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void frenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
