package com.company.factory;


import com.company.buttons.Button;
import com.company.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
