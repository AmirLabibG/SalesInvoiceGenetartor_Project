
package app.controllers;

import app.view.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;


public class The_Control implements ActionListener{

    private MainFrame frame;

    public The_Control(MainFrame frame) {
        this.frame = frame;
       
    }
    

    public The_Control() {
    }

    public The_Control(The_Control controller) {
    }
    
     
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("welceom");
        
        switch (e.getActionCommand()){
        
        case "S":
                saveFile();
                break;
       case "lo":
              loadFile();
                break;
       case "CNCL":
           cancelAaction();
                break;
       case "SV":
           saveChanges();
                break;
       case "D":
           deleteCurrentinv();
                break;
        
       case "CR":
          createInv();
               break;
        }
        
    }

   

    private void cancelAaction() {
        }

    private void saveChanges() {
    }

    private void deleteCurrentinv() {
    }

    private void createInv() {
    }

    public MainFrame getFrame() {
        return frame;
    }

    public void setFrame(MainFrame frame) {
        this.frame = frame;
        
    }

    private void saveFile() {
        throw new UnsupportedOperationException("Not supported yet."); }

    private void loadFile() {
       }
    
}
