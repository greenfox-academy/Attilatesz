import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[]{1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    private static List<Integer> subInt(int i, int[] ints) {

        List<Integer> filledList = new ArrayList<Integer>();

        for (int j = 0; j < ints.length; j++) {
            if (Integer.toString(ints[j]).contains(Integer.toString(i))) {
                filledList.add(ints[j]);
            }
        }
        return filledList;
    }
}