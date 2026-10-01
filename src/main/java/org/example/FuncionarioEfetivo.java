package org.example;

public class FuncionarioEfetivo implements Funcionario {

    public float salarioBase;

    public FuncionarioEfetivo() {
    }

    public FuncionarioEfetivo(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getSalario() {
        return salarioBase;
    }

    public String getEstrutura() {
        return "Efetivo";
    }
}