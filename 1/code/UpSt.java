import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.sql.*;

import java.io.*;


 public class UpSt extends JFrame implements ActionListener

  {
  

    String Dname,exdate11,exdate22,selectString;

    
    int istock1,ostock1,total1,rem;
     
    
    JLabel und,shead,ssub,dname,dname1,instock,outstock,remain,exda1,exda2,exda3,exda4;


    JTextField dtext,dtext1,dinstock,dexda1,dostock,dremain,dexda2,dexda3,dexda4;

  
    JButton submit,back,getDetails;


     public UpSt()

     {
    
          setLayout(null);

          setTitle("Drugs");

          //setMinimumSize(new Dimension(1000,700));

	 setBounds(0,0,1020,725);

	  shead=new JLabel("UPDATING DRUGS ");

	  shead.setFont(new Font("Arial Narrow",Font.BOLD,40));

	  shead.setForeground(new Color(204,102,0));

	  shead.setHorizontalAlignment(SwingConstants.CENTER);

      shead.setBounds(250,20,360,60);

	  getContentPane().add(shead);


      ssub=new JLabel("_________________ ");

	  ssub.setFont(new Font("Arial Narrow",Font.BOLD,40));

	  ssub.setForeground(new Color(255,102,102));

	  ssub.setHorizontalAlignment(SwingConstants.CENTER);

      ssub.setBounds(240,15,390,80);

	  getContentPane().add(ssub);

	   
	   und=new JLabel("_______________________________________________________ ");

	   und.setFont(new Font("Arial Narrow",Font.BOLD,40));

	   und.setForeground(new Color(255,102,102));

	   und.setHorizontalAlignment(SwingConstants.LEADING);

       und.setBounds(5,200,1020,80);

	    getContentPane().add(und);


	
	    dname=new JLabel("DRUG NAME:");

	    dname.setFont(new Font("Arial Narrow",Font.BOLD,20));

	    dname.setForeground(new Color(0,0,0));

	    dname.setHorizontalAlignment(SwingConstants.CENTER);

        dname.setBounds(20,80,180,40);

	    getContentPane().add(dname);

	
		 dname1=new JLabel("DRUG NAME:");

	     dname1.setFont(new Font("Arial Narrow",Font.BOLD,20));

	     dname1.setForeground(new Color(0,0,0));

		 dname1.setHorizontalAlignment(SwingConstants.CENTER);

		 dname1.setBounds(20,300,160,40);

	      getContentPane().add(dname1);


        instock=new JLabel("NEW-ISTOCK:");

	    instock.setFont(new Font("Arial Narrow",Font.BOLD,20));

	    instock.setForeground(new Color(0,0,0));

	    instock.setHorizontalAlignment(SwingConstants.TRAILING);

        instock.setBounds(20,352,140,40);

	    getContentPane().add(instock);

     
        outstock=new JLabel("NEW-OSTOCK:");

	    outstock.setFont(new Font("Arial Narrow",Font.BOLD,20));

	    outstock.setForeground(new Color(0,0,0));

	    outstock.setHorizontalAlignment(SwingConstants.LEADING);

        outstock.setBounds(40,405,150,40);

	    getContentPane().add(outstock);
 

        remain=new JLabel("TOT_DRUGS:");

	    remain.setFont(new Font("Arial Narrow",Font.BOLD,20));

	    remain.setForeground(new Color(0,0,0));

	    remain.setHorizontalAlignment(SwingConstants.CENTER);

        remain.setBounds(20,135,180,40);

	    getContentPane().add(remain);
                                                  

         exda1=new JLabel("EXPR DATE1:");

	     exda1.setFont(new Font("Arial Narrow",Font.BOLD,20));

	     exda1.setForeground(new Color(0,0,0));

	     exda1.setHorizontalAlignment(SwingConstants.CENTER);

         exda1.setBounds(20,180,180,40);

	     getContentPane().add(exda1);


	  
	     exda2=new JLabel("EXPR DATE2:");

	     exda2.setFont(new Font("Arial Narrow",Font.BOLD,20));

	     exda2.setForeground(new Color(0,0,0));

	     exda2.setHorizontalAlignment(SwingConstants.CENTER);

         exda2.setBounds(460,180,180,40);

	     getContentPane().add(exda2);


		 exda3=new JLabel("EXPR DATE1:");

	     exda3.setFont(new Font("Arial Narrow",Font.BOLD,20));

	     exda3.setForeground(new Color(0,0,0));

	     exda3.setHorizontalAlignment(SwingConstants.CENTER);

         exda3.setBounds(20,460,170,40);

	     getContentPane().add(exda3);
        

         exda4=new JLabel("EXPR DATE2:");

	     exda4.setFont(new Font("Arial Narrow",Font.BOLD,20));

	     exda4.setForeground(new Color(0,0,0));

	     exda4.setHorizontalAlignment(SwingConstants.CENTER);

         exda4.setBounds(20,514,170,40);

	     getContentPane().add(exda4);



          dtext=new JTextField(30);

	     dtext.setFont(new Font("Times New Roman",Font.BOLD,18));

         dtext.setBounds(180,85,300,30);

         getContentPane().add(dtext); 

         
		  dtext1=new JTextField(30);

	     dtext1.setFont(new Font("Times New Roman",Font.BOLD,18));

         dtext1.setBounds(180,300,300,30);

         getContentPane().add(dtext1); 


		
         dinstock=new JTextField(30);

	     dinstock.setFont(new Font("Arial Narrow",Font.BOLD,18));

         dinstock.setBounds(180,355,300,30);

         getContentPane().add(dinstock);


         dexda1=new JTextField(30);

	     dexda1.setFont(new Font("Arial Narrow",Font.BOLD,18));

         dexda1.setBounds(180,185,300,30);

         getContentPane().add(dexda1);
	

		 dexda2=new JTextField(30);

		 dexda2.setFont(new Font("Arial Narrow",Font.BOLD,18));

         dexda2.setBounds(620,185,300,30);

         getContentPane().add(dexda2);
	
	
		 dexda3=new JTextField(30);

		 dexda3.setFont(new Font("Arial Narrow",Font.BOLD,18));

         dexda3.setBounds(180,465,300,30);

         getContentPane().add(dexda3);
	

	     dexda4=new JTextField(30);

		 dexda4.setFont(new Font("Arial Narrow",Font.BOLD,18));

         dexda4.setBounds(180,520,300,30);

         getContentPane().add(dexda4);
	

         dostock=new JTextField(30);

	     dostock.setFont(new Font("Arial Narrow",Font.BOLD,18));

         dostock.setBounds(180,410,300,30);

         getContentPane().add(dostock);
	 

	      dremain=new JTextField(30);

	      dremain.setFont(new Font("Arial Narrow",Font.BOLD,18));

          dremain.setBounds(180,140,300,30);

          getContentPane().add(dremain);

                                           

				

		   getDetails=new JButton("Get Details");

		   getDetails.setFont(new Font("Arial Narrow",Font.BOLD,20));

		   getDetails.setForeground(new Color(0,0,255));

		   getDetails.setBounds(570,85,200,30);

		   getDetails.setMnemonic(KeyEvent.VK_D);

		   getDetails.addActionListener(this);

		   getDetails.setToolTipText("Press to Get the Detials");

		   getContentPane().add(getDetails);


          submit=new JButton("SUBMIT");

          submit.setFont(new Font("Arial Narrow",Font.BOLD,22));
 
          submit.setBounds(300,610,160,40);

	      submit.setForeground(new Color(0,0,255));

          submit.setMnemonic(KeyEvent.VK_S);
  
          submit.addActionListener(this);

          submit.setToolTipText("Press to submit the detials");
   
          getContentPane().add(submit); 


          back=new JButton("BACK");

          back.setFont(new Font("Arial Narrow",Font.BOLD,22));
 
          back.setBounds(480,610,160,40);

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

			       else if(ae.getActionCommand().equals("Get Details"))

				 {        

						try
		
							{
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

								Connection ms=DriverManager.getConnection("jdbc:odbc:Hsv"," ","paddu");
                                                            
                                                         //   Statement stmt;

			                                           
								Dname=dtext.getText();

								PreparedStatement pstmt=ms.prepareStatement("select Total,Exdate1,Exdate2 from Drugs where drugname= ?");
                                                   
                                pstmt.setString(1,Dname);


								ResultSet rs=pstmt.executeQuery();


                                 if(rs.next())

								         {
                                                                    
                                            dremain.setText(rs.getString(1));

                                            dexda1.setText(rs.getString(2));    
				 
											dexda2.setText(rs.getString(3));                          
                                          }      				

         				       
	                                         pstmt.close();
                                                                   
                                                ms.close();

                          }                     catch(Exception ex) {  System.out.println(ex.getMessage()); }
                   }


                  else if(ae.getActionCommand().equals("SUBMIT"))

	             {                      
 
                               			  Dname=dtext.getText();

										  istock1=total1;

                                          istock1=Integer.parseInt(dinstock.getText());
			
			                              ostock1=Integer.parseInt(dostock.getText());
			    
                                          exdate11=dexda1.getText();

										  exdate22=dexda2.getText();

										  total1=istock1-ostock1;

                                                               
                           
								try
		
										{	
												Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

												Connection ms=DriverManager.getConnection("jdbc:odbc:Hsv"," ","paddu");
			
												PreparedStatement pstmt=ms.prepareStatement("Update Drugs set istock=?, ostock=?, exdate1=? ,exdate2=?,total=? where drugname= ?");
                                                   
                                                pstmt.setString(6,Dname);

                                                pstmt.setInt(1,istock1);

												pstmt.setInt(2,ostock1);
                             
												pstmt.setString(3,exdate11);

												pstmt.setString(4,exdate22);

												pstmt.setInt(5,total1);
            
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
    
       UpSt id=new UpSt();

    }

}





   