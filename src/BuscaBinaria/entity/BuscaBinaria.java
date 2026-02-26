package BuscaBinaria.entity;

public class BuscaBinaria {
    private int[] listaBuscaBinaria = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    public BuscaBinaria(int valorProcurar){


        int posicao = buscarValor(valorProcurar);

        if(posicao != -1) {
            System.out.println("Valor Encontrado " + posicao);
        }
        else{
            System.out.println("Valor não encontrado!");
        }
    }


    private int buscarValor(int valorProcurar){
        int inicio = 0;
        int fim = listaBuscaBinaria.length - 1;


        for(int x = 0; x < listaBuscaBinaria.length; x++){

            int meio = (inicio + fim) / 2;

            if(listaBuscaBinaria[meio] == valorProcurar){
                return valorProcurar;
            }
            else if(listaBuscaBinaria[meio] < valorProcurar){
                inicio = meio + 1;
            }
            else{
                fim = meio - 1;
            }
        }
        return -1;
    }

}
