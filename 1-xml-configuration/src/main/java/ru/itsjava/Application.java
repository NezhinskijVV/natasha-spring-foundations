package ru.itsjava;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itsjava.services.ProgrammerService;

public class Application {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("context.xml");

        context.getBean(ProgrammerService.class).printEquipment();

    }
}