package com.demoqa.tests;

import com.demoqa.pages.RegistrationFormPage;
import org.junit.jupiter.api.Test;

import static com.demoqa.tests.TestData.*;

public class RegistrationFormWithJavaFaker extends TestBase {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test
    void fillFormTest() {
        registrationFormPage.openPage()

                //ввод
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setGender(gender)
                .setNumber(number)
                .setBirthDate(day, month, year)
                .setSubjects(subjects)
                .setHobbies(hobbies)
                .setAttach(attach)
                .setAddress(address)
                .setStateCity(state, city)
                .setSubmit()

                //проверка
                .checkResultsTableVisible()
                .checkResults("Student Name", firstName + " " + lastName)
                .checkResults("Student Email", userEmail)
                .checkResults("Gender", gender)
                .checkResults("Mobile", number)
                .checkResults("Date of Birth", day + " " + month + "," + year)
                .checkResults("Subjects", subjects)
                .checkResults("Hobbies", hobbies)
                .checkResults("Picture", attach)
                .checkResults("Address", address)
                .checkResults("State and City", state + " " + city);
    }
}
