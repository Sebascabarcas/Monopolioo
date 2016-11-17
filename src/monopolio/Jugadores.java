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
public class Jugadores {
    public class NodoJug{
      int jugador;
      int dinero;
      int prisionero;
      int cartaprision;
      int casas;
      int hoteles;
      NodoJug link;
    }
     NodoJug hacerlista(int njug) throws FileNotFoundException {
        int a =1;
        NodoJug q = null;
        NodoJug ult;

        NodoJug ptr = null;
        ult = null;

        while (a<=njug) {
            q = new NodoJug();
            if (ptr == null) {
                ptr = q;
            } else {
                ult.link = q;
            }
            ult = q;

            q.jugador=a;
            q.dinero = 1500;
            q.prisionero=0;
            q.cartaprision = 0;
            q.casas =0;
            q.hoteles=0;
           a=a+1;

        }
        q.link = ptr;
        return ptr;

    }
}
