package com.Controleremoto;

import javax.naming.ldap.Control;

public class controleRemoto implements Controlador {

    private int volume;
    private int ligado;
    private int tocando;

    public controleRemoto() {
        this.volume = 50;
        this.ligado = 0;
        this.tocando = 0;
    }


    public void ligar() {
        this.setLigado(1);
    }

    public void desligar() {
        this.setLigado(0);
    }

    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume() + "%");
        for (int i = 10; i <= this.getVolume(); i+=10 ) {
            System.out.print("|");
            //System.out.println(i);
        }
        System.out.println("");
    }

    public void maisvolume(){
            setVolume(getVolume() + 5);
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getLigado() {
        return ligado;
    }

    public void setLigado(int ligado) {
        this.ligado = ligado;
    }

    public int getTocando() {
        return tocando;
    }

    public void setTocando(int tocando) {
        this.tocando = tocando;
    }
}


