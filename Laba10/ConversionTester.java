package Laba10;

public class ConversionTester {
    public static void main(String[] args) {
        Conversion convertator = new Conversion();

       Integer[] arr_int = new Integer[5];

        for (int i = 0; i < arr_int.length; i++)
            arr_int[i] = i * 5;

        System.out.println(convertator.conversionToArrayList(arr_int).toString());

        String[] arr_str = new String[5];

        for (int i = 0; i < arr_str.length; i++)
            arr_str[i] = "element number = " + (1+i);

        System.out.println(convertator.conversionToVector(arr_str).toString());
    }
}
