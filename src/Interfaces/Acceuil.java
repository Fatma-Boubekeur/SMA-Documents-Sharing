/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
//import java.util.ArrayList;
//import java.util.Collection;
import java.util.LinkedHashMap;
//import java.util.List;

import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import agentA.ContainerAgentA;
import agentA.ContainerAgentB;
import agentA.JTabbedPane_User_Interface;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;
import jade.wrapper.StaleProxyException;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.MainContainer;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;

import java.awt.Font;

import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author DELL LATITUDE 7280
 */
public class Acceuil extends javax.swing.JFrame {

    /**
     * Creates new form Acceuil
     */
    public Acceuil() {
    	setResizable(false);
    	getContentPane().setBackground(Color.WHITE);
    	//Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    	//this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    	//setLocationRelativeTo(null); 
        this.setTitle("Acceuil");
        initComponents();
        
    }

    // username et mot de passe 
    public static LinkedHashMap<String, String> usersA=new LinkedHashMap<>();
    public static LinkedHashMap<String, String> usersB=new LinkedHashMap<>();
    public static List<String> uA=new ArrayList<>();
    public static List<String> uB=new ArrayList<>();

        
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ButtonGroup Bg = new ButtonGroup();
        SMA = new javax.swing.JRadioButton();
        IA = new javax.swing.JRadioButton();
        Valider = new javax.swing.JButton();
        Valider.setBackground(new Color(255, 255, 255));
        password = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        login_username = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        login_password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        login.setBackground(new Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(65, 105, 225));

