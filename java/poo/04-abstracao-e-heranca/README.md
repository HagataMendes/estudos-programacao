# Java: Aula 6 SENAI SUZANO

# Formação Java Oracle 

## 🔨 Objetivos do projeto

 Herança
## 4. Herança
Permite que uma classe herde atributos e métodos de outra.
No código, Cliente e Instrutor herdam de Pessoa.


```java
class Animal {
    void fazerSom() {
        System.out.println("Som de animal");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Latido");
    }
}
```

## 5. Abstração
- Oculta detalhes internos e expõe apenas o essencial.
- Oculta detalhes desnecessários e expõe apenas funcionalidades essenciais.
- No código, `Pessoa` é uma classe abstrata, forçando `Cliente` e `Instrutor` a implementarem `getDescricao()`.

```java
abstract class Veiculo {
    abstract void mover();
}

class Carro extends Veiculo {
    @Override
    void mover() {
        System.out.println("Carro se movendo");
        System.out.println("O carro está se movendo!");
    }
}
```
  
