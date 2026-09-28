# Java-Poo-Encapsulamento
- Protege os atributos, permitindo acesso apenas por métodos específicos (`get` e `set`). - Protege os dados de uma classe contra acesso indevido. - No código, os atributos `plano` e `especialidade` são privados e acessados por métodos. - Os atributos são privados e acessados por métodos `get` e `set`.

```java
class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
```
