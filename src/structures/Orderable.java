package structures;

public interface Orderable<T> {
    public boolean isSmaller(T toCompare);
    public boolean isBigger(T toCompare);
    public boolean isEqual(T toCompare);
}
