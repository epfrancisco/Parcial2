/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Proovedor;
import modelo.Persona;

public class ProovedorJdbc extends Jdbc {

    private List listaProovedor;
    Jdbc cone = new Jdbc();
//
    public void saveProovedor(Proovedor p1, Persona p2) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = getCon().prepareStatement("insert into proovedor values(?,?,?,?,?,?,?,?,?,?,?,?)");

            pstt.setString(1, null);            
            pstt.setString(2, p1.getNombrejuridico());
            pstt.setString(3, p2.getNombre());
            pstt.setString(4, p1.getEspecialidad());
            pstt.setString(5, p1.getDireccion());
            pstt.setString(6, p1.getBarrio());
            pstt.setString(7, p1.getCiudad());
            pstt.setString(8, p1.getPais());
            pstt.setString(9, p1.getCodigopostal());
            pstt.setString(10, p1.getCorreo());
            pstt.setString(11, p1.getTelefono());
            pstt.setString(12, p1.getFecharegistro());

            pstt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El proovedor fue registrado exitosamente!");

        } finally {
            if (pstt != null) {
                pstt.close();
            }
        }
    }

    public void updateProovedor(Proovedor f1, Persona f2) throws SQLException {
        PreparedStatement pstt = null;
        try {
            pstt = this.getCon().prepareStatement("UPDATE proovedor SET nit = ?,nombrejuridico = ?,representante = ?,especialidad = ?,direccion = ?,barrio = ?,ciudad = ?,pais = ?,codigopostal = ?, correo= ?, telefono= ?, fecharegistro= ? where id= ?");

             pstt.setString(1, f1.getNit());
            pstt.setString(2, f1.getNombrejuridico());
            pstt.setString(3, f2.getNombre());
            pstt.setString(4, f1.getEspecialidad());
            pstt.setString(5, f1.getDireccion());
            pstt.setString(6,  f1.getBarrio());
            pstt.setString(7, f1.getCiudad());
            pstt.setString(8, f1.getPais());
            pstt.setString(9, f1.getCodigopostal());
            pstt.setString(10, f1.getCorreo());
            pstt.setString(11, f1.getTelefono());
            pstt.setString(12, f1.getFecharegistro());

            pstt.executeUpdate();
        } finally {
            if (pstt != null) {
                pstt.close();
            }
        }
    }

    public Proovedor getProovedor(String id) throws SQLException {

        Proovedor p1 = new Proovedor();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {

            pstt = this.getCon().prepareStatement("select * from proovedor where id = ?");
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

 public List getProovedor() throws SQLException {

        listaProovedor = new LinkedList();
        PreparedStatement pstt = null;
        ResultSet rs = null;
        try {
            pstt = getCon().prepareStatement("select * from proovedor");
            rs = pstt.executeQuery();
            while (rs.next()) {
                listaProovedor.add(load(rs));
            }
        } finally {
            if (pstt != null) {
                pstt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return listaProovedor;
    }
    
 

    private Proovedor load(ResultSet rs) throws SQLException {
        Proovedor f1 = new Proovedor();
        Persona f2= new Persona();

        f1.setId(rs.getInt(1));
        f1.setNit(rs.getString(2));
        f2.setNombre(rs.getString(3));
        f1.setEspecialidad(rs.getString(4));
        f1.setDireccion(rs.getString(5));
        f1.setBarrio(rs.getString(6));
        f1.setCiudad(rs.getString(7));
        f1.setPais(rs.getString(8));
        f1.setCodigopostal(rs.getString(9));
        f1.setCorreo(rs.getString(10));
        f1.setTelefono(rs.getString(11));
        f1.setFecharegistro(rs.getString(12));
  

        return f1;
    }

    public void DeleteProovedor(String cedula) throws SQLException {
        PreparedStatement pstn = null;
        try {
            pstn = getCon().prepareStatement("delete from proovedor where id = ?");
            pstn.setString(1, cedula);
            pstn.executeUpdate();
        } finally {
            if (pstn != null) {
                pstn.close();
            }
        }
    }
}
