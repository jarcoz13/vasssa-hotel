package Controlador;

import Vista.Ventana;

public class Main {

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        Control programa = new Control(ventana);
        Conexion con = new Conexion();
        con.conectarBD("host", "port", "nombre bd", "postgres", "contraseña");
    }

}
