/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import javax.sound.sampled.*;
import sonido.Sonidos;


/**
 *
 * @author shiba
 */
public class Main implements Sonidos{
    public static void main(String[] args){
        Main m = new Main();
        m.reproducirSonido("inicio.wav");
        VentanaInicio vI = new VentanaInicio();
        vI.setVisible(true);
    }

    @Override
    public void reproducirSonido(String sonido) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(VentanaInicio.class.getResourceAsStream("/sonido/" + sonido));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
