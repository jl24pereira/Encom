package com.pereira.encomiendas.main;

import com.pereira.encomiendas.beans.EmisorFacade;
import com.pereira.encomiendas.view.Principal;
import javax.swing.UIManager;

public class Main {

    public static void main(String args[]) {
        Principal principal = new Principal();
        principal.setLocationRelativeTo(null);
        
        principal.setVisible(true);
        //EmisorFacade facade = new EmisorFacade();
        /*facade.findAll().forEach(emisor->{
            System.out.println("emisor: "+emisor.getNombres());
        });*/

    }
}
