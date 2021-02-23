package Controlador;

import Vista.Ventana;

public class Main {

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        Control programa = new Control(ventana);
        //Conexion BD Postgres de Vi
        //Conexion c = new Conexion();
        //c.conectarBD("localhost", "5432", "postgres", "postgres", "perseo");
    }

}
