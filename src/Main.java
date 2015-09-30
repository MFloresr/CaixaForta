import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        Caixa CaixaPedro = new Caixa(700);
        do {
            System.out.println("Elija una opcion:");
            System.out.println("1: Ver Saldo actual.");
            System.out.println("2: Sacar Dinero.");
            System.out.println("3: Ingresar dinero.");
            System.out.println("otros: Salir");
            opcion = input.nextInt();
            switch (opcion){
                case 1:if(opcion > 4){
                    System.exit(0);
                }
                case 2:if(opcion == 1){
                    System.out.println("Tiene un saldo de : "+CaixaPedro.getSaldo());
                }
                case 3:if(opcion == 2){
                    System.out.println("Su saldo actual es "+ CaixaPedro.getSaldo()+ " Cuanto Desea Sacar");
                    int cantidad = input.nextInt();
                    CaixaPedro.sacarDinero(cantidad);
                    System.out.println("Su saldo es de : "+ CaixaPedro.getSaldo());
                }
                case 4:if(opcion == 3){
                    System.out.println("Cuanto dinero desea ingresar: ");
                    int cantidad = input.nextInt();
                    CaixaPedro.IngresarDinero(cantidad);
                    System.out.println("Tiene un saldo de : "+CaixaPedro.getSaldo());
                }
            }
        }while(opcion > 0 && opcion < 4 );

    }
}
