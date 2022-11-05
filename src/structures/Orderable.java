package structures;

public interface Orderable<T> {
    public boolean isSmallerOrEqual(T toCompare);
    public boolean isEqual(T toCompare);
}
