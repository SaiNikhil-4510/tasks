package myproject;
//task 10.3

public class Sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] arr = {5, 3, 8, 4, 2, 7};
		        // Bubble 
		        for (int i = 0; i < arr.length - 1; i++)
		        {
		            for (int j = 0; j < arr.length - 1 - i; j++)
		            {
		                if (arr[j] > arr[j + 1]) 
		                {
		                    int temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
		            }
		        }

		        // Display the sorted array
		        System.out.println("Sorted Array:");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		    }
		}
