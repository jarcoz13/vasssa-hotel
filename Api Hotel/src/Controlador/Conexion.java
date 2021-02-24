package Controlador;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Conexion {

    public void conectarBD(String host, String port, String database,
            String user, String password) {
        String url = "";
        try {
            // Registro driver de Postgres
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }
            Connection connection = null;
            url = "jdbc:postgresql://" + host + ":" + port + "/" + database;
            // Coneccion
            connection = DriverManager.getConnection(
                    url,
                    user, password);
            boolean valid = connection.isValid(50000);
            System.out.println(valid ? "OK" : "FAIL");
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error al conectar con (" + url + "): " + sqle);
        }
    }
<<<<<<< HEAD
=======

    //METODO CONSULTAR RESERVA DISPONIBLE SIMP
    public boolean ConsultarSesion(String f_inicio, String f_final) {

        boolean existe = false;
        ResultSet rs = null;
        Statement s = null;
        //La fecha esta dentro de una reserva hecha
        try {
            s = connection.createStatement();
            rs = s.executeQuery("SELECT f_inicio,f_final FROM reserva WHERE f_inicio BETWEEN '" + f_inicio
                    + "' AND '" + f_final + "' and f_final BETWEEN '" + f_inicio
                    + "' AND '" + f_final + "';");
            if (rs.next()) {
                existe = true;
            }

        } catch (Exception e) {

            System.out.println("Problema en consultaSesion");
        }
        return existe;
    }

    //METODO CONSULTAR RESERVA DISPONIBLE COMP
    
    //METODO CONFIRMAR RESERVA
    public void InsertarReserva(int idReserva, int estado, Date f_inicio, Date f_final, int numDias,
            int idTipo, int idNumero, String apellido, String nombre, String direccion, String ciudad, int telefono, Date fNacimiento, int edad) {
        Statement s = null;
        try {
            s = connection.createStatement();
            // INSERTA DATOS DE PERSONA
            int z = s.executeUpdate(
                    "INSERT INTO persona (k_id_persona_tipo,k_id_persona_numero,n_apellido,n_nombre) VALUES ('"
                    + idTipo + "','" + idNumero + "','" + apellido + "','" + nombre + "');");
            if (z == 1) {
                System.out.println("Se agrego la persona de manera exitosa!");
            } else {
                System.out.println("Error");
            }
            // INSERTA DATOS DE HUESPED
            z = s.executeUpdate(
                    "INSERT INTO huesped (k_id_persona_tipo,k_id_persona_numero,n_direccion_residencia,n_ciudad_residencia,q_telefono,f_fecha_nacimiento,q_edad) VALUES ('"
                    + idTipo + "','" + idNumero + "','" + direccion + "','" + ciudad + "','" + telefono + "','" + fNacimiento + "','" + edad + "');");
            if (z == 1) {
                System.out.println("Se agrego el huesped de manera exitosa!");
            } else {
                System.out.println("Error");
            }
            // INSERTA DATOS DE RESERVA
            z = s.executeUpdate(
                    "INSERT INTO huesped (k_id_reserva,i_estado,f_inicio,f_final,q_num_diask_id_persona_tipo,k_id_persona_numero) VALUES ('"
                    + idReserva + "','" + estado + "','" + f_inicio + "','" + f_final + "','" + numDias + "','" + idTipo + "','" + idNumero + "');");
            if (z == 1) {
                System.out.println("Se agrego la reserva de manera exitosa!");
            } else {
            }
        } catch (Exception e) {
            System.out.println("Problema en insertar reserva");
            e.printStackTrace();
        }
    }

    //METODO MOSTRAR HABITACIONES
    public void printHabitaciones(JTable tabla) {
        ResultSet rs = null;
        Statement s = null;

        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Habitacion");// 1
        model.addColumn("Tipo");// 2
        model.addColumn("Camas");// 3
        model.addColumn("Precio");// 4
        model.addColumn("Descuento");// 5

        tabla.setModel(model);

        String[] datos = new String[5];

        try {

            s = connection.createStatement();
            rs = s.executeQuery("SELECT h.k_id_habitacion, ht.k_id_tipo_habitacion, h.q_num_camas, th.v_precio, th.v_descuento FROM habitacion h, habitacion_tipo ht, tipo_habitacion th WHERE h.k_id_habitacion=ht.k_id_habitacion AND ht.k_id_tipo_habitacion=th.k_id_tipo_habitacion;");

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                model.addRow(datos);
            }

        } catch (Exception e) {

            System.out.println("Error en tabla");

        }
    }
    //METODO MOSTRAR HABITACIONES

    public void printHabDisponibles(JTable tabla) {
        ResultSet rs = null;
        Statement s = null;

        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Habitacion");// 1
        model.addColumn("Tipo");// 2
        model.addColumn("Camas");// 3
        model.addColumn("Precio");// 4
        model.addColumn("Descuento");// 5

        tabla.setModel(model);

        String[] datos = new String[5];

        try {
            s = connection.createStatement();
            //Modificar para que muestre los registros que NO ESTEN EN reserva_habitacion
            rs = s.executeQuery("SELECT h.k_id_habitacion, ht.k_id_tipo_habitacion, h.q_num_camas, th.v_precio, th.v_descuento FROM habitacion h, habitacion_tipo ht, tipo_habitacion th WHERE h.k_id_habitacion=ht.k_id_habitacion AND ht.k_id_tipo_habitacion=th.k_id_tipo_habitacion;");

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                model.addRow(datos);
            }

        } catch (Exception e) {

            System.out.println("Error en tabla");

        }
    }

    //METODO RESERVAR HABITACIONES DISPONIBLES
    public void InsertarRegistro(int idReserva, int idHabitacion) {
        Statement s = null;
        try {
            s = connection.createStatement();
            // INSERTA LOS DATOS
            int z = s.executeUpdate(
                    "INSERT INTO reserva_habitacion (k_id_reserva,k_id_habitacion) VALUES ('" + idReserva + "','" + idHabitacion + "');");
            if (z == 1) {
                System.out.println("Se agrego la reserva de manera exitosa!");
            } else {
                System.out.println("Error");
            }
        } catch (Exception e) {
            System.out.println("Problema en insertar reserva de habitacion");
            e.printStackTrace();
        }

    }
>>>>>>> bac33c2508b6ffcb6aba84cbe349a75afa063845
}
