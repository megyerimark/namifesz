/*
* File: App.java
* Author: Megyeri Márk Máté
* Copyright: 2022-10-24, Megyeri Márk Máté
* Group: Szoft II/N
* Date: 2022-10-24
* Github: https://github.com/megyerimark
* Licenc: GNU GPL
*/
 


import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("Megyeri Márk Máté, SZOFT II/N , 2022.10.24");
       Nyilvantart nyilvantart = new Nyilvantart();
       ArrayList<String> nevLista=nyilvantart.getNames();

       for(String nev : nevLista){
        System.out.println(nev);
       }
    }
}

