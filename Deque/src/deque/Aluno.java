
package deque;

public class Aluno {
    private String noAme;
    private String matricula;
    
    public Aluno(String n, String m){
        this.nome = n;
        this.matricula = m;
    }
    
    @Override
    public String toString() {
        return "Aluno ->  " + "nome: " + nome + " | matricula: " + matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public boolean equals(Object o) {
        Aluno a=(Aluno)o;
        if (this.matricula.equals(a.matricula)) 
            return true;
        return false;
    }

//    @Override;
//    public int compareTo(Object t) {
//        Aluno a=(Aluno)t;
//        return this.matricula.compareTo(a.matricula);
//    }
}
