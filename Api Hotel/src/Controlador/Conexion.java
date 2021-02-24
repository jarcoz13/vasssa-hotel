package Controlador;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Conexion {

    Connection connection;

    //CONEXION 
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
            connection = null;
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

    //METODO CONSULTAR RESERVA DISPONIBLE SIMP
    public boolean ConsultarReserva(Date f_inicial, Date f_final) {

        boolean existe = false;
        ResultSet rs = null;
        Statement s = null;
        try {
            s = connection.createStatement();
            rs = s.executeQuery("SELECT f_inicio,f_final FROM reserva WHERE f_inicial BETWEEN '" + f_inicial
                    + "' AND '" + f_final + "' AND f_final BETWEEN '" + f_inicial
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
    public boolean ConsultarReservaComp(Date f_inicial, Date f_final, int habSencilla, int habDoble, int numPersonas) {

        boolean disp = false;
        boolean existe = false;

        ResultSet rs = null;
        Statement s = null;
        String datos = "";
        int hs = 0;
        int hd = 0;
        try {
            s = connection.createStatement();
            rs = s.executeQuery("SELECT f_inicio,f_final FROM reserva WHERE f_inicial BETWEEN '" + f_inicial
                    + "' AND '" + f_final + "' AND f_final BETWEEN '" + f_inicial
                    + "' AND '" + f_final + "';");
            if (rs.next()) {
                disp = true;
            }

        } catch (Exception e) {

            System.out.println("Problema en consultaSesion");
        }
        try {
            s = connection.createStatement();
            rs = s.executeQuery("SELECT count(th.k_id_tipo_habitacion) FROM habitacion h JOIN habitacion_tipo ht ON h.k_id_habitacion=ht.k_id_habitacion JOIN tipo_habitacion th ON ht.k_id_tipo_habitacion=th.k_id_tipo_habitacion LEFT JOIN reserva_habitacion rh ON h.k_id_habitacion=rh.k_id_habitacion WHERE rh.k_id_habitacion IS NULL AND th.k_id_tipo_habitacion = 1");
            while (rs.next()) {
                datos = rs.getString(1);
            }

        } catch (Exception e) {
            System.out.println("Error en tabla r");
        }
        hs = Integer.parseInt(datos);
        try {
            s = connection.createStatement();
            rs = s.executeQuery("SELECT count(th.k_id_tipo_habitacion) FROM habitacion h JOIN habitacion_tipo ht ON h.k_id_habitacion=ht.k_id_habitacion JOIN tipo_habitacion th ON ht.k_id_tipo_habitacion=th.k_id_tipo_habitacion LEFT JOIN reserva_habitacion rh ON h.k_id_habitacion=rh.k_id_habitacion WHERE rh.k_id_habitacion IS NULL AND th.k_id_tipo_habitacion = 2");
            while (rs.next()) {
                datos = rs.getString(1);
            }

        } catch (Exception e) {
            System.out.println("Error en tabla r");
        }
        hd = Integer.parseInt(datos);
        if (habSencilla <= hs & habDoble <= hd & disp == true) {
            existe = false;
        } else {
            existe = true;
        }
        return existe;
    }

    //METODO CONFIRMAR RESERVA
    public void InsertarReserva(int idReserva, int estado, Date f_inicio, Date f_final, int numDias,
            int idTipo, int idNumero, String apellido, String nombre, String direccion, String ciudad, String telefono, Date fNacimiento, int edad) {
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

    //MODIFICAR ESTADO DE UNA RESERVA POR NOMBRE
    public void modResNom(String nombre, int estado) {
        Statement s = null;

        try {
            s = connection.createStatement();
            s.executeUpdate("update reserva set i_estado="+estado+" from reserva r INNER JOIN persona p ON p.k_id_persona_tipo=r.k_id_persona_tipo where p.n_nombre = '"+nombre+"'");
        } catch (Exception e) {

            System.out.println("Problema en Reserva");
        }
    }
    
    //MODIFICAR ESTADO DE UNA RESERVA POR NUMERO Y FECHA
    public void modResNumFecha(String numero, Date fecha, int estado) {
        Statement s = null;

        try {
            s = connection.createStatement();
            s.executeUpdate("update reserva set i_estado="+estado+" from reserva r JOIN huesped h ON h.k_id_persona_tipo=r.k_id_persona_tipo where r.f_inicio= '"+fecha+"' AND h.q_telefono = '"+numero+"'");
        } catch (Exception e) {

            System.out.println("Problema en Reserva");
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
            rs = s.executeQuery("SELECT h.k_id_habitacion, ht.k_id_tipo_habitacion, h.q_num_camas, th.v_precio, th.v_descuento FROM habitacion h, habitacion_tipo ht, tipo_habitacion th LEFT JOIN reserva_habitacion rh ON h.k_id_habitacion=rh.k_id_habitacion WHERE h.k_id_habitacion=ht.k_id_habitacion AND ht.k_id_tipo_habitacion=th.k_id_tipo_habitacion AND rh.k_id_habitacion IS NULL;");

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

    //METODO CONSULTAR PRECIO DE UNA HABITACION
    public int getPrecio(int tipo) {

        ResultSet rs = null;
        Statement s = null;
        String string = null;
        int n;
        try {
            s = connection.createStatement();
            rs = s.executeQuery("SELECT th.v_precio FROM habitacion h JOIN habitacion_tipo ht ON h.k_id_habitacion=ht.k_id_habitacion JOIN tipo_habitacion th ON ht.k_id_tipo_habitacion=th.k_id_tipo_habitacion WHERE th.k_id_tipo_habitacion = " + tipo + " LIMIT 1");
            while (rs.next()) {
                string = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("uh");
        }
        n = Integer.parseInt(string);
        return n;
    }

    //METODO CONSULTAR PRECIO DE UNA HABITACION
    public int getDescuento(int tipo) {

        ResultSet rs = null;
        Statement s = null;
        String string = null;
        int n;
        try {
            s = connection.createStatement();
            rs = s.executeQuery("SELECT th.v_descuento FROM habitacion h JOIN habitacion_tipo ht ON h.k_id_habitacion=ht.k_id_habitacion JOIN tipo_habitacion th ON ht.k_id_tipo_habitacion=th.k_id_tipo_habitacion WHERE th.k_id_tipo_habitacion = " + tipo + " LIMIT 1");
            while (rs.next()) {
                string = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("uh");
        }
        n = Integer.parseInt(string);
        return n;
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
}
