import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.sql.*;

import java.io.*;


 public class PInDu extends JFrame implements ActionListener

  {
  

    String Dname,exdate1,exdate2;

    
    int istock,total;
     
    
    JLabel shead,ssub,dname,instock,exda1,exda2;


    JTextField dtext,dinstock,dexda1,dexda2;

  
    JButton submit,back;


     public PInDu()

     {
    
        	  setLayout(null);

        	  setTitle("Pharmacy Drugs");

         //  setMinimumSize(new Dimension(900,700));

                   setBounds(0,0,1020,725);

	  shead=new JLabel("INSERT THE DRUGS AT PHARMACY HOUSE");

	  shead.setFont(new Font("Arial Narrow",Font.BOLD,30));

	  shead.setForeground(new Color(204,102,0));

	  shead.setHorizontalAlignment(SwingConstants.CENTER);

      shead.setBounds(250,20,560,60);

	  getContentPane().add(shead);


      ssub=new JLabel("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");

	  ssub.setFont(new Font("Arial Narrow",Font.BOLD,40));

	  ssub.setForeground(new Color(255,102,102));

	  ssub.setHorizontalAlignment(SwingConstants.CENTER);

      ssub.setBounds(240,15,610,100);

	  getContentPane().add(ssub);

	
	  dname=new JLabel("DRUG NAME:");

	  dname.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  dname.setForeground(new Color(0,0,0));

	  dname.setHorizontalAlignment(SwingConstants.CENTER);

      dname.setBounds(70,130,180,40);

	  getContentPane().add(dname);
	

      instock=new JLabel("IN-STOCK:");

	  instock.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  instock.setForeground(new Color(0,0,0));

	  instock.setHorizontalAlignment(SwingConstants.TRAILING);

      instock.setBounds(80,214,140,40);

	  getContentPane().add(instock);
 

      exda1=new JLabel("EX-DATE1:");

	  exda1.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  exda1.setForeground(new Color(0,0,0));

	  exda1.setHorizontalAlignment(SwingConstants.TRAILING);

      exda1.setBounds(90,300,130,40);

	  getContentPane().add(exda1);


	  exda2=new JLabel("EX-DATE2:");

	  exda2.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  exda2.setForeground(new Color(0,0,0));

	  exda2.setHorizontalAlignment(SwingConstants.TRAILING);

      exda2.setBounds(90,370,130,40);

	  getContentPane().add(exda2);



      dtext=new JTextField(30);

	  dtext.setFont(new Font("Arial Narrow",Font.BOLD,18));

      dtext.setBounds(250,130,430,40);

      getContentPane().add(dtext);

		
      dinstock=new JTextField(30);

	  dinstock.setFont(new Font("Arial Narrow",Font.BOLD,18));

      dinstock.setBounds(250,215,430,40);

      getContentPane().add(dinstock);


      dexda1=new JTextField(30);
	
	  dexda1.setFont(new Font("Arial Narrow",Font.BOLD,18));

      dexda1.setBounds(250,300,430,40);

      getContentPane().add(dexda1);


	 
	  dexda2=new JTextField(30);
	
	  dexda2.setFont(new Font("Arial Narrow",Font.BOLD,18));

      dexda2.setBounds(250,380,430,40);

      getContentPane().add(dexda2);

	  
	 

	   
       submit=new JButton("SUBMIT");

       submit.setFont(new Font("Arial Narrow",Font.BOLD,28));
 
       submit.setBounds(200,480,230,50);

	   submit.setForeground(new Color(0,0,255));

	   submit.setBackground(new Color(0,255,255));
 
       submit.setMnemonic(KeyEvent.VK_S);
  
       submit.addActionListener(this);

       submit.setToolTipText("Press to submit the detials");
   
       getContentPane().add(submit); 


       back=new JButton("BACK");

       back.setFont(new Font("Arial Narrow",Font.BOLD,28));
 
       back.setBounds(470,480,220,50);

	   back.setForeground(new Color(0,0,255));

	   back.setBackground(new Color(255,204,204));

       back.setMnemonic(KeyEvent.VK_B);
  
       back.addActionListener(this);

       back.setToolTipText("PRESS TO DISPOSE");
   
       getContentPane().add(back); 

	   setVisible(true);

       addWindowListener(new WindowAdapter() {

                public void windowCloseing(WindowEvent we)

                                          {

                                                  dispose();

                                          }
         });

   }

 
      public void actionPerformed(ActionEvent ae)
   

        {

             if(ae.getActionCommand().equals("BACK"))

                {
 
                        dispose();

		}

		else if(ae.getActionCommand().equals("SUBMIT"))

		   {

                    try
		
			             {

							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

							Connection con=DriverManager.getConnection("jdbc:odbc:Hsv"," ","paddu");

							Dname=dtext.getText();

							istock=Integer.parseInt(dinstock.getText());

							exdate1=dexda1.getText();

							exdate2=dexda2.getText();
				
							total=istock;

               				PreparedStatement pstm=con.prepareStatement("insert into Drugs(DrugName,istock,Exdate1,Exdate2,Total)values(?,?,?,?,?)");
			                      
               				pstm.setString(1,Dname);
                               
                        
							pstm.setInt(2,istock);
        
                                
						    pstm.setString(3,exdate1);

							pstm.setString(4,exdate2);

							pstm.setInt(5,total);                              

							pstm.executeUpdate();

							pstm.close();

							con.close();

               }

               catch(Exception ex) {  System.out.println(ex.getMessage()); }
                   }


      }

   public static void main(String args[])

    {
    
       PInDu id=new PInDu();

    }

}





   