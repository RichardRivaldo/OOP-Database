// Richard Rivaldo - 13519185

public class Utility {
    public static <T extends Number> double getMidpoint(T[] arr) {
        int arr_length = arr.length;

        if (arr_length % 2 != 0) {
            return (arr[arr_length / 2].doubleValue());
        } else {
            return ((arr[arr_length / 2].doubleValue() + arr[arr_length / 2 - 1].doubleValue()) / 2);
        }
    }

    public static <T> T getMidpoint(T[] arr) {
        return arr[arr.length / 2];
    }

    public static <T> T getLast(T[] arr) {
        return arr[arr.length - 1];
    }

    public static <T> T getFirst(T[] arr) {
        return arr[0];
    }

    public static <T extends Number> double getAverage(T[] arr) {
        double jumlah = 0;

        for (int i = 0; i < arr.length; i++) {
            jumlah += arr[i].doubleValue();
        }

        return jumlah / arr.length;
    }

    public static <T extends Number> double getMin(T[] arr) {
        double minVal = 99999;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].doubleValue() < minVal) {
                minVal = arr[i].doubleValue();
            }
        }
        return minVal;
    }

    public static <T extends Number> double getMax(T[] arr) {
        double maxVal = -99999;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].doubleValue() > maxVal) {
                maxVal = arr[i].doubleValue();
            }
        }
        return maxVal;
    }

    public static <T> int getSize(T[] arr) {
        return arr.length;
    }

    public static void main(String[] args) {
        String[] string = { "AAA", "AAAAAA", "BBBBB", "BBBBBBBBB", "CCCC" };

        for (String str : string) {
            System.out.println(str);
        }
    }
}