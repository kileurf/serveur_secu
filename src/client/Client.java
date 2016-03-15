package client;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author kileurf
 */
public class Client extends JFrame {
    JButton envoye;
    JButton fichier;
    JTextArea area;
    JPanel envo;
    JTextArea ecriture;
    String machine;
    Socket connection;
    OutputStream out;
    InputStream in;
    JFileChooser fc;
    
    public Client(String machine){
        this.machine=machine;
        this.setName("client");
        this.setSize(800, 600);
        this.setLayout(new BorderLayout());
        this.setTitle("Client");
        
        envoye = new JButton("envoyé");
        envoye.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
  
            }
        });
        
        
        
        area = new JTextArea();
        area.setBackground(Color.LIGHT_GRAY);
        area.setPreferredSize(new Dimension(600, 100));
        
        fichier = new JButton("fichiers");
        fichier.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                fc = new JFileChooser();
               fc.showOpenDialog(((JButton)ae.getSource()).getParent());
            }
        });
        
        
        envo = new JPanel();
        envo.setLayout(new BorderLayout());
        envo.add(area,BorderLayout.WEST);
        envo.add(envoye,BorderLayout.CENTER);
        envo.add(fichier,BorderLayout.EAST);
        getContentPane().add(envo,BorderLayout.SOUTH);
        
        ecriture = new JTextArea();
        ecriture.setEditable(false);
        ecriture.setPreferredSize(new Dimension(400, 400));
        getContentPane().add(ecriture,BorderLayout.CENTER);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
    
    public static void main(String[] args){
       
        new Client("test");
    }
}
