///1

// public class BasicJava{
//     public static void main (String[] args){
//         for ( int i = 0 ; i <=255 ;i++ ){
//             System.out.println(i);
//         } 
//     }

// }

///2 
// public class BasicJava{
//     public static void main ( String[] args){
//         for ( int i = 0 ; i <= 255 ; i++){
//             if (i%2 == 1) {
//                 System.out.println(i);
//             }
//         }
//     }
// }

///////3
// public class BasicJava{
     
//         public static void main ( String[] args){
//             int sum = 0;
//             for ( int i = 0 ; i<=255 ; i++){
//                 sum += i ; 
//                  System.out.println(i + "," + sum);
//             }
           
        
//     }
// }

/////4
// public class BasicJava{
     
//         public static void main ( String[] args){
//             int [] arr={1,3,5,7,19};
//             for (int i =0 ; i <=arr.length ; i++){
//                 int x = arr[i];
//                 System.out.println(x);
//             }
//         }
// }

////5 MAX

// public class BasicJava{
     
//  public static void main (String[] args ){
//     int [] myArray= {5,6,9,21,69};
//      int max = myArray[0];
     
//         for (int i = 0 ; i <myArray.length ; i++){
//             if(myArray[i] > max){
//             max = myArray[i];
//             }
//         }
//         System.out.println(max);

//  }
// }


///// 6 Average
public static double average(double[] numbers) {
		double avg = 0;
		double sum = 0;
		for(double number : numbers) {
			sum += number;
		}
		avg = sum/numbers.length;
		System.out.println(String.format("The Average is: %.2f", avg));
		return avg;
	}

	// ////////////// 7
	// public static void oddArray() {
	// 	ArrayList<Integer> oddNumbers = new ArrayList<Integer>();  		
	// 	for (int i = 1; i <= 255; i++) {
	// 		if ( i % 2 == 1) {
	// 			// Integer s = (Integer) i;
	// 			oddNumbers.add(i);
	// 		}
	// 	}
	// 	System.out.println(oddNumbers);
	// }

	// ////////// 8
	// public static int greaterThan(double[] numbers ,double y) {
	// 	int counter = 0;
	// 	for (double number : numbers) {
	// 		if (number > y) {
	// 			counter += 1;
	// 		}
	// 	}
	// 	return counter;
	// }

	// ////////// 9
	// public static double[] squared(double[] numbers) {
	// 	double[] squares;
	// 	squares = new double[numbers.length];
	// 	for (int i = 0; i < numbers.length; i++) {
	// 		squares[i] = numbers[i] * numbers[i];
	// 		System.out.println(squares[i]);
	// 	}
	// 	return squares;
	// }

	// ///////// 10
	// public static int[] eliminateNegatives(int[] numbers) {
	// 	for (int i = 0; i < numbers.length; i++) {
	// 		if (numbers[i] < 0) {
	// 			numbers[i] = 0;
	// 		}
	// 	}
	// 	return numbers;
	// }

	// /////////// 11
	// public static double[] maxMinAvg(double[] numbers) {
	// 	double[] result;
	// 	result = new double[3]; 
	// 	double max = findMax(numbers);
	// 	double avg = average(numbers);
	// 	double min = numbers[0];
	// 	for (int i = 0; i < numbers.length; i++) {
	// 		if (numbers[i] < min) {
	// 			min = numbers[i];
	// 		}
	// 	}
	// 	result[0] = max;
	// 	result[1] = min;
	// 	result[2] = avg;
	// 	return result;
	// }

	// ////////////////12
	// public static double[] shift(double[] numbers) {
	// 	for (int i = 0; i < numbers.length - 1; i++) {
	// 		numbers[i] = numbers[i+1];
	// 	}
	// 	numbers[numbers.length-1] = 0;
	// 	return numbers;
	// }

}
}

