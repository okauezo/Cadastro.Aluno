    public class Aluno {
    private  String nome;
    private String matricula;
    private double nota;


    public Aluno(String nome, String matricula, double nota ){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;

    }


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public double getNota(){
        return nota;
    }
    public void setNota(double nota){
        this.nota = nota;
    }


    public String verificarAprovacaoAluno(){
        if(nota >= 6.5){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }


        public void exibirStatusAluno(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula do Aluno: " + matricula);
        System.out.println("Nota Sobre as Entrega: " + nota);
        System.out.println("Status do Aluno: " + verificarAprovacaoAluno());
    }
}

