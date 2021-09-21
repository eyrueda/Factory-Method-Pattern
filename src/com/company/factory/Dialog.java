package com.company.factory;

import com.company.buttons.Button;

public abstract class Dialog {

    public void renderWindows() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
