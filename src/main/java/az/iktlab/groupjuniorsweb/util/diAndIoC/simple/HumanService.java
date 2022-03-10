package az.iktlab.groupjuniorsweb.util.diAndIoC.simple;

public class HumanService {

    private final HumanRepo repo;

    public HumanService(HumanRepo repo) {
        this.repo = repo;
    }

    public void fooT() {
        repo.foo();
    }
}
