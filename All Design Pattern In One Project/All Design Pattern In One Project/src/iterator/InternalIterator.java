package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class InternalIterator implements Iterator<String> {
    int position;
    List<String> list;
    Predicate<String> predicate;

    public InternalIterator(List<String> elements, Predicate<String> predicate) {
        position = 0;
        list = new ArrayList<>();
        for (String s : elements) {
            if (predicate.test(s)) {
                list.add(s);
            }
        }
        this.predicate = predicate;
    }


    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public String next() {
        String element = list.get(position);
        position++;
        return element;
    }
}
