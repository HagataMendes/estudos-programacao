
# Java: Aula 6 SENAI SUZANO

# Formação Java Oracle 

## 🔨 Objetivos do projeto
## Polimorfismo
- Permite que um método tenha comportamentos diferentes dependendo da classe. - Permite criar novas classes baseadas em uma classe existente. - A classe filha herda os atributos e métodos da classe pai. - No código, getDescricao() é sobrescrito em Cliente e Instrutor.
  
```java
```java
class Forma {
    void desenhar() {
        System.out.println("Desenhando forma genérica");
    }
}

class Circulo extends Forma {
    @Override
    void desenhar() {
        System.out.println("Desenhando círculo");
    }
}
```

 **Segundo exemplo:**

```java
class Animal {
    void fazerSom() {
        System.out.println("Som genérico de animal");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Au Au!");
    }
}
```
