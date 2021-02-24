package Controlador;

import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Control implements ActionListener {

    private final Ventana ventana;

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
        ventana.getVistaFormulario().getBotonAgregar().addActionListener(this);
        ventana.getVistaFormulario().getBotonConsultar().addActionListener(this);
        ventana.getVistaFormulario().getBotonConfirmarReserva().addActionListener(this);
        ventana.getVistaFormulario().getBotonLimpiar().addActionListener(this);
    }

    public boolean queryReserva(Date fechaInicial, Date fechaFinal, int habitaciones, int numPersonas) {
        //IMPLEMENTAR
        return true;
    }

    public boolean queryReserva(Date fechaInicial, Date fechaFinal, int habitacionesSencillas, int habitacionesDobles, int numPersonas) {
        //IMPLEMENTAR
        return true;
    }

    public boolean queryIdReserva(int llave) {
        //IMPLEMENTAR 
        if (llave == 1) { // Si reserva con id llave existe
            return true;
        } else {
            return false;
        }
    }

    public boolean insertarReserva(int id, String nombre, String apellido, int numDoc, String tipoDoc, String telefono, String direccion, String ciudad, Date fechaNacimiento,
            Date fechaInicial, Date fechaFinal, int habitacionesSencillas, int habitacionesDobles, int numPersonas) {
        //IMPLEMENTAR

        ///
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
        while (queryIdReserva(idReserva) == true) {
            idReserva = generarNumReserva();
        }
        if (insertarReserva(idReserva, nombre, apellido, numDoc, tipoDoc, telefono, direccion, ciudad, fechaNacimiento,
                fechaInicial, fechaFinal, habitacionesSencillas, habitacionesDobles, numPersonas)) {
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

    public boolean comprobarIntegridad(Date fechaInicial, Date fechaFinal, int habitacionesSencillas, int habitacionesDobles, int numPersonas) {

        return true;
    }

    public boolean comprobarIntegridad(Date fechaInicial, Date fechaFinal, int habitacionesSencillas, int habitacionesDobles, int numPersonas, int numDoc) {

        return true;
    }

    public Date convertirStringAFecha(String texto) {
        Date fecha = null;
        try {
            fecha = new SimpleDateFormat("dd/MM/yyyy").parse(texto);
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
                return queryReserva(fechaInicial, fechaFinal, numPersonas, numHabitaciones);
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
                return queryReserva(fechaInicial, fechaFinal, habitacionesSencillas, habitacionesDobles, numPersonas);
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
            if (consultarReserva(false)) {

            } else {
                ventana.mostrarErrorDatosIngresados();
            }
        }
        if (evento.equals(ventana.getVistaReservas().getBotonConsultar())) { //Consultar reserva parcial
            if (consultarReserva(true)) {

            } else {
                ventana.mostrarErrorDatosIngresados();
            }
        }
        if (evento.equals(ventana.getVistaMenu().getBotonLogin())) { //Ir a Login

        }
        if (evento.equals(ventana.getVistaMenu().getBotonSalir())) { //Cerrar programa
            System.exit(0);
        }
    }
}