        jLabel1.setFont(new Font("Comic Sans MS", Font.BOLD, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenue sur DocShare");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(344, Short.MAX_VALUE)
        			.addComponent(jLabel1)
        			.addGap(334))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(jLabel1)
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setFont(new Font("Comic Sans MS", Font.BOLD, 34)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inscription");

        jLabel3.setFont(new Font("Comic Sans MS", Font.BOLD, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mot de passe :");

        jLabel4.setFont(new Font("Comic Sans MS", Font.BOLD, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nom :");

        username.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N

        jLabel5.setFont(new Font("Comic Sans MS", Font.BOLD, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Communauté :");

        
        SMA.setBackground(new Color(153, 204, 255));
        SMA.setFont(new Font("Comic Sans MS", Font.BOLD, 22)); // NOI18N
        SMA.setForeground(new java.awt.Color(255, 255, 255));
        SMA.setText("SMA");
        SMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMAActionPerformed(evt);
            }
        });

        IA.setBackground(new Color(153, 204, 255));
        IA.setFont(new Font("Comic Sans MS", Font.BOLD, 22)); // NOI18N
        IA.setForeground(new java.awt.Color(255, 255, 255));
        IA.setText("IA");
        IA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IAActionPerformed(evt);
            }
        });
         Bg.add(SMA);
         Bg.add(IA);

        Valider.setFont(new Font("Comic Sans MS", Font.BOLD, 22)); // NOI18N
        Valider.setText("S'inscrire");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(32)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel4)
        						.addComponent(jLabel3)
        						.addComponent(jLabel5))
        					.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(username, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGap(15)
        							.addComponent(IA)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(SMA)
        							.addGap(120))
        						.addComponent(password)
        						.addComponent(Valider, Alignment.LEADING)))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(179)
        					.addComponent(jLabel2)))
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel2)
        			.addGap(30)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel3)
        				.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(IA)
        				.addComponent(SMA))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(Valider)
        			.addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        jLabel6.setFont(new Font("Comic Sans MS", Font.BOLD, 34)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Authentification");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel7.setFont(new Font("Comic Sans MS", Font.BOLD, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nom :");

        login_username.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N

        jLabel8.setFont(new Font("Comic Sans MS", Font.BOLD, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mot de passe :");

        login_password.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N
        login_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_passwordActionPerformed(evt);
            }
        });

        login.setFont(new Font("Comic Sans MS", Font.BOLD, 22)); // NOI18N
        login.setText("Se Connecter");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(31)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel8)
        				.addComponent(jLabel7))
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(login)
        				.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
        					.addComponent(login_password, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        					.addComponent(login_username)))
        			.addContainerGap())
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap(138, Short.MAX_VALUE)
        			.addComponent(jLabel6)
        			.addGap(101))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addComponent(jLabel6)
        					.addGap(26)
        					.addComponent(login_username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jLabel7))
        			.addGap(18)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8)
        				.addComponent(login_password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(login)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3.setLayout(jPanel3Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(29)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(46)
        			.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addContainerGap())
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1236, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
        			.addGap(14)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(28)
        					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(58)
        					.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SMAActionPerformed

    private void IAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IAActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed
     
   
    public static ContainerAgentA agentAContainer;
    
    public static ContainerAgentB agentBContainer;
    JTabbedPane_User_Interface A;
    public static boolean first=false;
    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        if(first==false) {
    		MainContainer main=new MainContainer();
            first=true;
        }
        	String password=String.valueOf(this.password.getPassword());
        	
            String username=this.username.getText().toString();
           
            String communaute="";
            
            if(IA.isSelected()){
                communaute=IA.getText();
                System.out.println(communaute);
            }
            
            if(SMA.isSelected()){
                communaute=SMA.getText();
                System.out.println(communaute);
            }
            
            
            if (password.isEmpty()==true &&  username.isEmpty()==false) {
        		String st = "veuillez saisir le mot de passe ";
         		JOptionPane.showMessageDialog(null, st);
        	}else {
            if (username.isEmpty()==true &&  password.isEmpty()==false  ) {
        		String st = "veuillez saisir le nom d'utilisateur ";
         		JOptionPane.showMessageDialog(null, st);
        	}}
            if (SMA.isSelected()== false && IA.isSelected()==false && username.isEmpty()==true &&  password.isEmpty()==true ) {
            	String st = "veuillez remplir le formulaire ";
            	JOptionPane.showMessageDialog(null, st);
            }else {
            if (username.isEmpty()==true &&  password.isEmpty()==true  ) {
        		String st = "veuillez saisir le nom d'utilisateur et le mot de passe  ";
         		JOptionPane.showMessageDialog(null, st);
        	}
            if (SMA.isSelected()== false && IA.isSelected()==false) {
        		String st = "veuillez choisir une communauté  ";
         		JOptionPane.showMessageDialog(null, st);
        	}}
            
            
            
            
           		System.out.println(communaute);
            		String[] agentComunaute= {communaute};
            if (username.isEmpty()==false &&  password.isEmpty()==false) {
            if (communaute=="IA") {
                	if(agentAContainer==null) {
             		agentAContainer=new ContainerAgentA(username,agentComunaute);}
                	boolean si =agentAContainer.addAgent(username,agentComunaute);
                	System.out.println(si);
             		String st = "Création de l'agent "+username+"  effectuée avec succés :) ";
             		JOptionPane.showMessageDialog(null, st);
                  
             		usersA.put(username,password);
             		uA.add(username);
             		A= new JTabbedPane_User_Interface(username,"IA");
             		A.setVisible(true);
             		A.setA(username,"IA");
     				this.setVisible(false);
             		
             		
             		
            	}
            	
            if (communaute=="SMA") {
            	if(agentBContainer==null) {
         		agentBContainer=new ContainerAgentB(username,agentComunaute);}
            	boolean si =agentBContainer.addAgent(username,agentComunaute);
            	System.out.println(si);
         		String st = "Création de l'agent "+username+"  effectuée avec succés :) ";
         		JOptionPane.showMessageDialog(null, st);
              
         		usersB.put(username,password);
         		uB.add(username);
         		A= new JTabbedPane_User_Interface(username,"SMA");
         		A.setVisible(true);
         		A.setA(username,"SMA");
 				this.setVisible(false);
 				
 				
 				
 				
 				
        	}
            }
            
            
    }//GEN-LAST:event_ValiderActionPerformed

    private void login_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_passwordActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        String usernamelogin=this.login_username.getText();
        String passwordlogin=String.valueOf(this.login_password.getPassword());
        if (passwordlogin.isEmpty()==true &&  usernamelogin.isEmpty()==false) {
    		String st = "veuillez saisir le mot de passe ";
     		JOptionPane.showMessageDialog(null, st);
    	}else {
        if (usernamelogin.isEmpty()==true &&  passwordlogin.isEmpty()==false  ) {
    		String st = "veuillez saisir le nom d'utilisateur ";
     		JOptionPane.showMessageDialog(null, st);
    	}else {
    	if (usernamelogin.isEmpty()==true &&  passwordlogin.isEmpty()==true) {
    		String st = "veuillez remplir le formulaire ";
     		JOptionPane.showMessageDialog(null, st);
    	}else {
    	
        if((usersA.containsKey(usernamelogin) && usersA.containsValue(passwordlogin))||(usersB.containsKey(usernamelogin) && usersB.containsValue(passwordlogin))){  
     
     int index=0;
     try { 
        	 
     if(agentAContainer!=null) {
    	 String agentName="";
    	 System.out.println ("container 1 ---------------------------------------------------");
    	 for (AgentController ac : agentAContainer.getAgents()){
    		 System.out.println (ac.getName());
    		 
    		
    		 agentName="";
    		 index=0;
    		 while(ac.getName().charAt(index)!='@'   ) {
    	            agentName=agentName+ac.getName().charAt(index);
    	             
    	             System.out.println (agentName);
    	             index++;
    	 }
    		 if(agentName.equals(usernamelogin)) {
    			 A= new JTabbedPane_User_Interface(usernamelogin,"IA");
          		A.setVisible(true);
          		A.setA(usernamelogin,"IA");
 				this.setVisible(false);
 				break;
 		 }
    	   	
     }
     }  
     
            
             
     if(agentBContainer!=null) {
    	 String agentName="";
    	 System.out.println ("container 2 ---------------------------------------------------");
    	 for (AgentController ad : agentBContainer.getAgents()){
    		 System.out.println (ad.getName());
    		 
    		
    		 agentName="";
    		 index=0;
    		 while(ad.getName().charAt(index)!='@'   ) {
    	            agentName=agentName+ad.getName().charAt(index);
    	             
    	             System.out.println (agentName);
    	             index++;
    	 }
    		 if(agentName.equals(usernamelogin)) {
    			 A= new JTabbedPane_User_Interface(usernamelogin,"SMA");
          		A.setVisible(true);
          		A.setA(usernamelogin,"SMA");
 				this.setVisible(false);
 				break;
 		 }
    	   	
     }
     }  	
	
	} catch (StaleProxyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
        	
        	
        	
        }else {
        	 
         		String st = "cette utilisateur n'existe pas veuillez inscrir ! ";
          		JOptionPane.showMessageDialog(null, st);
        }
    	}
        }
    	}           
            
            
    // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuil().setVisible(true);
            }
        });
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton IA;
    private javax.swing.JRadioButton SMA;
    private javax.swing.JButton Valider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField login_password;
    private javax.swing.JTextField login_username;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
