package deque;

/*
 *@author Ivan Cavalvalcante Silva - 144181006
 */

public class Main {

   
    public static void main(String[] args) {
        Fila myFila = new Fila();
        
        //CRIANDO FILA        
        System.out.println("--------------------FILA---------------------");
        myFila.enQueue(new Aluno("Ivan", "144181006"));
        myFila.enQueue(new Aluno("Marcelo", "10293012"));
        myFila.enQueue(new Aluno("Jayme", "01928012901"));
        myFila.enQueue(new Aluno("Paulo", "819289128"));
        myFila.enQueue(new Aluno("Caio", "10290129102"));
        
        //PRINTANDO A FILA        
        myFila.printQueue();
        
        //REMOVENDO DA FILA
        myFila.deQueue();
                
        //PRINTANDO A FILA
        System.out.println("\n");
        myFila.printQueue();
        
        //ADICIONANDO NA FILA
        myFila.enQueue(new Aluno("Habbib (cadu)", "41234344"));              
        
        //PRINTANDO A FILA
        System.out.println("\n");
        myFila.printQueue();
        
        //LIMPANDO
        myFila.makeEmpty();
        
        //PRINTANDO A FILA
        System.out.println("\n");
        myFila.printQueue();
        
        //ADICIONANDO NA FILA
        myFila.enQueue(new Aluno("Carlos", "1543321"));              
        
        //PRINTANDO A FILA        
        myFila.printQueue();
        
    }
    
}
