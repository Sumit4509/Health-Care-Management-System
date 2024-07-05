import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.sql.*;

public class AdminPwd extends JDialog implements ActionListener,KeyListener

 {


   TextField pwd;

   JLabel l;

   JButton ok,cancel;

   JPanel p;

   String pass=null;

   int i=0;

   public AdminPwd(JFrame f)

    {

      super(f,"Administrative Password",true);

      setLayout(null);

      l=new JLabel("Enter password :");

      l.setForeground(Color.red);

      l.setFont(new Font("arial",Font.BOLD,20));

      l.setBounds(50,40,200,30);

      add(l);

      pwd=new TextField(10);

      pwd.setEchoChar('*');

      pwd.setFont(new Font("arial",Font.BOLD,20));

      pwd.setBounds(90,80,150,25);

      add(pwd);

      addWindowListener(new WindowAdapter()

       {

          public void windowClosing(WindowEvent we)

           {

             dispose();

           }

       });

      ok=new JButton("OK");

      cancel =new JButton("CANCEL");

      ok.setDisplayedMnemonicIndex(0);

      ok.addActionListener(this);

      ok.addKeyListener(this);

      ok.setToolTipText("Press it after entering Password to Validate Your Password and Enter into Administrator Module if valid");

      cancel.setDisplayedMnemonicIndex(0);

      cancel.addActionListener(this);

      cancel.setToolTipText("Press it to exit");

      cancel.addKeyListener(this);

      p=new JPanel();

      p.setLayout(new GridLayout(1,2));

      p.setBounds(90,150,200,30);

      p.add(ok);

      p.add(cancel);

      getContentPane().add(p);

      setBounds(320,350,400,220);

      setVisible(true);

    }

   public void actionPerformed(ActionEvent ae)

    {

      if(ae.getActionCommand().equals("OK"))

       {

          passwordCheck();

       }

      else if(ae.getActionCommand().equals("CANCEL"))

       {
         dispose();

       }

    }

   public void keyPressed(KeyEvent ke)

    {

      int key=ke.getKeyCode();

     if(((JButton)ke.getSource())==ok)

      {

      if(key==KeyEvent.VK_O||key==KeyEvent.VK_ENTER)

       {

          passwordCheck();

       }

      }

      else if(key==KeyEvent.VK_C||key==KeyEvent.VK_ENTER)

       {
            dispose();

       }

    }

   public void passwordCheck()

    {

      pass=pwd.getText();

      String pwd1=pass;

      try

       {

         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

         Connection con=DriverManager.getConnection("jdbc:odbc:Hsv");

         Statement st=con.createStatement();

         ResultSet rs=st.executeQuery("select *from PassWord");

         while(rs.next())

          pwd1=rs.getString(1);

       }

      catch(Exception ex){}

         if(pass.equals(pwd1))

          {

            dispose();

            HcHome a=new HcHome();

            a.setBounds(0,0,1020,1000);

            a.setVisible(true);
           
            i=0;

          }

         else

          {

            JOptionPane.showMessageDialog(null,"Incorrect Password","Wrong Password",JOptionPane.ERROR_MESSAGE);

             pwd.setText("");

             i++;

             if(i>=3)

              System.exit(0);

          }

     }


   public void keyTyped(KeyEvent ke){}

   public void keyReleased(KeyEvent ke){}
      
  }



