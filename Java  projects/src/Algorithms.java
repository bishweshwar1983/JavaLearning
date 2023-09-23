import java.util.ArrayList;
import java.util.List;

public class Algorithms {

    private final List<Integer> arrayToSort;

    public Algorithms(List<Integer> arrayToSort)
    {
        this.arrayToSort = arrayToSort;
    }

    public List<Integer> getresult(){
        return arrayToSort;
    }

    public boolean binarysearch() {

        boolean result = false;
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16, 20};
        int target = 2;

        int left = 0;
        int right = sortedArray.length - 1;

        while(left <= right) {

            int middle = (int)(left + right)/2;

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

        }
        return result;
    }



    public void bubblesort() {

        int[] array1 = {12, 4, 6, 8, 110, 145, 16, 20};

        for(int i = 0; i < array1.length-1 ; i++) {
            for(int j =0; j < array1.length-1-i ; j++) {
                if(array1[j] > array1[j+1]){
                    int temp;
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


    public void mergeSort(int start, int end) {

        if(start < end && (end-start)>=1){
            int middle = (start + end)/2;
            mergeSort(start, middle);
            mergeSort(middle+1, end);
            merge(start, middle, end);
        }

    }

    public void merge(int lb, int mid, int ub){

        List<Integer> finallist = new ArrayList<>();
        int l = lb;
        int j = mid+1;
        while(l <= mid && j <= ub){
            if(arrayToSort.get(l) <= arrayToSort.get(j)){
                finallist.add(arrayToSort.get(l));
                l++;
            }
            else{
                finallist.add(arrayToSort.get(j));
                j++;
            }
        }

        while(l<=mid){
            finallist.add(arrayToSort.get(l));
            l++;
        }

        while(j<=ub){
            finallist.add(arrayToSort.get(j));
            j++;
        }



        for(int i=0; i<finallist.size(); lb++){
            arrayToSort.set(lb, finallist.get(i++));
        }
        System.out.println("new new list: " + arrayToSort);

    }


}
