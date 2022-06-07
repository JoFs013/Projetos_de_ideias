import javax.swing.JOptionPane;

public class TestePessoa {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite um nome");

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade"));

        Pessoa p = new Pessoa();

        //p.nome = nome;
        p.setNome(nome);

        //p.idade = idade;
        p.setIdade(35);
        p.setIdade(17);

        System.out.printf("Nome: %s\n Idade: %d\n",
        p.getNome(),
        p.getIdade()
        );
    }
}
