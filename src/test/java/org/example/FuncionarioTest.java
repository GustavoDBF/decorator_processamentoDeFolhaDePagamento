package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarSalarioFuncionario() {
        Funcionario funcionario = new FuncionarioEfetivo(1000.0f);

        assertEquals(1000.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarSalarioFuncionarioComInsalubridade() {
        Funcionario funcionario = new Insalubridade(new FuncionarioEfetivo(1000.0f));

        assertEquals(1100.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarSalarioFuncionarioComAdicionalNoturno() {
        Funcionario funcionario = new AdicionalNoturno(new FuncionarioEfetivo(1000.0f));

        assertEquals(1200.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarSalarioFuncionarioComPericulosidade() {
        Funcionario funcionario = new Periculosidade(new FuncionarioEfetivo(1000.0f));

        assertEquals(1050.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarSalarioFuncionarioComInsalubridadeMaisAdicionalNoturno() {
        Funcionario funcionario = new Insalubridade(new AdicionalNoturno(new FuncionarioEfetivo(1000.0f)));

        assertEquals(1320.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarSalarioFuncionarioComInsalubridadeMaisPericulosidade() {
        Funcionario funcionario = new Insalubridade(new Periculosidade(new FuncionarioEfetivo(1000.0f)));

        assertEquals(1155.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarSalarioFuncionarioComAdicionalNoturnoMaisPericulosidade() {
        Funcionario funcionario = new AdicionalNoturno(new Periculosidade(new FuncionarioEfetivo(1000.0f)));

        assertEquals(1260.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarSalarioFuncionarioComInsalubridadeMaisAdicionalNoturnoMaisPericulosidade() {
        Funcionario funcionario = new Insalubridade(new AdicionalNoturno(new Periculosidade(new FuncionarioEfetivo(1000.0f))));

        assertEquals(1386.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarEstruturaFuncionario() {
        Funcionario funcionario = new FuncionarioEfetivo();

        assertEquals("Efetivo", funcionario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaFuncionarioComInsalubridade() {
        Funcionario funcionario = new Insalubridade(new FuncionarioEfetivo());

        assertEquals("Efetivo/Insalubridade", funcionario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaFuncionarioComAdicionalNoturno() {
        Funcionario funcionario = new AdicionalNoturno(new FuncionarioEfetivo());

        assertEquals("Efetivo/Noturno", funcionario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaFuncionarioComPericulosidade() {
        Funcionario funcionario = new Periculosidade(new FuncionarioEfetivo());

        assertEquals("Efetivo/Periculosidade", funcionario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaFuncionarioComInsalubridadeMaisAdicionalNoturno() {
        Funcionario funcionario = new Insalubridade(new AdicionalNoturno(new FuncionarioEfetivo()));

        assertEquals("Efetivo/Noturno/Insalubridade", funcionario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaFuncionarioComInsalubridadeMaisPericulosidade() {
        Funcionario funcionario = new Insalubridade(new Periculosidade(new FuncionarioEfetivo()));

        assertEquals("Efetivo/Periculosidade/Insalubridade", funcionario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaFuncionarioComAdicionalNoturnoMaisPericulosidade() {
        Funcionario funcionario = new AdicionalNoturno(new Periculosidade(new FuncionarioEfetivo()));

        assertEquals("Efetivo/Periculosidade/Noturno", funcionario.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaFuncionarioComInsalubridadeMaisAdicionalNoturnoMaisPericulosidade() {
        Funcionario funcionario = new Insalubridade(new AdicionalNoturno(new Periculosidade(new FuncionarioEfetivo())));

        assertEquals("Efetivo/Periculosidade/Noturno/Insalubridade", funcionario.getEstrutura());
    }
}