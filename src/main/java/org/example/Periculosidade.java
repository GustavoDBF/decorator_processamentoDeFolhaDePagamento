package org.example;

public class Periculosidade extends FuncionarioDecorator {

    public Periculosidade(Funcionario funcionario) {
        super(funcionario);
    }

    public float getPercentualAdicional() {
        return 5.0f;
    }

    public String getNomeEstrutura() {
        return "Periculosidade";
    }
}