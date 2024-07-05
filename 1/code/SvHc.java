import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class SvHc extends JFrame implements ActionListener,KeyListener

 {

   JLabel prin,title,title1,title2,title3,title4,title5;

   JButton back;

   public SvHc()

    {

      setLayout(null);

      setTitle("About Our Principal");

      title=new JLabel("ABOUT OUR PRINCIPAL SIR");

      title.setFont(new Font("arial",Font.BOLD,30));

      title.setForeground(Color.magenta);

      title.setBounds(260,50,500,40);

      getContentPane().add(title);

      prin=new JLabel(new ImageIcon("principal.jpg"));

      prin.setBounds(330,100,300,340);

      getContentPane().add(prin);

      title1=new JLabel("Prof.B.Mohan");

      title1.setFont(new Font("arial",Font.BOLD,25));

      title1.setForeground(Color.darkGray);

      title1.setBounds(400,440,300,40);

      getContentPane().add(title1);

      title3=new JLabel("Principal");

      title3.setFont(new Font("arial",Font.BOLD,20));

      title3.setForeground(Color.darkGray);

      title3.setBounds(436,465,300,40);

      getContentPane().add(title3);

      title2=new JLabel("College of CMIS");

      title2.setFont(new Font("arial",Font.BOLD,20));

      title2.setForeground(Color.darkGray);

      title2.setBounds(400,490,300,40);

      getContentPane().add(title2);

      title4=new JLabel("SV University");

      title4.setFont(new Font("arial",Font.BOLD,20));

      title4.setForeground(Color.darkGray);

      title4.setBounds(410,515,300,40);

      getContentPane().add(title4);

      title5=new JLabel("Tirupati");

      title5.setFont(new Font("arial",Font.BOLD,20));

      title5.setForeground(Color.darkGray);

      title5.setBounds(430,540,300,40);

      getContentPane().add(title5);

      back=new JButton("Back");

      back.setFont(new Font("arial",Font.BOLD,25));

      back.setMnemonic(KeyEvent.VK_B);

      back.setToolTipText("Press it to go to Home Page");

      back.setBounds(416,600,100,30);

      back.addActionListener(this);

      back.addKeyListener(this);

      getContentPane().add(back);

      setBounds(40,30,950,670);

      setVisible(true);

      addWindowListener(new WindowAdapter()

       {

         public void windowClosing(WindowEvent we)

          {

            dispose();

          }

       });

    }

   public void actionPerformed(ActionEvent ae)

    {

      dispose();

    }

   public void keyPressed(KeyEvent ke)

    {

      int i=(int)ke.getKeyCode();

      if(i==KeyEvent.VK_B)

        dispose();

    }

   public void keyTyped(KeyEvent ke){}

   public void keyReleased(KeyEvent ke){}

   public static void main(String args[])

    {

      SvHc p=new SvHc();

    }

  }


