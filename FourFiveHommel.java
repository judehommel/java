/*
Name: Jude Hommel
Program description: Creates a 15 int array randomly inserted with two 4s and two 5s 
the rest of the space is filled with ints 12-18 (inclusive), after creating the array
the array is rearranged in place so that all 5s are swaped with numbers proceeding 4s,
if there's a 4 in the last spot in the array, then the 5 is swaped with the first element
Self-grade: 100
Testimony: I certify that I completed all of the code independently and did not
receive help from any unauthorized resources.
This code is not AI-generated. I understand that submitting AI-generated
work will result in a score of zero.
Your initials: JH
*/

import java.util.Arrays;

public class FourFiveHommel {
    /*
    Creates a 15 int array randomly inserted with two 4s and two 5s the rest of the space is filled with ints 12-18 (inclusive)
    */
    public static int[] createArray() {
        int[] arr = new int[15];

        // Insert nums 12-18
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 7 + 12);
        }

        // Insert two 4s and two 5s
        int index = (int) (Math.random() * arr.length);
        for (int i=0; i<2; i++) {
            int previousIndex = index-1;
            if (previousIndex < 0) {
                index = arr.length-1;
            }

            while (arr[index] == 4 || arr[index] == 5 || arr[previousIndex] == 4) {
                index = (int) (Math.random() * arr.length);
            }
            arr[index] = 4;
            while (arr[index] == 4 || arr[index] == 5) {
                index = (int) (Math.random() * arr.length);
            }
            arr[index] = 5;
        }

        return arr;
    }

    /*
    Rearranges an array in place so that all 5s are swaped with numbers proceeding 4s, if there's a 4 in the last spot in the array, then the 5 is swaped with the first element
    */
    public static void rearrangeArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            // Locate 4s
            if (arr[i] == 4) {
                for (int j = 0; j < arr.length; j++) {
                    int index = j-1;
                    if (index < 0) {
                        index = arr.length-1;
                    }
                    // Locate 5s unless they're already correct
                    if (arr[j] == 5 && arr[index] != 4) {
                        index = i+1;
                        if (index == arr.length) {
                            index = 0;
                        }
                        // Swap them
                        int tmp = arr[index];
                        arr[index] = arr[j];
                        arr[j] = tmp;
                        break;
                    }
                }
            }
        }
    }

    /*
    Creates the array, prints it, then rearranges the array and prints it
    */
    public static void main (String args[]) {
        int[] arr = createArray();
        System.out.println("Arr before rearragement: " + Arrays.toString(arr));
        rearrangeArray(arr);
        System.out.println("Arr after rearragement: " + Arrays.toString(arr));
    }
}
