package CreationalDesignPatterns.AbstactFactory.app;

import CreationalDesignPatterns.AbstactFactory.buttons.Button;
import CreationalDesignPatterns.AbstactFactory.checkboxes.Checkbox;
import CreationalDesignPatterns.AbstactFactory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}