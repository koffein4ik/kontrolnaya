package Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomIterator<T> implements Iterator<T> {

    private final Iterator<T> iterator;

    public CustomIterator(List<Iterator<T>> iterators) {
        List<T> result = new ArrayList<>();
        for(Iterator<T> iterator: iterators) {
            while (iterator.hasNext()) {
                result.add(iterator.next());
            }
        }
        this.iterator = result.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override
    public T next() {
        return this.iterator.next();
    }
}
