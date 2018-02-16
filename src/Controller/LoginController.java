/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1379.joan23
 */
public class LoginController {
    //Conexion a la base de datos
    Conexion conectar = new Conexion();
    Connection cn = conectar.conec();
    // Consulta para el login
    public int controlAcceso (String nombre, String password){
        //Hacemos la consulta SQL
        String sql = "SELECT * FROM `tbl_persona` WHERE mail_persona = ? AND passwd_persona = ?";
        
        PreparedStatement pst;
        
        try {
            
            pst=cn.prepareStatement(sql);
            //montamos la consulta
            pst.setString(1, nombre);
            pst.setString(2,password);
            ResultSet rs= pst.executeQuery();
            
            if(rs.next()){
                return 1;
            }
            else{
                return 0;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        //return 0;
        //return 0;
    }
    //Fin consulta para el login
}

