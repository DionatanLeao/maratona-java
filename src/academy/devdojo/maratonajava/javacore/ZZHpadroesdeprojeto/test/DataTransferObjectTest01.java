package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country brazil = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(brazil);
        Person person = new Person.PersonBuilder()
                .firstName("firstName")
                .lastName("lastName")
                .username("username")
                .email("email")
                .build();
        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(brazil)
                .currency(currency)
                .personName(person.getFirstName())
                .build();
        System.out.println(reportDto);
    }
}
