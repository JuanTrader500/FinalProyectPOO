/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproyectpoo.View;

/**
 *
 * @author juana
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.BorderLayout; // Necesario para el layout
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Un JPanel personalizado que dibuja una imagen de fondo.
 * La imagen se escala para llenar el tamaño del panel.
 */
public class ImagePanel extends JPanel {

    private Image backgroundImage;

    /**
     * Constructor que carga la imagen de fondo.
     * @param imagePath La ruta a la imagen (ej: "/com/mycompany/recursos/fondo.jpg")
     */
    public ImagePanel(String imagePath) {
        // Carga la imagen
        try {
            // Usamos getResource para que la imagen se cargue desde el JAR final
            ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
            this.backgroundImage = icon.getImage();
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen de fondo: " + imagePath);
            e.printStackTrace();
            this.backgroundImage = null;
        }
        
        // Asignamos un BorderLayout para poder añadir el JTextArea (CENTER) 
        // y el JButton (SOUTH) fácilmente.
        setLayout(new BorderLayout());
    }

    /**
     * Este método es llamado por Swing para dibujar el componente.
     * Lo sobrescribimos para pintar nuestra imagen primero.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Pinta el fondo normal primero
        
        // Si la imagen se cargó correctamente, la dibuja
        if (backgroundImage != null) {
            // Dibuja la imagen para que llene el panel (getWidth(), getHeight())
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
