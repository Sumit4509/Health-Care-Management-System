import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.sql.*;

import java.io.*;

import java.lang.*;


 public class AbSt extends JFrame implements ActionListener

  {
  

    String Dname,exdate,selectString;;

    
    int istock,ostock,total;
     
    
    JLabel shead,ssub,dname,instock,outstock,remain,exda;


    JTextField dtext,dexda,dremain;

  
    JButton submit,back;


     public AbSt()

     {
    
          setLayout(null);

          setTitle("Drugs");

          setBounds(10,10,1020, 725);       

//       setMinimumSize(new Dimension(1000,700));

	  shead=new JLabel("STOCK DETAILS");

	  shead.setFont(new Font("Arial Narrow",Font.BOLD,40));

	  shead.setForeground(new Color(204,102,0));

	  shead.setHorizontalAlignment(SwingConstants.CENTER);

                    shead.setBounds(220,80,490,50);

	  getContentPane().add(shead);


                    ssub=new JLabel("   _ _ _ _ _ _ _ _ _ _ _ _    ");

	  ssub.setFont(new Font("Arial Narrow",Font.BOLD,40));

	  ssub.setForeground(new Color(255,102,102));

	  ssub.setHorizontalAlignment(SwingConstants.CENTER);

                     ssub.setBounds(260,65,420,100);;

	  getContentPane().add(ssub);

	
	  dname=new JLabel("DRUG NAME:");

	  dname.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  dname.setForeground(new Color(0,0,0));

	  dname.setHorizontalAlignment(SwingConstants.CENTER);

                    dname.setBounds(120,180,130,40);

	  getContentPane().add(dname);
	

/*                    instock=new JLabel("IN-STOCK:");

	  instock.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  instock.setForeground(new Color(0,0,0));

	  instock.setHorizontalAlignment(SwingConstants.TRAILING);

                    instock.setBounds(80,264,140,40);

	  getContentPane().add(instock);
                                                                                   */
     
  /*                   outstock=new JLabel("OUT-STOCK:");

	  outstock.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  outstock.setForeground(new Color(0,0,0));

	  outstock.setHorizontalAlignment(SwingConstants.CENTER);

                    outstock.setBounds(70,350,110,40);

	  getContentPane().add(outstock);      */
 

                   remain=new JLabel("REMAINING");
 
	  remain.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  remain.setForeground(new Color(0,0,0));

	  remain.setHorizontalAlignment(SwingConstants.CENTER);

                    remain.setBounds(70,350,180,30);

	  getContentPane().add(remain);
                                                  

                    exda=new JLabel("EX-DATE:");

	  exda.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  exda.setForeground(new Color(0,0,0));

	  exda.setHorizontalAlignment(SwingConstants.TRAILING);

                    exda.setBounds(440,350,100,30);

	  getContentPane().add(exda);


                     dtext=new JTextField(30);

	  dtext.setFont(new Font("Arial Narrow",Font.BOLD,18));

                   dtext.setBounds(280,180,410,30);

                  getContentPane().add(dtext);

		
        /*            dinstock=new JTextField(30);

	  dinstock.setFont(new Font("Arial Narrow",Font.BOLD,18));

                    dinstock.setBounds(250,270,430,40);

                   getContentPane().add(dinstock);

                                                                                      */
                   dexda=new JTextField(30);
 
	  dexda.setFont(new Font("Arial Narrow",Font.BOLD,18));

                   dexda.setBounds(550,350,140,30);

                     getContentPane().add(dexda);
	

                     dremain=new JTextField(30);

	  dremain.setFont(new Font("Arial Narrow",Font.BOLD,18));

                     dremain.setBounds(279,350,120,30);
 
                     getContentPane().add(dremain);
	 


	/*  dremain=new JTextField(30);

                      dremain.setFont(new Font("Arial Narrow",Font.BOLD,18));

                     dremain.setBounds(650,520,320,40);

                       getContentPane().add(dremain);

                                           */
	                       
                      submit=new JButton("SUBMIT");

                      submit.setFont(new Font("Arial Narrow",Font.BOLD,18));
 
                      submit.setBounds(400,263,160,40);

                      submit.setForeground(new Color(0,0,255));

                      submit.setBackground(new Color(255,204,204));

                      submit.setMnemonic(KeyEvent.VK_S);
   
                      submit.addActionListener(this);

                      submit.setToolTipText("Press to submit the detials");
   
                      getContentPane().add(submit); 


                      back=new JButton("BACK");

                      back.setFont(new Font("Arial Narrow",Font.BOLD,18));
 
                      back.setBounds(410,440,160,40);

                      back.setForeground(new Color(0,0,255));

                      back.setBackground(new Color(0,255,255));                     

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

			     Connection ms=DriverManager.getConnection("jdbc:odbc:Hsv"," ","paddu");
                                                            
                                                         //   Statement stmt;

			                                           
                                                            Dname=dtext.getText();

                                       	     PreparedStatement pstmt=ms.prepareStatement("select Exdate1,Total from Drugs where DrugName= ?");
                                                   
                                                           pstmt.setString(1,Dname);


			        ResultSet rs=pstmt.executeQuery();


                                                             if(rs.next())

                                                                    {
                                                                    
                                                                           
                                                                                  
                                                                           dremain.setText(rs.getString(2));

                                                                          dexda.setText(rs.getString(1));    
				 
                          
                                                                                  
                                                                    }      				

         				       
	                            		  
                                                                         

			                      pstmt.close();
                                                                   
                                                                           ms.close();

                          }

                          catch(Exception ex) {  System.out.println(ex.getMessage()); }
                   }


      }

   public static void main(String args[])

    {
    
       AbSt a=new AbSt();

    }

}





   