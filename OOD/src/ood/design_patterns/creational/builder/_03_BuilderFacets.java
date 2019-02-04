package ood.design_patterns.creational.builder;

class Person2 {
    // address
    public String streetAddress;
    public String postcode;
    public String city;

    // employment
    public String companyName;
    public String position;
    public int annualIncome;

    @Override
    public String toString() {
        return "Person2{" + "streetAddress='" + streetAddress + '\'' + ", postcode='" + postcode + '\'' + ", city='" + city + '\'' + ", companyName='" + companyName + '\'' + ", position='" + position + '\'' + ", annualIncome=" + annualIncome + '}';
    }
}

// builder facade
class PersonBuilder2 {
    // the object we're going to build
    protected Person2 Person2 = new Person2(); // reference!

    public PersonJobBuilder works() {
        return new PersonJobBuilder(Person2);
    }

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(Person2);
    }

    public Person2 build() {
        return Person2;
    }
}

class PersonAddressBuilder extends PersonBuilder2 {
    public PersonAddressBuilder(Person2 Person2) {
        this.Person2 = Person2;
    }

    public PersonAddressBuilder at(String streetAddress) {
        Person2.streetAddress = streetAddress;
        return this;
    }

    public PersonAddressBuilder withPostcode(String postcode) {
        Person2.postcode = postcode;
        return this;
    }

    public PersonAddressBuilder in(String city) {
        Person2.city = city;
        return this;
    }
}

class PersonJobBuilder extends PersonBuilder2 {
    public PersonJobBuilder(Person2 Person2) {
        this.Person2 = Person2;
    }

    public PersonJobBuilder at(String companyName) {
        Person2.companyName = companyName;
        return this;
    }

    public PersonJobBuilder asA(String position) {
        Person2.position = position;
        return this;
    }

    public PersonJobBuilder earning(int annualIncome) {
        Person2.annualIncome = annualIncome;
        return this;
    }
}

public class _03_BuilderFacets {
    public static void main(String[] args) {
        PersonBuilder2 pb = new PersonBuilder2();
        Person2 Person2 = pb.lives().at("123 London Road").in("London").withPostcode("SW12BC").works().at("Fabrikam").asA("Engineer").earning(123000).build();
        System.out.println(Person2);
    }
}