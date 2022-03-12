package az.iktlab.groupjuniorsweb.util.diAndIoC.simple;

public class HumanController {

    HumanRepo repo = new HumanRepo();
    HumanService service = new HumanService(repo);

}
