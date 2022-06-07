import javax.swing.JOptionPane;
public class metabolismo{
    public static void main(String[] args) {
        
        int idademasc;
        int escolhaatividade;
        int idadefem;
        int escolhasexo;
        double alturamasc;
        double alturafem;
        double pesomasc;
        double pesofem;

        JOptionPane.showMessageDialog(null,"Este é um programa que calcula o quanto de caloria voce gasta por dia. ");

        String [] opcoes = {"Masculino", "Feminino"};
        escolhasexo = JOptionPane.showOptionDialog(
        null,
        "Escolha o seu SEXO",
        "SEXO",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes,
        opcoes[1]);

        if (escolhasexo == JOptionPane.CLOSED_OPTION){
            JOptionPane.showMessageDialog(null,"OPERAÇÃO CANCELADA");

        } else{
            if(escolhasexo == 0){ //MASCULINO
                idademasc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade !!!"));
                pesomasc = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu peso em KG"));
                alturamasc = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura em CM"));

                String [] opcoes2 = {"Sedentário", "Levemente Ativo", "Moderadamente Ativo", "Altamente ativo", "Extremamente ativo"};
                escolhaatividade = JOptionPane.showOptionDialog(
                null,
                "Escolha o nível de atividade física",
                "Atividade Física",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes2,
                opcoes2[1],
                opcoes2[2],
                opcoes2[3],
                opcoes2[4]);
           }
        }
    }
}