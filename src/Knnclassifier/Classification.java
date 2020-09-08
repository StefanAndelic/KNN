package Knnclassifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Classification {

	public static float counter1;
	public static float counter2;
	public static float counter3;
	
	public static double accuracy;
	
	public static PriorityQueue<Queue> queue  = new  PriorityQueue<Queue>();

	  
		
	
	public static void classify() {
		//iterates through the trainining and test set instances
		
		for(int i = 0; i < Knnclassifier.Parser.test.size(); i++) {
			
			// three different counts for three different flower types 
			counter1 = 0;
			counter2 = 0;
			counter3 = 0;
			 Queue q;
			for(int j = 0; j < Knnclassifier.Parser.training.size(); j++) {
			
			
			float euclediandist = (float) Math.sqrt((Knnclassifier.Parser.test.get(i).swidth-Knnclassifier.Parser.training.get(j).swidth)*(Knnclassifier.Parser.test.get(i).swidth-Knnclassifier.Parser.training.get(j).swidth)
			+ (Knnclassifier.Parser.test.get(i).slength-Knnclassifier.Parser.training.get(j).slength)*(Knnclassifier.Parser.test.get(i).slength-Knnclassifier.Parser.training.get(j).slength) + (Knnclassifier.Parser.test.get(i).pwidth-Knnclassifier.Parser.training.get(j).pwidth)*(Knnclassifier.Parser.test.get(i).pwidth-Knnclassifier.Parser.training.get(j).pwidth) + 
			(Knnclassifier.Parser.test.get(i).plength-Knnclassifier.Parser.training.get(j).plength)*(Knnclassifier.Parser.test.get(i).plength-Knnclassifier.Parser.training.get(j).plength));
								
			q  = new Queue(euclediandist,Parser.training.get(j).flowertype);
			queue.add(q);
			
			//System.out.println(euclediandist);
				
				
			
			}
			
			for(int l = 0; l < Main.neighbours; l++) {
				
				Queue temp;
				temp = queue.poll();
							
				String test = temp.flower;
				if(test.equals("Iris-setosa")) {
				counter1++;				
								
				}
				else if(test.equals("Iris-versicolor")) {
				counter2++;				
								
				}
				else {
				counter3++;				
						
				}
								
				}
						
				queue.clear();
						
				Queue temporary1 = new Queue();	
				Queue temporary2 = new Queue();	
				Queue temporary3 = new Queue();	
						
				temporary1.eucledian = counter1;
				temporary1.flower ="Iris-setosa";
				queue.add(temporary1);
						
				temporary2.eucledian = counter2;
				temporary2.flower ="Iris-versicolor";
				queue.add(temporary2);
						
				temporary3.eucledian = counter3;
				temporary3.flower ="Iris-virginica";
				queue.add(temporary3);
						
								
				while(queue.size() > 1) {
						
				Queue proba;
				proba = queue.poll();
				//System.out.println(queue.size());
							
				}
								
						
				q = queue.poll();
				
				System.out.println("[" + q.flower + "]");
				
				if(q.flower.equals(Knnclassifier.Parser.test.get(i).flowertype)) {
				accuracy++;
				//System.out.println(accuracy);
				}
						
						
					
			
		}
		
		
	}
}
