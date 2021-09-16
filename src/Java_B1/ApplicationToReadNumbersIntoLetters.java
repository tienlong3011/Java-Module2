package Java_B1;

import java.util.Scanner;

public class ApplicationToReadNumbersIntoLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số có cần dịch (0-999)");
        String number = scanner.nextLine();
        if(number.equalsIgnoreCase("0")){ //equalsIgnoreCase: so sanh bằng cả in hoa và in thường (không phân biệt in hoa in thường)
            System.out.println("Zero");
        }
        String[] array = number.split("");
        // 1 2 3
        switch (array.length) {
            case 1:
                System.out.println(units(array[0]));
                break;
            case 2:
            {
                if(array[0].equalsIgnoreCase("1")){
                    System.out.println(Ten(array[1]));
                    // 1  2  3
                    // 0  1  2
                } else{
                    System.out.println(Tens(array[0])+" "+units(array[1]));
                }
            }break;
            case 3:{
                if(array[1].equalsIgnoreCase("0") && array[2].equalsIgnoreCase("0")){
                    System.out.println(units(array[0]) + " hundred ");
                }
                else{
                    if(array[1].equalsIgnoreCase("1")){
                        System.out.println(units(array[0]) + " hundred "+Ten(array[2]));
                    }
                    else{
                        System.out.println(units(array[0]) + " hundred "+Tens(array[1])+" "+units(array[2]));
                    }
                }
            }break;
            default:
                break;
        }
    }
    public static String Ten(String num) {
        switch (Integer.parseInt(num)) {
            case 0:
                return "Ten";
            case 1:
                return "Elevent";
            case 2:
                return "Twelve";
            case 3:
                return "Thirteen";
            case 4:
                return "Fourteen";
            case 5:
                return "Fiveteen";
            case 6:
                return "Sixteen";
            case 7:
                return "Seventeen";
            case 8:
                return "Eighteen";
            case 9:
                return "Ninteen";
        }
        return "";
    }

    public static String units(String num) {
        switch (Integer.parseInt(num)) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
        }
        return "";
    }
    // 123 //
//one hundred twety threee

    public static String Tens(String numb){
        switch (Integer.parseInt(numb)) {
            case 0:
                return "";
            case 1:
                return "";
            case 2:
                return "Twety";
            case 3:
                return "Thirty";
            case 4:
                return "Fourty";
            case 5:
                return "Fifty";
            case 6:
                return "Sixty";
            case 7:
                return "Seventy";
            case 8:
                return "Eighty";
            case 9:
                return "Ninety";
        }
        return "";
    }


}



