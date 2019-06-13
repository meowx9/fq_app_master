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
import cl.uv.app.fq.resource.ResourcesUtil;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author bnavarro
 */
public class Registro {

    JFrame frame;

    public void loadRegistro(JFrame jframe) {
        frame = jframe;

        //Centrar
        frame.setLocationRelativeTo(null);

        //Título
        frame.setTitle("Registro de Médico FQ");

        ResourcesUtil rUtil = new ResourcesUtil();
        ImageIcon ImageIcon = new ImageIcon(rUtil.getPulmonShowMessage());
        Image Image = ImageIcon.getImage();
        frame.setIconImage(Image);
    }


}
