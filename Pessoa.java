public class Pessoa {
    private String nome;
    private int idade;

    //Métodos de acesso e modificadores
    //Atribuir um valor a variável NOME
    public void setNome(String nome){
        //This está se referindo da variável da linha 2
        this.nome = nome;
    }
    // Setter para a variável idade
    public void setIdade(int idade){
        if (idade >= 18){
            this.idade= idade;
        }else{    
            this.idade = 18;
    }
}

    //getter para a variável nome
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
}
