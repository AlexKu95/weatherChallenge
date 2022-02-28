package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Static utility class, only used for file reading 
 */
public class utility {

    /**
     * The method gets a Path String for a file and reads it line per Line. It saves the elements as entrys in an ArrayList. 
     * @param path A path to a readable text or csv file
     * @return Returns an ArrayList of Strings. Each line represents one entry in the ArrayList.
     */
    public static ArrayList<String> readFilePerLine(String path)
    {
        ArrayList<String> lines = new ArrayList<String>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(path));
			String line = reader.readLine();
			while (line != null) {
				//System.out.println(line);
                lines.add(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return lines;
	}
}
