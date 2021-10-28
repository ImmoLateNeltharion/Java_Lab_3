public class        Guide extends Literature {

    private String direction;
    private String tom;
    private int chapter;


    public Guide(String bookName, String author, String genre, int pages, int year, int code, String developerName, String direction, String tom, int chapter) {
        super(bookName, author, genre, pages, year, code, developerName);

        this.direction = direction;
        this.tom = tom;
        this.chapter = chapter;

    }

    public String getDirection() { return direction;}
    public void setDirection(String direction) { this.direction = direction; }

    public String getTom() { return tom;}
    public void setTom(String tom) { this.tom = tom;}

    public int getChapter() { return chapter;}
    public void setChapter(int chapter) { this.chapter = chapter;}

    @Override
    public String toString() {
        return  super.toString() +
                " direction= '" + direction + '\'' +
                ", tom= " + tom +
                ", chapter= " + chapter;
    }
}
