package day06;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C01JavaFakerClass {


    @Test
            public void testFaker(){
        Faker faker = new Faker();
String fullName1 = faker.name().fullName();
String fullName2 = faker.name().fullName();
        System.out.println(fullName1);      // it will print random full name
        System.out.println(fullName2);
        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());
        System.out.println("faker.ancient().hero() = " + faker.ancient().hero());

        System.out.println("faker.internet().domainName() = " + faker.internet().domainName());
        System.out.println("faker.internet().emailAddress() = " + faker.internet().emailAddress());

        System.out.println("faker.internet().password() = " + faker.internet().password(6,6,true));

    }










}
