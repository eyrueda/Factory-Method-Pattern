package com.company.buttons;

/**
 * HTML button implementation.
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Testing HtmlButton</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
