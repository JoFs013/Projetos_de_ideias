import java.util.Scanner;
public class jogo {
   public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       

       Personagem p = new Personagem();

       System.out.println("Qual o nome do seu personagem? ");
       p.nome = leitor.next();

       System.out.println("O nome do seu Personagem é: " + p.nome);

       p.cacar();
       p.cacar();

       p.dormir();
    
       int resultado = p.somar(2,3);
       System.out.println(resultado);
       
       

       p.cacar();

       p.comer();
    }
}
