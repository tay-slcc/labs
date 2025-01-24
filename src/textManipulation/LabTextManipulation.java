package textManipulation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * Reads in the names of national parks and</br>
 * prints them in the format:</br>
 * {parkName} | {parkName} | {parkName} ...
 * 
 * @author chantay
 */
public class LabTextManipulation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> parks = new ArrayList<>();
		

        while (true) {
    		System.out.print("Please enter your favorite National Park or DONE to stop: ");
            String park = scanner.nextLine();

            if (park.equalsIgnoreCase("done")) {
            	scanner.close();
                break;
            } else {
            	parks.add(updateSpelling(park));
            }

        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < parks.size(); i++) {
            String park = parks.get(i);
            boolean isLast = i + 1 == parks.size();
            if (isLast) sb.append(park);
            else sb.append(park + " | ");
        }
		
		System.out.println(sb);

	}
	
	/**
	 * 
	 * formats the text to be titleized
	 * 
	 * @param text   unformatted text
	 * @return       titleized and trimmed text
	 */
	private static String updateSpelling(String text) {
		text = text.toLowerCase().strip();
		StringBuilder titleized = new StringBuilder(text.length());
		
		for (int i = 0; i < text.length(); i++) {
			String letter = text.substring(i, i+1);
			if (i == 0 || titleized.substring(i-1, i).equals(" ")) {
				titleized.append(letter.toUpperCase());
			} 
			else titleized.append(letter);
		}
		
		return titleized.toString();
	}

}
