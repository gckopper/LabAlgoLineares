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
        this.length++;
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
        this.last = this.last.next;
        this.length++;
    }

    public void addToBeginning(T value) {
        if (this.last == null || this.first == null) {
            init(value);
            return;
        }
        this.first.previous = new Node<T>(null, this.last, value);
        this.first = this.first.previous;
        this.length++;
    }

    public boolean isEmpty() {
        return this.last == null || this.first == null;
    }

    public void reset() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    @Override
    public void add(T element) {
        if (this.last == null || this.first == null) {
            init(element);
            return;
        }
        if (last.value.isBigger(element) || last.value.isEqual(element)) {
            addToEnd(element);
            return;
        }
        Node<T> node;
        for (node = this.first; keepGoing(node, element); node = node.next);
        insertBefore(node, element);
    }

    private void insertBefore(Node<T> node, T element) {
        Node<T> newNode = new Node<T>(node, node.previous, element);
        if (node.previous == null) {
            this.first = newNode;
        } else {
            node.previous.next = newNode;
        }
        node.previous = newNode;
        this.length++;
    }

    private boolean keepGoing(Node<T> node, T element) {
        return nullCheck(node) && node.value.isBigger(element);
    }

    private boolean nullCheck(Node<T> node) {
        return node.next != null;
    }

    @Override
    public T remove() {
        if (first == null || last == null) {
            return null;
        }
        T result = this.first.value;
        if (this.first.next != null) {
            this.first = this.first.next;
            this.first.previous = null;
        } else {
            this.first = null;
            this.last = null;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Começo: ");
        for (Node<T> node = this.first; node != null; node = node.next)    {
            if (node.value != null) {
                result.append(node.value.toString());
                result.append('\n');
            }
        }
        result.append("Fim!");
        return result.toString();
    }
}
