import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
 
import java.sql.*;

import java.io.*;

public class Register extends JFrame implements ActionListener

{


    JLabel head,shead,name,age,opno,sex,occu,addr,fm;

    JTextField topno,tname,toccu,tage,tsex;

    JTextArea  dadd,dfm;

    JScrollPane pdadd,pdfm;

    JButton submit,reset;

    

   String sname,soccu,sage,ssex,sadd,sfm,popno;


                public Register()
            
                  {   
                    setLayout(null);

                   setTitle("Registration of Patient");

           //      setMinimumSize(new Dimension(1030,730));

                   setBounds(0,0,1020,725);

	  head=new JLabel("S.V.University Health Center,Tirupati");

	  head.setFont(new Font("Arial Narrow",Font.BOLD,30));

	  head.setForeground(new Color(255,51,255));

	  head.setHorizontalAlignment(SwingConstants.CENTER);

                    head.setBounds(210,0,570,60);

	  getContentPane().add(head);

	  
	  shead=new JLabel("Registration Record");

	  shead.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  shead.setForeground(new Color(51,51,255));

	  shead.setHorizontalAlignment(SwingConstants.CENTER);

                    shead.setBounds(370,40,250,30);

	  getContentPane().add(shead);

	  opno=new JLabel("O.P.No");

	  opno.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  opno.setForeground(new Color(204,0,51));

	  opno.setHorizontalAlignment(SwingConstants.CENTER);

                      opno.setBounds(230,80,70,30);

	  getContentPane().add(opno);

	  name=new JLabel("Name");

	  name.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  name.setForeground(new Color(204,0,51));

	  name.setHorizontalAlignment(SwingConstants.CENTER);

                    name.setBounds(240,130,60,30);

	  getContentPane().add(name);



	  age=new JLabel("Age:");

	  age.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  age.setForeground(new Color(204,0,51));

	  age.setHorizontalAlignment(SwingConstants.CENTER);

                    age.setBounds(250,240,40,30);

	  getContentPane().add(age);
	
	  
	
  

	  occu=new JLabel("Dept:");

	  occu.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  occu.setForeground(new Color(204,0,51));

	  occu.setHorizontalAlignment(SwingConstants.CENTER);

                   occu.setBounds(240,180,60,30);

	  getContentPane().add(occu);

		
	  sex=new JLabel("Sex");

	  sex.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  sex.setForeground(new Color(204,0,51));

	  sex.setHorizontalAlignment(SwingConstants.CENTER);

                    sex.setBounds(250,300,50,30);

	  getContentPane().add(sex);

         
                    addr=new JLabel("Address:");

	 addr.setFont(new Font("Arial Narrow",Font.BOLD,16));

	 addr.setForeground(new Color(204,0,51));

	 addr.setHorizontalAlignment(SwingConstants.CENTER);

                     addr.setBounds(210,350,100,30);

	  getContentPane().add(addr);

	 

	    fm=new JLabel("Family Members:");

	    fm.setFont(new Font("Arial Narrow",Font.BOLD,16));

	   fm.setForeground(new Color(204,0,51));

	   fm.setHorizontalAlignment(SwingConstants.TRAILING);

                     fm.setBounds(125,460,160,30);

	  getContentPane().add(fm);


	   tname=new JTextField(30);

	  tname.setFont(new Font("Arial Narrow",Font.BOLD,12));

                     tname.setBounds(310,130,310,30);

        	  getContentPane().add(tname);


	  tage=new JTextField(30);

	  tage.setFont(new Font("Arial Narrow",Font.BOLD,12));

                    tage.setBounds(310,240,310,30);

       	   getContentPane().add(tage);

               
	  topno=new JTextField(30);

	  topno.setFont(new Font("Arial Narrow",Font.BOLD,12));

         	 topno.setBounds(310,80,100,30);

        	  getContentPane().add(topno);


                   toccu=new JTextField(30);

	 toccu.setFont(new Font("Arial Narrow",Font.BOLD,12));

         	toccu.setBounds(310,180,310,30);

        	  getContentPane().add(toccu);


	
	  tsex=new JTextField(30);

	  tsex.setFont(new Font("Arial Narrow",Font.BOLD,12));

        	 tsex.setBounds(310,300,310,30);

          	getContentPane().add(tsex);


                  dadd=new JTextArea();

                   dadd.setColumns(8);

                  dadd.setRows(5);

	JScrollPane pdadd =new JScrollPane(dadd);

                // 	pdadd.setViewportView(dadd);

	// pdadd.setBounds(310,380,330,80);
            
                    dadd.setBounds(310,380,330,80);            

                 getContentPane().add(pdadd);

                 getContentPane().add(dadd);
	
              

	
                  dfm=new JTextArea(5,8);

	 dfm.setBounds(310,500,330,80);

           //	pdadd.setViewportView(dfm);

                 JScrollPane pdfm=new JScrollPane(dfm);

                 getContentPane().add(pdfm);

                 getContentPane().add(dfm);

          
          	
          
         	 submit=new JButton("Submit");

         	 submit.setFont(new Font("Arial Narrow",Font.BOLD,18));
 
        	 submit.setBounds(450,80,110,30);

//	  but1.setForeground(new Color(51,153,255));

	 submit.setMnemonic(KeyEvent.VK_S);
  
                    submit.addActionListener(this);

                   submit.setToolTipText("Press to submit the detials");
   
                     getContentPane().add(submit); 

                    
                   reset=new JButton("Exit");

                   reset.setFont(new Font("Arial Narrow",Font.BOLD,18));              // jLabel2.setForeground(new java.awt.Color(51, 51, 255));
 
                   reset.setBounds(400,630,120,40);

//	  but2.setForeground(new Color(51,153,255));

                   reset.setMnemonic(KeyEvent.VK_X);
  
                    reset.addActionListener(this);

                    reset.setToolTipText("Press to Register Student as the In-Paitent ");
   
                    getContentPane().add(reset); 

                     setVisible(true);


	  addWindowListener(new WindowAdapter() {
                 
                                        public void windowClosing(WindowEvent we)
 
                                               {

				dispose();

                                                 }

		  });

                    }
   
                              public void actionPerformed(ActionEvent ae)
 
		       {
   
		           if(ae.getActionCommand().equals("Exit"))

		              {
                     
                     		  dispose();

		              }

			   else if(ae.getActionCommand().equals("Submit"))

                			   {
	                      
                   	                       try
		
			       {
                            			 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		                                     Connection ms=DriverManager.getConnection("jdbc:odbc:Hsv"," ", "paddu");

                            			    popno=topno.getText();

                                                                 	      PreparedStatement pstmt=ms.prepareStatement("Select * from Registration where OPNO=? ");
                    
	                                                            pstmt.setString(1,popno); 
                                                                            
                                                                              ResultSet rs=pstmt.executeQuery();                           
                                                                          
                                                                           
                                                                         if(rs.next())

                                                                           {
                                                                                 
                                                                                tname.setText(rs.getString(2));

				        toccu.setText(rs.getString(3));

				        tage.setText(rs.getString(4));

				         tsex.setText(rs.getString(5));

				        
                                                                                dadd.setText(rs.getString(6));

				      dfm.setText(rs.getString(7));           

                                                                       }

  

			      
			      pstmt.close();

                              ms.close();
                              
                              
                           }
                  
                          catch(Exception ex){  System.out.println(ex.getMessage()); }

       }
}

    public static void main(String args[])
  
             {

                         Register r=new Register();

            }

}