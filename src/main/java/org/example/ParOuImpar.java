package org.example;

import java.util.Scanner; // Importamos a classe Scanner do pacote Java.util para capturar os valores que são inseridos no console.

// O objetivo desse exericio é criar uma função Java para validar se um número é Par ou Impar.
// A função deve receber um valor inserido no console e após digitar o valor, determinar se ele é par ou impar.

public class ParOuImpar {

// Em Java, todo código deve estar dentro de uma classe, portanto foi necessário criar a classe ParOuImpar que deve ter o mesmo nome do arquivo.

    public static void main (String[] args ){
        // Este é o ponto de entrada do programa. O método "main" é obrigatório em programas Java para que o código possa ser executado.
        // "public" significa que esse metodo pode ser acessado por outras partes do código.
        // "void" significa que o método não retorna nenhum valor
        // "String[] args" É um Array de Strings pode conter argumentos passados para o programa de linha de comando (embra não seja usado nesse exemplo).

        Scanner ler = new Scanner(System.in);

        // Aqui criamos um objeto tipo Scanner que será usado para capturar a entrada do usuário.
        // "Systen.in" significa que a entrada será lida a partir do console (teclado).
        // "ler" é nome que damos para o objeto "Scanner" para usá-lo no restante do Código.

        System.out.println("Digite um número inteiro: ");

        // "System.out.println" imprimpe a mensagem escrita dentro dele, e pula uma linha no console para o valor ser digitado.

        int numero = ler.nextInt();

        // O método "nextInt()" captura o número interiro que o usuário digitar e armazena dentro da variavel numero.
        // "int numero" declara uma váriavel do tipo int para receber um número inteiro.

        if(numero % 2 == 0){
            // Aqui verificamos se o número é par
            // O operador "%" (módulo) retorna o resto da divisão do npumero por 2
            // Se o resto da divisão for 0 então significa que o número é Par.

            System.out.println("O valor " + numero + " é Par");

            //Aqui usamos o System.out.println novamente para imprimir o resultado da condição if e concatenamos usando + para mostra o resultado.
        }else {

            System.out.println("O número " + numero + " é ímpar");
            //Aqui imprimimos o resultado se ele for impar e concatenamos com o valor
        }
        ler.close();
        // Fechar o "ler" é uma boa prática para liberar resursos da classe "Scanner"

    }
}
