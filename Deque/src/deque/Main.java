package deque;

/*
 *@author Ivan Cavalvalcante Silva - 144181006
 */

public class Main {

   
    public static void main(String[] args) {
        Deque myDeque = new Deque();
        
        //CRIANDO (ADICIONANDO TODOS COMO UMA FILA)       
        System.out.println("--------------------DEQUE---------------------");
        myDeque.enQueue(new Aluno("Ivan", "144181006"));
        myDeque.enQueue(new Aluno("Marcelo", "10293012"));
        myDeque.enQueue(new Aluno("Jayme", "01928012901"));
        myDeque.enQueue(new Aluno("Paulo", "819289128"));
        myDeque.enQueue(new Aluno("Caio", "10290129102"));
        
        //PRINTANDO O DEQUE        
        myDeque.printQueue();
         
        //REMOVENDO DO DEQUE (FRENTE)
        myDeque.popFront();
                
        //PRINTANDO O DEQUE
        System.out.println("\n");
        myDeque.printQueue();
        
        //REMOVENDO DO DEQUE (FRENTE)
        myDeque.popFront();
                
        //PRINTANDO O DEQUE
        System.out.println("\n");
        myDeque.printQueue();
        
        
        //REMOVENDO DO DEQUE (FUNDO)
        //myDeque.popBack();
                
        //PRINTANDO A FILA
        //System.out.println("\n");
        //myDeque.printQueue();
        
        // ADICIONANDO NO DEQUE (FUNDO)
        myDeque.pushBack(new Aluno("Ivan", "144181006"));
        
        //PRINTANDO O DEQUE
        System.out.println("\n");
        myDeque.printQueue();
        
        // ADICIONANDO NO DEQUE (FRENTE)- NÃO ESTA FUNCIONANDO CERTO
        myDeque.pushFront(new Aluno("Joelma", "123123123"));
        
        //PRINTANDO O DEQUE
        System.out.println("\n");
        myDeque.printQueue();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
    }
    
}
