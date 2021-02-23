package ejemplobasesdedatosproyect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BasesDatos {

	// ATRIBUTOS
	private Connection connection;

	// METODO PARA ESTABLECER CONEXION CON LA BASE DE DATOS
	public void EstablecerConexion() {

		if (connection != null) {
			return;
		}
		String url = "jdbc:postgresql://localhost:5432/postgres";

		try {
			Class.forName("org.postgresql.Driver");

			connection = DriverManager.getConnection(url, "postgres", "12345");
			if (connection != null) {
				System.out.println("Conectando a la base de datos...");
			}
		} catch (Exception e) {
			System.out.println("Problemas de conexion");
		}
	}

	// METODO PARA DETENER LA CONEXION
	public void DetenerConexion() {
		try {
			connection.close();
			System.out.println("Conexion detenida");
		} catch (Exception e) {
			System.out.println("Problema al cerrar la base de datos");
		}
	}

	// METODO PARA CREAR LA TABLA
	public void ReiniciarTabla() {
		Statement s = null;

		try {
			s = connection.createStatement();
			// SE EJECUTAN LOS COMANDOS PARA CREAR LA TABLA E INGRESA LA INFO DEL ADMIN
			s.executeUpdate("drop table if exists Registro;\r\n" + "\r\n" + "create table Registro(\r\n"
					+ "				usuario varchar(20)unique not null,\r\n"
					+ "				contraseña varchar(20)not null,\r\n"
					+ "				correo varchar(30)not null,\r\n" + "				genero varchar(10)not null,\r\n"
					+ "				edad int not null,\r\n" + "				pareja varchar(2),\r\n"
					+ "				userPareja varchar(20),\r\n" + "				idTarjeta serial primary key,\r\n"
					+ "				cupo int,\r\n" + "				deudaTarjeta int, \r\n"
					+ "				restriccion varchar(2), \r\n" + "				fecha varchar(15),\r\n"
					+ "				almacen varchar(30)\r\n" + "				);\r\n" + "				\r\n"
					+ "drop table if exists Almacen;\r\n" + "\r\n" + "create table Almacen(\r\n"
					+ "				nombre varchar(30)unique,\r\n" + "				idAlmacen serial primary key\r\n"
					+ ");\r\n" + "\r\n"
					+ "insert into Almacen (nombre) values ('sedeA'),('sedeB'),('sedeC'),('sedeD');");
			System.out.println("Tabla creada con exito");
		} catch (Exception e) {
			System.out.println("Error al crear tabla");
		}
	}

	// METODO PARA INSERTAR DATOS
	public void InsertarRegistro(String usuario, String contraseña, String correo, int genero, int edad,
			int cupoTarjeta, String pareja, int deuda, String restriccion, String almacen) {

		// CONDICION PARA VALIDAR SI ES HOMBRE(0) O MUJER(1)
		String gen;
		if (genero == 0) {
			gen = "Hombre";
		} else {
			gen = "Mujer";
		}
		Statement s = null;
		try {
			s = connection.createStatement();
			// INSERTA LOS DATOS
			int z = s.executeUpdate(
					"INSERT INTO Registro (usuario,contrase�a,correo,genero,edad,cupo,pareja,deudaTarjeta,restriccion,almacen) VALUES ('"
							+ usuario + "','" + contraseña + "','" + correo + "','" + gen + "','" + edad + "','"
							+ cupoTarjeta + "','" + pareja + "','" + deuda + "','" + restriccion + "','" + almacen
							+ "');");
			if (z == 1) {
				System.out.println("Se agreg� el registro de manera exitosa!");
			} else {
				System.out.println("Error al agregar el registro!");
			}
		} catch (Exception e) {
			System.out.println("Problema en insertarregistro");
			e.printStackTrace();
		}

	}

	// BORRAR DATOS DE LA TABLA REGISTRO
	public void BorrarUsuario(String usuario) {
		Statement s = null;
		try {
			s = connection.createStatement();
			int z = s.executeUpdate("DELETE FROM Registro where usuario='" + usuario + "';");
			if (z == 1) {
				System.out.println("Se elimino el usuario de manera exitosa!");
			} else {
				System.out.println("Error al eliminar el registro!");
			}
		} catch (Exception e) {
			System.out.println("Problema en insertarregistro");
			e.printStackTrace();
		}
	}
	// METODO PARA CREAR EL ALMACEN
	public void CrearAlmacen(String nombre) {
		Statement s = null;
		try {
			s = connection.createStatement();
			int z = s.executeUpdate("INSERT INTO Almacen (nombre) VALUES ('" + nombre + "');");
			if (z == 1) {
				System.out.println("Se agreg� el registro de manera exitosa!");
			} else {
				System.out.println("Error al agregar el registro!");
			}
		} catch (Exception e) {
			System.out.println("Error al agregar el registro!");
		}
	}
	// BORRAR ALMACEN DE LA TABLA ALMACEN
	public void BorrarAlmacen(String nombre) {
		Statement s = null;
		try {
			s = connection.createStatement();
			int z = s.executeUpdate("DELETE FROM Almacen where nombre='" + nombre + "';");
			if (z == 1) {
				System.out.println("Se elimino el almacen de manera exitosa!");
			} else {
				System.out.println("Error al eliminar el registro!");
			}
		} catch (Exception e) {
			System.out.println("Problema en insertarregistro");
			e.printStackTrace();
		}
	}


	// METODO PARA PASAR A TABLA
	public void printTabla(JTable tabla) {
		ResultSet rs = null;
		Statement s = null;

		DefaultTableModel model = new DefaultTableModel();

		model.addColumn("Usuario");// 1
		model.addColumn("Contrase�a");// 2
		model.addColumn("Correo");// 3
		model.addColumn("Genero");// 4
		model.addColumn("Edad");// 5
		model.addColumn("Pareja");// 6
		model.addColumn("Nombre de pareja");// 7
		model.addColumn("ID Tarjeta");// 8
		model.addColumn("Cupo");// 9
		model.addColumn("Deuda");// 10
		model.addColumn("Fecha");// 12
		model.addColumn("Almacen");// 13

		tabla.setModel(model);

		String[] datos = new String[12];

		try {

			s = connection.createStatement();
			rs = s.executeQuery("SELECT * FROM Registro;");

			while (rs.next()) {
				datos[0] = rs.getString(1);
				datos[1] = rs.getString(2);
				datos[2] = rs.getString(3);
				datos[3] = rs.getString(4);
				datos[4] = rs.getString(5);
				datos[5] = rs.getString(6);
				datos[6] = rs.getString(7);
				datos[7] = rs.getString(8);
				datos[8] = rs.getString(9);
				datos[9] = rs.getString(10);
				datos[10] = rs.getString(12);
				datos[11] = rs.getString(13);
				model.addRow(datos);
			}

		} catch (Exception e) {

			System.out.println("Error en tabla");

		}
	}

	// METODO PARA SABER LA CANTIDAD DE ALMACENES
	public int getRegistroAlmacen() {
		int n = 0;
		ResultSet rs = null;
		Statement s = null;
		String datos = "";

		try {
			s = connection.createStatement();
			rs = s.executeQuery("select count(*) from Almacen;");
			while (rs.next()) {
				datos = rs.getString(1);
			}

		} catch (Exception e) {
			System.out.println("Error en tabla r");
		}
		n = Integer.parseInt(datos);
		return n;

	}

	// METODO PARA DEVOLVER ARREGLO CON TODOS LOS ALMACENES
	public String[] getAlmacenes() {

		int i = 0;
		int tam = getRegistroAlmacen();
		String[] almacenes = new String[tam];
		ResultSet rs = null;
		Statement s = null;

		try {
			s = connection.createStatement();
			rs = s.executeQuery("select * from Almacen;");
			while (rs.next()) {
				almacenes[i] = rs.getString(1);
				i++;
			}

		} catch (Exception e) {
			System.out.println("Error en tabla a");
		}

		return almacenes;
	}

	// METODO PARA CONTAR USUARIOS
	public int getNumUsers() {
		int n = 0;
		ResultSet rs = null;
		Statement s = null;
		String datos = "";

		try {
			s = connection.createStatement();
			rs = s.executeQuery("select count(*) from Registro;");
			while (rs.next()) {
				datos = rs.getString(1);
			}

		} catch (Exception e) {
			System.out.println("Error en tabla r");
		}
		n = Integer.parseInt(datos);
		return n;

	}

	// METODO PARA DEVOLVER LOS CUPOS
	public int getSumaDatos(int dato) {

		int n = 0;
		ResultSet rs = null;
		Statement s = null;

		try {
			s = connection.createStatement();
			rs = s.executeQuery("select * from Registro;");
			while (rs.next()) {
				n += Integer.parseInt(rs.getString(dato));
			}

		} catch (Exception e) {
			System.out.println("Error en tabla a");
		}

		return n;
	}

	// METODO QUE DEVULEVE UN ARRAY CON LOS DATOS DEL REGISTRO
	public int[] arrayDatos(int dato) {
		int n[] = new int[getNumUsers()];
		int i = 0;
		ResultSet rs = null;
		Statement s = null;

		try {
			s = connection.createStatement();
			rs = s.executeQuery("select * from Registro;");
			while (rs.next()) {
				n[i] = Integer.parseInt(rs.getString(dato));
				i++;
			}

		} catch (Exception e) {
			System.out.println("Error en tabla a");
		}

		return n;
	}

	// METODO PARA HACER LA CONSULTA DE USUARIO
	public boolean ConsultarUsuario(String usuario) {

		boolean existe = false;
		ResultSet rs = null;
		Statement s = null;

		try {
			s = connection.createStatement();
			rs = s.executeQuery("SELECT usuario FROM Registro WHERE usuario='" + usuario + "';");
			if (!rs.next()) {
				existe = true;
			}
		} catch (Exception e) {

			System.out.println("Problema en consultaUsuario");
		}
		return existe;
	}

	// METODO PARA HACER LA CONSULTA USUARIO Y CONTRASE�A
	public boolean ConsultarSesion(String usuario, String contra) {

		boolean existe = false;
		ResultSet rs = null;
		Statement s = null;
		try {
			s = connection.createStatement();
			rs = s.executeQuery("SELECT usuario,contrase�a FROM Registro WHERE usuario='" + usuario
					+ "' and contrase�a = '" + contra + "';");
			if (rs.next()) {
				existe = true;
			}

		} catch (Exception e) {

			System.out.println("Problema en consultaSesion");
		}
		return existe;
	}

	// METODO PARA AGREGAR PAREJA
	public void agregarPareja(String pareja, int id) {
		Statement s = null;

		try {
			s = connection.createStatement();
			s.executeUpdate(
					"UPDATE Registro SET userPareja='" + pareja + "', pareja='Si' WHERE idTarjeta='" + id + "';");
		} catch (Exception e) {

			System.out.println("Problema en pareja");
		}
	}

	// METODO PARA AGREGAR FECHA
	public void agregarFecha(String fecha, int id) {
		Statement s = null;

		try {
			s = connection.createStatement();
			s.executeUpdate(
					"UPDATE Registro SET fecha='" + fecha + "', restriccion='Si' WHERE idTarjeta='" + id + "';");
		} catch (Exception e) {

			System.out.println("Problema en fecha");
		}
	}

	// METODO PARA QUITAR FECHA
	public void quitarFecha(String fecha, int id) {
		Statement s = null;

		try {
			s = connection.createStatement();
			s.executeUpdate(
					"UPDATE Registro SET fecha='" + fecha + "', restriccion='No' WHERE idTarjeta='" + id + "';");
		} catch (Exception e) {

			System.out.println("Problema en fecha");
		}
	}

	// METODO PARA QUITAR PAREJA
	public void quitarPareja(String pareja, int id) {
		Statement s = null;

		try {
			s = connection.createStatement();
			s.executeUpdate(
					"UPDATE Registro SET userPareja='" + pareja + "', pareja='No' WHERE idTarjeta='" + id + "';");

		} catch (Exception e) {

			System.out.println("Problema en pareja");
		}
	}

	// METODO PARA AGREGAR SOBRECUPO
	public void agregarCupo(int cupo, int id) {
		Statement s = null;

		try {
			s = connection.createStatement();
			s.executeUpdate("UPDATE Registro SET cupo='" + cupo + "' WHERE idTarjeta='" + id + "';");
		} catch (Exception e) {

			System.out.println("Problema en cupo");
		}
	}

	// METODO PARA AGREGAR DEUDA
	public void agregarDeuda(int deuda, int id) {
		Statement s = null;

		try {
			s = connection.createStatement();
			s.executeUpdate("UPDATE Registro SET deudaTarjeta='" + deuda + "' WHERE idTarjeta='" + id + "';");
		} catch (Exception e) {

			System.out.println("Problema en deuda");
		}
	}
	//"GETTERS"

	// METODO PARA EL OBTENER EL USUARIO
	public String getUsuario(String usuario) {

		ResultSet rs = null;
		Statement s = null;
		String string = null;
		try {
			s = connection.createStatement();
			rs = s.executeQuery("SELECT usuario FROM Registro WHERE usuario='" + usuario + "';");
			while (rs.next()) {
				string = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println("uh");
		}

		return string;
	}

	// METODO PARA OBTENER LA CONTRASE�A
	public String getContra(String usuario) {

		ResultSet rs = null;
		Statement s = null;
		String string = null;
		try {
			s = connection.createStatement();
			rs = s.executeQuery("SELECT contrase�a FROM Registro WHERE usuario='" + usuario + "';");
			while (rs.next()) {
				string = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println("uh");
		}

		return string;
	}

	// METODO PARA OBTENER EL CORREO
	public String getCorreo(String usuario) {

		ResultSet rs = null;
		Statement s = null;
		String string = null;
		try {
			s = connection.createStatement();
			rs = s.executeQuery("SELECT correo FROM Registro WHERE usuario='" + usuario + "';");
			while (rs.next()) {
				string = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println("uh");
		}

		return string;
	}

	// METODO PARA OBTENER EL GENERO
	public int getGenero(String usuario) {

		ResultSet rs = null;
		Statement s = null;
		String string = null;
		int n;
		try {
			s = connection.createStatement();
			rs = s.executeQuery("SELECT genero FROM Registro WHERE usuario='" + usuario + "';");
			while (rs.next()) {
				string = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println("uh");
		}

		if (string.equals("Hombre")) {
			n = 0;
		} else {
			n = 1;
		}
		return n;
	}

	// METODO PARA OBTENER LA EDAD
	public int getEdad(String usuario) {

		ResultSet rs = null;
		Statement s = null;
		String string = null;
		int n;
		try {
			s = connection.createStatement();
			rs = s.executeQuery("SELECT edad FROM Registro WHERE usuario='" + usuario + "';");
			while (rs.next()) {
				string = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println("uh");
		}
		n = Integer.parseInt(string);
		return n;
	}

	// METODO PARA OBTENER LA PAREJA
	public boolean getPareja(String usuario) {

		ResultSet rs = null;
		Statement s = null;
		String string = null;
		boolean tiene;
		try {
			s = connection.createStatement();
			rs = s.executeQuery("SELECT pareja FROM Registro WHERE usuario='" + usuario + "';");
			while (rs.next()) {
				string = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println("uh");
		}
		if (string.equals("No")) {
			tiene = false;
		} else {
			tiene = true;
		}

		return tiene;
	}

	// METODO PARA OBTENER USER PAREJA
	public String getUserPareja(String usuario) {

		ResultSet rs = null;
		Statement s = null;
		String string = null;
		try {
			s = connection.createStatement();
			rs = s.executeQuery("SELECT userPareja FROM Registro WHERE usuario='" + usuario + "';");
			while (rs.next()) {
				string = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println("uh");
		}

		return string;
	}

	// METODO PARA OBTENER LA ID TARJETA
	public int getIdTarjeta(String usuario) {

		ResultSet rs = null;
		Statement s = null;
		String string = null;
		int n;
		try {
			s = connection.createStatement();
			rs = s.executeQuery("SELECT idTarjeta FROM Registro WHERE usuario='" + usuario + "';");
			while (rs.next()) {
				string = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println("uh");
		}

		n = Integer.parseInt(string);
		return n;
	}

	// METODO PARA OBTENER EL CUPO TARJETA
	public int getCupoTarjeta(String usuario) {

		ResultSet rs = null;
		Statement s = null;
		String string = null;
		int n;
		try {
			s = connection.createStatement();
			rs = s.executeQuery("SELECT cupo FROM Registro WHERE usuario='" + usuario + "';");
			while (rs.next()) {
				string = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println("uh");
		}

		n = Integer.parseInt(string);
		return n;
	}

	// METODO PARA OBTENER LA DEUDA TARJETA
	public int getDeudaTarjeta(String usuario) {

		ResultSet rs = null;
		Statement s = null;
		String string = null;
		int n;
		try {
			s = connection.createStatement();
			rs = s.executeQuery("SELECT deudaTarjeta FROM Registro WHERE usuario='" + usuario + "';");
			while (rs.next()) {
				string = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println("uh");
		}

		n = Integer.parseInt(string);
		return n;
	}

	// METODO PARA OBTENER LA RESTRICCION
	public boolean getRestriccion(String usuario) {

		ResultSet rs = null;
		Statement s = null;
		String string = null;
		boolean tiene;
		try {
			s = connection.createStatement();
			rs = s.executeQuery("SELECT restriccion FROM Registro WHERE usuario='" + usuario + "';");
			while (rs.next()) {
				string = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println("uh");
		}
		if (string.equals("No")) {
			tiene = false;
		} else {
			tiene = true;
		}

		return tiene;
	}

	// METODO PARA OBTENER LA FECHA
	public String getFecha(String usuario) {

		ResultSet rs = null;
		Statement s = null;
		String string = null;
		try {
			s = connection.createStatement();
			rs = s.executeQuery("SELECT fecha FROM Registro WHERE usuario='" + usuario + "';");
			while (rs.next()) {
				string = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println("uh");
		}

		return string;
	}

	// METODO PARA OBTENER EL ALMACEN
	public String getAlmacen(String usuario) {

		ResultSet rs = null;
		Statement s = null;
		String string = null;
		try {
			s = connection.createStatement();
			rs = s.executeQuery("SELECT almacen FROM Registro WHERE usuario='" + usuario + "';");
			while (rs.next()) {
				string = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println("uh");
		}

		return string;
	}



}
