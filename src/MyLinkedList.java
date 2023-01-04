import java.util.Objects;

public class MyLinkedList<T> implements List11<T> {
    static class Node<T> {
        T element;
        Node<T> next;
        public Node(T element) {
            this.element = element;
        }
    }
    private Node<T> first;
    private Node<T> last;
    private int size;
    private Node<T> getNodebyIndex(int index) {
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    @Override
    public void add(T element) {
        Node<T> newNode = new Node<T>(element);
        if (size == 0) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }
    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return getNodebyIndex(index).element;
    }
    @Override
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T removedElement;
        if (index == 0) {
            removedElement = first.element;
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            Node<T> prev = getNodebyIndex(index - 1);
            removedElement = prev.next.element;
            prev.next = prev.next.next;
            if (index == size - 1) {
                last = prev;
            }
        }
        size--;
        return removedElement;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public void clear() {
        first = last = null;
        size = 0;

    }
}
