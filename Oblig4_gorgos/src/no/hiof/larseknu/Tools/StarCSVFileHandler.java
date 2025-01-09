package no.hiof.larseknu.Tools;

import no.hiof.larseknu.Interface.ObjectFileHandler;
import no.hiof.larseknu.models.Star;

import java.io.*;
import java.util.ArrayList;

public class StarCSVFileHandler implements ObjectFileHandler {

        @Override
        public void writtToFile(ArrayList t, File file) {
            try ( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
                for (Star s: (ArrayList<Star>)t){
                    bufferedWriter.write(s.getName() + ": " + s.getMass() + "; " +
                            s.getRadius() + "; " + s.getEffectiveTemp() +"\n");

                }

            } catch (IOException ioException) {
                System.err.println(ioException.getMessage());
            }
        }

        @Override
        public ArrayList readFromFile(File file) {

            String returnString = ";" ;

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

                String line;
                while ((line = bufferedReader.readLine()) != null){
                    returnString = returnString + "\n" + line;
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


            return null;
        }
    }


