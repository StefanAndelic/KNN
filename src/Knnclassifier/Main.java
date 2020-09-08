package Knnclassifier;


public class Main {

	public static String test_set;
	public static String training_set;
	
	

	//path to the directory
	public static String path = "src\\Knnclassifier\\data\\";


	public static void main (String [] args) {


		if(args.length < 3){

			System.out.println("Please enter training set, test set and number of neighbours:");

		}
		else {
			/*String filename1 = "iris-training.txt";
			String filename2 = "iris-test.txt";*/


			String dir = System.getProperty("user.dir");
			training_set = path + args[0];
			test_set = path + args[1];
			neighbours = Integer.parseInt(args[2]);
			System.out.println("Reading the training set from:" + " " +  dir + "\\" + test_set);
			System.out.println("Reading the test set from:" + " " + dir + "\\" +  training_set);

		}


		if(neighbours == 1) {
			System.out.println("Classifying and calculating accuracy of KNN for" + " " + args[2] + " " + "neighbour");
			System.out.println("------------------------------------------------------------");
		}

		else {

			System.out.println("Classifying and calculating accuracy of KNN for" + " " + args[2] + " " + "neighbours");
			System.out.println("------------------------------------------------------------");
		}


		Knnclassifier.Parser.loadtrainingset(training_set);       // loads the training set
		Knnclassifier.Parser.loadtestset(test_set);					// loads the test set
		System.out.println("Predicted class labels are:");
		Knnclassifier.Classification.classify();                       // performs the classification
		double accuracy = (Classification.accuracy/Parser.test.size())*100;           // calculates the accuracy of the classifier
		System.out.println("Classification accuracy of KNN algorithm is:" + accuracy + "%");


	}


}
