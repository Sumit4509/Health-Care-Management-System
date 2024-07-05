import javax.swing.*;

import java.sql.*;

import java.awt.*;

import java.awt.event.*;

import java.io.*;

public class DaEn extends JFrame implements ActionListener
{
	JLabel stop,sdown,Drug1,img,Drug2,Drug3,Drug4,Drug5,Drug6,Drug7,Drug8,Drug9,Drug10,opno3,date3;

	JLabel drugissued1,drugissued2,drugissued3,drugissued4,drugissued5,drugissued6,drugissued7,drugissued8,
		   drugissued9,drugissued10;

	JButton submit,back;

	JTextField topno,tdrug1,tdrug2,tdrug3,tdrug4,tdrug5,tdrug6,tdrug7,tdrug8,tdrug9,tdrug10,tdate;

	JTextField tdrugissued1,tdrugissued2,tdrugissued3,tdrugissued4,tdrugissued5,tdrugissued6,tdrugissued7,

		       tdrugissued8,tdrugissued9,tdrugissued10;

	
	String opno1,date1,drug1name,drug2name,drug3name,drug4name,drug5name,drug6name,drug7name,drug8name,drug9name,drug10name;

	int  issued1,issued2,issued3,issued4,issued5,issued6,issued7,issued8,issued9,issued10;

