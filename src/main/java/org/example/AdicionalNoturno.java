package org.example;

public class AdicionalNoturno extends FuncionarioDecorator {

    public AdicionalNoturno(Funcionario funcionario) {
        super(funcionario);
    }

    public float getPercentualAdicional() {
        return 20.0f;
    }

    public String getNomeEstrutura() {
        return "Noturno";
    }
}