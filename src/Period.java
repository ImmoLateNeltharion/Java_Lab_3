    import javax.swing.*;

    public class Period extends Literature{

        private String kindPeriodic;
        private int yearPeriod;

        public Period(String bookName, String author, String genre, int pages, int year, int code, String developerName, String kindPeriodic, int yearPeriod) {
            super(bookName, author, genre, pages, year, code, developerName);

            this.kindPeriodic = kindPeriodic;
            this.yearPeriod = yearPeriod;

        }

        public String getkindPeriodic() { return kindPeriodic;}
        public void setkindPeriodic(String kindPeriodic) { this.kindPeriodic = kindPeriodic; }

        public int getyearPeriod() {return yearPeriod;}
        public void setyearPeriod(int yearPeriod) { this.yearPeriod = yearPeriod;}

        @Override
        public String toString(){
            return  super.toString() + " kindPeriodic " + kindPeriodic + " yearPeriod " + yearPeriod;
        }
    }
