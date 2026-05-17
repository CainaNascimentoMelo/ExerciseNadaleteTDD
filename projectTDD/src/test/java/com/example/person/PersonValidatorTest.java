package com.example.person;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PersonValidatorTest {

    private final PersonValidator validator = new PersonValidator();

    @Test
    void validPerson() {
        Person person = new Person(
                "Joao Silva",
                25,
                List.of(new Email("joao@email.com"))
        );

        List<String> errors = validator.isValidToInclude(person);

        assertTrue(errors.isEmpty());
    }

    @Test
    void invalidNameSinglePart() {
        Person person = new Person(
                "Joao",
                25,
                List.of(new Email("joao@email.com"))
        );

        List<String> errors = validator.isValidToInclude(person);

        assertTrue(errors.contains("Invalid name"));
    }

    @Test
    void invalidNameWithNumbers() {
        Person person = new Person(
                "Joao123 Silva",
                25,
                List.of(new Email("joao@email.com"))
        );

        List<String> errors = validator.isValidToInclude(person);

        assertTrue(errors.contains("Invalid name"));
    }

    @Test
    void invalidAgeLessThanOne() {
        Person person = new Person(
                "Joao Silva",
                0,
                List.of(new Email("joao@email.com"))
        );

        List<String> errors = validator.isValidToInclude(person);

        assertTrue(errors.contains("Invalid age"));
    }

    @Test
    void invalidAgeGreaterThanTwoHundred() {
        Person person = new Person(
                "Joao Silva",
                201,
                List.of(new Email("joao@email.com"))
        );

        List<String> errors = validator.isValidToInclude(person);

        assertTrue(errors.contains("Invalid age"));
    }

    @Test
    void personWithoutEmails() {
        Person person = new Person(
                "Joao Silva",
                25,
                List.of()
        );

        List<String> errors = validator.isValidToInclude(person);

        assertTrue(errors.contains("Person must have at least one email"));
    }

    @Test
    void invalidEmailFormat() {
        Person person = new Person(
                "Joao Silva",
                25,
                List.of(new Email("joaoemail.com"))
        );

        List<String> errors = validator.isValidToInclude(person);

        assertTrue(errors.contains("Invalid email"));
    }
}