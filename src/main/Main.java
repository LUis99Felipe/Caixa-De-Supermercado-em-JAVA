
package main;

import View.Splash_GUI;
import View.Tela_GUI;




public class Main {

    
    public static void main(String[] args) {
          Model.ConectaDriver_DB.carregaDriver();
            new Splash_GUI().setVisible(true);   
    }
    
}
