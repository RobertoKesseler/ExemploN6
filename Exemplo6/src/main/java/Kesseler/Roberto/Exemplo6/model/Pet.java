package Kesseler.Roberto.Exemplo6.model;

import Kesseler.Roberto.Exemplo6.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pet {

    @Autowired
    @Qualifier("Cat")
    private IAnimal iAnimal;

    public void execute() { iAnimal.comunicar(); }
}
