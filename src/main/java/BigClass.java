public class BigClass {
    private int number = 0;
    private String text = null;

    public BigClass() {

    }
    public BigClass(int number) {
        this.number = number;
    }
    public BigClass(String text) {
        this.text = text;
    }
    public BigClass(int number,String text) {
        this.number = number;
        this.text = text;
    }

    public void setNumber(int number) {
        if (number >= 0) {
            this.number = number;
        } else {
            System.out.println("Enter a positive integer");
        }
    }
    public int getNumber() {
        return number;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
