package Java_BT11_daonguocmangsonguyenStack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int [] array = {1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println(stack);

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.peek();
            stack.pop();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        Stack<String> stack2 = new Stack<>();
        String string = "CodeGyms.com";
                String [] arr = string.split("");
                System.out.println("Kết quả: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            stack2.push(arr[i]);
        }
        System.out.println(stack2);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack2.peek();
            stack2.pop();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
