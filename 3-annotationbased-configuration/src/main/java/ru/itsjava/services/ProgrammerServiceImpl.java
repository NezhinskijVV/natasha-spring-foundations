package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProgrammerServiceImpl implements ProgrammerService {
    private final NotebookService notebookService;

    public ProgrammerServiceImpl(@Qualifier("notebookServiceImpl2") NotebookService notebookService) {
        this.notebookService = notebookService;
    }

    @Override
    public void printEquipment() {
        System.out.println("Оборудование: "
                + notebookService.getNotebook());
    }
}
