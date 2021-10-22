# ContaBancaria
Primeiro projeto em java feito baseado no [curso da Alura](https://cursos.alura.com.br/formacao-java) 

## Para lembrar 

Como criar array em Java 
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
