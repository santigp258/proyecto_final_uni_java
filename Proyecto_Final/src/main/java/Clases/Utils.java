/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Laura Isabel
 */
public class Utils {
    
    public static String formatDate(Date fecha) {
        /* Convierte una fecha de tipo Date al formato que se esta definiendo 
           "yyyy/MM/dd" y queda de tipo String */
        if (fecha == null) {  /*Si la fecha esta en blanco entonces a esa fecha
                                asignele la fecha del sistema */
            fecha = new Date();
        }
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/MM/dd");
        return formatoDelTexto.format(fecha);
    }
    
}
