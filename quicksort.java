public class QuickSort {

	public static void main(String[] args) 
	{
		int[] array = {50, 11, 33, 21, 40, 50, 40, 40, 21}; //enter initial array
		int x = array.length; //length of the array
		quickSort(array, 0, x - 1); //array after only quicksort
		System.out.println("Array using QuickSort: "); //print out 
		System.out.println();
		printArray(array, x); //array after sizing
	}
	
	 static void swapArray(int[] array, int i, int j) //used to swap the array 
	    {
	        int temp = array[i]; //initialize a variable, temp
	        array[i] = array[j];  //transfer temp to array[j]
	        array[j] = temp;
	    }
	  

	 static int partition(int[] array, int low, int high) //partition the array 
	    {
	  
	        int pivot = array[high]; //the pivot belongs to the highest number or the last number

	        int i = (low - 1);
	  
	        for (int j = low; j <= high - 1; j++) {

	            if (array[j] < pivot) {

	                i++;
	                swapArray(array, i, j); //perform the swapping of the array as needed
	            }
	        }
	        swapArray(array, i + 1, high);
	        return (i + 1);
	    }

	 static void quickSort(int[] array, int low, int high) //perform quickSort when higher is bigger than the low
	    {
	        if (low < high) {

	            int pi = partition(array, low, high);
	            quickSort(array, low, pi - 1);
	            quickSort(array, pi + 1, high);
	    }
	    }
	  

	  static void printArray(int[] array, int size) //print the array with the correct sizing
	    {
	        for (int i = 0; i < size; i++)
	            System.out.print(array[i] + " ");
	        	System.out.println();
	    }
		}
