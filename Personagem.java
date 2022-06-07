public class Personagem{
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;
    

    // Metódo tem quatro partes
        //1. Tipo de retorno
        //2. nome
        //3. Lista de parâmetros
        //4. Corpo

        void cacar(){
            if(energia >= 2){
            System.out.println(nome + " caçando...");;
            energia = energia - 2;
            }
            else{
                System.out.println(nome + " Sem energia para caçar");
            }
            fome = Math.min (fome + 1,10);
            sono = Math.min (sono + 1,10);
        }
        void dormir(){
            if(sono >= 1){
                System.out.println(nome + " dormindo...");
                sono = sono - 1;
                energia = energia + 1 <= 10 ? energia + 1 : 10;
            }
            else{
                System.out.println(nome + " sem sono...");
            }
        }
        void comer(){
            if(fome >= 1){
            System.out.println(nome + " comendo...");
            fome = fome - 1;
            energia = Math.min (energia + 1, 10);
            }
            else{
                System.out.println(nome +" sem fome" );
            }
        }
        int somar(int a, int b){
            return a + b;
        }
}