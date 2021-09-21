package com.company.factory;

import com.company.buttons.Button;
import com.company.buttons.HtmlButton;

public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
