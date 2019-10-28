package deque;

/*
 * Ivan Cavalvalcante Silva - 144181006
 * Marcelo Matos Carvalho - 042181009
 */
public class Deque {

    private DequeNode first, last;    
    private int size;

    private class DequeNode {

        private Object element;
        private DequeNode next;
        private DequeNode prev;

        public DequeNode(Object e, DequeNode n, DequeNode p) {
            element = e;
            next = n;
            prev = p;
        }
    }

    public Deque() {
        size = 0;
        first = new DequeNode(null, null,null);
        last = new DequeNode(null, null,null);        
    }

    public boolean isEmpty() {
        return (size == 0 || first == null);
    }
    
    public void makeEmpty() {
        size = 0;
        first = last = null;
    }
    
    public void pushFront(Object e) { //ADICIONA ITEM NA FRENTE
        DequeNode newElement = new DequeNode(e, null, null);
        if (isEmpty()) {
            last = newElement;
        } else {
            first.prev = newElement;
            newElement.next = first;
        }
        first = newElement;
        last.next = first;
        first.prev = last;
        size++;
    }

    public void pushBack(Object e) { //ADICIONA ITEM NO FUNDO
        DequeNode newElement = new DequeNode(e, null, null);
        if (isEmpty()) {
            first = newElement;
        } else {
            last.next = newElement;
            newElement.prev = last;
        }
        last = newElement;
        last.next = first;
        first.prev = last;
        size++;
    }

    public Object popFront() { //REMOVE ITEM DA FRENTE
        if (isEmpty()) {
            return null;
        }else if(first == last){
                    first = last = null;
                    first.prev = first.next = last.next = last.prev = null;
                } else // remove de uma lista com mais de um elemento
                {
                    first = first.next;
                    last.next = first;
                    first.prev = last;
                }
        size --;
        return null;
    }   
    
    public Object popBack() { //REMOVE ITEM DO FIM ;
       if (isEmpty()) {
            return null;
        } else 
            if(first == last){
                first = last = null;
                first.prev = first.next = last.next = last.prev = null;
            } 
            else{
                last = last.prev;
                last.next = first;
                first.prev = last;
            }
       size --;
       return null;
    }     

    
    public Object front() { //DIZ QUEM É O PRIMEIRO DA FILA
        if (isEmpty()) {
            return null;
        }        
        return first.element;     
       
    }
    
    public Object back() { //DIZ QUEM É O ULTIMO DA FILA
        if (isEmpty()) {
            return null;
        }  
        return last.element;            
    }
    
    public void printDeque() { //PRINTA A FILA
         if (this.isEmpty()) {
            System.out.println("A fila está vazia!");
            return;
        }
        DequeNode itr = first;           
        for (int i = 0; i < size; i++) {
           System.out.println(itr.element.toString());
            itr = itr.next;
        }
    }
}
