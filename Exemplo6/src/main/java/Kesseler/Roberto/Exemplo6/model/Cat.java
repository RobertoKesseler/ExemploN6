package Kesseler.Roberto.Exemplo6.model;

import Kesseler.Roberto.Exemplo6.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Cat")
public class Cat implements IAnimal {

    @Override
    public void comunicar() {
        // TODO Auto-generated method stub
        System.out.println("miauuuu");

    }
}
