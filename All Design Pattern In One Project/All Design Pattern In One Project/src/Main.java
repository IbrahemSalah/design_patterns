import command_mediator.CommandClient;
import composite.CompositeClient;
import factory_abstract_factory.AbstractFactoryClient;
import factory_abstract_factory.FactoryClient;
import iterator.IteratorClient;
import observer.ObserverClient;
import proxy.ProxyClient;
import state.StateClient;
import strategy.StrategyClient;
import template.TemplateClient;

public class Main {


    public static void main(String[] args) {
        StrategyClient strategyClient = new StrategyClient();
        TemplateClient templateClient = new TemplateClient();
        StateClient stateClient = new StateClient();
        ProxyClient proxyClient = new ProxyClient();
        ObserverClient observerClient = new ObserverClient();
        FactoryClient factoryClient = new FactoryClient();
        AbstractFactoryClient abstractFactoryClient = new AbstractFactoryClient();
        CompositeClient compositeClient = new CompositeClient();
        IteratorClient iteratorClient = new IteratorClient();
        iteratorClient.IterateUsingInternalIterator();
        CommandClient commandClient = new CommandClient();
    }
}