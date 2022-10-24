/*
* File: Nyilvantart.java
* Author: Megyeri Márk Máté
* Copyright: 2022-10-24, Megyeri Márk Máté
* Group: Szoft II/N
* Date: 2022-10-24
* Github: https://github.com/megyerimark
* Licenc: GNU GPL
*/
 


import java.util.ArrayList;
import java.util.Arrays;

public class Nyilvantarto implements Nev {
    @Override
    public ArrayList<String> getNames() {

        String[] nevek = {"Béla", "Géza"} ;
        ArrayList<String>nevLista =
        new ArrayList<>(Arrays.asList(nevek));
        return nevLista;
     
    
};
}
