package com.example.salary;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SalaryCalculatorTest {

    private final SalaryCalculator calculator = new SalaryCalculator();

    @Test
    void developerSalaryAboveLimit() {
        Employee employee = new Employee(
                "Joao",
                "joao@email.com",
                3000.0,
                Role.DESENVOLVEDOR
        );

        assertEquals(2400.0, calculator.calculate(employee));
    }

    @Test
    void developerSalaryBelowLimit() {
        Employee employee = new Employee(
                "Maria",
                "maria@email.com",
                2500.0,
                Role.DESENVOLVEDOR
        );

        assertEquals(2250.0, calculator.calculate(employee));
    }

    @Test
    void dbaSalaryAboveLimit() {
        Employee employee = new Employee(
                "Carlos",
                "carlos@email.com",
                2000.0,
                Role.DBA
        );

        assertEquals(1500.0, calculator.calculate(employee));
    }

    @Test
    void testerSalaryBelowLimit() {
        Employee employee = new Employee(
                "Ana",
                "ana@email.com",
                1500.0,
                Role.TESTADOR
        );

        assertEquals(1275.0, calculator.calculate(employee));
    }

    @Test
    void managerSalaryAboveLimit() {
        Employee employee = new Employee(
                "Pedro",
                "pedro@email.com",
                5000.0,
                Role.GERENTE
        );

        assertEquals(3500.0, calculator.calculate(employee));
    }
}