package CreationalDesignPatterns.AbstactFactory.factories;

import CreationalDesignPatterns.AbstactFactory.buttons.Button;
import CreationalDesignPatterns.AbstactFactory.buttons.WindowsButton;
import CreationalDesignPatterns.AbstactFactory.checkboxes.Checkbox;
import CreationalDesignPatterns.AbstactFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}