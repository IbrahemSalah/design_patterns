package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class CustomIterable {
    List<String> elements;

    public CustomIterable() {
        elements = new ArrayList<>();
    }

    public Iterator getExternalIterator() {
        return elements.iterator();
    }

    public Iterator getInternalIterator() {
        InternalIterator internalIterator = new InternalIterator(elements, predicate);

        return internalIterator;
    }

    public void addElement(String element) {
        elements.add(element);
    }

    Predicate<String> predicate = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length() > 2;
        }
    };
}
