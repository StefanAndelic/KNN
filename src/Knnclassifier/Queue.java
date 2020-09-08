package Knnclassifier;

public class Queue implements Comparable<Queue>{

	float eucledian;
	String flower;
		
		public Queue(float eucl, String f) {
			this.eucledian = eucl;
			this.flower = f;
			
			
		}
		
		public Queue() {
			
			
		}

		@Override
		public int compareTo(Queue arg0) {
			if(this.eucledian > arg0.eucledian) {
				return 1;
			}
			if(this.eucledian < arg0.eucledian) {
				return -1;
			}
			else {
				return 0;
		}
		}

		
		
}
