package Kesseler.Roberto.Exemplo6.model;

import Kesseler.Roberto.Exemplo6.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Dog")
public class Dog implements IAnimal {


    @Override
    public void comunicar() {
        // TODO Auto-generated method stub
        System.out.println("au auuu");

    }

}
