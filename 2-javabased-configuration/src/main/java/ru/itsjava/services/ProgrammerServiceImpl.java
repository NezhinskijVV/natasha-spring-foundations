package ru.itsjava.services;

public class ProgrammerServiceImpl implements ProgrammerService{
    private final NotebookService notebookService;

    public ProgrammerServiceImpl(NotebookService notebookService) {
        this.notebookService = notebookService;
    }

    @Override
    public void printEquipment() {
        System.out.println("Оборудование: "
                + notebookService.getNotebook());
    }
}
