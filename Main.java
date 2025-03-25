public class Main {
    public static void main(String[] args){
        Aluno  aluno1 = new Aluno("kauê", "rm554403" , 7.5);
        Aluno aluno2 = new Aluno("Higor", "rm556677", 8.4);
        Aluno aluno3 = new Aluno("Sarah" , "rm765503", 10);

        System.out.println(" Aluno 1");
        aluno1.exibirStatusAluno();
        System.out.println();

        System.out.println(" Aluno 2");
        aluno2.exibirStatusAluno();
        System.out.println();

        System.out.println(" Aluno 3");
        aluno3.exibirStatusAluno();
        System.out.println();
    }
}