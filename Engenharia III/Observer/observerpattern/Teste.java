package observerpattern;

public class Teste {

    public static void main(String args) {

             AgenciaNoticias agenciaNoticias= new AgenciaNoticias();
             Radio radio = new Radio();

          
             agenciaNoticias.registrar(radio);

          
             agenciaNoticias.adicionaNoticia("Brasil sofre jogando contra o japão");
             agenciaNoticias.adicionaNoticia("Após o jogo, neymar é vitíma de memes na internet,");
             agenciaNoticias.adicionaNoticia("Será que ele irá se pronunciar??.");
    }
}
