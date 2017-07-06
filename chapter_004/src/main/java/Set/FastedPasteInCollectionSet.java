package Set;

public class FastedPasteInCollectionSet<E> {
   Object values[];

    public FastedPasteInCollectionSet() {
        this.values = new Object[1000];
    }
    public boolean add(E value) {
        if (values[value.hashCode()] == null) {
            values[value.hashCode()] = value;
            return true;
        } else {
            return false;
        }
    }
}
