package Controlador;

import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Control implements ActionListener {

    private final Ventana ventana;
    Conexion con = new Conexion();

    public Control(Ventana ventana) {
        this.ventana = ventana;
        inicializarAcciones();
    }

    public void inicializarAcciones() {
        ventana.getBotonInicio().addActionListener(this);
        ventana.getBotonReservas().addActionListener(this);
        ventana.getBotonMenu().addActionListener(this);
        ventana.getBotonUbicacion().addActionListener(this);
        ventana.getBotonContacto().addActionListener(this);
        ventana.getVistaMenu().getBotonLogin().addActionListener(this);
        ventana.getVistaMenu().getBotonSalir().addActionListener(this);
        ventana.getVistaReservas().getBotonConsultar().addActionListener(this);
        ventana.getVistaReservas().getBotonReservar().addActionListener(this);
        ventana.getVistaReservas().getBotonCancelar().addActionListener(this);
        ventana.getVistaFormulario().getBotonAgregar().addActionListener(this);
        ventana.getVistaFormulario().getBotonConsultar().addActionListener(this);
        ventana.getVistaFormulario().getBotonConfirmarReserva().addActionListener(this);
        ventana.getVistaFormulario().getBotonLimpiar().addActionListener(this);
        ventana.getVistaCancelacion().getRadioNombre().addActionListener(this);
        ventana.getVistaCancelacion().getRadioTelyFecha().addActionListener(this);
        ventana.getVistaCancelacion().getBotonBuscar().addActionListener(this);
        ventana.getVistaLogin().getBotonIngreso().addActionListener(this);
        ventana.getVistaAdmin().getBotonEmpleados().addActionListener(this);
        ventana.getVistaAdmin().getBotonMenu().addActionListener(this);
        ventana.getVistaAdmin().getBotonHabitaciones().addActionListener(this);
        ventana.getVistaAdmin().getBotonHuespeds().addActionListener(this);
        ventana.getVistaAdmin().getBotonReservas().addActionListener(this);
        ventana.getVistaMenuAdmin().getBotonCerrarSesion().addActionListener(this);
        ventana.getVistaMenuAdmin().getBotonSalir().addActionListener(this);
        ventana.getVistaAdminRes().getBotonInsertar().addActionListener(this);
        ventana.getVistaAdminRes().getBotonActualizar().addActionListener(this);
        ventana.getVistaAdminRes().getBotonEliminar().addActionListener(this);
    }

    /* Los métodos QUERY se encargan de hacer la consulta necesaria
       todos son de tipo BOOLEAN y deben retornar TRUE si lo que se busca
        consultar existe o FALSE si no
     */
    public boolean queryReserva(String fechaInicial, String fechaFinal, int habitaciones, int numPersonas) { //Consulta rápida
        boolean disponible = false;
        disponible = con.ConsultarReserva(fechaInicial, fechaFinal);
        return disponible;
    }

    public boolean queryReserva(String fechaInicial, String fechaFinal, int habitacionesSencillas, int habitacionesDobles, int numPersonas) { //Consulta completa
        boolean disponible = false;
        disponible = con.ConsultarReservaComp(fechaInicial, fechaFinal, habitacionesSencillas, habitacionesDobles, numPersonas);
        return disponible;
    }

    public boolean queryReserva(int llave) { //Consulta por llave primaria
        //IMPLEMENTAR
        return true;
    }

    public boolean queryReserva(String nombre) { //Consulta por nombre
        boolean existe = true;
        con.printConsultaReserva(nombre);
        return existe;
    }

    public boolean queryReserva(String telefono, String fechaInicial) { //Consulta por telefono y fechaInicial
        //IMPLEMENTAR
        return true;
    }

    public boolean queryUsuario(String usuario, String password) { //Consulta de usuario
        //IMPLEMENTAR
        return true;
    }

    public boolean insertarReserva(int id, String nombre, String apellido, int numDoc, String tipoDoc, String telefono, String direccion, String ciudad, String fechaNacimiento,
            String fechaInicial, String fechaFinal, int habitacionesSencillas, int habitacionesDobles, int numPersonas) {
        //IMPLEMENTAR
        return true;
    }

    public boolean actualizarReserva(int id, String nombre, String apellido, int numDoc, String tipoDoc, String telefono, String direccion, String ciudad, String fechaNacimiento,
            String fechaInicial, String fechaFinal, int habitacionesSencillas, int habitacionesDobles, int numPersonas) {
        //IMPLEMENTAR
        return true;
    }

    public void eliminarReserva() {
        String numReserva = ventana.getVistaAdminRes().getCampoID().getText();
        //IMPLEMENTAR
    }

    public void editarRegistro(boolean valor) {
        int numReserva = Integer.parseInt(ventana.getVistaAdminRes().getCampoID().getText());
        String nombreCompleto[] = ventana.getVistaAdminRes().getCampoNombre().getText().split(" ");
        String nombre = nombreCompleto[0];
        String apellido = nombreCompleto[1];
        int numDoc = Integer.parseInt(ventana.getVistaAdminRes().getCampoNumId().getText());
        String tipoDoc = (String) ventana.getVistaAdminRes().getComboTipoDoc().getSelectedItem();
        String telefono = ventana.getVistaAdminRes().getCampoTelefono().getText();
        String dire[] = ventana.getVistaAdminRes().getCampoDir().getText().split("");
        String direccion = dire[0];
        String ciudad = dire[1];
        String fechaN = ventana.getVistaAdminRes().getCampoFechaNa().getFormattedTextField().getText();
        String fechaI = ventana.getVistaAdminRes().getCampoFechaIni().getFormattedTextField().getText();
        String fechaFin = ventana.getVistaAdminRes().getCampoFechaFin().getFormattedTextField().getText();
        int habSen = Integer.parseInt(ventana.getVistaAdminRes().getCampoHSen().getText());
        int habDob = Integer.parseInt(ventana.getVistaAdminRes().getCampoHDob().getText());
        int numPer = Integer.parseInt(ventana.getVistaAdminRes().getCampoPer().getText());

        if (valor) {
            insertarReserva(numReserva, nombre, apellido, numDoc, tipoDoc, telefono, direccion, ciudad, fechaN, fechaI,
                    fechaFin, habSen, habDob, numPer);
        } else {
            actualizarReserva(numReserva, nombre, apellido, numDoc, tipoDoc, telefono, direccion, ciudad, fechaN, fechaI,
                    fechaFin, habSen, habDob, numPer);
        }

    }

    public boolean buscarReserva(boolean valor) {
        if (valor) {
            String nombre = ventana.getVistaCancelacion().getCampoNombre().getText();
            if (queryReserva(nombre)) {
                return true;
            } else {
                return false;
            }
        } else {
            String telefono = ventana.getVistaCancelacion().getCampoTelefono().getText();
            String fechaInicial = ventana.getVistaCancelacion().getFechaInicial().getFormattedTextField().getText();
            if (queryReserva(telefono, fechaInicial)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean comprobarIntegridad(Date fechaInicial, Date fechaFinal, int habitacionesSencillas, int habitacionesDobles, int numPersonas) {

        return true;
    }

    public boolean comprobarIntegridad(Date fechaInicial, Date fechaFinal, int habitacionesSencillas, int habitacionesDobles,
            int numPersonas, int numDoc) {

        return true;
    }

    public boolean confirmarReserva() {
        int numPersonas = Integer.parseInt(ventana.getVistaFormulario().getNumPersonasReservadas().getText());
        int habitacionesSencillas = Integer.parseInt(ventana.getVistaFormulario().getNumHabSencillasReservadas().getText());
        int habitacionesDobles = Integer.parseInt(ventana.getVistaFormulario().getNumHabDoblesReservadas().getText());
        String fechaI = ventana.getVistaFormulario().getFechaInicial().getFormattedTextField().getText();
        String fechaF = ventana.getVistaFormulario().getFechaFinal().getFormattedTextField().getText();
        Date fechaInicial = convertirStringAFecha(fechaI);
        Date fechaFinal = convertirStringAFecha(fechaF);
        String nombreCompleto[] = ventana.getVistaFormulario().getCampoNombre().getText().split(" ");
        String nombre = nombreCompleto[0];
        String apellido = nombreCompleto[1];
        String telefono = ventana.getVistaFormulario().getCampoTelefono().getText();
        String direccionCompleta[] = ventana.getVistaFormulario().getCampoDireccionCompleta().getText().split(",");
        String direccion = direccionCompleta[0];
        String ciudad = direccionCompleta[1];
        String fechaN = ventana.getVistaFormulario().getFechaNacimiento().getFormattedTextField().getText();
        int numDoc = Integer.parseInt(ventana.getVistaFormulario().getCampoNumId().getText());
        String tipoDoc = (String) ventana.getVistaFormulario().getComboTipoId().getSelectedItem();
        Date fechaNacimiento = convertirStringAFecha(fechaN);
        int idReserva = generarNumReserva();
        while (queryReserva(idReserva) == true) {
            idReserva = generarNumReserva();
        }
        if (insertarReserva(idReserva, nombre, apellido, numDoc, tipoDoc, telefono, direccion, ciudad, fechaN,
                fechaI, fechaF, habitacionesSencillas, habitacionesDobles, numPersonas)) {
            imprimirRecibo(idReserva, nombre, apellido, numDoc, tipoDoc, telefono, direccion, ciudad, fechaN, fechaI, fechaF,
                    habitacionesSencillas, habitacionesDobles, numPersonas);
            return true;
        } else {
            return false;
        }
    }

    public void imprimirRecibo(int idRes, String nombre, String apell, int numDoc, String tipoDoc, String telefono, String dir,
            String ciud, String fechaN, String fechaI, String fechaF, int habCen, int habDob, int numPer) {
        String nombreCompleto = nombre + " " + apell;
        ventana.getVistaRecibo().getNumReserva().setText("" + idRes);
        ventana.getVistaRecibo().getNombre().setText(nombreCompleto);
        ventana.getVistaRecibo().getTipoDoc().setText(tipoDoc);
        ventana.getVistaRecibo().getNumDoc().setText("" + numDoc);
        ventana.getVistaRecibo().getTelefono().setText(telefono);
        ventana.getVistaRecibo().getDireccion().setText(dir);
        ventana.getVistaRecibo().getCiudad().setText(ciud);
        ventana.getVistaRecibo().getFechaNacimiento().setText(fechaN);
        ventana.getVistaRecibo().getFechaInicial().setText(fechaI);
        ventana.getVistaRecibo().getFechaFinal().setText(fechaF);
        ventana.getVistaRecibo().getNumHabDobles().setText("" + habDob);
        ventana.getVistaRecibo().getNumHabSencillas().setText("" + habCen);
        ventana.getVistaRecibo().getNumPersonas().setText("" + numPer);
        ventana.mostrarVistaRecibo();
    }

    public int generarNumReserva() {
        int id = (int) (Math.random() * (10000 - 1000 + 1) + 1000);
        return id;
    }

    public void llenarFormulario() {
        String fechaI = ventana.getVistaReservas().getFechaInicioRes().getFormattedTextField().getText();
        String fechaF = ventana.getVistaReservas().getFechaFinRes().getFormattedTextField().getText();
        ventana.getVistaFormulario().getFechaInicial().getFormattedTextField().setText(fechaI);
        ventana.getVistaFormulario().getFechaFinal().getFormattedTextField().setText(fechaF);
    }

    public void limpiarFormulario() {
        restablecerCombos();
        ventana.getVistaFormulario().getComboTipoId().setSelectedIndex(0);
        ventana.getVistaFormulario().getNumPersonasReservadas().setText("0");
        ventana.getVistaFormulario().getNumHabDoblesReservadas().setText("0");
        ventana.getVistaFormulario().getNumHabSencillasReservadas().setText("0");
        ventana.getVistaFormulario().getFechaInicial().getFormattedTextField().setText("");
        ventana.getVistaFormulario().getFechaFinal().getFormattedTextField().setText("");
    }

    public void restablecerCombos() {
        ventana.getVistaFormulario().getComboHabitaciones().setSelectedIndex(0);
        ventana.getVistaFormulario().getComboPersonas().setSelectedIndex(0);
        ventana.getVistaFormulario().getComboTipoHab().setSelectedIndex(0);
    }

    public Date convertirStringAFecha(String texto) {
        Date fecha = null;
        try {
            fecha = new SimpleDateFormat("yyyy/MM/dd").parse(texto);
        } catch (ParseException ex) {
        }
        return fecha;
    }

    public String obtenerTipoHab() {
        String tipo = (String) ventana.getVistaFormulario().getComboTipoHab().getSelectedItem();
        return tipo;
    }

    public boolean añadirAlaReserva() {
        String fechaI = ventana.getVistaFormulario().getFechaInicial().getFormattedTextField().getText();
        String fechaF = ventana.getVistaFormulario().getFechaFinal().getFormattedTextField().getText();
        Date fechaInicial = convertirStringAFecha(fechaI);
        Date fechaFinal = convertirStringAFecha(fechaF);
        int habitacionesSencillas = 0;
        int habitacionesDobles = 0;
        int numPersonas = Integer.parseInt((String) ventana.getVistaFormulario().getComboPersonas().getSelectedItem());
        int numHabitaciones = Integer.parseInt((String) ventana.getVistaFormulario().getComboHabitaciones().getSelectedItem());
        if ("Sencilla".equals(obtenerTipoHab())) {
            habitacionesSencillas = numHabitaciones;
        } else {
            habitacionesDobles = numHabitaciones;
        }
        if (comprobarIntegridad(fechaInicial, fechaFinal, habitacionesSencillas, habitacionesDobles, numPersonas)) {
            numPersonas = Integer.parseInt(ventana.getVistaFormulario().getNumPersonasReservadas().getText()) + numPersonas;
            habitacionesSencillas = Integer.parseInt(ventana.getVistaFormulario().getNumHabSencillasReservadas().getText()) + habitacionesSencillas;
            habitacionesDobles = Integer.parseInt(ventana.getVistaFormulario().getNumHabDoblesReservadas().getText()) + habitacionesDobles;
            ventana.getVistaFormulario().getNumPersonasReservadas().setText("" + numPersonas);
            ventana.getVistaFormulario().getNumHabSencillasReservadas().setText("" + habitacionesSencillas);
            ventana.getVistaFormulario().getNumHabDoblesReservadas().setText("" + habitacionesDobles);
            return true;
        } else {
            return false;
        }
    }

    public boolean consultarReserva(boolean valor) {
        String fechaI = ventana.getVistaReservas().getFechaInicioRes().getFormattedTextField().getText();
        String fechaF = ventana.getVistaReservas().getFechaFinRes().getFormattedTextField().getText();
        String numP = (String) ventana.getVistaReservas().getNumPersonas().getSelectedItem();
        String numH = (String) ventana.getVistaReservas().getNumHabitaciones().getSelectedItem();
        if (valor) {
            if ("".equals(fechaI) || "".equals(fechaF)) {
                return false;
            } else {
                Date fechaInicial = convertirStringAFecha(fechaI);
                Date fechaFinal = convertirStringAFecha(fechaF);
                int numPersonas = Integer.parseInt(numP);
                int numHabitaciones = Integer.parseInt(numH);
                return queryReserva(fechaI, fechaF, numPersonas, numHabitaciones);
            }
        } else {
            int numPersonas = Integer.parseInt(ventana.getVistaFormulario().getNumPersonasReservadas().getText());
            int habitacionesSencillas = Integer.parseInt(ventana.getVistaFormulario().getNumHabSencillasReservadas().getText());
            int habitacionesDobles = Integer.parseInt(ventana.getVistaFormulario().getNumHabDoblesReservadas().getText());
            fechaI = ventana.getVistaFormulario().getFechaInicial().getFormattedTextField().getText();
            fechaF = ventana.getVistaFormulario().getFechaFinal().getFormattedTextField().getText();
            Date fechaInicial = convertirStringAFecha(fechaI);
            Date fechaFinal = convertirStringAFecha(fechaF);
            if (comprobarIntegridad(fechaInicial, fechaFinal, habitacionesSencillas, habitacionesDobles, numPersonas)) { //Comprobaciones de reservación
                return queryReserva(fechaI, fechaF, habitacionesSencillas, habitacionesDobles, numPersonas);
            }
            return false;
        }
    }

    public void enviarReserva() {
        if (confirmarReserva()) {
            limpiarFormulario();
            ventana.apagarVistas();
            ventana.mostrarVistaReservas();
        } else {
            System.out.println("Fallo al insertar la reserva");
        }
    }

    public void elegirOpcion1() {
        ventana.getVistaCancelacion().getRadioTelyFecha().setSelected(false);
        ventana.getVistaCancelacion().getCampoTelefono().setEnabled(false);
        ventana.getVistaCancelacion().getFechaInicial().setEnabled(false);
        ventana.getVistaCancelacion().getCampoNombre().setEnabled(true);

    }

    public void elegirOpcion2() {
        ventana.getVistaCancelacion().getRadioNombre().setSelected(false);
        ventana.getVistaCancelacion().getCampoNombre().setEnabled(false);
        ventana.getVistaCancelacion().getFechaInicial().setEnabled(true);
        ventana.getVistaCancelacion().getCampoTelefono().setEnabled(true);
    }

    public void consultarCancelacion() {
        boolean opcion = ventana.getVistaCancelacion().getRadioNombre().isSelected();
        if (opcion) {
            buscarReserva(true);
        } else {
            buscarReserva(false);
        }
    }

    public void iniciarSesion() {
        String user = ventana.getVistaLogin().getCampoUsuario().getText();
        char[] pass = ventana.getVistaLogin().getCampoContraseña().getPassword();
        String password = new String(pass);
        if (queryUsuario(user, password)) {
            ventana.ocultarVistaLogin();
            ventana.ocultarVentana();
            ventana.apagarVistas();
            ventana.mostrarVistaAdmin();
        } else {
            ventana.mostrarErrorDatosIngresados();
            ventana.mostrarVistaLogin();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evento = e.getSource();
        if (evento.equals(ventana.getBotonInicio())) { //Ir al Home
            ventana.apagarVistas();
            ventana.mostrarVistaHome();
        }
        if (evento.equals(ventana.getBotonMenu())) { //Desplegar/Ocultar menu lateral
            if (ventana.getVistaMenu().isVisible()) {
                ventana.ocultarVistaMenu();
            } else {
                ventana.mostrarVistaMenu();
            }
        }
        if (evento.equals(ventana.getVistaAdmin().getBotonMenu())) { //Desplegar/Ocultar menu lateral
            if (ventana.getVistaMenuAdmin().isVisible()) {
                ventana.ocultarVistaMenuAdmin();
            } else {
                ventana.mostrarVistaMenuAdmin();
            }
        }
        if (evento.equals(ventana.getBotonReservas())) { //Ir a reservas
            ventana.apagarVistas();
            ventana.mostrarVistaReservas();
        }
        if (evento.equals(ventana.getBotonUbicacion())) { //Ir a ubicación
            ventana.apagarVistas();
            ventana.mostrarVistaUbicacion();
        }
        if (evento.equals(ventana.getBotonContacto())) { //Ir a contacto
            ventana.apagarVistas();
            ventana.mostrarVistaContacto();
        }
        if (evento.equals(ventana.getVistaReservas().getBotonReservar())) { //Ir a hacer una reserva
            llenarFormulario();
            ventana.mostrarVistaFormularioReserva();
        }
        if (evento.equals(ventana.getVistaFormulario().getBotonAgregar())) {//Añadir datos a la reserva
            añadirAlaReserva();
        }
        if (evento.equals(ventana.getVistaFormulario().getBotonLimpiar())) {//Limpiar formulario
            limpiarFormulario();
        }
        if (evento.equals(ventana.getVistaFormulario().getBotonConfirmarReserva())) {//ConfirmarReserva           
            boolean fallo = false;
            try {
                enviarReserva();
            } catch (Exception excepcion) {
                fallo = true;
            }
            if (fallo) {
                ventana.mostrarErrorDatosIngresados();
                ventana.mostrarVistaFormularioReserva();
            }
        }
        if (evento.equals(ventana.getVistaFormulario().getBotonConsultar())) { //Consultar reserva completa
            try {
                consultarReserva(false);
            } catch (Exception excepcion) {
                ventana.mostrarErrorDatosIngresados();
            }
        }
        if (evento.equals(ventana.getVistaReservas().getBotonConsultar())) { //Consultar reserva parcial
            try {
                consultarReserva(true);
            } catch (Exception excepcion) {
                ventana.mostrarErrorDatosIngresados();
            }
        }
        if (evento.equals(ventana.getVistaReservas().getBotonCancelar())) {
            ventana.mostrarVistaCancelacion();
        }
        if (evento.equals(ventana.getVistaMenu().getBotonLogin())) { //Ir a Login
            ventana.mostrarVistaLogin();
        }
        if (evento.equals(ventana.getVistaCancelacion().getBotonBuscar())) {
            consultarCancelacion();
        }
        if (evento.equals(ventana.getVistaCancelacion().getRadioNombre())) {
            elegirOpcion1();
        }
        if (evento.equals(ventana.getVistaCancelacion().getRadioTelyFecha())) {
            elegirOpcion2();
        }
        if (evento.equals(ventana.getVistaMenu().getBotonSalir())
                || evento.equals(ventana.getVistaMenuAdmin().getBotonSalir())) { //Cerrar programa
            System.exit(0);
        }
        if (evento.equals(ventana.getVistaMenuAdmin().getBotonCerrarSesion())) {
            ventana.apagarVistas();
            ventana.mostrarVentana();
        }
        if (evento.equals(ventana.getVistaAdminRes().getBotonInsertar())) {
            try {
                editarRegistro(true);
            } catch (Exception excepcion) {
                ventana.mostrarErrorDatosIngresados();
            }
        }
        if (evento.equals(ventana.getVistaAdminRes().getBotonEliminar())) {
            try {
                eliminarReserva();
            } catch (Exception excepcion) {
                ventana.mostrarErrorDatosIngresados();
            }
        }
        if (evento.equals(ventana.getVistaAdminRes().getBotonActualizar())) {
            try {
                editarRegistro(false);
            } catch (Exception excepcion) {
                ventana.mostrarErrorDatosIngresados();
            }
        }
        if (evento.equals(ventana.getVistaLogin().getBotonIngreso())) {
            iniciarSesion();
        }
    }
}
