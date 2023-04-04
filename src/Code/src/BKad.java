import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
@SuppressWarnings("unchecked")

public class BKad extends JFrame implements ActionListener{
    JLabel Head_bk,pic_logo_Bk, pic_banner_bk;
    JLabel advice,pic_preset_bc;
    Font Heading,Count,Tittle,Scipt;
    ImageIcon logo_Bk,Banner_bk,preset_bk;
    JPanel put2back,pic,recomed;
    JButton back;

    BKad()
    {
        Heading = new Font("printable4u",Font.BOLD,50);
         Count = new Font("printable4u",Font.BOLD,120);
         Tittle = new Font("printable4u",Font.BOLD,40);
         Scipt = new Font("printable4u",Font.BOLD,25);

         logo_Bk = new ImageIcon("Pic/logo/BK.png");
         Banner_bk = new ImageIcon("Pic/Banner/bk.png");
         preset_bk = new ImageIcon("Pic/preset/bk.png");
         Head_bk = new JLabel("Burger King is a world-renowned burger brand. ");
         Head_bk.setFont(Scipt);
         pic_logo_Bk = new JLabel(logo_Bk);
         pic_banner_bk = new JLabel(Banner_bk);
         pic_preset_bc  = new JLabel(preset_bk);

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
      pic.add(pic_logo_Bk);
      pic.add(Head_bk);

    recomed = new JPanel();
    recomed.setPreferredSize(new Dimension(720,500));
    recomed.setBackground(Color.white);
    recomed.add(pic_preset_bc);

   this.add(pic_banner_bk);
   this.add(back);
   this.add(pic);
   this.add(advice);
   this.add(recomed);
   
      // Resolution 
      this.setSize(720,1080);
      this.getContentPane().setBackground(new Color(232, 220, 240));
      this.setTitle("Advice_BurgerKIng");
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
