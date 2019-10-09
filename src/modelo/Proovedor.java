/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class Proovedor {

    private int id;
    private String tipo;
    private String nit;
    private String nombrejuridico;
    private Persona representante;
    private String especialidad;
    private String direccion;
    private String barrio;
    private String ciudad;
    private String pais;
    private String codigopostal;
    private String correo;
    private String telefono;
    private String fecharegistro;
    
        /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the nombrejuridico
     */
    public String getNombrejuridico() {
        return nombrejuridico;
    }

    /**
     * @param nombrejuridico the nombrejuridico to set
     */
    public void setNombrejuridico(String nombrejuridico) {
        this.nombrejuridico = nombrejuridico;
    }

    /**
     * @return the representante
     */
    public Persona getRepresentante() {
        return representante;
    }

    /**
     * @param representante the representante to set
     */
    public void setRepresentante(Persona representante) {
        this.representante = representante;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the barrio
     */
    public String getBarrio() {
        return barrio;
    }

    /**
     * @param barrio the barrio to set
     */
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the codigopostal
     */
    public String getCodigopostal() {
        return codigopostal;
    }

    /**
     * @param codigopostal the codigopostal to set
     */
    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the fecharegistro
     */
    public String getFecharegistro() {
        return fecharegistro;
    }

    /**
     * @param fecharegistro the fecharegistro to set
     */
    public void setFecharegistro(String fecharegistro) {
        this.fecharegistro = fecharegistro;
    }
    
}
