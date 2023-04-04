import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
@SuppressWarnings("unchecked")

public class Otoad extends JFrame implements ActionListener{
    JLabel Head_oto,pic_logo_oto, pic_banner_oto;
    JLabel advice,pic_preset_bc;
    Font Heading,Count,Tittle,Scipt;
    ImageIcon logo_oto,Banner_oto,preset_oto;
    JPanel put2back,pic,recomed;
    JButton back;

    Otoad()
    {
        Heading = new Font("printable4u",Font.BOLD,50);
         Count = new Font("printable4u",Font.BOLD,120);
         Tittle = new Font("printable4u",Font.BOLD,40);
         Scipt = new Font("printable4u",Font.BOLD,25);

         logo_oto= new ImageIcon("Pic/logo/Ootoya.png");
         Banner_oto = new ImageIcon("Pic/Banner/oty.png");
         preset_oto = new ImageIcon("Pic/preset/ot.png");
         Head_oto = new JLabel("Ootoya is a premium-quality Japanese restaurant. ");
         Head_oto.setFont(Scipt);
         pic_logo_oto = new JLabel(logo_oto);
         pic_banner_oto = new JLabel(Banner_oto);
         pic_preset_bc  = new JLabel(preset_oto);

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
      pic.add(pic_logo_oto);
      pic.add(Head_oto);

    recomed = new JPanel();
    recomed.setPreferredSize(new Dimension(720,500));
    recomed.setBackground(Color.white);
    recomed.add(pic_preset_bc);

   this.add(pic_banner_oto);
   this.add(back);
   this.add(pic);
   this.add(advice);
   this.add(recomed);
   
      // Resolution 
      this.setSize(720,1080);
      this.getContentPane().setBackground(new Color(232, 220, 240));
      this.setTitle("Advice_Ootoya");
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
