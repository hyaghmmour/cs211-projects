public class OrderedPair <K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("The key class is %s and the value class is %s", this.key.getClass().getName(), this.value.getClass().getName());
    }
}
