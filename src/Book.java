public class Book {
    public static void main(String[] args) {
        Literature book = new Literature("'Asya'", "Tolstoy", "Roman", 100, 1900, 1223, "'ProzaDevelop' ");

       System.out.println(book.toString());

        Scientific sci = new Scientific("Portal", "A", "B", 120, 2000, 123, "Aboba", "fizika", 555);

       System.out.println(sci.toString());

        Period periodic = new Period("A", "B", "q", 123, 2000, 555, "J", " asdf ", 3000);

        System.out.println(periodic.toString());

        Guide gid = new Guide("Z", "X", "C", 999, 4444, 789, "Aboba", "next", "second", 1);

        System.out.println(gid.toString());
    }
}
