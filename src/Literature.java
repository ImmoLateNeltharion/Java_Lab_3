 class Literature {
    private int code;
    private int year;
    private int pages;
    private String genre;
    private String developerName;
    private String author;
    private String bookName;

    public Literature(String bookName, String author, String genre, int pages, int year, int code, String developerName ) {
        this.code = code;
        this.year = year;
        this.pages = pages;
        this.genre = genre;
        this.developerName = developerName;
        this.author = author;
        this.bookName = bookName;
    }



     public String getBookName() {
        return bookName;
    }

    public void setBookName(String name) {
        this.bookName = name;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String toString() {
        return "It is a book  " + bookName + " Author`s " + author + " Genre " + genre + " Contains " + pages + " pages Released in " + year + " from " + developerName + " with code " + code;
    }

}






