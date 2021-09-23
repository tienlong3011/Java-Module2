package Java_BT;

public class FictionBook extends Book{
    private String cateGory;

    public FictionBook() {
    }

    public FictionBook(String bookCode, String name, double price, String author, String cateGory) {
        super(bookCode, name, price, author);
        this.cateGory = cateGory;
    }

    public String getCateGory() {
        return cateGory;
    }

    public void setCateGory(String cateGory) {
        this.cateGory = cateGory;
    }
}
