package com.demoqa.tests;

import com.github.javafaker.Faker;
public class TestData {
    static Faker faker = new Faker();
    static String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            gender = faker.demographic().sex(),
            number = faker.phoneNumber().subscriberNumber(10),
            day = String.valueOf(faker.number().numberBetween(10, 28)),
            year = String.valueOf(faker.number().numberBetween(1920, 2000)),
            address = faker.address().streetAddress(),
            month = "April",
            subjects = "History",
            hobbies = "Music",
            attach = "1.PNG",
            state = "NCR",
            city = "Gurgaon";
}