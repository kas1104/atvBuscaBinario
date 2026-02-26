import java.util.Scanner;

public class EstruturaBuscaBinaria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] listaBuscaBinaria = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};



        int inicio = 0;
        int fim =listaBuscaBinaria.length - 1;
        //Sempre realizar este calculo para sempre verificar qual o valor que está no meio da lista
        System.out.println("Digite um numero de 1 a 10 para o programa achar: ");
        int valorProcurar = sc.nextInt();
        boolean valorEncontrado = false;
        System.out.println();

        for(int x = 0; x < listaBuscaBinaria.length; x++){

            int meio = (inicio + fim) / 2;

            if(listaBuscaBinaria[meio] == valorProcurar){
                System.out.println("O valor foi encontrado: " + valorProcurar);
                valorEncontrado = true;
                break;
            }
            else if (listaBuscaBinaria[meio] < valorProcurar) {
                inicio = meio + 1;
            }
            else{
                fim = meio - 1;
            }
        }
        if(valorEncontrado == false){
            System.out.println("Valor não encontrado");
        }
    }
}
