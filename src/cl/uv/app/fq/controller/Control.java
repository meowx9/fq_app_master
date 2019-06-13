/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.uv.app.fq.controller;

import cl.uv.app.fq.bo.ControlBo;
import cl.uv.app.fq.bo.MedicoBo;
import cl.uv.app.fq.bo.PacienteBo;
import cl.uv.app.fq.facade.ControlFacade;
import cl.uv.app.fq.facade.MedicoFacade;
import cl.uv.app.fq.init.MultilineTableCellRenderer;
import cl.uv.app.fq.init.TextAreaRenderer;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bnavarro
 */
public class Control {

    public int insertControl(ControlBo control) {
        ControlFacade controlFacade = new ControlFacade();
        return controlFacade.insertControl(control);
    }

    public void getAllControlWherePaciente(JTable table, PacienteBo paciente) {
        table.setDefaultRenderer(Object.class, new Render());
        MedicoFacade medicoFacade = new MedicoFacade();
        MedicoBo medico;
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        ControlFacade controlFacade = new ControlFacade();
        ArrayList<ControlBo> arrayControles = controlFacade.getAllControlWherePaciente(paciente);
        for (ControlBo control : arrayControles) {
            medico = medicoFacade.getMedicoWhere(control.getMedioIdMedico());

            model.addRow(new Object[]{control.getFechaControl(), control.getPeso() + " Kl", control.getEstatura() + " Cm",control.getTiempoSoplado()+" Seg",control.getNivelMaximo(), control.getComentario(), medico.getNombres() + medico.getApellidos()});
        }

        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        table.setDefaultRenderer(String.class, new MultilineTableCellRenderer());
        table.setModel(model);

    }

    public int getCantidadControles(PacienteBo paciente) {
        int cantidadControl = 0;
        try {
            ControlFacade controlFacade = new ControlFacade();
            ArrayList<ControlBo> arrayControles = controlFacade.getAllControlWherePaciente(paciente);
            cantidadControl = arrayControles.size();
        } catch (Exception e) {
            System.out.println("error al contar controles del paciente " + e);
        }

        return cantidadControl;
    }

}
