import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


 public  class DrugStore extends JFrame implements ActionListener

	
   {

	JLabel ds,ima;
 	
	JButton indg,updg,inou,tokn,back;

                 public DrugStore()

                    {
 
	   setLayout(null);

	   setTitle(" Drug Store");

	   setBounds(0,0,1020,725);

	//   setMinimumSize(new java.awt.Dimension(1020,720));

	   ds=new JLabel(" S.V.Universtiy Drug Store ");

	   ds.setFont(new Font("Arial Narrow",Font.BOLD,36));

	   ds.setForeground(new Color(153,0,153));

                     ds.setHorizontalAlignment(SwingConstants.CENTER);

                    ds.setBounds(220,40,660,50);

                    getContentPane().add(ds);

	
	   ima=new JLabel("  ");

	   ima.setFont(new Font("Arial Narrow",Font.BOLD,35));

	   ima.setIcon(new ImageIcon("E:\\svhospital\\code\\drugstore.jpg"));
 
                    ima.setHorizontalAlignment(SwingConstants.CENTER);

                    ima.setBounds(290,210,450,360);

                   getContentPane().add(ima);
         
           
                    indg=new JButton("Insert Durgs");

                    indg.setFont(new Font("Arial Narrow",Font.BOLD,25));
 
                    indg.setBounds(390,130,280,70);

	   indg.setForeground(new Color(0,0,255));

                    indg.setMnemonic(KeyEvent.VK_I);
  
                    indg.addActionListener(this);

                     indg.setToolTipText("Press To Enter The Drugs ");
   
                    getContentPane().add(indg);

	   
	  
                    updg=new JButton("Update  Drugs ");

                    updg.setFont(new Font("Arial Narrow",Font.BOLD,25));
 
                     updg.setForeground(new Color(0,0,255));

	   updg.setBounds(40,350,210,70);

                     updg.setMnemonic(KeyEvent.VK_U);
  
                    updg.addActionListener(this);

                    updg.setToolTipText("PRESS TO UPDATE THE DRUGS");
   
                   getContentPane().add(updg);

          
                     inou=new JButton("About Stock");
 
                       inou.setFont(new Font("Arial Narrow",Font.BOLD,25));

	   inou.setForeground(new Color(0,0,255));
 
                     inou.setBounds(770,360,210,70);

                      inou.setMnemonic(KeyEvent.VK_K);
  
                   inou.addActionListener(this);

                    inou.setToolTipText("PRESS TO KNOW ABOUT THE DRUGS STOCK");
   
                     getContentPane().add(inou);

	   
	   back=new JButton("BACK");

                    back.setFont(new Font("Arial Narrow",Font.BOLD,25));

	   back.setForeground(new Color(204,0,0));
 
 	   back.setBounds(410,580,250,70);

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

        	      else if(ae.getActionCommand().equals("Insert Durgs"))

	       		{
                                                           InDu i=new InDu();
		          
                                                    }

                else if(ae.getActionCommand().equals("Update  Drugs "))

       		{     
                                            UpSt s=new UpSt();
		          
                                   }
         else if(ae.getActionCommand().equals("About Stock"))

	 	      {
	
                                               AbSt a=new AbSt();

	                        }
              }





   public static void main(String args[])
  
    {
  
     DrugStore d=new DrugStore();

    }

}



