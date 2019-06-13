/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.uv.app.fq.init;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author bnavarro
 */
public class LevelMeter {

    private static float nivelMaximo = 0;
    private int meterWidth = 10;
    private static long startTime = 0;
    private float amp = 0f;
    private float peak = 0f;
    private static int contadorForGeneral = 0;
    

    private static float nivelAnterior = 0;

    public void setAmplitude(float amp) {
//        System.out.println(amp);
        this.amp = Math.abs(amp);
    }

    public void setPeak(float peak) {
        this.peak = Math.abs(peak);
    }

 

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
              
               
//                new Thread(new Recorder(LevelMeter.this)).start();
            }
        });
    }

   
}
