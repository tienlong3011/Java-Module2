package Java_BT11_daonguocmangsonguyenStack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        //dao nguoc so nguyen
        Stack<Integer> stack = new Stack<>();
        int [] array = {1,2,3,4,5};
        for (int j : array) {
            stack.push(j);
        }
        System.out.println(stack);

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        for (int j : array) {
            System.out.println(j);
        }

        // dao nguoc chuoi
        Stack<String> stack2 = new Stack<>();
        String string = "CodeGyms.com";
                String [] arr = string.split("");
                System.out.println("Kết quả: " + Arrays.toString(arr));

        for (String s : arr) {
            stack2.push(s);
        }
        System.out.println(stack2);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack2.pop();
        }
        for (String s : arr) {
            System.out.print(s);
        }

    }
}
