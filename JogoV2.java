import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception{
        Random gerador = new Random();
        //1: caçar
        //2: comer
        //3: dormir
        Personagem p = new Personagem();
        p.nome = "Caçador";
        while (true){
            int oQueFazer = gerador.nextInt(3)+ 1;
            switch(oQueFazer){
                case 1:
                    p.cacar();
                    break;
                case 2:
                    p.comer();
                    break;
                case 3:
                    p.dormir();
                    break;
            }
            System.out.printf("Energia: %d, Fome: %d, Sono: %d", p.energia, p.fome, p.sono);
            System.out.println("==============================================");
            Thread.sleep(2000);
        }
    }
}
