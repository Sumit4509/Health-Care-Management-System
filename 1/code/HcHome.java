import javax.swing.*;

import java.awt.*;

import java.awt.event.*;


public class HcHome extends JFrame implements ActionListener

{
   
   JButton  aboutHc,mts,ultraSound,xRay,bioChemical,register,drugStore,lumberRoom,wards,other,exit;
   
   JLabel svcHc,homePage,image;

   public HcHome()
    
     {
     
        setLayout(null);
	
	setTitle("Home Page");
	
                    setBounds(0,0,1020, 729);
	 
                    //setMinimumSize(new java.awt.Dimension(1020, 720));

	svcHc=new JLabel("S.V.U.Campus Health Center");

	svcHc.setFont(new Font("Arial Narrow",Font.BOLD,45));

        svcHc.setHorizontalAlignment(SwingConstants.CENTER);

        svcHc.setBounds(120,20,780,70);

        getContentPane().add(svcHc);
 
	
	homePage=new JLabel("Home Page");

	homePage.setFont(new Font("Arial Narrow",Font.BOLD,35));

	homePage.setForeground(new Color(102,102,255));

                  homePage.setHorizontalAlignment(SwingConstants.CENTER);

                  homePage.setBounds(450,100,170,50);
 
                  getContentPane().add(homePage);


	image=new JLabel("Home Page");

	image.setFont(new Font("Arial Narrow",Font.BOLD,35));

	image.setForeground(new Color(102,102,255));

                  image.setHorizontalAlignment(SwingConstants.CENTER);

                  image.setIcon(new ImageIcon("E:\\SvHospital\\code\\title1.jpg"));

                  image.setBounds(250,170,770,500);
 
                  getContentPane().add(image);
 
 
       
                     aboutHc=new JButton("About HC");

                     aboutHc.setFont(new Font("Arial Narrow",Font.BOLD,22));

	 aboutHc.setForeground(new Color(255, 0, 0));
 
                   aboutHc.setBounds(20,190,170,40);

	 aboutHc.setMnemonic(KeyEvent.VK_A);

                   aboutHc.addActionListener(this);

    //  principal.addKeyListener(this);
 
                 aboutHc.setToolTipText("Press it to know About Our Health Center");

                   getContentPane().add(aboutHc);


                    mts=new JButton("Case Records");
 
                   mts.setFont(new Font("Arial Narrow",Font.BOLD,22));

                     mts.setForeground(new Color(255, 0, 0));
 
                     mts.setBounds(20,440,170,40);

                     mts.setMnemonic(KeyEvent.VK_C);

                    mts.addActionListener(this);
 
    //  principal.addKeyListener(this);
 
        mts.setToolTipText("Press it to know About Medical Treatment Services Provided at Hc ");

        getContentPane().add(mts);


/*        ultraSound=new JButton("Scanning");
 
        ultraSound.setFont(new Font("Arial Narrow",Font.BOLD,25));

	ultraSound.setForeground(new Color(255, 0, 0));
 
        ultraSound.setBounds(160,330,170,40);

        ultraSound.setMnemonic(KeyEvent.VK_U);

        ultraSound.addActionListener(this);

    //  principal.addKeyListener(this);
 
        ultraSound.setToolTipText("Press it to Enter into Scanning Dept. phase");

        getContentPane().add(ultraSound);  */
        
	
/*        xRay=new JButton("X-Ray");
 
        xRay.setFont(new Font("Arial Narrow",Font.BOLD,25));

	xRay.setForeground(new Color(255, 0, 0));
 
        xRay.setBounds(160,410,170,40);

        xRay.setMnemonic(KeyEvent.VK_X);

        xRay.addActionListener(this);

    //  principal.addKeyListener(this);
 
        xRay.setToolTipText("Press it to know About X-Ray  Services Provided at Hc ");

        getContentPane().add(xRay);         */
 
	        
	
  /*      bioChemical=new JButton("Bio Chemical");

        bioChemical.setFont(new Font("Arial Narrow",Font.BOLD,25));

	bioChemical.setForeground(new Color(255, 0, 0));
 
        bioChemical.setBounds(160,490,170,40);

        bioChemical.setMnemonic(KeyEvent.VK_B);

        bioChemical.addActionListener(this);

    //  principal.addKeyListener(this);
 
        bioChemical.setToolTipText("Press it to enter into BioChemical Lab services ");

        getContentPane().add(bioChemical);  */
 
       
	register=new JButton("Registration");

        register.setFont(new Font("Arial Narrow",Font.BOLD,22));

	register.setForeground(new Color(255, 0, 0));
 
        register.setBounds(20,280,170,40);

        register.setMnemonic(KeyEvent.VK_O);

        register.addActionListener(this);

    //  principal.addKeyListener(this);
 
        register.setToolTipText("Press it to know About register Details at Hc ");

        getContentPane().add(register);
           
        
	drugStore=new JButton("Drug Store");

        drugStore.setFont(new Font("Arial Narrow",Font.BOLD,22));

	drugStore.setForeground(new Color(255, 0, 0));
 
        drugStore.setBounds(20,360,170,40);

        drugStore.setMnemonic(KeyEvent.VK_S);

        drugStore.addActionListener(this);

    //  principal.addKeyListener(this);
 
        drugStore.setToolTipText("Press it to know About Drug Store at Hc ");

        getContentPane().add(drugStore);
           
/* 	
	lumberRoom=new JButton("Lumber Room");

        lumberRoom.setFont(new Font("Arial Narrow",Font.BOLD,25));

        lumberRoom.setForeground(new Color(255, 0, 0));
 
 	lumberRoom.setBounds(690,330,160,40);

        lumberRoom.setMnemonic(KeyEvent.VK_L);

        lumberRoom.addActionListener(this);

    //  principal.addKeyListener(this);
 
        lumberRoom.setToolTipText("Press it to know About  the Lumber Room services Provided at Hc ");

        getContentPane().add(lumberRoom);
 

	wards=new JButton("Wards");

        wards.setFont(new Font("Arial Narrow",Font.BOLD,25));

	wards.setForeground(new Color(255, 0, 0));
 
 	wards.setBounds(690,410,160,40);

        wards.setMnemonic(KeyEvent.VK_W);

        wards.addActionListener(this);

    //  principal.addKeyListener(this);
 
        wards.setToolTipText("Press it to know About ward information");

        getContentPane().add(wards)  ;
                                                                 */          
 
	other=new JButton("Daily Entries");

        other.setFont(new Font("Arial Narrow",Font.BOLD,22));

	other.setForeground(new Color(255, 0, 0));
 
 	other.setBounds(20,520,170,40);

        other.setMnemonic(KeyEvent.VK_D);

        other.addActionListener(this);

    //  principal.addKeyListener(this);
 
        other.setToolTipText("Press it to know About Pshycological Councelling Center ");

        getContentPane().add(other);
        
                                                                                       
	exit=new JButton("Exit");

        exit.setFont(new Font("Arial Narrow",Font.BOLD,22));

	exit.setForeground(new Color(255, 0, 0));
 
 	exit.setBounds(20,600,170,40);

        exit.setMnemonic(KeyEvent.VK_E);

        exit.addActionListener(this);

    //  principal.addKeyListener(this);
 
        exit.setToolTipText("Press it to Exit ");

        getContentPane().add(exit);
       
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

	      if(ae.getActionCommand().equals("Exit"))

	       {

 	        dispose();

	       }

	      else if(ae.getActionCommand().equals("About HC"))

	       {

	         SvHome  a=new SvHome();

	       }


	      else if(ae.getActionCommand().equals("Case Records"))

	       {

	                  Mts m=new Mts();

	        }

                         else if(ae.getActionCommand().equals("Registration"))

	       {
	
                               	 ReHo r=new ReHo();

	       }

                         else if(ae.getActionCommand().equals("Drug Store"))

	       {
	
	                DrugStore o=new DrugStore();

	       }


/*	      else if(ae.getActionCommand().equals("LumberRoom"))

	       {

//	         LumberRoom l=new LumberRoom();

 	      }                     */
/*	       else if(ae.getActionCommand().equals("Wards"))

	       {

//	         Wards w=new LumberRoom();

 	      }         */
		 else if(ae.getActionCommand().equals("Daily Entries"))

	       {

              
			DEntries d=new DEntries();

 	      }	
   }      

     public static  void main(String args[])

	{

		HcHome h=new HcHome();

        }
}
