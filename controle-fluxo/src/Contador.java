import java.util.Scanner;
public class Contador {

    public static void main(String[] args){
        int numero_1, numero_2;
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite o primeiro parametro: ");
        numero_1 = scanner.nextInt();

        System.out.println("Digite o segundo parametro: ");
        numero_2 = scanner.nextInt();
        
        try{
            contar(numero_1, numero_2);

        }
        catch(ParametrosInvalidosException e){
            System.out.println("Segundo parametro maior do que o primeiro");
        }

        
    }

    static void contar(int numero_1, int numero_2) throws ParametrosInvalidosException {
        if(numero_1 > numero_2){
            throw new ParametrosInvalidosException();
        }

        for(int indice = 1; indice <= numero_2 - numero_1; indice++){
            System.out.println(indice);
        }               

    }



}
