/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author kileurf
 */
public class IHM_Serveur extends JFrame {
    JButton arreter,ok;
    JTextField ipDist;
    JLabel monIp,dist;
    JPanel ip;
    
    public IHM_Serveur(){
        this.setLayout(new BorderLayout());
        arreter = new JButton("arreter le serveur");
        ok=new JButton("ok");
        ipDist = new JTextField();
        dist = new JLabel("adresse ip :");
        monIp = new JLabel("votre ip: "+new Ip().getIps().get(0));
        ip = new JPanel(new BorderLayout());
        ip.add(dist,BorderLayout.WEST);
        ip.add(ipDist,BorderLayout.CENTER);
        ip.add(ok,BorderLayout.EAST);
        this.add(monIp,BorderLayout.NORTH);
        this.add(ip,BorderLayout.CENTER);
        this.add(arreter,BorderLayout.SOUTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 100);
        this.setVisible(true);
    }
    
    public static void main(String[] args){
        new IHM_Serveur();
    }
}
