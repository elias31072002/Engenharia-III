package observerpattern;

public class Teste {

    public static void main(String args) {

             AgenciaNoticias agenciaNoticias= new AgenciaNoticias();
             Radio radio = new Radio();

          
             agenciaNoticias.registrar(radio);

          
             agenciaNoticias.adicionaNoticia("Brasil sofre jogando contra o jap�o");
             agenciaNoticias.adicionaNoticia("Ap�s o jogo, neymar � vit�ma de memes na internet,");
             agenciaNoticias.adicionaNoticia("Ser� que ele ir� se pronunciar??.");
    }
}
