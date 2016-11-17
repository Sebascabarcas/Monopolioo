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
public class CommunityQuest {
     public class NodoCq{
    int id;
    String descripcion;
    String flag;
    String action;
    NodoCq link;
    }
     NodoCq hacerlista() throws FileNotFoundException {
        String[] s1 = new String[100];
        File f = new File("src/Community.txt");
        Scanner leer = new Scanner(f);
        NodoCq q = null;
        NodoCq ult;
        NodoCq ptr = null;
        ult = null;
        
        while (leer.hasNextLine()) {
         
            q = new NodoCq();
            String line = leer.nextLine();
            
            s1 = line.split(";");
            if (ptr == null) {
                ptr = q;
            } else {
                ult.link = q;
            }
            ult = q;

            q.id=toint(s1[0]);
            q.descripcion = s1[1];
            q.flag=s1[2];
            q.action = s1[3];
            
       

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


