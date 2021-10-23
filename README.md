# ContaBancaria
Primeiro projeto em java feito baseado no [curso da Alura](https://cursos.alura.com.br/formacao-java) 

## Para lembrar 

### Como criar array em Java 
```java
  // Array de tipos primitivos (inteiro)
  
  int [] idades = new int[5];
  
  for(int i = 0; i < idades.lenght; i++){
    idades[i] = i * i;
  }
  
  for(i = 0; i < idades.lenght; i++){
    System.out.println(idades[i]);
  }
  \\ Vai imprimir: 0,1,4,,9,16


  //Array de referencias 
  
  ContaCorrente [] contas = new ContaCorrente[5];
  
  ContaCorrente cc1 = new ContaCorrente(22,11);
  ContaCorrente cc2 = new ContaCorrente(22,22);
  
  contas[0] = cc1;
  contas[1] = cc2;
  
  System.out.println(contas[0].getNumero());
  // Vai imprimir: 11
  
  System.out.println(contas[1].getNumero());
  // Vai imprimir: 22
```
### Cast explícito e implícito

Type Cast é a conversão de um tipo para outro. 

#### Conversão de tipos primitivos:

```java
int numero = 3;

//cast implícito pois um inteiro cabe em um double
double valor = numero;
```

```java
double valor = 3.56;

//cast explícito já que um double não cabe em um inteiro 
// Copilador joga o decimal para fora e deixa apenas o valor inteiro
int numero = (int) valor;
```
#### Conversão de referências:

```java
ContaCorrente cc1 = new ContaCorrente(22, 33);
//cast implicito
Conta conta = cc1; 
```

```java
ContaCorrente cc1 = new ContaCorrente(22, 33);
//cast explícito mas desnecessário
Conta conta = (Conta) cc1; 
```

```java
Cliente cliente = new Cliente();
// impossível, não compila pois cliente não estende a classe Conta ou implementa uma interface do tipo Conta
// referência do tipo Conta jamais pode apontar para um objeto do tipo Cliente
Conta conta = (Conta) cliente; 
```

#### Exemplo

```java
package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {

    public static void main(String[] args) {

        Conta[] contas = new Conta[5];
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        contas[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        contas[1] = cc2;    

        // Copilador não sabe se a conta que está na posição 0 é poupança ou corrente
        // Precisa de um cast explícito para copilar
        ContaCorrente ref = (ContaCorrente) contas[0];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
    }
}
```

⚠️  Atenção 

```java
 ContaPoupanca ref = (ContaPoupanca) contas[0];
 System.out.println(cc2.getNumero());
 System.out.println(ref.getNumero());
```

O código acima copila porém ao rodar dá erro já que na posição 0 existe uma conta corrente e não poupança! 

### ArrayList

- Guarda referências;
- É do pacote java.util;
- Usa internamente um array;
- Ao add um elemento sem definir a posição ele é add no fim da lista;
- O limite de armaxzenamento no ArrayList é a memória da JVM.

#### Exemplo

```java
package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {

        ArrayList lista = new ArrayList();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33, 322);
        lista.add(cc4);

        for(int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("----------");
        
        // Outra maneira de fazer o for em java
        for(Object oRef : lista) {
            System.out.println(oRef);
        }

    }
}
```

