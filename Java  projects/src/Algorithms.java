public class Algorithms {

    public boolean binarysearch() {

        boolean result = false;
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16, 20};
        int target = 21;

        int left = 0;
        int right = sortedArray.length - 1;

        while(left <= right) {

            int middle = (int)(left + right)/2;
            System.out.println("left :  " + left + "   " + "right:  " + right + "  " + "middle:  " + middle);
            System.out.println(sortedArray[middle]);

            if (target == sortedArray[middle]) {
                result = true;
                break;
            }
            else if (target > sortedArray[middle]) {
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }

            for(int e: sortedArray) {
                System.out.print(e + "\t");
            }
            System.out.println();

        }
        return result;
    }



    public void bubblesort() {

        int[] array1 = {12, 4, 6, 8, 110, 145, 16, 20};
        int temp;

        for(int i = 0; i < array1.length-1 ; i++) {
            for(int j =0; j < array1.length-1-i ; j++) {
                if(array1[j] > array1[j+1]){
                    temp = array1[j];
                    array1[j] = array1[j+1];
                    array1[j+1] = temp;
                }
            }

        }

        for(int e: array1){
            System.out.print(e + "\t");
        }

    }
}
