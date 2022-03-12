package az.iktlab.groupjuniorsweb.util.diAndIoC;

import org.springframework.stereotype.Service;

@Service
public class HumanService {

    private String name;

    public void foo() {
        System.out.println(name);
    }
}