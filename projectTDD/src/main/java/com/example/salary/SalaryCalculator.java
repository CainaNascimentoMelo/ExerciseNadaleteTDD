package com.example.salary;

public class SalaryCalculator {

    public double calculate(Employee employee) {
        double salary = employee.getBaseSalary();

        switch (employee.getRole()) {

            case DESENVOLVEDOR:
                if (salary >= 3000.0) {
                    return salary * 0.8;
                }
                return salary * 0.9;

            case DBA:
            case TESTADOR:
                if (salary >= 2000.0) {
                    return salary * 0.75;
                }
                return salary * 0.85;

            case GERENTE:
                if (salary >= 5000.0) {
                    return salary * 0.7;
                }
                return salary * 0.8;

            default:
                throw new IllegalArgumentException("Invalid role");
        }
    }
}