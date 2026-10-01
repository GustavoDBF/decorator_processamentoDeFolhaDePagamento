package org.example;

public class Insalubridade extends FuncionarioDecorator {

    public Insalubridade(Funcionario funcionario) {
        super(funcionario);
    }

    public float getPercentualAdicional() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Insalubridade";
    }
}