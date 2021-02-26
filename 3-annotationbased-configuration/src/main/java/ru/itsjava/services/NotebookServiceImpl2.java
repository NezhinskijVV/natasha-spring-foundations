package ru.itsjava.services;

import org.springframework.stereotype.Service;
import ru.itsjava.domain.Notebook;

@Service
public class NotebookServiceImpl2 implements  NotebookService{

    @Override
    public Notebook getNotebook() {
        return new Notebook("Acer");
    }
}
