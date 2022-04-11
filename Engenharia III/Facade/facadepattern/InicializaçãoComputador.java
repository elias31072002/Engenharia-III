package facadepattern;

public class InicializaçãoComputador {
	public class Cpu {

		   public void start() {
		      System.out.println("Inicializando....");
		   }
		   public void execute() {
		      System.out.println("Executando alguma coisa no processador....");
		   }
		   public void load() {
		      System.out.println("Carregando registrador....");
		   }
		   public void free() {
		      System.out.println("Liberando registradores....");
		   }
		}

		public class Memoria {
		   public void load(int position, String info) {
		      System.out.println("Carregando dados na memória....");
		   }
		   public void free(int position, String info) {
		      System.out.println("Liberando dados na memória....");
		   }
		}

		public class HardDrive {
		   public void read(int startPosition, int size) {
		      System.out.println("Lendo os dados do HD");
		   }
		   public void write(int position, String info) {
		      System.out.println("Escrevendo dados no HD");
		   }
		}

		public class ComputadorFacade {
		   private Cpu cpu = null;
		   private Memoria memoria = null;
		   private HardDrive hardDrive = null;

		   public ComputadorFacade(Cpu cpu,
		               Memoria memoria,
		               HardDrive hardDrive) {
		      this.cpu = cpu;
		      this.memoria = memoria;
		      this.hardDrive = hardDrive;
		   }

		   public void ligarComputador() {
		      cpu.start();
		      String hdBootInfo = hardDrive.read(BOOT_SECTOR, SECTOR_SIZE);
		      memoria.load(BOOT_ADDRESS, hdBootInfo);
		      cpu.execute();
		      memoria.free(BOOT_ADDRESS, hdBootInfo);
		   }
		}
	
	
	
	
	
}
