package simpleJSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// importing from the JSON simple library
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SimpleJSON {

	// This program shows how to use the JSON simple library
	// By creating a JSON object and array,
	//    writing it to a file,
	//    reading it back up,
	//    and using the JSON parser to parse the content back into a JSON object.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student name: ");
		String name = input.nextLine();

		// create new JSON object and adds a name-name value pair into the JSON Object
		JSONObject root = new JSONObject();
		root.put("name", name);
		
		// declaring the array before adding to it in the loop
		JSONArray courses = new JSONArray();
		
		while (true) {
			
			// get the course name
			System.out.print("Enter course name: ");
			String course = input.nextLine();
			
			// check to see if the user hits enter to exit the loop
			if (course.length() == 0) {
				break;
			}
			
			// get the grade
			System.out.print("Enter Grade: ");
			int grade = input.nextInt();
			
			if (input.hasNextLine()) {
				input.nextLine();
			}
			
			// create a JSON object and stores a class object in it
			JSONObject courseObject = new JSONObject();
			courseObject.put("grade", grade);
			courseObject.put("name", course);
			
			// adds the course to the array
			courses.add(courseObject);
			
		}
		
		// add the array to the root object
		root.put("courses", courses);
		
		System.out.println(root.toJSONString());
		
		// creating the file to write the JSON structure to it		
		File file = new File("StudentGrades.txt");
		
		try (PrintWriter writer = new PrintWriter(file)){
			writer.print(root.toJSONString());
		} catch (FileNotFoundException ex) {
			System.out.println(ex.toString());
		}
		
		System.out.println("File created successfully\n\n Press enter to continue.");
		input.nextLine();
		
		try {
			input = new Scanner(file);
			
			// reading the file line by line
			StringBuilder jsonIn = new StringBuilder();
			while (input.hasNextLine()) {
				jsonIn.append(input.nextLine());
			}
			System.out.println(jsonIn.toString());
			
			// Parsing the string retrieved from the file
			JSONParser parser = new JSONParser();			
			JSONObject objRoot = (JSONObject) parser.parse(jsonIn.toString());
			
			System.out.printf("Student name is %s\n", objRoot.get("name").toString());
			
			// adding the parsed contents back into a JSON array
			JSONArray coursesIn = (JSONArray) objRoot.get("courses");
			
			// looping back through the JSON array to display the contents
			for (int i = 0; i < coursesIn.size(); i++) {
				JSONObject courseIn = (JSONObject) coursesIn.get(i);
				long gradeIn = (long) courseIn.get("grade");
				String nameIn = (String) courseIn.get("name");
					
				System.out.printf("Course %s; grade %d\n", nameIn, gradeIn);
			}
			
		} catch (FileNotFoundException ex) {
			System.out.println(ex.toString());
			
		} catch (ParseException ex) {
			System.out.println(ex.toString());
		}		
		
	}

}
