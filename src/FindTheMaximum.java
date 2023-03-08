import java.util.ArrayList;
import java.util.List;

public class FindTheMaximum<T extends Comparable<T>> {

    public <T extends Comparable<T>> T findMaximum(T... x) {
        T max = x[0];
        List<T> parameterArray = new ArrayList<T>();
        for (T element : x) {
            parameterArray.add(element);
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        System.out.println("Maximum of " + parameterArray.toString() + " is " + max);
        return max;
    }

    public static void main(String[] args) {
        FindTheMaximum genericsFindMax = new FindTheMaximum();
        genericsFindMax.findMaximum(6, 7, 5, 9);
        genericsFindMax.findMaximum(6.5, 7.8, 5.9, 8.6);
        genericsFindMax.findMaximum("apple", "peach", "banana", "orange");
    }
}