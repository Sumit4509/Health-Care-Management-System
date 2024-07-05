import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


 public  class DEntries extends JFrame implements ActionListener

	
   {

	JLabel mts,ima;
 	
	JButton sinReg,ouReg,einReg,back;

        public DEntries()

         {
 
	   setLayout(null);

	   setTitle("Daily Entries");

//           setMinimumSize(new java.awt.Dimension(1020,720));

             setBounds(0,0,1020,728);

	   mts=new JLabel(" Daily Entries of Pharmacy & Nurses");

	   mts.setFont(new Font("Arial Narrow",Font.BOLD,36));

	   mts.setForeground(new Color(255,51,255));

                     mts.setHorizontalAlignment(SwingConstants.CENTER);

                    mts.setBounds(10,20,580,110);

                    getContentPane().add(mts);

	
	   ima=new JLabel("  ");

	   ima.setFont(new Font("Arial Narrow",Font.BOLD,35));

	   ima.setIcon(new ImageIcon("E:\\svhospital\\code\\Regist.jpg"));

       ima.setHorizontalAlignment(SwingConstants.CENTER);
     
       ima.setBounds(500,50,560,530);

       getContentPane().add(ima);
         
           
       sinReg=new JButton("Drugs Entries");

       sinReg.setFont(new Font("Arial Narrow",Font.BOLD,25));
  
       sinReg.setBounds(100,160,260,90);

       sinReg.setForeground(new Color(51,153,255));

       sinReg.setBackground(new Color(204,255,204));

	   sinReg.setMnemonic(KeyEvent.VK_D);
  
  	   sinReg.addActionListener(this);

	   sinReg.setToolTipText("Press to Enter Pharmacy House Drug Entries ");
   
   	   getContentPane().add(sinReg);

	   
	  
	  einReg=new JButton("Pharmacy Entries");

	  einReg.setFont(new Font("Arial Narrow",Font.BOLD,25));
 
	  einReg.setForeground(new Color(51,153,255));

      einReg.setBackground(new Color(204,255,204));

      einReg.setBounds(100,360,260,90);

      einReg.setMnemonic(KeyEvent.VK_P);
  
      einReg.addActionListener(this);
 
      einReg.setToolTipText("Press to Enter the Daily in the Pharmacy House");
   
      getContentPane().add(einReg);
          
	
	/*  ouReg=new JButton("Nurse Entries");

	  ouReg.setFont(new Font("Arial Narrow",Font.BOLD,25));

	  ouReg.setForeground(new Color(51,153,255));

      ouReg.setBackground(new Color(236,233,216));
 
      ouReg.setBounds(100,430,260,40);

      ouReg.setMnemonic(KeyEvent.VK_N);
  
  	  ouReg.addActionListener(this);

	  ouReg.setToolTipText("Press to Enter the Daily Entries of the Nurses");
   
      getContentPane().add(ouReg);

	                                         */
	   back=new JButton("BACK");

       back.setFont(new Font("Arial Narrow",Font.BOLD,25));

	   back.setForeground(new Color(0,0,0));

       back.setBackground(new Color(255,153,153));	   

  	   back.setBounds(430,580,120,40);

       back.setMnemonic(KeyEvent.VK_B);

       back.addActionListener(this);

       back.setToolTipText("Press for returning to Home Page");

       getContentPane().add(back);
       
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
 
	          if(ae.getActionCommand().equals("BACK"))

        	       {
    
                	        dispose();

         	       }

        	      else if(ae.getActionCommand().equals("Drugs Entries"))

	       		{
                       
		          PharDrugs p=new PharDrugs();
                 }


   		      else if(ae.getActionCommand().equals("Pharmacy Entries"))

		       {
                     DaEn a=new DaEn();
                           
	            }

/*		      else if(ae.getActionCommand().equals("Nurse Entries"))

	 	      {
	
                           

	              }                      */
              }





   public static void main(String args[])
  
    {
  
     DEntries m=new DEntries();

    }

}



