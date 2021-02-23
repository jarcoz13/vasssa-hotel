/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobasesdedatosproyect;



/**
 *
 * @author sebas
 */
public class EjemploBasesDeDatos {
    public static void main (String[] args){
        BasesdeDatos bd = new BasesdeDatos();
        bd.EstablecerConexion();
        bd.InsertarRegistro();
        bd.printTabla();
        bd.DetenerConexion();
    }
}