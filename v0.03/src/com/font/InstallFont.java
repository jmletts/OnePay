
package com.font;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class InstallFont {

    public static String installFont(String fontPath) {
        try {
            // Ruta 
            File fontFile = new File(fontPath);

            // Verificar si el archivo  existe
            if (!fontFile.exists()) {
                return "El archivo de la fuente no existe: " + fontFile.getAbsolutePath();
            }

            // Directorio 
            String windowsFontsDir = System.getenv("WINDIR") + "\\Fonts";
            File systemFontDir = new File(windowsFontsDir);

            // Verificar 
            if (!systemFontDir.exists()) {
                return "No se encontró el directorio de fuentes del sistema.";
            }

            // Verificar 
            File destination = new File(systemFontDir, fontFile.getName());
            if (destination.exists()) {
                return "La fuente ya está instalada: " + destination.getAbsolutePath();
            }

            Files.copy(fontFile.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);

            return "Fuente instalada correctamente en: " + destination.getAbsolutePath();

        } catch (IOException e) {
            return "Error al instalar la fuente: " + e.getMessage();
        }
    }
}
