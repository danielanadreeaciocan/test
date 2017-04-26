/**
 * Created by DACiocan on 4/26/2017.
 */
public class Arrays {
    //return max value
    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
    //return avg of an array of elements
    public static double avgArray(int[] inputArray) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++)
            sum = sum + inputArray[i];
        double avg = sum / inputArray.length;
        return avg;
    }
    //does the arrau have duplicates?
    public static boolean hasDuplicates(int[] inputArray) {
        boolean duplicate = false;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[i]==inputArray[j] && i != j) {
                    duplicate = true;
                }
            }
        }

            return duplicate;
    }

    //sort the array using bubble sort
    public static void bubbleSort(int[] inputArray) {
        int n = inputArray.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (inputArray[j - 1] > inputArray[j]) {
                    temp = inputArray[j - 1];
                    inputArray[j - 1] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
    }


    public static void main(String args[]){
        int[] inputArray = {5,1,2,4,3};

        getMax(inputArray);
        System.out.println("Max value is: "+ getMax(inputArray));

        avgArray(inputArray);
        System.out.println("Average value is: "+ avgArray(inputArray));

        hasDuplicates(inputArray);
        System.out.println("Does the array have duplicates?: "+ hasDuplicates(inputArray));

        bubbleSort(inputArray);
        for(int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }

    }
    }



