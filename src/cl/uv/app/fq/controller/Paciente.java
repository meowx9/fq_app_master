/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.uv.app.fq.controller;

import cl.uv.app.fq.bo.MedicoBo;
import cl.uv.app.fq.bo.PacienteBo;
import cl.uv.app.fq.facade.PacienteFacade;
import cl.uv.app.fq.init.MultilineTableCellRenderer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bnavarro
 */
public class Paciente {

    public int ingresaPaciente(PacienteBo paciente, MedicoBo medico) {
        PacienteFacade pacienteFacade = new PacienteFacade();
        return pacienteFacade.Ingresarpaciente(paciente, medico);
    }

    public void getAllPacientes(JTable table) {

        table.setDefaultRenderer(Object.class, new Render());

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        PacienteFacade pacienteFacade = new PacienteFacade();
        ArrayList<PacienteBo> arrayPaciente = pacienteFacade.getAllPacientes();
        for (PacienteBo paciente : arrayPaciente) {
            String nacimiento = dateFormat.format(paciente.getFechaNacimiento());
            JButton btn1 = new JButton("Perfil");
            btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btn1.setName(paciente.getIdPaciente() + "");
            model.addRow(new Object[]{paciente.getNombre(), getEdad(nacimiento), paciente.getFechaIncorporacion(), btn1});
        }
        table.setModel(model);
        table.setPreferredScrollableViewportSize(table.getPreferredSize());

    }

    public PacienteBo getPacienteWherId(String id_paciente) {
        PacienteFacade pacienteFacade = new PacienteFacade();
        return pacienteFacade.getPacienteWhereId(id_paciente);
    }

    private int getEdad(String fechaNacc) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNac = LocalDate.parse(fechaNacc, fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);

        return periodo.getYears();
    }
}
