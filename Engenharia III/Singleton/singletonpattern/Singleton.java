package observerpattern

class Singleton {

	// Refer�ncia de vari�vel est�tica de single_instance
	// do tipo Singleton
    private static Singleton single_instance = null;
 
    // Declarando uma vari�vel do tipo String
    public String s;
 
    // Construtor
    // Aqui estaremos criando um construtor privado
    // restrito a esta classe em si
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }
 
    // M�todo est�tico
    // M�todo est�tico para criar inst�ncia da classe Singleton
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

	// M�todo do driver principal
    public static void main(String args[])
    {

    	// Instanciando a classe Singleton com a vari�vel x
        Singleton x = Singleton.getInstance();
 

        // Instanciando a classe Singleton com a vari�vel y
        Singleton y = Singleton.getInstance();
 

        // Instanciando a classe Singleton com a vari�vel z
        Singleton z = Singleton.getInstance();
 
        // Imprimindo o c�digo hash para a vari�vel acima como
        // declarado
        System.out.println("Hashcode de x � "
                           + x.hashCode());
        System.out.println("Hashcode de y � "
                           + y.hashCode());
        System.out.println("Hashcode de z � "
                           + z.hashCode());
 

        // Verifica��o de condi��o
        if (x == y && y == z) {
 
        	// Imprime declara��o
            System.out.println(
                "Tr�s objetos apontam para o mesmo local de mem�ria no heap, ou seja, para o mesmo objeto");
        }
 
        else {
        	// Imprime declara��o
            System.out.println(
                "Tr�s objetos N�O apontam para o mesmo local de mem�ria no heap");
        }
    }
}