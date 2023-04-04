import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
@SuppressWarnings("unchecked")

public class pepad extends JFrame implements ActionListener{
    JLabel Head_pep,pic_logo_pep, pic_banner_pep;
    JLabel advice,pic_preset_pep;
    Font Heading,Count,Tittle,Scipt;
    ImageIcon logo_pep,Banner_pep,preset_pep;
    JPanel put2back,pic,recomed;
    JButton back;

    pepad()
    {
        Heading = new Font("printable4u",Font.BOLD,50);
         Count = new Font("printable4u",Font.BOLD,120);
         Tittle = new Font("printable4u",Font.BOLD,40);
         Scipt = new Font("printable4u",Font.BOLD,25);

         logo_pep = new ImageIcon("Pic/logo/Paper Lunch.png");
         Banner_pep = new ImageIcon("Pic/Banner/pl.png");
         preset_pep = new ImageIcon("Pic/preset/pl.png");
         Head_pep = new JLabel("Pepper Lunch is a new style of Japanese restaurant.");
         Head_pep.setFont(Scipt);
         pic_logo_pep = new JLabel(logo_pep);
         pic_banner_pep = new JLabel(Banner_pep);
         pic_preset_pep  = new JLabel(preset_pep);

         advice = new JLabel("Recommended menu",SwingConstants.LEFT);
         advice.setFont(Tittle);

      back = new JButton("Back");
      back.setPreferredSize(new Dimension(100,30));
      back.setFont(Scipt);
      back.setBackground(new Color(242, 238, 179));
      back.addActionListener(this);
   
    pic = new JPanel();
    pic.setPreferredSize(new Dimension(720,210));
      pic.setBackground(new Color(216, 204, 242));
      pic.add(pic_logo_pep);
      pic.add(Head_pep);

    recomed = new JPanel();
    recomed.setPreferredSize(new Dimension(720,500));
    recomed.setBackground(Color.white);
    recomed.add(pic_preset_pep);

   this.add(pic_banner_pep);
   this.add(back);
   this.add(pic);
   this.add(advice);
   this.add(recomed);
   
      // Resolution 
      this.setSize(720,1080);
      this.getContentPane().setBackground(new Color(232, 220, 240));
      this.setTitle("Advice_Paper lunch");
      this.setVisible(true);
      this.setResizable(false);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));   
 }
 @Override
    public void actionPerformed(ActionEvent e)
    {
         new Guizone();
         this.setVisible(false);
    }
}
