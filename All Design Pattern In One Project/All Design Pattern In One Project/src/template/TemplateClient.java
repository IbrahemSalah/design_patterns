package template;

public class TemplateClient {

    BaseAlgorithm baseAlgorithm;

    public TemplateClient(){
        baseAlgorithm = new AlgorithmUpdatedA();
        baseAlgorithm.stepThree();
    }
}
