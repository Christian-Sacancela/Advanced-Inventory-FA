/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.AdminPanel;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Christian Sacancela
 */
public class ConfigController implements MouseListener {
    
    private AdminPanel views;

    public ConfigController(AdminPanel views) {
        this.views = views;
        this.views.JLabelC.addMouseListener(this);
        this.views.JLabelCat.addMouseListener(this);
        this.views.JLabelConf.addMouseListener(this);
        this.views.JLabelM.addMouseListener(this);
        this.views.JLabelNP.addMouseListener(this);
        this.views.JLabelNS.addMouseListener(this);
        this.views.JLabelP.addMouseListener(this);
        this.views.JLabelPr.addMouseListener(this);
        this.views.JLabelU.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == views.JLabelC) {
            views.JPanelC.setBackground(new Color(255,120,120));
        } else if (e.getSource() == views.JLabelCat) {
            views.JPanelCat.setBackground(new Color(255,120,120));
        }else if (e.getSource() == views.JLabelConf) {
            views.JPanelConf.setBackground(new Color(255,120,120));
        }else if (e.getSource() == views.JLabelM) {
            views.JPanelM.setBackground(new Color(255,120,120));
        }else if (e.getSource() == views.JLabelNP) {
            views.JPanelNP.setBackground(new Color(255,120,120));
        }else if (e.getSource() == views.JLabelNS) {
            views.JPanelNS.setBackground(new Color(255,120,120));
        }else if (e.getSource() == views.JLabelP) {
            views.JPanelP.setBackground(new Color(255,120,120));
        }else if (e.getSource() == views.JLabelPr) {
            views.JPanelPr.setBackground(new Color(255,120,120));
        }else if (e.getSource() == views.JLabelU) {
            views.JPanelU.setBackground(new Color(255,120,120));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == views.JLabelC) {
            views.JPanelC.setBackground(new Color(240,240,240));
        } else if (e.getSource() == views.JLabelCat) {
            views.JPanelCat.setBackground(new Color(240,240,240));
        }else if (e.getSource() == views.JLabelConf) {
            views.JPanelConf.setBackground(new Color(240,240,240));
        }else if (e.getSource() == views.JLabelM) {
            views.JPanelM.setBackground(new Color(240,240,240));
        }else if (e.getSource() == views.JLabelNP) {
            views.JPanelNP.setBackground(new Color(240,240,240));
        }else if (e.getSource() == views.JLabelNS) {
            views.JPanelNS.setBackground(new Color(240,240,240));
        }else if (e.getSource() == views.JLabelP) {
            views.JPanelP.setBackground(new Color(240,240,240));
        }else if (e.getSource() == views.JLabelPr) {
            views.JPanelPr.setBackground(new Color(240,240,240));
        }else if (e.getSource() == views.JLabelU) {
            views.JPanelU.setBackground(new Color(240,240,240));
        }
    }
    
}
