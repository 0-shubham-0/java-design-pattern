package CreationalDesignPatterns.AbstactFactory;

import CreationalDesignPatterns.AbstactFactory.app.Application;
import CreationalDesignPatterns.AbstactFactory.factories.GUIFactory;
import CreationalDesignPatterns.AbstactFactory.factories.WindowsFactory;

public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        factory = new WindowsFactory();
            app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}