/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.uv.app.fq.bo;

import java.util.Date;

/**
 *
 * @author bnavarro
 */
public class PacienteBo {
    int idPaciente;
    String nombre;
    Date fechaNacimiento;
    Date fechaIncorporacion;
    float peso;
    float estatura;
    String comentario;
    int medicoIdMedico;

    public PacienteBo() {
    }

    public PacienteBo(int idCliente, String nombre, Date fechaNacimiento, Date fechaIncorporacion, float peso, float estatura, String comentario, int medicoIdMedico) {
        this.idPaciente = idCliente;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIncorporacion = fechaIncorporacion;
        this.peso = peso;
        this.estatura = estatura;
        this.comentario = comentario;
        this.medicoIdMedico = medicoIdMedico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idCliente) {
        this.idPaciente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getMedicoIdMedico() {
        return medicoIdMedico;
    }

    public void setMedicoIdMedico(int medicoIdMedico) {
        this.medicoIdMedico = medicoIdMedico;
    }

    @Override
    public String toString() {
        return "PacienteBo{" + "idCliente=" + idPaciente + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", fechaIncorporacion=" + fechaIncorporacion + ", peso=" + peso + ", estatura=" + estatura + ", comentario=" + comentario + ", medicoIdMedico=" + medicoIdMedico + '}';
    }
    
    
    
}
