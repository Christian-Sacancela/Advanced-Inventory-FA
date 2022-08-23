/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Users;
import Models.UsersDao;
import Views.AdminPanel;
import Views.FrmLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian Sacancela
 */
public class LoginController implements ActionListener{
    
    private Users us;
    private UsersDao usDao;
    private FrmLogin view;

    public LoginController(Users us, UsersDao usDao, FrmLogin view) {
        this.us = us;
        this.usDao = usDao;
        this.view = view;
        this.view.btnLogin.addActionListener(this);
        this.view.btnExit.addActionListener(this);
        this.view.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnLogin) {
            if (view.txtUser.getText().equals("") || String.valueOf(view.txtPass.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Los campos están vacíos");
        }else{
            String user = view.txtUser.getText();
            String pass = String.valueOf(view.txtPass.getPassword());
            us = usDao.login(user, pass);
            if (us.getUser() != null) {
                AdminPanel admin = new AdminPanel();
                admin.setVisible(true);
                this.view.dispose();
            }
        }
        }
    }
    
    
}
