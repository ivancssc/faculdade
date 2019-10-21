package deque;

/*
 * @author Ivan Cavalvalcante Silva - 144181006
 */
public class Fila {

    private queueNode first, last;

    private class queueNode {

        private Object element;
        private queueNode next;

        private queueNode(Object e, queueNode n) {
            element = e;
            next = n;
        }
    }

    public Fila() {
        first = last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void makeEmpty() {
        first = last = null;
    }

    public void enQueue(Object e) {
        queueNode element = new queueNode(e, null);
        if (isEmpty()) {
            first = last = element;
        } else {
            last.next = last = element;
        }
    }

    public Object deQueue() {
        if (isEmpty()) {
            return null;
        }
        Object value = first.element;
        first = first.next;
        return value;
    }

    public void printQueue() {
        queueNode itr = first;

        while (itr != null) {
            System.out.println(itr.element.toString());
            itr = itr.next;
        }
    }
}


