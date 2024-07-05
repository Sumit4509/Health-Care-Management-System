import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.sql.*;

import java.io.*;


 public class AbSt extends JFrame implements ActionListener

  {
  

    String Dname,exdate,selectString;;

    
    int istock,ostock,total;
     
    
    JLabel shead,ssub,dname,instock,outstock,remain,exda;


    JTextField dtext,dinstock,dexda,dremain;

  
    JButton submit,back;


     public AbSt()

     {
    
          setLayout(null);

          setTitle("Drugs");

          setBounds(10,10,1020, 725);       

	//     setMinimumSize(new Dimension(1000,700));

			shead=new JLabel("STOCK DETAILS");

			shead.setFont(new Font("Arial Narrow",Font.BOLD,40));

			shead.setForeground(new Color(204,102,0));

			shead.setHorizontalAlignment(SwingConstants.CENTER);

            shead.setBounds(220,80,490,50);

			getContentPane().add(shead);


            ssub=new JLabel("_______________________________________________________________");

			ssub.setFont(new Font("Arial Narrow",Font.BOLD,40));

			ssub.setForeground(new Color(255,102,102));

			ssub.setHorizontalAlignment(SwingConstants.CENTER);

            ssub.setBounds(250,70,360,60);

			getContentPane().add(ssub);

	
			dname=new JLabel("DRUG NAME:");

			dname.setFont(new Font("Arial Narrow",Font.BOLD,24));

			dname.setForeground(new Color(0,0,0));

			dname.setHorizontalAlignment(SwingConstants.CENTER);

            dname.setBounds(70,180,180,40);

			getContentPane().add(dname);
	

            instock=new JLabel("IN-STOCK:");

			instock.setFont(new Font("Arial Narrow",Font.BOLD,24));

			instock.setForeground(new Color(0,0,0));

			instock.setHorizontalAlignment(SwingConstants.TRAILING);

            instock.setBounds(80,264,140,40);

			getContentPane().add(instock);

     
  /*        outstock=new JLabel("OUT-STOCK:");

			outstock.setFont(new Font("Arial Narrow",Font.BOLD,24));

			outstock.setForeground(new Color(0,0,0));

			outstock.setHorizontalAlignment(SwingConstants.CENTER);

            outstock.setBounds(70,350,110,40);

			getContentPane().add(outstock);      */
 

            remain=new JLabel("REMAINING");
 
			remain.setFont(new Font("Arial Narrow",Font.BOLD,24));

			remain.setForeground(new Color(0,0,0));

			remain.setHorizontalAlignment(SwingConstants.CENTER);

            remain.setBounds(690,440,220,50);

			getContentPane().add(remain);
                                                  

            exda=new JLabel("EX-DATE:");

			exda.setFont(new Font("Arial Narrow",Font.BOLD,24));

			exda.setForeground(new Color(0,0,0));

			exda.setHorizontalAlignment(SwingConstants.TRAILING);

            exda.setBounds(90,450,120,40);

			getContentPane().add(exda);


            dtext=new JTextField(30);

			dtext.setFont(new Font("Arial Narrow",Font.BOLD,18));

            dtext.setBounds(250,180,430,40);

            getContentPane().add(dtext);

		
            dinstock=new JTextField(30);

			dinstock.setFont(new Font("Arial Narrow",Font.BOLD,18));

			dinstock.setBounds(250,270,430,40);

            getContentPane().add(dinstock);


           dexda=new JTextField(30);
 
		   dexda.setFont(new Font("Arial Narrow",Font.BOLD,18));

           dexda.setBounds(250,450,430,40);

           getContentPane().add(dexda);
	

           dremain=new JTextField(30);

	       dremain.setFont(new Font("Arial Narrow",Font.BOLD,18));

           dremain.setBounds(250,360,430,40);
 
           getContentPane().add(dremain);
	 


	/*     dremain=new JTextField(30);

           dremain.setFont(new Font("Arial Narrow",Font.BOLD,18));

           dremain.setBounds(650,520,320,40);

           getContentPane().add(dremain);

                                           */
	                       
           submit=new JButton("SUBMIT");

           submit.setFont(new Font("Arial Narrow",Font.BOLD,28));
 
           submit.setBounds(110,610,160,60);

           submit.setForeground(new Color(0,0,255));

           submit.setMnemonic(KeyEvent.VK_S);
   
           submit.addActionListener(this);

           submit.setToolTipText("Press to submit the detials");
   
           getContentPane().add(submit); 


           back=new JButton("BACK");

           back.setFont(new Font("Arial Narrow",Font.BOLD,28));
 
           back.setBounds(330,610,160,60);

           back.setForeground(new Color(0,0,255));

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

							Dname=dtext.getText();

                                   try
		
									 {
			     
											Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

											Connection ms=DriverManager.getConnection("jdbc:odbc:Hsv");
			
											PreparedStatement pstmt=ms.prepareStatement("select Total,Exdate from Drugs where DrugName= ?");
                                                   
                                            pstmt.setString(3,Dname);

                                            ResultSet rs=pstmt.executeQuery();

                                            if(rs.next())

                                              {
                                                                            
                                 			         total.setText(rs.getString(1));

                                                     exdate.setText(rs.getSting(2));      
                          
                                                     total.setEditable(false);

													 exdate.setEditable(false);  
             
                                               }      				

         				          
	                            		               pstmt.executeUpdate();

                                                       ms.commit();  

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





   