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

    //4. Gör om text-variabeln till stora bokstäver
    public String stringToUpperCase() {
        return text.toUpperCase();
    }

    //5. Metod for att göra om text-variabeln till null.
    public void textToNull() {
        this.text = null;
    }

    //6. Adderar number med nytt tal. Ersätter number-variabeln med summan. Neg ej accepteras.
    public void addToNumber(int n) {
        if(n >= 0) {
            this.number = number+n;
        } else {
            System.out.println("Enter a positive integer.");
        }
    }
    //7. toString-metod.

    @Override
    public String toString() {
        return "BigClass{" +
                "number=" + number +
                ", text='" + text + '\'' +
                '}';
    }
}
