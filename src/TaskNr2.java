public class TaskNr2 {

    public static void main(String[] args) {
//        Create a simple 1 dimensional array of 10 integers. Select the values yourself
//        1) In a for loop print all odd values
//        2)  Calculate and print sum of all odd values


        int[] newArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int i : newArray) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("The sum of the odd numbers are : " + sum);
//        find the smallest value in the array
//        Find the largest element in the array

        int minValue = newArray[0];
        int maxValue = newArray[0];

        for (int i=0; i<newArray.length; i++) {
            if (newArray[i] < minValue)
            minValue=newArray[i];
        }
            System.out.println("The smallest number in the array is " + minValue);
        for (int i=0; i<newArray.length; i++) {
            if(newArray[i]>maxValue)
                maxValue=newArray[i];
        }
        System.out.println("The largest number in the array is " + maxValue);







    }
}
