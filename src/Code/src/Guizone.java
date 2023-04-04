import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
@SuppressWarnings("unchecked")
public class Guizone extends JFrame implements ActionListener{

    Font Heading,Count,Tittle,Scipt,Mystery;
    ImageIcon logo_BK,logo_Paper,logo_Ootoya,logo_Bonchon;
    JButton Startran,ClearList,addin,Advice_paper,Advice_bonchon,Advice_ootoya,Advice_burking;
    JLabel pic_logo_BK,pic_logo_Bonchon,pic_logo_Ootoya,pic_logo_Peper;
    JLabel Head_bonchon;
    JLabel Head_ootoya;
    JLabel Head_pep; 
    JLabel name_shop_BK,name_shop_Bonchon,name_shop_ootoya,name_shop_pepper,headname,Ccount,shop,blank,recomed,kk;
    JPanel pannelin,recomenu,recomenu2;
    JTextField sub,count;
    int counti = 0;
    Logiczone logi = new Logiczone();
    
    Guizone()
    {
        Mystery = new Font("Gloss and bloom",Font.BOLD,30);
         Heading = new Font("printable4u",Font.BOLD,50);
         Count = new Font("printable4u",Font.BOLD,120);
         Tittle = new Font("printable4u",Font.BOLD,40);
         Scipt = new Font("printable4u",Font.BOLD,25);

      logo_BK = new ImageIcon("Pic/logo/BK.png");
      logo_Bonchon = new ImageIcon("Pic/logo/Bonchon.png");
      logo_Ootoya = new ImageIcon("Pic/logo/Ootoya.png");
      logo_Paper = new ImageIcon("Pic/logo/Paper Lunch.png");

      Startran = new JButton("Random it!!");
     Startran.setPreferredSize(new Dimension(320,80));
     Startran.setFont(Tittle);
     Startran.addActionListener(this);
     Startran.setBackground(new Color(242, 238, 179));

      ClearList = new JButton("ClearList");
     ClearList.setPreferredSize(new Dimension(320,80));
     ClearList.setFont(Tittle);
     ClearList.addActionListener(this);
     ClearList.setBackground(new Color(242, 238, 179));

      addin = new JButton("Add here");
     addin.setPreferredSize(new Dimension(150,50));
     addin.setFont(Scipt);
     addin.addActionListener(this);
     addin.setBackground(new Color(242, 238, 179));

      Advice_paper = new JButton(logo_Paper);
      Advice_paper.setBackground(new Color(242, 238, 179));
     Advice_paper.setPreferredSize(new Dimension(200,200));
     Advice_paper.addActionListener(this);
      Advice_bonchon = new JButton(logo_Bonchon);
      Advice_bonchon.setBackground(new Color(242, 238, 179));
     Advice_bonchon.setPreferredSize(new Dimension(200,200));
     Advice_bonchon.addActionListener(this);
      Advice_ootoya = new JButton(logo_Ootoya);
      Advice_ootoya.setBackground(new Color(242, 238, 179));
     Advice_ootoya.setPreferredSize(new Dimension(200,200));
     Advice_ootoya.addActionListener(this);
      Advice_burking = new JButton(logo_BK);
      Advice_burking.setBackground(new Color(242, 238, 179));
     Advice_burking.setPreferredSize(new Dimension(200,200));
     Advice_burking.addActionListener(this);

      pic_logo_BK = new JLabel(logo_BK);
      pic_logo_Bonchon = new JLabel(logo_Bonchon);
      pic_logo_Ootoya = new JLabel(logo_Ootoya);
      pic_logo_Peper  = new JLabel(logo_Paper);

      name_shop_BK = new JLabel("Burger King");
      name_shop_BK.setForeground(Color.black);
      name_shop_BK.setFont(Scipt); 

      name_shop_Bonchon = new JLabel("Bonchon");
      name_shop_Bonchon.setForeground(Color.black);
     name_shop_Bonchon.setFont(Scipt);
     name_shop_Bonchon.setPreferredSize(new Dimension(120,100));
     
      name_shop_ootoya = new JLabel("Ootoya    ");
      name_shop_ootoya.setForeground(Color.black);
     name_shop_ootoya.setPreferredSize(new Dimension(120,100));
     name_shop_ootoya.setFont(Scipt);

      name_shop_pepper = new JLabel("Pepper Lunch");
      name_shop_pepper.setForeground(Color.black);
     name_shop_pepper.setFont(Scipt);

     //Set First page
      headname = new JLabel("Welcome to Ran it!!",SwingConstants.CENTER);
     headname.setFont(Heading);
     headname.setPreferredSize(new Dimension(720,70));

      Ccount = new JLabel("1",SwingConstants.CENTER);
     Ccount.setFont(Count);
     Ccount.setPreferredSize(new Dimension(720,80));

      shop = new JLabel("All you add have",SwingConstants.CENTER);
     shop.setFont(Scipt);
     shop.setPreferredSize(new Dimension(720,40));

      blank = new JLabel("",SwingConstants.CENTER);
     blank.setPreferredSize(new Dimension(720,40));
    
    kk = new JLabel("Just Random",SwingConstants.CENTER);
    kk.setFont(Mystery);
    kk.setPreferredSize(new Dimension(720,70));

      sub = new JTextField();
      sub.setFont(Scipt);
     sub.setPreferredSize(new Dimension(500,50));

     count = new JTextField(Integer.toString(counti));
     count.setFont(Count);
     count.setEditable(false);
     count.setPreferredSize(new Dimension(80,80));
     
      recomed = new JLabel("Recommend Restaurant",SwingConstants.CENTER);
     recomed.setFont(Tittle);
     recomed.setPreferredSize(new Dimension(720,80));

      pannelin = new JPanel();
     pannelin.setPreferredSize(new Dimension(720,145));
     pannelin.add(Startran,BorderLayout.EAST);
     pannelin.add(ClearList,BorderLayout.WEST);
     pannelin.add(addin);
     pannelin.add(sub);
     pannelin.setBackground(new Color(232, 220, 240));

      recomenu = new JPanel();
     recomenu.add(Advice_bonchon);
     recomenu.add(name_shop_Bonchon);
     recomenu.add(Advice_burking);
     recomenu.add(name_shop_BK);
     recomenu.add(Advice_ootoya);
     recomenu.add(name_shop_ootoya);
     recomenu.add(Advice_paper);
     recomenu.add(name_shop_pepper);
     recomenu.setPreferredSize(new Dimension(720,225));
     recomenu.setBackground(new Color(216, 204, 242));

      recomenu2 = new JPanel();
     recomenu2.add(new JLabel("   "));
     recomenu2.add(Advice_ootoya);
     recomenu2.add(name_shop_ootoya);
     recomenu2.add(Advice_paper);
     recomenu2.add(name_shop_pepper);
     recomenu2.setPreferredSize(new Dimension(720,225));
     recomenu2.setBackground(new Color(216, 204, 242));
      
        this.add(headname);
        this.add(count,BorderLayout.CENTER);
        this.add(shop);
        this.add(blank);
        this.add(pannelin);
        this.add(recomed);
        this.add(recomenu);
        this.add(recomenu2);
        this.add(kk,BorderLayout.EAST);
        
        this.setSize(720,1080);
        this.getContentPane().setBackground(new Color(232, 220, 240));
        this.setTitle("Ran it");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        
    }
@Override
public void actionPerformed(ActionEvent e){
 if(e.getSource()==Startran)
 {
    try
    {
    if(logi.random().length() == 0)
    {
        JOptionPane.showMessageDialog(this,"You didn't put ");
        counti--;
        counti--;
        if(counti < -1)
        {
            counti++;
        }
    }
    else
    {
        JOptionPane.showMessageDialog(this, "You got "+logi.random()+"!!");
    }
    }
    catch(Exception n){
        JOptionPane.showMessageDialog(this,"No have anyting in you quene");
    }
 }
 else if(e.getSource()== ClearList)
 {
    JOptionPane.showMessageDialog(this, "This List is Clear!!");
    counti =0;
    count.setText(""+Integer.toString(counti));
    logi.clearList();
 }
 else if(e.getSource() == addin)
 {
    logi.array(sub.getText());
    JOptionPane.showMessageDialog(this, "Add \""+sub.getText()+"\" in queue now!!");
    sub.setText("");
    counti++;
    count.setText(""+Integer.toString(counti));

 }
 else if(e.getSource() == Advice_ootoya)
 {
    new Otoad();
    this.setVisible(false);
 }
 
 else if(e.getSource() == Advice_burking)
 {
   new BKad();
   this.setVisible(false);
 }
 else if(e.getSource() == Advice_paper)
 {
   new pepad();
   this.setVisible(false);
 }
 else if(e.getSource() == Advice_bonchon)
 {
    new Bonad();
    this.setVisible(false);
 }
}  
}
