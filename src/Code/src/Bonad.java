import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
@SuppressWarnings("unchecked")
public class Bonad extends JFrame implements ActionListener{
    JLabel Head_bonchon,pic_logo_Bonchon, pic_banner_bonchon;
    JLabel advice,pic_preset_bc;
    ImageIcon logo_Bonchon,Banner_bnc,preset_bnc;
    Font Heading,Count,Tittle,Scipt;
    JPanel put2back,pic,recomed;
    JButton back;
    
    Bonad()
    {
        Heading = new Font("printable4u",Font.BOLD,50);
         Count = new Font("printable4u",Font.BOLD,120);
         Tittle = new Font("printable4u",Font.BOLD,40);
         Scipt = new Font("printable4u",Font.BOLD,25);
         logo_Bonchon = new ImageIcon("Pic/logo/Bonchon.png");
        Banner_bnc = new ImageIcon("Pic/Banner/bc.png");
        preset_bnc = new ImageIcon("Pic/preset/bc.png");
        Head_bonchon = new JLabel("Bonchon, a Korean-style fried chicken brand");
        Head_bonchon.setFont(Scipt);
        pic_logo_Bonchon = new JLabel(logo_Bonchon);
        pic_banner_bonchon = new JLabel(Banner_bnc);
        pic_preset_bc  = new JLabel(preset_bnc);
   
      advice = new JLabel("Recommended menu",SwingConstants.LEFT);
      advice.setFont(Tittle);

      back = new JButton("Back");
      back.setBackground(new Color(242, 238, 179));
      back.setPreferredSize(new Dimension(100,30));
      back.setFont(Scipt);
      back.addActionListener(this);
         
    pic = new JPanel();
    pic.setPreferredSize(new Dimension(720,180));
      pic.setBackground(new Color(216, 204, 242));
      pic.add(pic_logo_Bonchon);
      pic.add(Head_bonchon);

    recomed = new JPanel();
    recomed.setPreferredSize(new Dimension(720,500));
    recomed.setBackground(Color.white);
    recomed.add(pic_preset_bc);

   this.add(pic_banner_bonchon);
   this.add(back);
   this.add(pic);
   this.add(advice);
   this.add(recomed);
   
      // Resolution 
      this.setSize(720,1080);
      this.getContentPane().setBackground(new Color(232, 220, 240));
      this.setTitle("Advice_Bonchon");
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
