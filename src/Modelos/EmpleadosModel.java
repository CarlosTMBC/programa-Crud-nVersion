/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.sql.*;
import Modelos.Conexion;
/**
 *
 * @author carlt
 */
public class EmpleadosModel {
    Conexion nuevaConexion;
    Connection MyConexion;
    ResultSet rst;

    public EmpleadosModel(Conexion nuevaConexion, Connection MyConexion, ResultSet rst) {
        this.nuevaConexion = nuevaConexion;
        this.MyConexion = MyConexion;
        this.rst = rst;
    }

    
    
    public ResultSet ListarDatos()
    {
        try{
        MyConexion= nuevaConexion.Conectar();
        Statement sentencia = MyConexion.createStatement();
        rst = sentencia.executeQuery("select * from Empleados");
        return rst;
        }
        catch(SQLException e)
        {
            System.out.println(e);
            return rst;
        }
        
    }
   
    
    
}
