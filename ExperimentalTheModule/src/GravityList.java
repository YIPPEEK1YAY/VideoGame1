import java.util.Arrays;

public class MagneticList {
    //fields
    int[] array1;

    //constructor
    public MagneticList() {
        this.array1 = new int[0];
    }

    //public methods
    public void turnOn() {
        int[] newArray = new int[array1.length];
        newArray[positionOfTwo()] = 2;
        int leftOverCount = 0;

        for (int j = 1; j <= oneCount(); j++) {
            if (positionOfTwo() + j < array1.length) {
                newArray[positionOfTwo() + j] = 1;
            } else {
                leftOverCount += 1;
            }
            if (positionOfTwo() - j >= 0) {
                newArray[positionOfTwo() - j] = 1;
            } else {
                leftOverCount += 1;
            }
        }

        array1 = newArray;
    }


    public void append(int newInt) {
        increaseArrayLengthByOne();
        array1[array1.length - 1] = newInt;
    }

    public void remove(int index) {
        int[] newArray = new int[array1.length - 1];

        array1[index] = 0;

        for (int i = 0; i < index; i++)
            newArray[i] = array1[i];

        for (int i = array1.length - 1; i > index; i--)
            newArray[i - 1] = array1[i];

        array1 = newArray;
    }

    public void print() {
        System.out.println(Arrays.toString(array1));
    }

    //private method
    private void increaseArrayLengthByOne() {
        int[] newArray = new int[array1.length + 1];

        for (int i = 0; i <= array1.length - 1; i++)
            newArray[i] = array1[i];

        newArray[newArray.length - 1] = 0;

        array1 = newArray;
    }

    private int oneCount() {
        int count = 0;
        for (int element : array1) {
            if (element == 1)
                count += 1;
        }
        return count;
    }

    private int positionOfTwo() {
        int x = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 2)
                x = i;
        }
        return x;
    }
}
