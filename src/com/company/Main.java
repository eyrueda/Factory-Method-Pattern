package com.company;

import com.company.factory.Dialog;
import com.company.factory.HtmlDialog;
import com.company.factory.WindowsDialog;

public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    public static void configure() {
        String osName = System.getProperty("os.name");
        if (osName.equalsIgnoreCase("linux")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindows();
    }
}
