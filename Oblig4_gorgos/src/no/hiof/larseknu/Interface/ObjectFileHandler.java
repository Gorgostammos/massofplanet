package no.hiof.larseknu.Interface;

import java.io.File;
import java.util.ArrayList;

public interface ObjectFileHandler<T> {

        // metode for å skrive til fil
        void writtToFile(ArrayList<T> t, File file);

        // metode for å lese fra fil og retunerer den
        ArrayList<T> readFromFile(File file);

    }
