import java.util.Scanner;
import BuscaBinaria.entity.BuscaBinaria;

public class classeBuscaBinaria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para buscar entre 1 a 10: ");
        int valorProcurar = sc. nextInt();

        BuscaBinaria buscaBinariaObjeto = new BuscaBinaria(valorProcurar);


    }
}
