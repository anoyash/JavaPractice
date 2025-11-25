import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyListArray {

    public static void main(String[] args) {
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

    }
}