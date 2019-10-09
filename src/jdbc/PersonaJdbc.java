/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Persona;

/**
 *
 * @author Estudiante
 */

public class PersonaJdbc extends Jdbc {

    private List listaPersona;
    Jdbc cone = new Jdbc();
//
    public void savePersona(Persona p1) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = getCon().prepareStatement("insert into persona values(?,?,?,?,?,?,?,?,?,?)");

            pstt.setString(1, null);            
            pstt.setString(2, p1.getCedula());
            pstt.setString(3, p1.getNombre());
            pstt.setString(4, p1.getApellido());
            pstt.setString(5, p1.getSexo());
            pstt.setString(6, p1.getCorreo());
            pstt.setString(7, p1.getPais());
            pstt.setString(8, p1.getDepartamento());
            pstt.setString(9, p1.getDireccion());
            pstt.setString(10, p1.getTelefono());

            pstt.executeUpdate();
            JOptionPane.showMessageDialog(null, "La persona fue registrada exitosamente!");

        } finally {
            if (pstt != null) {
                pstt.close();
            }
        }
    }

    public void updatePersona(Persona f1) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = this.getCon().prepareStatement("UPDATE persona SET cedula = ?,nombre = ?,apellido = ?,sexo = ?,correo = ?,pais = ?,departamento = ?,direccion = ?,telefono = ? where id= ?");

             pstt.setString(1, f1.getCedula());
            pstt.setString(2, f1.getNombre());
            pstt.setString(3, f1.getApellido());
            pstt.setString(4, f1.getSexo());
            pstt.setString(5, f1.getCorreo());
            pstt.setString(6,  f1.getPais());
            pstt.setString(7, f1.getDepartamento());
            pstt.setString(8, f1.getDireccion());
            pstt.setString(9, f1.getTelefono());

            pstt.executeUpdate();
        } finally {
            if (pstt != null) {
                pstt.close();
            }
        }
    }

    public Persona getPersona(String id) throws SQLException {

        Persona p1 = new Persona();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {

            pstt = this.getCon().prepareStatement("select * from persona where id = ?");
            pstt.setString(1, id);
            rs = pstt.executeQuery();
            while (rs.next()) {
                p1 = load(rs);
            }
        } finally {
            if (pstt != null) {
                pstt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }

        return p1;
    }

 public List getPersona() throws SQLException {

        listaPersona = new LinkedList();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {
            pstt = getCon().prepareStatement("select * from persona");
            rs = pstt.executeQuery();
            while (rs.next()) {
                listaPersona.add(load(rs));
            }
        } finally {
            if (pstt != null) {
                pstt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return listaPersona;
    }
    
 

    private Persona load(ResultSet rs) throws SQLException {
        Persona f1 = new Persona();

        f1.setId(rs.getInt(1));
        f1.setCedula(rs.getString(2));
        f1.setNombre(rs.getString(3));
        f1.setApellido(rs.getString(4));
        f1.setSexo(rs.getString(5));
        f1.setCorreo(rs.getString(6));
        f1.setPais(rs.getString(7));
        f1.setDepartamento(rs.getString(8));
        f1.setDireccion(rs.getString(9));
        f1.setTelefono(rs.getString(10));
  

        return f1;
    }

    public void DeletePersona(String cedula) throws SQLException {
        PreparedStatement pstn = null;
        try {
            pstn = getCon().prepareStatement("delete from persona where id = ?");
            pstn.setString(1, cedula);
            pstn.executeUpdate();
        } finally {
            if (pstn != null) {
                pstn.close();
            }
        }
    }
    
}

