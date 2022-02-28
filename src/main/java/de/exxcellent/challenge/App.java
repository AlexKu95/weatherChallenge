package de.exxcellent.challenge;

import java.util.ArrayList;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */

    private static String weatherCsvPath = "./src/main/resources/de/exxcellent/challenge/weather.csv";

    public static void main(String... args) {

        // Your preparation code …
        
        String dayWithSmallestTempSpread = "Someday";     // Your day analysis function call …
        dayWithSmallestTempSpread = calculateDayWithSmallestTemperatureSpread(weatherCsvPath);
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }

    private static String calculateDayWithSmallestTemperatureSpread(String path){
        ArrayList<Weather> weatherList = Generator.generateWeatherList(path);
        Weather maxSpreadWeather = new Weather();
        int maxSpread=-1; 
        for (Weather weather : weatherList) {
            int tempSpread = weather.getSpread();
            if(tempSpread>maxSpread)
            {
                maxSpread = tempSpread;
                maxSpreadWeather = weather;
            }
        }
        return maxSpreadWeather.toString();
    }
}
