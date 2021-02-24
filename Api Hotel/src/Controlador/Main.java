package Controlador;

import Vista.Ventana;

public class Main {

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        Control programa = new Control(ventana);
    }

}
