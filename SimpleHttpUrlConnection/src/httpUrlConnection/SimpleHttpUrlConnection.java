package httpUrlConnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SimpleHttpUrlConnection {

	private static Scanner in;
	
	public static void main(String args[]) throws Exception {
		
		// gets user input
		in = new Scanner(System.in);
		String website = null;		
		System.out.println("Please enter a website to connect to (example: www.google.com): ");
		website = in.next();
		
		// sets up connection objects
		URL webURL = new URL("http://" + website);		
		HttpURLConnection connectionObject = (HttpURLConnection) webURL.openConnection();
		
		// open the stream and put it into BufferedReader
        BufferedReader bufferReader = new BufferedReader(
        		new InputStreamReader(connectionObject.getInputStream()));

        // prints each line out until the end of the webpage
        String inputLine;
        while ((inputLine = bufferReader.readLine()) != null) {
                System.out.println(inputLine);
        }
        
        // important to close
        bufferReader.close();
				
		
	}
	
}
