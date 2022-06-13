package observerpattern

class Singleton {

	// Referência de variável estática de single_instance
	// do tipo Singleton
    private static Singleton single_instance = null;
 
    // Declarando uma variável do tipo String
    public String s;
 
    // Construtor
    // Aqui estaremos criando um construtor privado
    // restrito a esta classe em si
    private Singleton()
    {
        s = "Olá eu sou um texto que faz parte para a classe singleton";
    }
 
    // Método estático
    // Método estático para criar instância da classe Singleton
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
 
        return single_instance;
    }
}
 
// Classe 2
//Classe principal
class GFG {

	// Método do driver principal
    public static void main(String args[])
    {

    	// Instanciando a classe Singleton com a variável x
        Singleton x = Singleton.getInstance();
 

        // Instanciando a classe Singleton com a variável y
        Singleton y = Singleton.getInstance();
 

        // Instanciando a classe Singleton com a variável z
        Singleton z = Singleton.getInstance();
 
        // Imprimindo o código hash para a variável acima como
        // declarado
        System.out.println("Hashcode de x é "
                           + x.hashCode());
        System.out.println("Hashcode de y é "
                           + y.hashCode());
        System.out.println("Hashcode de z é "
                           + z.hashCode());
 

        // Verificação de condição
        if (x == y && y == z) {
 
        	// Imprime declaração
            System.out.println(
                "Três objetos apontam para o mesmo local de memória no heap, ou seja, para o mesmo objeto");
        }
 
        else {
        	// Imprime declaração
            System.out.println(
                "Três objetos NÃO apontam para o mesmo local de memória no heap");
        }
    }
}
