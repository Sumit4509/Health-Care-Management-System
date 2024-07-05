import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
 
import java.sql.*;

import java.io.*;

public class InEmp extends JFrame implements ActionListener

{    

     String pname,pdate,pdiag,psex,pdesg;

     int page,popno;    
   
     JLabel head,shead,name,age,opno,date,sex,diag,desg;

     JTextField tname,tage,tdate,topno,tdesg;

     JTextArea dtext;

     JButton but1,but2,but3;
 
     JRadioButton rad1,rad2;

     ButtonGroup bgroup;

     public InEmp()
 
      {
 

        	 setLayout(null);

	 setTitle("Student Registration");

	//setMinimumSize(new Dimension(1030,730));

	  setBounds(0,0,1020,725);

	  head=new JLabel("S.V.University Health Center,Tirupati");

	  head.setFont(new Font("Arial Narrow",Font.BOLD,40));

	  head.setForeground(new Color(255,51,255));

	  head.setHorizontalAlignment(SwingConstants.CENTER);

	  head.setBounds(150,50,660,60);

	  getContentPane().add(head);

	  
	  shead=new JLabel("Out-Paitent Registration(Employee)");

	  shead.setFont(new Font("Arial Narrow",Font.BOLD,30));

	  shead.setForeground(new Color(51,51,255));

	  shead.setHorizontalAlignment(SwingConstants.CENTER);

	  shead.setBounds(230,120,480,50);

	  getContentPane().add(shead);

	
	  name=new JLabel("Name");

	  name.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  name.setForeground(new Color(204,0,51));

	  name.setHorizontalAlignment(SwingConstants.CENTER);

         	  name.setBounds(120,200,80,30);

	  getContentPane().add(name);



	  age=new JLabel("Age");

	  age.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  age.setForeground(new Color(204,0,51));

	  age.setHorizontalAlignment(SwingConstants.CENTER); 

         	 age.setBounds(500,200,40,30);

	  getContentPane().add(age);
	
	  
	  opno=new JLabel("O.P.No");

	  opno.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  opno.setForeground(new Color(204,0,51));

	  opno.setHorizontalAlignment(SwingConstants.CENTER);

         	 opno.setBounds(120,250,60,30);

	  getContentPane().add(opno);
  

	  date=new JLabel("Date");

	  date.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  date.setForeground(new Color(204,0,51));

	  date.setHorizontalAlignment(SwingConstants.LEADING);

	   date.setBounds(530,250,40,30);

	  getContentPane().add(date);

		
	  sex=new JLabel("Sex");

	  sex.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  sex.setForeground(new Color(204,0,51));

	  sex.setHorizontalAlignment(SwingConstants.CENTER);

        	  sex.setBounds(120,310,60,30);

	  getContentPane().add(sex);

         
       	   diag=new JLabel("Diagnosis");

	  diag.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  diag.setForeground(new Color(204,0,51));

	  diag.setHorizontalAlignment(SwingConstants.CENTER);

        	  diag.setBounds(110,370,80,30);

	  getContentPane().add(diag);

          
	  desg=new JLabel("Designation");

       
	  desg.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  desg.setForeground(new Color(204,0,51));

	  desg.setHorizontalAlignment(SwingConstants.CENTER);

        	  desg.setBounds(480,310,100,30);

	  getContentPane().add(desg);


        	  tname=new JTextField(30);

	  tname.setFont(new Font("Arial Narrow",Font.BOLD,12));

       	   tname.setBounds(200,200,240,30);

        	  getContentPane().add(tname);

          
        	  tdesg=new JTextField(30);

	  tdesg.setFont(new Font("Arial Narrow",Font.BOLD,12));

        	  tdesg.setBounds(590,310,250,30);

        	  getContentPane().add(tdesg);


	  tage=new JTextField(30);

	  tage.setFont(new Font("Arial Narrow",Font.BOLD,12));

        	  tage.setBounds(590,200,250,30);

         	 getContentPane().add(tage);

               
	  topno=new JTextField(30);

	  topno.setFont(new Font("Arial Narrow",Font.BOLD,12));

       	   topno.setBounds(200,250,240,30);

       	   getContentPane().add(topno);

	
	  tdate=new JTextField(30);

	  tdate.setFont(new Font("Arial Narrow",Font.BOLD,12));

         	 tdate.setBounds(590,250,250,30);

        	  getContentPane().add(tdate);

       	
                     dtext=new JTextArea(5,10);

                    JScrollPane jp=new JScrollPane(dtext,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

	 getContentPane().add(jp);

	  jp.setBounds(200,380,480,200);

          

          
	    but1=new JButton("Submit");

         	   but1.setFont(new Font("Arial Narrow",Font.BOLD,18));
 
                     but1.setBounds(780,520,100,40);

	   but1.setForeground(new Color(51,153,255));

                     but1.setMnemonic(KeyEvent.VK_S);
  
                    but1.addActionListener(this);

                    but1.setToolTipText("Press to submit the detials");
   
                   getContentPane().add(but1); 

                     
         	  but2=new JButton("Exit");

         	   but2.setFont(new Font("Arial Narrow",Font.BOLD,18));              // jLabel2.setForeground(new java.awt.Color(51, 51, 255));
 
         	  but2.setBounds(780,580,100,40);

	  but2.setForeground(new Color(51,153,255));

         	  but2.setMnemonic(KeyEvent.VK_X);
  
          	 but2.addActionListener(this);

         	 but2.setToolTipText("Press to Register Student as the In-Paitent ");
   
         	 getContentPane().add(but2); 
               
           
         	 but3=new JButton("Next");

         	 but3.setFont(new Font("Arial Narrow",Font.BOLD,18));              // jLabel2.setForeground(new java.awt.Color(51, 51, 255));
 
         	 but3.setBounds(780,640,100,40);

	  but3.setForeground(new Color(51,153,255));

          	but3.setMnemonic(KeyEvent.VK_N);
  
          	but3.addActionListener(this);

        	  but3.setToolTipText("Press to Ente progress of the In=patient ");
   
          	getContentPane().add(but3); 
                

	  rad1=new JRadioButton("Male");
	 
	  rad1.setBounds(200, 320, 85, 15);  
          
         	 getContentPane().add(rad1);
    

         	 rad2=new JRadioButton("Female");
	 
	  rad2.setBounds(330, 320, 85, 15);  
          
          	getContentPane().add(rad2);
    

        	  bgroup=new ButtonGroup();

       	   bgroup.add(rad1);

        	  bgroup.add(rad2);
        
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

                             					 Connection ms=DriverManager.getConnection("jdbc:odbc:Hsv"," ","paddu");

			  			    pname=tname.getText();

                           					   page=Integer.parseInt(tage.getText());

                             					 popno=Integer.parseInt(topno.getText());

                             					 pdate=tdate.getText();

                             					 psex= bgroup.getSelection().getActionCommand();

                             					 pdesg=tdesg.getText();                        

                             					pdiag=dtext.getText();
				
			      

			   		                 PreparedStatement psms=ms.prepareStatement("insert into regEmp  values(?,?,?,?,?,?,?)");
                    
			     			psms.setString(1,pname);

                            				                 psms.setInt(2,page);

			                                                     psms.setInt(3,popno);

			                                                     psms.setString(4,pdate);

                                                                                                           psms.setString(5,psex);

 			                                                     psms.setString(6,pdesg);

                                                                                                          psms.setString(7,pdiag);

			     		                 psms.executeUpdate();

			      			psms.close();

                           				  	 ms.close();
                              
                              
                           }
                  
                          catch(Exception ex){  System.out.println(ex.getMessage()); }
                       }

                      else if(ae.getActionCommand().equals("Next"))
                 
                        {
                         // DiRec d=new DiRec(); 
                        }           
           
}

  
  public static void main(String args[])
  
      {
 
          InEmp i=new InEmp();

       }
}                     
                        