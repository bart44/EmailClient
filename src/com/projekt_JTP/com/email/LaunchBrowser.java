/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projekt_JTP.com.email;

import java.io.IOException;
import java.net.URI;
import java.awt.Desktop;

/**
 *
 * @author Bartek
 */
public class LaunchBrowser {
    /**
     * This method redirect you to the Gmail website
     * for example to log in after sending an email
     * click on Blue Gmail icon to redirect
     */
    public void LaunchGmail() {
        try {
            Desktop.getDesktop().browse(URI.create("www.gmail.com"));
        }
        catch(IOException e) {
        }
    }
}
