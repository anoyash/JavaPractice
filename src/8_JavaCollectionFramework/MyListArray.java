import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyListArray {

    public static void main(String[] args) {

        method1();
        method2();
    }

    public static void method1() {
        System.out.println("Method 1st");

        List<Integer> values = new ArrayList<>();

        for (int i = 1; i <= 4; i++)
            values.add(i);

        Iterator<Integer> valueIterator = values.iterator();
        // this iterator method is returing an object, and that object has three
        // functions : .hasNext() , .next() , .remove()

        while (valueIterator.hasNext()) {
            int val = valueIterator.next();
            System.out.println(val);
            if (val == 3)
                valueIterator.remove();
        }

        System.out.println("Iterating the values using for-each Loop");

        for (int val : values) {
            System.out.println(val);
        }

        System.out.println("Iterating the value using forEach method");

        values.forEach((Integer val) -> {
            System.out.println(val);
        });

    }

    public static void method2() {
        /*
         * Collections : max , min , reverse , sort , swap , copy , rotate ,
         * binanrySearch , get , unmodifiableCollection , suffle
         */

        System.out.println("Method 2nd");

        List<Integer> values = new ArrayList<>();

        for (int i = 1; i <= 4; i++)
            values.add(i);

        System.out.println("Maximum Value in values : " + Collections.max(values));
        System.out.println("Minimum Value in values : " + Collections.min(values));

        System.out.println("Reversing the values");
        Collections.reverse(values);

        values.forEach((Integer val) -> System.out.print(val + " : "));

        System.out.println("\n" + "After Swapping 1st element and 4th element");
        Collections.swap(values, 0, 3);
        values.forEach((Integer val) -> System.out.print(val + " : "));
    }
}