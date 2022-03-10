package az.iktlab.groupjuniorsweb.util.diAndIoC;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

    private final HumanService service;

    public HumanController(HumanService service) {
        this.service = service;
    }

    public void fooT() {
        service.foo();
    }
}
