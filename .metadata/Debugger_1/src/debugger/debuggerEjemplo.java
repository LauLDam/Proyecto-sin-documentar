package debugger;

public class debuggerEjemplo {

	public static void main(String[] args) {
        long num_0=0, num_1=1, Resultado=0;
        for (int i = 0; i < 1000; i++) {
            if (i == 0){
                System.out.print("\n"+num_0);
            }
            else if (i==1) {
                System.out.print("\n"+num_1);
            }
            else {
                Resultado = num_0 + num_1;
                num_0 = num_1;
                num_1 = Resultado;
            }
            if (i>1) {
                long CalculoInfinito = (4*(200*Resultado/3)/5)-45;
                System.out.print("\n"+CalculoInfinito);
            }
        }
    }
}