	public DaEn()
	{
		setLayout(null);

        setTitle("In-Patient Registration");

        setBounds(0,0,1020,725);

	   
	    stop=new JLabel("S.V.University Health Center,Tirupati");

	    stop.setFont(new Font("Arial Narrow",Font.BOLD,24));

	    stop.setForeground(new Color(255,51,255));

	    stop.setHorizontalAlignment(SwingConstants.CENTER);

        stop.setBounds(120,20,590,30);

	    getContentPane().add(stop);

          
        sdown=new JLabel("Pharmacy Entries");

	    sdown.setFont(new Font("Arial Narrow",Font.BOLD,18));

	    sdown.setForeground(new Color(0,0,153));

	    sdown.setHorizontalAlignment(SwingConstants.CENTER);

        sdown.setBounds(300,60,250,20);

	    getContentPane().add(sdown);

		 
		opno3=new JLabel("OpNo:");

		opno3.setFont(new Font("Arial Narrow",Font.BOLD,18));

		opno3.setForeground(new Color(0,0,153));

		opno3.setHorizontalAlignment(SwingConstants.CENTER);

		opno3.setBounds(60,85,180,40);

		getContentPane().add(opno3);


        date3=new JLabel("DATE:");

		date3.setFont(new Font("Arial Narrow",Font.BOLD,18));

		date3.setForeground(new Color(0,0,153));

		date3.setHorizontalAlignment(SwingConstants.CENTER);

		date3.setBounds(440,85,180,40);

		getContentPane().add(date3);

        
		Drug1=new JLabel("Drug1:");

		Drug1.setFont(new Font("Arial Narrow",Font.BOLD,18));

		Drug1.setForeground(new Color(0,0,153));

		Drug1.setHorizontalAlignment(SwingConstants.CENTER);

		Drug1.setBounds(60,135,180,40);

		getContentPane().add(Drug1);


        Drug2=new JLabel("Drug2:");

		Drug2.setFont(new Font("Arial Narrow",Font.BOLD,18));

		Drug2.setForeground(new Color(0,0,153));

		Drug2.setHorizontalAlignment(SwingConstants.CENTER);

		Drug2.setBounds(60,185,180,40);

		getContentPane().add(Drug2);


		Drug3=new JLabel("Drug3:");

		Drug3.setFont(new Font("Arial Narrow",Font.BOLD,18));

		Drug3.setForeground(new Color(0,0,153));

		Drug3.setHorizontalAlignment(SwingConstants.CENTER);

		Drug3.setBounds(60,235,180,40);

		getContentPane().add(Drug3);


		Drug4=new JLabel("Drug4:");

		Drug4.setFont(new Font("Arial Narrow",Font.BOLD,18));

		Drug4.setForeground(new Color(0,0,153));

		Drug4.setHorizontalAlignment(SwingConstants.CENTER);

		Drug4.setBounds(60,285,180,40);

		getContentPane().add(Drug4);


        Drug5=new JLabel("Drug5:");

		Drug5.setFont(new Font("Arial Narrow",Font.BOLD,18));

		Drug5.setForeground(new Color(0,0,153));

		Drug5.setHorizontalAlignment(SwingConstants.CENTER);

		Drug5.setBounds(60,335,180,40);

		getContentPane().add(Drug5);

	
		Drug6=new JLabel("Drug6:");

		Drug6.setFont(new Font("Arial Narrow",Font.BOLD,18));

		Drug6.setForeground(new Color(0,0,153));

		Drug6.setHorizontalAlignment(SwingConstants.CENTER);

		Drug6.setBounds(60,395,180,40);

		getContentPane().add(Drug6);

  
		Drug7=new JLabel("Drug7:");

		Drug7.setFont(new Font("Arial Narrow",Font.BOLD,18));

		Drug7.setForeground(new Color(0,0,153));

		Drug7.setHorizontalAlignment(SwingConstants.CENTER);

		Drug7.setBounds(60,445,180,40);

		getContentPane().add(Drug7);


		Drug8=new JLabel("Drug8:");

		Drug8.setFont(new Font("Arial Narrow",Font.BOLD,18));

		Drug8.setForeground(new Color(0,0,153));

		Drug8.setHorizontalAlignment(SwingConstants.CENTER);

		Drug8.setBounds(60,495,180,40);

		getContentPane().add(Drug8);


		Drug9=new JLabel("Drug9:");

		Drug9.setFont(new Font("Arial Narrow",Font.BOLD,18));

		Drug9.setForeground(new Color(0,0,153));

		Drug9.setHorizontalAlignment(SwingConstants.CENTER);

		Drug9.setBounds(60,545,180,40);

		getContentPane().add(Drug9);


		Drug10=new JLabel("Drug10:");

		Drug10.setFont(new Font("Arial Narrow",Font.BOLD,18));

		Drug10.setForeground(new Color(0,0,153));

		Drug10.setHorizontalAlignment(SwingConstants.CENTER);

		Drug10.setBounds(60,595,180,40);

		getContentPane().add(Drug10);


        drugissued1=new JLabel("No.Of Drugs1:" );

		drugissued1.setFont(new Font("Arial Narrow",Font.BOLD,18));

		drugissued1.setForeground(new Color(0,0,153));

		drugissued1.setHorizontalAlignment(SwingConstants.CENTER);

		drugissued1.setBounds(420,135,180,40);

		getContentPane().add(drugissued1);

		
		drugissued2=new JLabel("No.Of Drugs2:" );

		drugissued2.setFont(new Font("Arial Narrow",Font.BOLD,18));

		drugissued2.setForeground(new Color(0,0,153));

		drugissued2.setHorizontalAlignment(SwingConstants.CENTER);

		drugissued2.setBounds(420,185,180,40);

		getContentPane().add(drugissued2);


        drugissued3=new JLabel("No.Of Drugs3:" );

		drugissued3.setFont(new Font("Arial Narrow",Font.BOLD,18));

		drugissued3.setForeground(new Color(0,0,153));

		drugissued3.setHorizontalAlignment(SwingConstants.CENTER);

		drugissued3.setBounds(420,235,180,40);

		getContentPane().add(drugissued3);

       
	    drugissued4=new JLabel("No.Of Drugs4:" );

		drugissued4.setFont(new Font("Arial Narrow",Font.BOLD,18));

		drugissued4.setForeground(new Color(0,0,153));

		drugissued4.setHorizontalAlignment(SwingConstants.CENTER);

		drugissued4.setBounds(420,285,180,40);

		getContentPane().add(drugissued4);

           
		drugissued5=new JLabel("No.Of Drugs5:" );

		drugissued5.setFont(new Font("Arial Narrow",Font.BOLD,18));

		drugissued5.setForeground(new Color(0,0,153));

		drugissued5.setHorizontalAlignment(SwingConstants.CENTER);

		drugissued5.setBounds(420,335,180,40);

		getContentPane().add(drugissued5);


        drugissued6=new JLabel("No.Of Drugs6:" );

		drugissued6.setFont(new Font("Arial Narrow",Font.BOLD,18));

		drugissued6.setForeground(new Color(0,0,153));

		drugissued6.setHorizontalAlignment(SwingConstants.CENTER);

		drugissued6.setBounds(420,390,180,40);

		getContentPane().add(drugissued6);


		drugissued7=new JLabel("No.Of Drugs7:" );

		drugissued7.setFont(new Font("Arial Narrow",Font.BOLD,18));

		drugissued7.setForeground(new Color(0,0,153));

		drugissued7.setHorizontalAlignment(SwingConstants.CENTER);

		drugissued7.setBounds(420,440,180,40);

		getContentPane().add(drugissued7);

		
		drugissued8=new JLabel("No.Of Drugs8:" );

		drugissued8.setFont(new Font("Arial Narrow",Font.BOLD,18));

		drugissued8.setForeground(new Color(0,0,153));

		drugissued8.setHorizontalAlignment(SwingConstants.CENTER);

		drugissued8.setBounds(420,490,180,40);

		getContentPane().add(drugissued8);


		drugissued9=new JLabel("No.Of Drugs9:" );

		drugissued9.setFont(new Font("Arial Narrow",Font.BOLD,18));

		drugissued9.setForeground(new Color(0,0,153));

		drugissued9.setHorizontalAlignment(SwingConstants.CENTER);

		drugissued9.setBounds(420,540,180,40);

		getContentPane().add(drugissued9);

		
		drugissued10=new JLabel("No.Of Drugs10:" );

		drugissued10.setFont(new Font("Arial Narrow",Font.BOLD,18));

		drugissued10.setForeground(new Color(0,0,153));

		drugissued10.setHorizontalAlignment(SwingConstants.CENTER);

		drugissued10.setBounds(420,590,180,40);

		getContentPane().add(drugissued10);
/*	 	img=new JLabel(" ");



		img.setFont(new Font("Arial Narrow",Font.BOLD,18));

		img.setForeground(new Color(0,0,153));

        img.setIcon(new ImageIcon("E:\\SvHospital\\code\\NONAME.gif"));

		img.setHorizontalAlignment(SwingConstants.CENTER);

		img.setBounds(360,335,180,40);

		getContentPane().add(img);
*/
        
		topno=new JTextField("-");

		topno.setFont(new Font("Times New Roman",Font.BOLD,18));

		topno.setForeground(new Color(55,55,153));

		topno.setBounds (180,90,180,30);

        getContentPane().add(topno);


        tdate=new JTextField("-");

		tdate.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdate.setForeground(new Color(55,55,153));

		tdate.setBounds (580,90,180,30);

        getContentPane().add(tdate);


		tdrug1=new JTextField("-");

		tdrug1.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrug1.setForeground(new Color(55,55,153));

		tdrug1.setBounds (180,140,230,30);

        getContentPane().add(tdrug1);

	
		tdrug2=new JTextField("-");

		tdrug2.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrug2.setForeground(new Color(55,55,153));

		tdrug2.setBounds (180,190,230,30);

        getContentPane().add(tdrug2);


		tdrug3=new JTextField("-");

		tdrug3.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrug3.setForeground(new Color(55,55,153));

		tdrug3.setBounds (180,240,230,30);

        getContentPane().add(tdrug3);


		tdrug4=new JTextField("-");

		tdrug4.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrug4.setForeground(new Color(55,55,153));

		tdrug4.setBounds (180,290,230,30);

        getContentPane().add(tdrug4);

        
		tdrug5=new JTextField("-");

		tdrug5.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrug5.setForeground(new Color(55,55,153));

		tdrug5.setBounds (180,340,230,30);

        getContentPane().add(tdrug5);


		tdrug6=new JTextField("-");

		tdrug6.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrug6.setForeground(new Color(55,55,153));

		tdrug6.setBounds (180,400,230,30);

        getContentPane().add(tdrug6);


		tdrug7=new JTextField("-");

		tdrug7.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrug7.setForeground(new Color(55,55,153));

		tdrug7.setBounds (180,450,230,30);

        getContentPane().add(tdrug7);

		
		tdrug8=new JTextField("-");

		tdrug8.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrug8.setForeground(new Color(55,55,153));

		tdrug8.setBounds (180,500,230,30);

        getContentPane().add(tdrug8);


		tdrug9=new JTextField("-");

		tdrug9.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrug9.setForeground(new Color(55,55,153));

		tdrug9.setBounds (180,550,230,30);

        getContentPane().add(tdrug9);


		tdrug10=new JTextField("-");

		tdrug10.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrug10.setForeground(new Color(55,55,153));

		tdrug10.setBounds (180,600,230,30);

        getContentPane().add(tdrug10);


		tdrugissued1=new JTextField("0");

		tdrugissued1.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrugissued1.setForeground(new Color(55,55,153));

		tdrugissued1.setBounds (580,140,180,30);

        getContentPane().add(tdrugissued1);


        tdrugissued2=new JTextField("0");

		tdrugissued2.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrugissued2.setForeground(new Color(55,55,153));

		tdrugissued2.setBounds (580,190,180,30);

        getContentPane().add(tdrugissued2);


        tdrugissued3=new JTextField("0");

		tdrugissued3.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrugissued3.setForeground(new Color(55,55,153));

		tdrugissued3.setBounds (580,240,180,30);

        getContentPane().add(tdrugissued3);

      
	    tdrugissued4=new JTextField("0");

		tdrugissued4.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrugissued4.setForeground(new Color(55,55,153));

		tdrugissued4.setBounds (580,290,180,30);

        getContentPane().add(tdrugissued4);


		tdrugissued5=new JTextField("0");

		tdrugissued5.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrugissued5.setForeground(new Color(55,55,153));

		tdrugissued5.setBounds (580,340,180,30);

        getContentPane().add(tdrugissued5);



        tdrugissued6=new JTextField("0");

		tdrugissued6.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrugissued6.setForeground(new Color(55,55,153));

		tdrugissued6.setBounds (580,395,180,30);

        getContentPane().add(tdrugissued6);


		tdrugissued7=new JTextField("0");

		tdrugissued7.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrugissued7.setForeground(new Color(55,55,153));

		tdrugissued7.setBounds (580,445,180,30);

        getContentPane().add(tdrugissued7);


        tdrugissued8=new JTextField("0");

		tdrugissued8.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrugissued8.setForeground(new Color(55,55,153));

		tdrugissued8.setBounds (580,495,180,30);

        getContentPane().add(tdrugissued8);


		tdrugissued9=new JTextField("0");

		tdrugissued9.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrugissued9.setForeground(new Color(55,55,153));

		tdrugissued9.setBounds (580,545,180,30);

        getContentPane().add(tdrugissued9);


		tdrugissued10=new JTextField("0");

		tdrugissued10.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrugissued10.setForeground(new Color(55,55,153));

		tdrugissued10.setBounds (580,595,180,30);

        getContentPane().add(tdrugissued10);

            

	   submit=new JButton("Submit");

	   submit.setFont(new Font("Arial Narrow",Font.BOLD,22));
 
       submit.setBounds(300,645,160,40);

	   submit.setForeground(new Color(0,0,255));

       submit.setMnemonic(KeyEvent.VK_S);
  
       submit.addActionListener(this);

       submit.setToolTipText("Press to submit the detials");
   
       getContentPane().add(submit); 

     
	   
	   back=new JButton("Back");

       back.setFont(new Font("Arial Narrow",Font.BOLD,22));
 
       back.setBounds(480,645,160,40);

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
	  
	   if(ae.getActionCommand().equals("Back"))

     	{ 
			  dispose();
		}

		else
			if(ae.getActionCommand().equals("Submit"))

	   {   
            try

		   {

		    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			Connection con=DriverManager.getConnection("jdbc:odbc:Hsv"," ","paddu");
		
/*	    	String opno1,date1,drug1name,drug2name,drug3name,drug4name,drug5name,drug6name,drug7name,drug8name,drug9name,drug10name;

         	int  issued1,issued2,issued3,issued4,issued5,issued6,issued7,issued8,issued9,issued10;


			JTextField topno,tdrug1,tdrug2,tdrug3,tdrug4,tdrug5,tdrug6,tdrug7,tdrug8,tdrug9,tdrug10,tdate;

			JTextField tdrugissued1,tdrugissued2,tdrugissued3,tdrugissued4,tdrugissued5,tdrugissued6,tdrugissued7,

		       tdrugissued8,tdrugissued9,tdrugissued10;

																										*/

              opno1=topno.getText();

			  date1=tdate.getText();

			  drug1name=tdrug1.getText();

			  issued1=Integer.parseInt(tdrugissued1.getText());

			  drug2name=tdrug2.getText();

			  issued2=Integer.parseInt(tdrugissued2.getText());

			  drug3name=tdrug3.getText();

			  issued3=Integer.parseInt(tdrugissued3.getText());

			  drug4name=tdrug4.getText();

			  issued4=Integer.parseInt(tdrugissued4.getText());

			  drug5name=tdrug5.getText();

			  issued5=Integer.parseInt(tdrugissued5.getText());

			  drug6name=tdrug6.getText();

			  issued6=Integer.parseInt(tdrugissued6.getText());

			  drug7name=tdrug7.getText();

			  issued7=Integer.parseInt(tdrugissued7.getText());

			  drug8name=tdrug8.getText();

			  issued8=Integer.parseInt(tdrugissued8.getText());

              drug9name=tdrug9.getText();

			  issued9=Integer.parseInt(tdrugissued9.getText());

			  drug10name=tdrug10.getText();

			  issued10=Integer.parseInt(tdrugissued10.getText());

			  PreparedStatement pstm=con.prepareStatement("insert into PharDaily values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			                      
              // 				pstm.setString(1,Dname);
                               
                        
			//				pstm.setInt(2,istock);
        
                            pstm.setString(1,opno1);
							
							pstm.setString(2,date1);

                            pstm.setString(3,drug1name);

							pstm.setInt(4,issued1);

							pstm.setString(5,drug2name);

							pstm.setInt(6,issued2);

							pstm.setString(7,drug3name);

							pstm.setInt(8,issued3);

							pstm.setString(9,drug4name);

							pstm.setInt(10,issued4);

							pstm.setString(11,drug5name);

							pstm.setInt(12,issued5);

							pstm.setString(13,drug6name);

							pstm.setInt(14,issued6);

							pstm.setString(15,drug7name);

							pstm.setInt(16,issued7);

							pstm.setString(17,drug8name);

							pstm.setInt(18,issued8);

							pstm.setString(19,drug9name);

							pstm.setInt(20,issued9);

							pstm.setString(21,drug10name);

							pstm.setInt(22,issued10);


							pstm.executeUpdate();

							pstm.close();

							con.close();


		   }

		    catch(Exception  ex){ System.out.println(ex.getMessage());} 

	              
       }
	  
}

		public static void main(String args[])
		{
                 DaEn a=new DaEn();
		}
}