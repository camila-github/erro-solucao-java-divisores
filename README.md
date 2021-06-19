## Exercicio (Java): Divisores

O exercicio publicado é referente ao treinamento do Bootcamp Java - Aritméticos em Java 
(https://digitalinnovation.one)


#### Descrição do Desafio:

Pense um número positivo n. Agora me diga um divisor A de n. Agora me dê um outro número B que não seja divisor de n. Agora um múltiplo C. E um não múltiplo D. O número que você pensou é...

Parece um truque de mágica, mas é matemática! Será que, conhecendo os números A, B, C e D, você consegue descobrir qual era o número original n? Note que pode existir mais de uma solução!

Neste problema, dados os valores de A, B, C e D, você deve escrever um programa que determine qual o menor número n que pode ter sido pensado ou concluir que não existe um valor possível.

#### Entrada: 

A entrada consiste de uma única linha que contém quatro números inteiros A, B, C, e D, como descrito acima (1 ≤ A, B, C, D ≤ 109).


#### Saída: 

Seu programa deve produzir uma única linha. Caso exista pelo menos um número n para os quais A, B, C e D façam sentido, a linha deve conter o menor n possível. Caso contrário, a linha deve conter -1.

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
2 12 8 2 | 4

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
3 4 60 105 | 6  
 


#### Java　

```java
//SOLUCAO 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisores {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[4];
        for (int i = 0; i < 4; i++){
          num[i] = Integer.parseInt(st.nextToken());
        }
        br.close();   
   
        int numMenor = -1;
        if (num[2] % num[0] == 0) {
            for(int i = 1; i <= num[2]/num[0]; i++){                
                int numAux = num[0] * i;
                if (numAux % num[1] != 0 && num[3] % numAux != 0 && num[2] % numAux ==0) {
                    numMenor = numAux;
                    break;
                }
            }
        }
        System.out.println(numMenor);        
    }    
}
```

