package az.iktlab.groupjuniorsweb.util.dto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        PersonDto personDto = new PersonDto();
        personDto.setName(name);

        PersonService service = new PersonService();
        service.add(personDto);
    }
}