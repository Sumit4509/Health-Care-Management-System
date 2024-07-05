import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
 
import java.sql.*;

import java.io.*;


public class DiRec extends JFrame implements ActionListener

{
      String pname,psex,poccu,pdoa,pdod,pdia,pda,ppc,pph,ppe,pi; 

      int page,popno;

      JLabel stop,sdown,name,age,opno,sex,diag,desg,doa,dod,drua,preCom,hpl,ph,pe,inve;

      JButton submit,Exit;

      JTextField tname,tage,tsex,tdesg,tdoa,topno,tdod;

      JTextArea  adia,ada,aprec,aph,ape,ai;

      JScrollPane jScrollPane1,jScrollPane2,jScrollPane3,jScrollPane4,jScrollPane5,jScrollPane6;

       public DiRec()
 
      {
 

          setLayout(null);

          setTitle("In-Patient Registration");

         //  setMinimumSize(new Dimension(1030,730));

	 setBounds(0,0,1020,725);

	  stop=new JLabel("S.V.University Health Center,Tirupati");

	  stop.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  stop.setForeground(new Color(255,51,255));

	  stop.setHorizontalAlignment(SwingConstants.CENTER);

          stop.setBounds(120,20,590,30);

	  getContentPane().add(stop);

          
          sdown=new JLabel("IN-PATIENT CASE RECORD");

	  sdown.setFont(new Font("Arial Narrow",Font.BOLD,18));

	  sdown.setForeground(new Color(0,0,153));

	  sdown.setHorizontalAlignment(SwingConstants.CENTER);

          sdown.setBounds(300,60,250,20);

	  getContentPane().add(sdown);


          name=new JLabel("Name");

	  name.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  name.setForeground(new Color(0,153,51));

	  name.setHorizontalAlignment(SwingConstants.CENTER);

          name.setBounds(30,100,50,20);

	  getContentPane().add(name);



	  age=new JLabel("Age");

	  age.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  age.setForeground(new Color(0,153,51));

	  age.setHorizontalAlignment(SwingConstants.CENTER); 

          age.setBounds(254,100,40,20);

	  getContentPane().add(age);
	
	  
	  opno=new JLabel("O.P.No");

	  opno.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  opno.setForeground(new Color(0,153,51));

	  opno.setHorizontalAlignment(SwingConstants.CENTER);

          opno.setBounds(30,140,50,30);

	  getContentPane().add(opno);
  

	 

		
	  sex=new JLabel("Sex:");

	  sex.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  sex.setForeground(new Color(0,153,51));

	  sex.setHorizontalAlignment(SwingConstants.CENTER);

          sex.setBounds(410,100,40,20);

	  getContentPane().add(sex);

         
          desg=new JLabel("Occupation:");

	  desg.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  desg.setForeground(new Color(0,153,51));

	  desg.setHorizontalAlignment(SwingConstants.CENTER);

          desg.setBounds(630,100,80,20);

	  getContentPane().add(desg);


          doa=new JLabel("Date of Admission:");

	  doa.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  doa.setForeground(new Color(0,153,51));

	  doa.setHorizontalAlignment(SwingConstants.LEADING);

          doa.setBounds(240,140,110,20);

	  getContentPane().add(doa);

		
	  dod=new JLabel("Date Of DisCharge:");

	  dod.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  dod.setForeground(new Color(0,153,51));

	  dod.setHorizontalAlignment(SwingConstants.CENTER);

          dod.setBounds(580,140,130,20);

	  getContentPane().add(dod);

         
          diag=new JLabel("Diagnosis:");

	  diag.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  diag.setForeground(new Color(0,153,51));

	  diag.setHorizontalAlignment(SwingConstants.CENTER);

          diag.setBounds(30,180,60,20);

	  getContentPane().add(diag);

         
          drua=new JLabel("Drugs Allergy:");  

	  drua.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  drua.setForeground(new Color(0,153,51));

	  drua.setHorizontalAlignment(SwingConstants.CENTER);

          drua.setBounds(10,240,80,20);

	  getContentPane().add(drua);

         
          preCom=new JLabel("Present Compliant:");

	  preCom.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  preCom.setForeground(new Color(0,153,51));

	  preCom.setHorizontalAlignment(SwingConstants.CENTER);

          preCom.setBounds(10,310,110,20);

	  getContentPane().add(preCom);


         
		
	  ph=new JLabel("Past History:");                          

	  ph.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  ph.setForeground(new Color(0,153,51));

	  ph.setHorizontalAlignment(SwingConstants.CENTER);

          ph.setBounds(10,400,110,20);

	  getContentPane().add(ph);

         
          pe=new JLabel("Phyiscal Examination:");

	  pe.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  pe.setForeground(new Color(0,153,51));

	  pe.setHorizontalAlignment(SwingConstants.CENTER);

          pe.setBounds(10,510,120,30);

	  getContentPane().add(pe);


          inve=new JLabel("Investigation:");

	  inve.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  inve.setForeground(new Color(0,153,51));

	  inve.setHorizontalAlignment(SwingConstants.CENTER);

          inve.setBounds(10,610,110,20);

	  getContentPane().add(inve);

    
          tname=new JTextField(30);

	  tname.setFont(new Font("Arial Narrow",Font.BOLD,12));

          tname.setBounds(90,100,140,20);

          getContentPane().add(tname);

          
         


	  tage=new JTextField(30);

	  tage.setFont(new Font("Arial Narrow",Font.BOLD,12));

          tage.setBounds(290,100,110,20);

          getContentPane().add(tage);

          
          tsex=new JTextField(30);

	  tsex.setFont(new Font("Arial Narrow",Font.BOLD,12));

          tsex.setBounds(460,100,140,20);

          getContentPane().add(tsex);
               

	  topno=new JTextField(30);

	  topno.setFont(new Font("Arial Narrow",Font.BOLD,12));

          topno.setBounds(90,140,140,20);

          getContentPane().add(topno);



	  tdesg=new JTextField(30);

	  tdesg.setFont(new Font("Arial Narrow",Font.BOLD,12));

          tdesg.setBounds(720,100,150,20);

          getContentPane().add(tdesg);


	
	  tdoa=new JTextField(30);

	  tdoa.setFont(new Font("Arial Narrow",Font.BOLD,12));

          tdoa.setBounds(360,140,210,20);

          getContentPane().add(tdoa);

          

	  tdod=new JTextField(30);

	  tdod.setFont(new Font("Arial Narrow",Font.BOLD,12));

          tdod.setBounds(720,140,150,20);

          getContentPane().add(tdod);



	  adia=new JTextArea(5,10);

	  adia.setBounds(100, 180, 650, 50);

	  getContentPane().add(adia);

	
	  ada=new JTextArea(5,10);

	  ada.setBounds(100, 250, 650, 50);

          getContentPane().add(ada);

                                        
           
          aprec=new JTextArea(5,10);

	  aprec.setBounds(100, 330, 650, 60);

	  getContentPane().add(aprec);


          aph=new JTextArea(5,10);

	  aph.setBounds(100, 430, 650, 60);

          getContentPane().add(aph);
          

          ape=new JTextArea(5,10);

	  
	  ape.setBounds(100, 540, 650, 60);

          getContentPane().add(ape);

    
           ai=new JTextArea(5,10);

       	   ai.setBounds(100,650,650,60);

           getContentPane().add(ai);
         
           submit=new JButton("Submit");

          submit.setFont(new Font("Arial Narrow",Font.BOLD,18));
 
          submit.setBounds(780,520,100,40);

	  submit.setForeground(new Color(51,153,255));

          submit.setMnemonic(KeyEvent.VK_S);
  
          submit.addActionListener(this);

          submit.setToolTipText("Press to submit the detials");
   
          getContentPane().add(submit); 

                    
          Exit=new JButton("Exit");

          Exit.setFont(new Font("Arial Narrow",Font.BOLD,18));              // jLabel2.setForeground(new java.awt.Color(51, 51, 255));
 
          Exit.setBounds(780,580,100,40);

	  Exit.setForeground(new Color(51,153,255));

          Exit.setMnemonic(KeyEvent.VK_X);
  
          Exit.addActionListener(this);

          Exit.setToolTipText("Press to Register Student as the In-Paitent ");
   
          getContentPane().add(Exit); 

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

           if(ae.getActionCommand().equals("Submit"))
            {

	      try
           
	       {
          
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	
		Connection ms=DriverManager.getConnection("jdbc:odbc:Hsv"," ","paddu");

                pname=tname.getText();

		page=Integer.parseInt(tage.getText());

		psex=tsex.getText();

		poccu=tdesg.getText();

		popno=Integer.parseInt(topno.getText());

		pdoa=tdoa.getText();

		pdod=tdod.getText();

		pdia=adia.getText();

		pda=ada.getText();

		ppc=aprec.getText();

		pph=aph.getText();

		ppe=ape.getText();

		pi=ai.getText();

		PreparedStatement psms=ms.prepareStatement("insert into InPaCaseRec values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

		psms.setString(1,pname);

		psms.setInt(2,page);

		psms.setString(3,psex);

		psms.setString(4,poccu);

		psms.setInt(5,popno);

		psms.setString(6,pdoa);

		psms.setString(7,pdod);

		psms.setString(8,pdia);

		psms.setString(9,pda);

		psms.setString(10,ppc);

		psms.setString(11,pph);

		psms.setString(12,ppe);

		psms.setString(13,pi);

                psms.executeUpdate();

		psms.close();
		

	     }
              catch(Exception ex){ System.out.println(ex.getMessage());}

            }
              else if(ae.getActionCommand().equals("Exit"))
               {
                 dispose();

               }
        }  

 public static void main(String args[])

      {
  

           DiRec d=new DiRec();
  
     }  
}                                          