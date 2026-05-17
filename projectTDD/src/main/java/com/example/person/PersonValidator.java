package com.example.person;

import java.util.ArrayList;
import java.util.List;

public class PersonValidator {

    public List<String> isValidToInclude(Person person) {
        List<String> errors = new ArrayList<>();

        if (person.getName() == null ||
                !person.getName().matches("[A-Za-zÀ-ÿ]+(\\s+[A-Za-zÀ-ÿ]+)+")) {
            errors.add("Invalid name");
        }

        if (person.getAge() < 1 || person.getAge() > 200) {
            errors.add("Invalid age");
        }

        if (person.getEmails() == null || person.getEmails().isEmpty()) {
            errors.add("Person must have at least one email");
        } else {
            for (Email email : person.getEmails()) {
                if (!email.getAddress().matches(".+@.+\\..+")) {
                    errors.add("Invalid email");
                    break;
                }
            }
        }

        return errors;
    }
}