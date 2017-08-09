package main;

import carros.Carro;
import fabricas.Fabrica;
import fabricas.FabricaAudi;
import fabricas.FabricaFerrari;
import transmision.Automatico;
import transmision.Manual;

/**
 *
 * @author VARGAS
 */
public class Ventana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creando un Ferrari f40 automático //
        Fabrica constructora = new FabricaFerrari();
        Carro ferrari = constructora.crearCarro(new Automatico());
        ferrari.setColor("Rojo");
        
        // Hacemos unp pequeño test-drive del ferrari
        ferrari.acelerar();
        ferrari.frenar();
        
        
        // Creando un Audi A4 manual //
        constructora = new FabricaAudi();
        Carro audi = constructora.crearCarro(new Manual());
        audi.setColor("Plata");
        
        // Hacemos unp pequeño test-drive del audi
        audi.acelerar();
        audi.frenar();
        
        
        
        
    }

}
