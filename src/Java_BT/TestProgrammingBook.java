package Java_BT;


import java.util.ArrayList;

public class TestProgrammingBook {
    public static void main(String[] args) {

        Book SupperBook1 = new ProgrammingBook("B1", "Đắc nhân tâm", 300, "TG1", "English", "CodeIgniter");
        Book SupperBook2 = new ProgrammingBook("B2", "Cách nghĩ để thành công", 350, "TG2", "Tiếng việt", "CakePHP");
        Book SupperBook3 = new ProgrammingBook("B3", "7 thói quen của người thành đạt", 400, "TG3", "English", "Node.js");
        Book SupperBook4 = new ProgrammingBook("B4", "Cuộc sống không giới hạn", 450, "TG4", "Tiếng việt", "Laravel Framework");
        Book SupperBook5 = new ProgrammingBook("B5", "Người giàu có nhất thành Babylon", 500, "TG5", "Tiếng việt", ".NET Framework");

        Book SupperBook6 = new FictionBook("B6", "Hành trình về Phương Đông", 300, "TG6", "18+");
        Book SupperBook7 = new FictionBook("B7", "Quẳng gánh lo đi mà vui sống", 350, "TG7", "16+");
        Book SupperBook8 = new FictionBook("B8", "Bộ sách – Hạt giống tâm hồn", 400, "TG8", "16+");
        Book SupperBook9 = new FictionBook("B9", "Tốc độ của niềm tin", 450, "TG9", "18+");
        Book SupperBook10 = new FictionBook("B10", "Thói quen thứ 8", 500, "TG10", "13+");

//        ArrayList<Book> ListBook = new ArrayList<>();
//        ListBook.add(SupperBook1);
//        ListBook.add(SupperBook2);
//        ListBook.add(SupperBook3);
//        ListBook.add(SupperBook4);
//        ListBook.add(SupperBook5);
//        ListBook.add(SupperBook6);
//        ListBook.add(SupperBook7);
//        ListBook.add(SupperBook8);
//        ListBook.add(SupperBook9);
//        ListBook.add(SupperBook10);
//
//        double sum = 0;
//        for (int i = 0; i < ListBook.size(); i++) {
//            sum += ListBook.get(i).getPrice();
//        }
//        System.out.println("Tổng số tiền 10 cuốn sách là: " + sum)


        Book[] bookList = {SupperBook1, SupperBook2, SupperBook3, SupperBook4, SupperBook5, SupperBook6, SupperBook7, SupperBook8, SupperBook9, SupperBook10};

        double sum = 0;
        for (int i = 0; i < bookList.length; i++) {
            sum += bookList[i].getPrice();
        }
        System.out.println("Tổng tiền là: " + sum);

        int count = 0;
        Book[] bookList2 = {SupperBook1,SupperBook2,SupperBook3,SupperBook4,SupperBook5};
        for (int i = 0; i < bookList2.length; i++) {
            if(((ProgrammingBook)bookList2[i]).getLanguage().equalsIgnoreCase("English")){
                count++;
            }
        }
        System.out.println("Số sách có tiếng English là: " + count);
    }
}
