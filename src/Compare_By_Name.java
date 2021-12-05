import java.util.Comparator;

class Compare_By_Name implements Comparator<Literature> {
    @Override
    public int compare(Literature o1, Literature o2) {
            return o1.toString().compareTo(o2.toString());
    }
}
