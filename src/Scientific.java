class Scientific extends Literature {

    private String fieldScience;
    private int quantity;


    public Scientific(String bookName, String author, String genre, int pages, int year, int code, String developerName, String fieldScience, int quantity) {
        super(bookName, author, genre, pages, year, code, developerName);


        this.quantity = quantity;
        this.fieldScience = fieldScience;
    }

    public String getFieldScience() { return fieldScience;}
    public void setFieldScience(String fieldScience) { this.fieldScience = fieldScience; }

    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) { this.quantity = quantity;}

    @Override
    public String toString() {
        return  super.toString() +
                " fieldScience= " + fieldScience + '\'' +
                " quantity=" + quantity +
                '}';
    }
}