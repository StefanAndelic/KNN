package Knnclassifier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Parser {

	
	public static ArrayList<Instance> test;  
	public static ArrayList<Instance> training;
	
	
	
	//loads the test set
	public static void loadtestset(String filename) {
		 test = new ArrayList<Instance>();
		String line;
			
		try {
		BufferedReader br = new BufferedReader(new FileReader(filename));
		
			
			while ((line = br.readLine()) != null && br.readLine() != "\n") {
				String[] values = line.split("\n");
				String[] arr = values[0].split(" ");    
										
				
				float sepalh = Float.parseFloat(arr[0]);
				float sepalw = Float.parseFloat(arr[2]);
				float petalh = Float.parseFloat(arr[4]);
				float petalw = Float.parseFloat(arr[6]);
				String flower = arr[8];
				
							
				test.add(new Instance(sepalh,sepalw,petalh,petalw,flower));
				
			}
			
		

			br.close();
			
		}
		
		catch(IOException e) {
			System.out.println("File not found");
			e.printStackTrace();
			
		}
	}

	//loads the training set
	public static void loadtrainingset(String filename) {
	
		 training = new ArrayList<Instance>();
			String line;
				
			try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
				
				while ((line = br.readLine()) != null && br.readLine() != "\n") {
					String[] values = line.split("\n");
					String[] arr = values[0].split(" ");    
											
					
					float sepalh = Float.parseFloat(arr[0]);
					float sepalw = Float.parseFloat(arr[2]);
					float petalh = Float.parseFloat(arr[4]);
					float petalw = Float.parseFloat(arr[6]);
					String flower = arr[8];
					
								
					training.add(new Instance(sepalh,sepalw,petalh,petalw,flower));
					
				}
				
				
				br.close();
				
			}
			
			catch(IOException e) {
				
				System.out.println("File not found");
				e.printStackTrace();
				
			}
			
		}

	
}
