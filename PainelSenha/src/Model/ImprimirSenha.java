/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author LAB3M3
 */
public class ImprimirSenha {
    public static void imprimir(){
       
        LocalDate data = java.time.LocalDate.now();
        String recebe = data.format(DateTimeFormatter.ISO_DATE);
        System.out.println(recebe);
        Frame f = new Frame("Imp");
        Toolkit tk = f.getToolkit();
        PrintJob pj = tk.getPrintJob(f, "Recibo", null);
        if (pj != null) {
            Graphics m = pj.getGraphics();
             m.drawString("CLÍNICA MÉDICA", 50, 60);
             m.drawString("Senha Preferencial", 50, 80);
             m.drawString("Senha: " + View.Inicio_GUI.resultado, 50, 100);
             m.drawString("Data: " + recebe , 50, 120);   
            m.dispose();
            m.finalize();
            pj.end();
            pj.finalize();
        }
        f.dispose();
 }
    }

