package CreationalDesignPatterns.AbstactFactory.factories;

import CreationalDesignPatterns.AbstactFactory.buttons.Button;
import CreationalDesignPatterns.AbstactFactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
