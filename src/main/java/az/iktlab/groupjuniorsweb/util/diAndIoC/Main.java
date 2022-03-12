package az.iktlab.groupjuniorsweb.util.diAndIoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Main {

    @Autowired
    private HumanController controller;

    //    @PostConstruct
    public void load() {
        controller.fooT();
    }
}
