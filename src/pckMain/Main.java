/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckMain;

import Controlador.EmpleadosController;
import Modelos.Conexion;
import Vistas.*;

/**
 *
 * @author carlt
 */
public class Main {
    public static void main(String args[])
    {
        frmPrincipal VistaPrincipal = new frmPrincipal();
    frmEmpleado VistaEmpleados =  new frmEmpleado(null,true);
    Conexion ModeloConexion = new Conexion();
    EmpleadosController Controlador = new EmpleadosController(VistaPrincipal, VistaEmpleados, ModeloConexion);
    }
    
}
