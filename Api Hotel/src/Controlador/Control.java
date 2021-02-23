package Controlador;

import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        ventana.getFormularioReserva().getBotonAgregar().addActionListener(this);
        ventana.getFormularioReserva().getBotonConsultar().addActionListener(this);
        ventana.getFormularioReserva().getBotonConfirmarReserva().addActionListener(this);
        ventana.getFormularioReserva().getBotonLimpiar().addActionListener(this);
    }
    
    public boolean queryReserva(Date fechaInicial, Date fechaFinal, int habitaciones, int numPersonas) {
        //IMPLEMENTAR
        return true;
    }
    
    public boolean queryReserva(Date fechaInicial, Date fechaFinal, int habitacionesSencillas, int habitacionesDobles, int numPersonas) {
        //IMPLEMENTAR
        return true;
    }
    
    public boolean confirmarReserva() {
        //IMPLEMENTAR
        return true;
    }
    
    public void llenarFormulario() {
        String fechaI = ventana.getVistaReservas().getFechaInicioRes().getFormattedTextField().getText();
        String fechaF = ventana.getVistaReservas().getFechaFinRes().getFormattedTextField().getText();
        ventana.getFormularioReserva().getFechaInicial().getFormattedTextField().setText(fechaI);
        ventana.getFormularioReserva().getFechaFinal().getFormattedTextField().setText(fechaF);
    }
    
    public void limpiarFormulario() {
        restablecerCombos();
        ventana.getFormularioReserva().getComboTipoId().setSelectedIndex(0);
        ventana.getFormularioReserva().getNumPersonasReservadas().setText("0");
        ventana.getFormularioReserva().getNumHabDoblesReservadas().setText("0");
        ventana.getFormularioReserva().getNumHabSencillasReservadas().setText("0");
        ventana.getFormularioReserva().getFechaInicial().getFormattedTextField().setText("");
        ventana.getFormularioReserva().getFechaFinal().getFormattedTextField().setText("");
        ventana.getFormularioReserva().getNumId().setText("");
    }
    
    public void restablecerCombos() {
        ventana.getFormularioReserva().getComboHabitaciones().setSelectedIndex(0);
        ventana.getFormularioReserva().getComboPersonas().setSelectedIndex(0);
        ventana.getFormularioReserva().getComboTipoHab().setSelectedIndex(0);
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
            System.out.println("Ocurrió un error Inesperado");
        }
        return fecha;
    }
    
    public String obtenerTipoHab() {
        String tipo = (String) ventana.getFormularioReserva().getComboTipoHab().getSelectedItem();
        return tipo;
    }
    
    public boolean añadirAlaReserva() {
        System.out.println("Entro 1");
        String fechaI = ventana.getFormularioReserva().getFechaInicial().getFormattedTextField().getText();
        String fechaF = ventana.getFormularioReserva().getFechaFinal().getFormattedTextField().getText();
        Date fechaInicial = convertirStringAFecha(fechaI);
        Date fechaFinal = convertirStringAFecha(fechaF);
        int habitacionesSencillas = 0;
        int habitacionesDobles = 0;
        int numPersonas = Integer.parseInt((String) ventana.getFormularioReserva().getComboPersonas().getSelectedItem());
        int numHabitaciones = Integer.parseInt((String) ventana.getFormularioReserva().getComboHabitaciones().getSelectedItem());
        if ("Sencilla".equals(obtenerTipoHab())) {
            habitacionesSencillas = numHabitaciones;
        } else {
            habitacionesDobles = numHabitaciones;
        }
        if (comprobarIntegridad(fechaInicial, fechaFinal, habitacionesSencillas, habitacionesDobles, numPersonas)) {
            numPersonas = Integer.parseInt(ventana.getFormularioReserva().getNumPersonasReservadas().getText()) + numPersonas;
            habitacionesSencillas = Integer.parseInt(ventana.getFormularioReserva().getNumHabSencillasReservadas().getText()) + habitacionesSencillas;
            habitacionesDobles = Integer.parseInt(ventana.getFormularioReserva().getNumHabDoblesReservadas().getText()) + habitacionesDobles;
            ventana.getFormularioReserva().getNumPersonasReservadas().setText("" + numPersonas);
            ventana.getFormularioReserva().getNumHabSencillasReservadas().setText("" + habitacionesSencillas);
            ventana.getFormularioReserva().getNumHabDoblesReservadas().setText("" + habitacionesDobles);
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
            int numPersonas = Integer.parseInt(ventana.getFormularioReserva().getNumPersonasReservadas().getText());
            int habitacionesSencillas = Integer.parseInt(ventana.getFormularioReserva().getNumHabSencillasReservadas().getText());
            int habitacionesDobles = Integer.parseInt(ventana.getFormularioReserva().getNumHabDoblesReservadas().getText());
            fechaI = ventana.getFormularioReserva().getFechaInicial().getFormattedTextField().getText();
            fechaF = ventana.getFormularioReserva().getFechaFinal().getFormattedTextField().getText();
            Date fechaInicial = convertirStringAFecha(fechaI);
            Date fechaFinal = convertirStringAFecha(fechaF);
            if (comprobarIntegridad(fechaInicial, fechaFinal, habitacionesSencillas, habitacionesDobles, numPersonas)) { //Comprobaciones de reservación
                return queryReserva(fechaInicial, fechaFinal, habitacionesSencillas, habitacionesDobles, numPersonas);
            }
            return false;
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
        if (evento.equals(ventana.getFormularioReserva().getBotonAgregar())) {//Añadir datos a la reserva
            añadirAlaReserva();
        }
        if (evento.equals(ventana.getFormularioReserva().getBotonLimpiar())) {//Limpiar formulario
            limpiarFormulario();
        }
        if (evento.equals(ventana.getFormularioReserva().getBotonConfirmarReserva())) {//ConfirmarReserva
            if (confirmarReserva()) {
                limpiarFormulario();
            } else {
                System.out.println("La reserva Falló");
            }
        }
        if (evento.equals(ventana.getFormularioReserva().getBotonConsultar())) { //Consultar reserva completa
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
