package ru.itsjava.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.services.NotebookService;
import ru.itsjava.services.NotebookServiceImpl;
import ru.itsjava.services.ProgrammerService;
import ru.itsjava.services.ProgrammerServiceImpl;

@Configuration
public class MyConfiguration {

    @Bean
    public NotebookService noteService() {
        return new NotebookServiceImpl();
    }

    @Bean("myName")
    public ProgrammerService programmerService(NotebookService notebookService){
        return new ProgrammerServiceImpl(notebookService);
    }
}
