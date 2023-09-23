import java.util.ArrayList;
import java.util.List;

public class SortArrayList {
    private final List<Integer> arrayToSort;

    public SortArrayList(List<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    public List<Integer> getArrayAfterSorting() {
        return arrayToSort;
    }

    public void divideArrayElements(int indexStart, int indexEnd) {

        if (indexStart < indexEnd && (indexEnd - indexStart) >= 1) {
            int middleElement = (indexEnd + indexStart) / 2;

            divideArrayElements(indexStart, middleElement);
            divideArrayElements(middleElement + 1, indexEnd);

            mergeArrayElements(indexStart, middleElement, indexEnd);
        }
    }

    public void mergeArrayElements(int indexStart, int indexMiddle, int indexEnd) {

        List<Integer> tempArray = new ArrayList<>();

        int getLeftIndex = indexStart;
        int getRightIndex = indexMiddle + 1;

        while (getLeftIndex <= indexMiddle && getRightIndex <= indexEnd) {

            if (arrayToSort.get(getLeftIndex) <= arrayToSort.get(getRightIndex)) {

                tempArray.add(arrayToSort.get(getLeftIndex));
                getLeftIndex++;

            } else {

                tempArray.add(arrayToSort.get(getRightIndex));
                getRightIndex++;

            }
        }

        while (getLeftIndex <= indexMiddle) {
            tempArray.add(arrayToSort.get(getLeftIndex));
            getLeftIndex++;
        }

        while (getRightIndex <= indexEnd) {
            tempArray.add(arrayToSort.get(getRightIndex));
            getRightIndex++;
        }


        for (int i = 0; i < tempArray.size(); indexStart++) {
            arrayToSort.set(indexStart, tempArray.get(i++));

        }

    }

    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(15);
        integerArrayList.add(1);
        integerArrayList.add(10);
        integerArrayList.add(4);
        integerArrayList.add(99);
        integerArrayList.add(7);
        integerArrayList.add(9);
        integerArrayList.add(3);

        SortArrayList exampleClass1 = new SortArrayList(integerArrayList);

        System.out.println("Array Before Merge Sort: ");
        for (Integer integer : exampleClass1.getArrayAfterSorting()) {
            System.out.println(integer);
        }

        System.out.println();

        exampleClass1.divideArrayElements(0, integerArrayList.size() - 1);

        System.out.println("Array After Merge Sort: ");
        for (Integer integer : exampleClass1.getArrayAfterSorting()) {
            System.out.println(integer);
        }


    }
}