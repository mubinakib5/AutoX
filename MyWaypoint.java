/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package waypoint;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;

/**
 *
 * @author User
 */
public class MyWaypoint extends DefaultWaypoint {

    public String getName () {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    } 
    
    public JButton getButton () {
        return button;
    }
    
    public void setButton (JButton button) {
        this.button = button;
    }
    
    public MyWaypoint (String name, EventWaypoint event, GeoPosition coord) {
        super(coord);
        this.name = name;
        initButton(event);
    }
    
    public MyWaypoint () {
        
    }
    
    private String name;
    private JButton button;
    
    private void initButton (EventWaypoint event) {
        button = new ButtonWaypoint();
        button.addActionListener((ActionEvent e) -> {
            event.selected(MyWaypoint.this);
        } /* @Override*/ );
    }

    GeoPosition getPositon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
