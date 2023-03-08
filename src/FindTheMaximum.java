public class FindTheMaximum<T extends Comparable<T>> {

    public <T extends Comparable<T>> T findMaximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }

    public static void main(String[] args) {
        FindTheMaximum genericsFindMax = new FindTheMaximum();
        genericsFindMax.findMaximum(6, 7, 5);
        genericsFindMax.findMaximum(6.5, 7.8, 5.9);
    }
}