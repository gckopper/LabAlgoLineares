package structures;

public final class LinkedList<T extends Orderable<T>> implements PriorityQueue<T> {
    private Node<T> first;
    private Node<T> last;
    private int length = 0;

    private final class Node<P> {
        private Node<P> next;
        private Node<P> previous;
        private P value;
        private Node(Node<P> next, Node<P> previous, P value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }
    }
    
    public LinkedList() {}
    
    public LinkedList(T value) {
        init(value);
    }

    private void init(T value) {
        init(new Node<T>(null, null, value));
    }

    private void init(Node<T> node) {
        this.first = node;
        this.last = node;
        this.length += 1;
    }

    public T getFirst() {
        if (first == null) {
            return null;
        }
        return this.first.value;
    }

    public T getLast() {
        if (last == null) {
            return null;
        }
        return this.last.value;
    }

    public void addToEnd(T value) {
        if (this.last == null || this.first == null) {
            init(value);
            return;
        }
        this.last.next = new Node<T>(null, this.last, value);
        this.length++;
    }

    @Override
    public void add(T element) {
        if (this.last == null || this.first == null) {
            init(element);
            return;
        }
        Node<T> node;
        for (node = this.first; keepGoing(node, element); node = node.next);
        insertAfter(node, element);
    }

    private void insertAfter(Node<T> node, T element) {
        Node<T> newNode = new Node<T>(node.next, node, element);
        if (node.next != null) {
            node.next.previous = newNode;
        }
        node.next = newNode;
    }

    private boolean keepGoing(Node<T> node, T element) {
        return nullCheck(node.next) && node.next.value.isSmallerOrEqual(element);
    }

    private boolean nullCheck(Node<T> node) {
        return node != null;
    }

    @Override
    public T remove() {
        T result = this.first.value;
        if (this.first.next != null) {
            this.first = this.first.next;
            this.first.previous = null;
        }
        return result;
    }
    
}
