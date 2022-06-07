import java.util.Random;
import javax.swing.JOptionPane;
public class exercicioaula{
    public static void main(String[] args) {
        
        // DEIXAR O USUARIO ESCOLHER O NÍVEL
        // Nível fácil = com dica
        // Nível dificil = sem dica
        int contador = 1;
        int numerooculto;
        int palpitedousuario = 0;
        int escolha;
        char cadastrar;
        Random gerador = new Random();

        numerooculto = gerador.nextInt(10) + 1;

        //Escolha de nível

        String [] opcoes = {"Fácil" , "Difícil" };
        escolha = JOptionPane.showOptionDialog(
        null,
        "Escolha o nível",
        "Nível",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes,
        opcoes[1]);

        if (escolha == JOptionPane.CLOSED_OPTION){
            JOptionPane.showMessageDialog(null, "OPERAÇAO CANCELADA");
        } else if (escolha == 0){
            //cadastrar = opcoes[escolha].charAt(0); //Fácil 
            palpitedousuario = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu palpite"));

            
            if(palpitedousuario > numerooculto){
                JOptionPane.showMessageDialog(null, "O número oculto é MENOR que o número digitado");
            }
            else if(palpitedousuario < numerooculto){
                JOptionPane.showMessageDialog(null, "O número oculto é MAIOR que o número digitado");
            }
    
            while(palpitedousuario != numerooculto){
                palpitedousuario = Integer.parseInt(JOptionPane.showInputDialog("Escolha outro"));
    
                if(palpitedousuario > numerooculto){
                    JOptionPane.showMessageDialog(null, "O número oculto é MENOR que o número digitado");
                }
                else if(palpitedousuario < numerooculto){
                    JOptionPane.showMessageDialog(null, "O número oculto é MAIOR que o número digitado");
                }
    
                contador++;
            }

        } else if(escolha == 1){
             //Díficil

            while(palpitedousuario != numerooculto){
                palpitedousuario = Integer.parseInt(JOptionPane.showInputDialog("Errou !!! Digite outro palpite"));

                contador++;
            }
        }

        JOptionPane.showMessageDialog(null, "Você acertou o número era " + numerooculto +"\n" + "Você tentou acertar " + contador +" Vezes");
    }
}
