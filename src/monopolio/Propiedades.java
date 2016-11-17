/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author SebastianCabarcas
 */
public class Propiedades {

     class Nodo {

        String nombre;
        int alquiler;
        int alquiler1;
        int alquiler2;
        int alquiler3;
        int alquiler4;
        int alquilerhotel;
        int hipoteca;
        int casc;
        int hotc;
        int costo;
        String color;
        int comprabilidad;
        int casas;
        int hotel;
        int dueño;
        Nodo link;
    }

    Nodo hacerlista() throws FileNotFoundException {

        String[] s1 = new String[100];
        Scanner s = new Scanner(System.in);
        File file = new File("src/propiedades.txt");
        Scanner leer = new Scanner(file);
        Nodo q = null;
        Nodo ult;

        Nodo ptr = null;
        ult = null;
        
        while (leer.hasNextLine()) {
            q = new Nodo();
            String line = leer.nextLine();

            s1 = line.split(";");
            if (ptr == null) {
                ptr = q;
            } else {
                ult.link = q;
            }
            ult = q;

            q.nombre = s1[0];
            q.alquiler = toint(s1[1]);
            q.alquiler1 = toint(s1[2]);
            q.alquiler2 = toint(s1[3]);
            q.alquiler3 = toint(s1[4]);
            q.alquiler4 = toint(s1[5]);
            q.alquilerhotel = toint(s1[6]);
            q.hipoteca = toint(s1[7]);
            q.casc = toint(s1[8]);
            q.hotc = toint(s1[9]);
            q.costo = toint(s1[10]);
            q.color = s1[11];
            q.comprabilidad = toint(s1[12]);
            q.casas=0;
            q.hotel=0;
            q.dueño = toint(s1[13]);
            
        }
        q.link = ptr;
        return ptr;

    }

    int toint(String s) {
        int x;
        x = Integer.parseInt(s);
        return x;
    }
}
