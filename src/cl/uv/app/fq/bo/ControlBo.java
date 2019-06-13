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
public class ControlBo {
    int idControl;
    Date fechaControl;
    float estatura;
    float peso;
    int tiempoSoplado;
    float nivelMaximo;
    String comentario;
    int pacienteIdPaciente;
    int medioIdMedico;

    public ControlBo() {
    }

    public ControlBo(int idControl, Date fechaControl, float estatura, float peso, int tiempoSoplado, float nivelMaximo, String comentario, int pacienteIdPaciente, int medioIdMedico) {
        this.idControl = idControl;
        this.fechaControl = fechaControl;
        this.estatura = estatura;
        this.peso = peso;
        this.tiempoSoplado = tiempoSoplado;
        this.nivelMaximo = nivelMaximo;
        this.comentario = comentario;
        this.pacienteIdPaciente = pacienteIdPaciente;
        this.medioIdMedico = medioIdMedico;
    }

    public int getTiempoSoplado() {
        return tiempoSoplado;
    }

    public void setTiempoSoplado(int tiempoSoplado) {
        this.tiempoSoplado = tiempoSoplado;
    }

    public float getNivelMaximo() {
        return nivelMaximo;
    }

    public void setNivelMaximo(float nivelMaximo) {
        this.nivelMaximo = nivelMaximo;
    }

   

    public int getIdControl() {
        return idControl;
    }

    public void setIdControl(int idControl) {
        this.idControl = idControl;
    }

    public Date getFechaControl() {
        return fechaControl;
    }

    public void setFechaControl(Date fechaControl) {
        this.fechaControl = fechaControl;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getPacienteIdPaciente() {
        return pacienteIdPaciente;
    }

    public void setPacienteIdPaciente(int pacienteIdPaciente) {
        this.pacienteIdPaciente = pacienteIdPaciente;
    }

    public int getMedioIdMedico() {
        return medioIdMedico;
    }

    public void setMedioIdMedico(int medioIdMedico) {
        this.medioIdMedico = medioIdMedico;
    }

    @Override
    public String toString() {
        return "ControlBo{" + "idControl=" + idControl + ", fechaControl=" + fechaControl + ", estatura=" + estatura + ", peso=" + peso + ", tiempoSoplado=" + tiempoSoplado + ", nivelMaximo=" + nivelMaximo + ", comentario=" + comentario + ", pacienteIdPaciente=" + pacienteIdPaciente + ", medioIdMedico=" + medioIdMedico + '}';
    }
    
    
    
}
