package com.interfaz.loader;

import java.awt.Desktop;
import java.net.URI;

public class LoaderService1 {

    public void openLink() throws InterruptedException {
      
        loader loa = new loader(); 
        loa.setVisible(true);

        Thread.sleep(3000);
        
        loaderIni ini = new loaderIni();
        ini.setVisible(true);
        
    }
}
