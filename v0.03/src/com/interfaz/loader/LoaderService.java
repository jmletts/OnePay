package com.interfaz.loader;

import java.awt.Desktop;
import java.net.URI;

public class LoaderService {

    public void openLink(String url) {
      
        loader loa = new loader(); 
        loa.setVisible(true);

   
        new Thread(() -> {
            try {
              
                Thread.sleep(3000);

                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    Desktop.getDesktop().browse(new URI(url));
                } else {
                    System.out.println("No se puede abrir el navegador en este sistema.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
 
                loa.dispose();
            }
        }).start(); // Iniciar el hilo
    }
}
