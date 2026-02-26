package BuscaBinaria.entity;

public class BuscaBinaria {
    //Lista com os elementos
    private int[] listaBuscaBinaria = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    //Construtor que recebe o valor que o usuario deseja encontrar dentro da lista
    public BuscaBinaria(int valorProcurar){

        //Variavel que recebe o valor dentro do metodo buscarValor
        int posicao = buscarValor(valorProcurar);

        //Estrutura Condicional que verifica se o valor retornado pelo metodo é o que o usuario estava procurando ou não
        if(posicao != -1) {
            System.out.println("Valor Encontrado " + posicao);
        }
        else{
            System.out.println("Valor não encontrado!");
        }
    }

    //Função que realiza a logica de busca do valor do usuario
    private int buscarValor(int valorProcurar){

        int inicio = 0;
        int fim = listaBuscaBinaria.length - 1;

        //Estrutura de repetição
        for(int x = 0; x < listaBuscaBinaria.length; x++){

            /*O calculo é feito separando a lista em começo, meio e fim para realizar a busca de forma mais rapida e otimizada
            * o começo ele sempre começa com o valor de 0 e o fim é sempre o total de todos os elementos dentro da lista -1
            * isso se deve ao fato que em java a maquina ele sempre começa a contar do numero 0 em diante, ou seja se nos
            * temos uma lista com numeros de 1 a 10, temos 10 posições porem a contagem das posições é de 0 a 9, pois
            * a contagem sempre começa com 0.
            * Após a separação entre começo e fim, é necessario saber onde fica o meio da lista que o calculo é a soma do
            * começo e do fim dividido por 2, assim descobrimos qual o meio */
            int meio = (inicio + fim) / 2;

            //Estrutura condicional que verifica se o valor da posição do meio é igual ao valor que o usuario deseja encontrar
            if(listaBuscaBinaria[meio] == valorProcurar){
                return valorProcurar;
            }
            /*Caso o valor que o usuário esteja buscando é maior que o valor da posição do meio da lista
            * ele adicionará mais 1 ao valor do meio e atribuirá para a variável início para eliminar os valores as posições menores dentro da lista
             * para reduzir para as posições focar nas maiores*/
            else if(listaBuscaBinaria[meio] < valorProcurar){
                inicio = meio + 1;
            }
            /*Caso o valor que o usuário esteja buscando é menor que o valor da posição do meio da lista
            * ele diminuirá em 1 o valor do meio e atribuirá para a variável fim para eliminar os valores as posições maiores dentro da lista
            * para reduzir para as posições focar nas menores*/
            else{
                fim = meio - 1;
            }
        }
        //E caso ele não esteja dentro da lista ele retornará -1 para verificação do sistema
        return -1;
    }

}
