package de.exxcellent.challenge;

import java.util.ArrayList;

/**
 * Static generator class, generates Lists of specific Elements
 */
public class Generator {
    
    /**
     * This method generates a ArrayList of Weather Objects from a file path.
     * @param path The path of the file as a string
     * @return an ArrayList<Weather> which has all the weather objects 
     */
    public static ArrayList<Weather> generateWeatherList(String path){
        ArrayList<Weather> weatherList = new ArrayList<Weather>();
        ArrayList<String> data = utility.readFilePerLine(path);
        data.remove(0); //Remove First Line
        for (String line : data) {
            String[] result = line.split(",");
            Weather tempWeather = new Weather(result);
            weatherList.add(tempWeather);
        }
        return weatherList;        
    }

    /**
     * This method generates a ArrayList of Footboll Objects from a file path.
     * @param path The path of the file as a string
     * @return an ArrayList<Football> which has all the Football objects 
     */
    public static ArrayList<Football> generateFootballList(String path){
        ArrayList<Football> footballList = new ArrayList<Football>();
        ArrayList<String> data = utility.readFilePerLine(path);
        data.remove(0); //Remove First Line
        for (String line : data) {
            String[] result = line.split(",");
            Football tempFootball = new Football(result);
            footballList.add(tempFootball);
        }
        return footballList;        
    }
    
}
