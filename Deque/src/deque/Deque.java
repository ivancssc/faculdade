package deque;

/*
 * @author Ivan Cavalvalcante Silva - 144181006
 */
public class Deque {

    private DequeNode first, last, previous;    
    private int size;

    private class DequeNode {

        private Object element;
        private DequeNode next;

        public DequeNode(Object e, DequeNode n) {
            element = e;
            next = n;
        }
    }

    public Deque() {
        size = 0;
        first = new DequeNode(null, null);
        last = new DequeNode(null, null);        
    }

    public boolean isEmpty() {
        return (size == 0 || first == null);
    }
    
    public void makeEmpty() {
        size = 0;
        first = last = null;        
    }
    
    public void pushFront(Object e) { //ADICIONA ITEM NA FRENTE
        if (isEmpty()) {
            first.next = last.next = new DequeNode(e, null);
        } else {
            first.next = new DequeNode(e, first.next);
        }
        size++;
    }

    public void pushBack(Object elem) { //ADICIONA ITEM NO FUNDO
        if (isEmpty()) {
            first.next = last.next = new DequeNode(elem, null);
        } else {
            last.next.next = last.next = new DequeNode(elem, null);
        }
        size++;
    }

    public Object popFront() { //REMOVE ITEM DA FRENTE
        if (isEmpty()) {
            return null;
        }
        first.next = first.next.next;
        return null;
    }   
    
//    public Object popBack() { //REMOVE ITEM DO FIM (NAO CONSEGUI FAZER)
//        
//    }     

    
    public Object front() { //DIZ QUEM É O PRIMEIRO DA FILA
        if (isEmpty()) {
            return null;
        }        
        return first.next.element;     
       
    }
    
    public Object back() { //DIZ QUEM É O ULTIMO DA FILA
        if (isEmpty()) {
            return null;
        }  
        return last.next.element;            
    }
    
    public void printDeque() { //PRINTA A FILA
        DequeNode itr = first.next;

        while (itr != null) {
            System.out.println(itr.element.toString());
            itr = itr.next;
        }
    }
}
