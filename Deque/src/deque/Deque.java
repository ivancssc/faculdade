package deque;

/*
 * @author Ivan Cavalvalcante Silva - 144181006
 */
public class Deque {

    private queueNode first, last;

    private class queueNode {

        private Object element;
        private queueNode next;
        private queueNode before;

        private queueNode(Object e, queueNode n, queueNode b) {
            element = e;
            next = n;
            before = b;
        }
    }

    public Deque() {
        first = last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void makeEmpty() {
        first = last = null;
    }
    
    public void enQueue(Object e){ //MESMA COISA DO PUSHFRONT
        queueNode element = new queueNode(e, null, null);
        if(isEmpty()){
            first = last = element;
        }else{
            last.next = last = element;
        }
    }
    
    public void pushFront(Object e) {
        queueNode element = new queueNode(e, null, null);
        if (isEmpty()) {
            first = last = element;
        } else {
            first.before = first = element;
        }
    }
    
    public void pushBack(Object e) {
        queueNode element = new queueNode(e, null, null);
        if (isEmpty()) {
            first = last = element;
        } else {
            last.next = last = element;
        }
    }

    public Object popFront() {
        if (isEmpty()) {
            return null;
        }
        Object value = first.element;
        first = first.next;
        return value;
    }
    
    public Object popBack() {
        if (isEmpty()) {
            return null;
        }
        Object value = last.element;
        last = last.before;
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


