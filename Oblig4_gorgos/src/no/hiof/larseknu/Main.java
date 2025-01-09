package no.hiof.larseknu;

import no.hiof.larseknu.Tools.StarCSVFileHandler;
import no.hiof.larseknu.models.CelestialBody;
import no.hiof.larseknu.models.Planet;
import no.hiof.larseknu.models.PlanetSystem;
import no.hiof.larseknu.models.Star;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        File fil = new File("Star.csv");

        ArrayList<Star> stars = new ArrayList<>();
        stars.add(new Star("Sun",1.0,1.0, 5777.0));
        stars.add(new Star("MU Cas",4.192, 4.657, 14750.0));
        stars.add(new Star("V69-47",1.316,0.876,5945.0));
        stars.add(new Star("YZ Cas",2.547,2.308,9200.0));
        stars.add(new Star("NGC188",1.425,1.102,5900.0));
        stars.add(new Star("zet Phe",2.853,3.922,14550.0));

        StarCSVFileHandler handler = new StarCSVFileHandler();

        handler.writtToFile(stars,fil);



        Star sun = new Star("Sun", 1.0, 1.0, 5777);

	    PlanetSystem solarSystem = new PlanetSystem("Solar System", sun);


        solarSystem.addPlanet(new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4, 0.387, 0.206, 88, sun));
	    
	    solarSystem.addPlanet(new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225, sun));
        solarSystem.addPlanet(new Planet("Earth", 0.08911486599899289, 0.003146469968387777, 1, 0.017, 365, sun));
        solarSystem.addPlanet(new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687, sun));
        solarSystem.addPlanet(new Planet("Jupiter",1.0, 1.0, 5.20440, 0.049, 4380, sun));
        solarSystem.addPlanet(new Planet("Saturn", 0.8145247020645666, 0.2994204425711275, 9.5826, 0.057, 10585, sun));
        solarSystem.addPlanet(new Planet("Uranus", 0.35475297935433336, 0.04573761854583773,  19.2184, 0.046, 30660, sun));
        solarSystem.addPlanet(new Planet("Neptune",0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225, sun));





        System.out.println();
ArrayList<Planet> temp = solarSystem.getPlanets();

        Collections.sort(temp);
        for (CelestialBody o : temp){
            System.out.println(o);

        }



    }




    }











