package RestauranteIsrael;

/**
 * la Clase retsuranteisrael gestiona los comensales del restaurante Israel y el stock de su almacen
 * 
 * @author Laura Villar Caballero
 * 
 * @version 1.0
 */


public class RestauranteIsrael {
	
	/**
	 * Representa la cantidad de patatas 
	 */
	
	public int patatas; //representa la cantidad de patatas(cuando la clase es privada no hay que documentar solo comentar)
	
	

	private int calamares; //Representa la cantidad de calamares  //es privado al haber hecho getters y setters y no es /**
	

	private static RestauranteIsrael miRestaurante; //ES PRIVADO NO SE COMENTA!!!
	
	
	/**
	 * Constructor de la clase Restaurante Israel con dos parámetros de entrada
	 * 
	 * @param a representa la cantidad de patatas iniciales
	 * @param b representa la cantidad de calamares iniciales
	 */

   public RestauranteIsrael(int a, int b) {
       this.setPatatas(a);
       this.setCalamares(b);
   }
   
//puede ponerse solo int cantP() Y ESO ES PRIVADO ASI QUE SOLO COMENTARIO!!
   //método por el que se calcula el num de comensales en funcion del stock de patatas
   private int cantP() {
       int a = this.getPatatas() * 3;
       return a;
   }
   
 //método por el que se calcula el num de comensales en funcion del stock de calamares
   private int cantC() {
       int ch = this.getCalamares() * 6;
       return ch;
   }

   /**
    * Método por el que se añade una Q de calamares al stock del restaurante
    * @param c representa la Q de calamares que se quiere añadir al stock
    */
   
   public void addCalamares(int c) {
       this.setCalamares(this.getCalamares() + c);
   }

   
   /**
    * Método por el que se añade una Q de patatas al stock del restaurante
    * @param d representa la Q de patatas que se quiere añadir al stock
    */
   
   public void addPatatas(int d) {
       this.setPatatas(this.getPatatas() + d);
   }

   
   //este es para que se ejecute pero no para que se use desde el exterior. Con el hidden no lo genera en la documentación.
   /**
    * 
    * @hidden 
    */
   
   public static void main(String[] args) {
       RestauranteIsrael r1 = new RestauranteIsrael(50, 60);
       System.out.println("Cantidad de calamares: " + r1.getCalamares());
       System.out.println("Cantidad de patatas: " + r1.getPatatas());
       calculaComensales(r1);
       r1.addCalamares(1);
       r1.addPatatas(80);
       System.out.println("\nPedido Recibido!! Stock actual: ");
       System.out.println(r1.getPatatas() + " patatas.\n" + r1.getCalamares() + " calamares");
       calculaComensales(r1);
   }

   
   
   
   //es private así que sólo comentario
   
   /*Método por el que sólo se calcula la Q de clientes a los que se ñpuede dar de comer 
   en el rest Israel en funcion del stock de productos*/
   
   private static void calculaComensales(RestauranteIsrael r1) {
       if (r1.cantP() <= r1.cantC()) {
           System.out.println(
                   "\nIsrael puede dar de comer a " + r1.cantP() + " personas con raciones de patatas máximo");
       } else {
           System.out.println(
                   "\nIsrael puede dar de comer a " + r1.cantC() + " personas con raciones de calamares máximo");
       }
   }

   //esto hidden porque los int los puso publicos y entonces no tiene sentido, pero en vez de borrarlos mejor ocultarlo proqu algun metodo lo llama
   /*
    * @hidden
    */
   
   public int getPatatas() {
       return patatas;
   }
   /*
    * @hidden
    */
   public void setPatatas(int patatas) {
       this.patatas = patatas;
   }
   /*
    * @hidden
    */
   public int getCalamares() {
       return calamares;
   }
   /*
    * @hidden
    */
   public void setCalamares(int calamares) {
       this.calamares = calamares;
   } 
}

