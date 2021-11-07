import java.util.Comparator;

class Compare_By_Year implements Comparator<Literature> {
    @Override
    public int compare(Literature o1, Literature o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}
