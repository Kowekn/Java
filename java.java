class HelloWorld {
    /*public static void main(String[] args) {
        System.out.println(OPA(2,5)); 
    }
    public static int OPA(int numero1,int numero2){
        return numero1 + numero2;
    }
    */
    static Classe1 novo2 = new Classe1("issis", 19);
    public static void main(String[] args) {
    Classe1 novo = new Classe1("carlos", 9);
    System.out.println(novo.nome);
    System.out.println(novo2.nome);
    }
    
    
}

class Classe1 {
    protected String nome;
    protected int idade;

    public Classe1(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(Classe1 classe){
        return classe.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(Classe1 classe){
        return classe.idade;
    }
}

