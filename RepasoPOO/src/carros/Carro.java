package carros;

import transmision.Transmision;

/**
 *
 * @author VARGAS
 */
public abstract class Carro {
    
    private int velocidad;
    private String color;
    private Transmision miTransmision;
    
    
    public Carro(Transmision transmision){
        this.miTransmision = transmision;
    }
    
    public abstract void acelerar();
    public abstract void frenar();

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Transmision getMiTransmision() {
        return miTransmision;
    }

    public void setMiTransmision(Transmision miTransmision) {
        this.miTransmision = miTransmision;
    }
    
    
    
}
