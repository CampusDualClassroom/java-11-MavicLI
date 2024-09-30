package com.campusdual.classroom;

public class TVRemote {
    //atributos
    int channel;
    int volume;
    boolean on;
    String color;

    //constructores:
    public TVRemote(String color) {
        this.channel = 0;
        this.volume = 0;
        this.color = color;
    }

    //metodos
    public boolean turnOn() {
        this.on = true;
        return this.on;
    }

    public boolean turnOff() {
        this.on = false;
        return this.on;
    }

    public void channelUp() {
        this.channel++;
    }

    public void channelDown() {
        if (this.checkMinValue(this.channel)) { //si esta condiciones falsa, no hace nada; si es true entra y le baja 1 unidad al canal
            this.channel--;
        }
    }

    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        if (this.checkMinValue(this.volume)) {
            this.volume--;
        }
    }

    public String getColor() { //getcolour = obtener valor
        return this.color;
    }

    private boolean checkMinValue(int value) {
        if (value == 0) {
            return false;
        } else {
            return true;
        }
    }


}
