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
        ventana.getFormularioReserva().getNumPersonasReservadas().setText("0");
        ventana.getFormularioReserva().getNumHabDoblesReservadas().setText("0");
        ventana.getFormularioReserva().getNumHabSencillasReservadas().setText("0");
        ventana.getFormularioReserva().getFechaInicial().getFormattedTextField().setText("");
        ventana.getFormularioReserva().getFechaFinal().getFormattedTextField().setText("");
        ventana.getFormularioReserva().getNumId().setText("");
    }
    
    public boolean comprobarIntegridad(Date fechaInicial, Date fechaFinal, int habitacionesSencillas, int habitacionesDobles, int numPersonas){
        return true;
    }
    
    public boolean comprobarIntegridad(Date fechaInicial, Date fechaFinal, int habitacionesSencillas, int habitacionesDobles, int numPersonas, int numDoc){
        return true;
    }
    
    public boolean consultarReserva(boolean valor) {
        String fechaI = ventana.getVistaReservas().getFechaInicioRes().getFormattedTextField().getText();
        String fechaF = ventana.getVistaReservas().getFechaFinRes().getFormattedTextField().getText();
        String numP = (String) ventana.getVistaReservas().getNumPersonas().getSelectedItem();
        String numH = (String) ventana.getVistaReservas().getNumHabitaciones().getSelectedItem();
        try {
            if (valor) {
                if ("".equals(fechaI) || "".equals(fechaF)) {
                    return false;
                } else {
                    Date fechaInicial = new SimpleDateFormat("dd/MM/yyyy").parse(fechaI);
                    Date fechaFinal = new SimpleDateFormat("dd/MM/yyyy").parse(fechaF);
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
                Date fechaInicial = new SimpleDateFormat("dd/MM/yyyy").parse(fechaI);
                Date fechaFinal = new SimpleDateFormat("dd/MM/yyyy").parse(fechaF);
                if (comprobarIntegridad(fechaInicial, fechaFinal, habitacionesSencillas, habitacionesDobles, numPersonas)) { //Comprobaciones de reservación
                    return queryReserva(fechaInicial, fechaFinal, habitacionesSencillas, habitacionesDobles, numPersonas);
                }
                return false;
            }
        } catch (ParseException ex) {
            System.out.println("Ocurrió un error");
        }
        return false;
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
        if (evento.equals(ventana.getFormularioReserva().getBotonLimpiar())) {
            limpiarFormulario();
        }
        if (evento.equals(ventana.getFormularioReserva().getBotonConfirmarReserva())) {
            if (confirmarReserva()) {
                limpiarFormulario();
            } else {
                System.out.println("La reserva Falló");
            }
        }
        if (evento.equals(ventana.getFormularioReserva().getBotonConsultar())) { //Consultar reserva completa
            if (consultarReserva(false)) {

            } else {
                System.out.println("Lleno mal los datos");
            }
        }
        if (evento.equals(ventana.getVistaReservas().getBotonConsultar())) { //Consultar reserva parcial
            if (consultarReserva(true)) {

            } else {
                System.out.println("Lleno mal los datos");
            }
        }
        if (evento.equals(ventana.getVistaMenu().getBotonLogin())) { //Ir a Login

        }
        if (evento.equals(ventana.getVistaMenu().getBotonSalir())) { //Cerrar programa
            System.exit(0);
        }
    }
}
