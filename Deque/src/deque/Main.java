package deque;

/*
 *@author Ivan Cavalvalcante Silva - 144181006
 */

public class Main {

   
    public static void main(String[] args) {
        
        Deque myDeque = new Deque(); 
        
        myDeque.pushFront(new Aluno("Ivan","001")); //Colocado na frente da fila
        myDeque.pushFront(new Aluno("Marcelo","002")); //Colocado na frente de Ivan
        myDeque.pushFront(new Aluno("Paulo","003")); //Colocado na frente de Marcelo
        myDeque.pushBack(new Aluno("Jayme", "004"));//Colocado no fim da fila
        myDeque.pushBack(new Aluno("Caio", "005"));// Colocado no fim da fila (depois de Jayme)       
        
        myDeque.printDeque(); //printando a fila
        
        System.out.println("\n");
        
        myDeque.popFront();//removendo da frente da fila
        myDeque.printDeque(); //printando a fila
        
        System.out.println("\n");
        
        myDeque.popFront();//removendo da frente da fila
        myDeque.printDeque(); //printando a fila
        
        System.out.println("\n");
        
        System.out.println("Front: " + myDeque.front());
        System.out.println("Back : " + myDeque.back());
    }    
}
