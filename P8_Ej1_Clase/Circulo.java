package mx.unam.fi.poo.g1.p8_1;
import mx.unam.fi.poo.g1.p8_1.*;

class Circulo extends Figura{
    private double radio;

    public Circulo(double radio){
        setRadio(radio);
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return this.radio;
    }

    @Override
    public void dibuja(){
        System.out.println("Mas adelante van a usar graficos en Java...");
    }

    @Override
    public double calculaArea(){
        return Math.PI * getRadio() * getRadio();
    }
}