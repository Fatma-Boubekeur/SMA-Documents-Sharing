/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentA;

import Interfaces.Acceuil;
import jade.gui.GuiEvent;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.ScrollPaneConstants;
import javax.swing.JFrame;

/**
 *
 * @author DELL LATITUDE 7280
 */
public class JTabbedPane_User_Interface extends javax.swing.JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static agentA A;
	//private agentB B=new agentB();
	String a;
	String c;
	List<String> docs=new ArrayList<>();
	public void setA(String a,String c) {
		this.a = a;
		this.c=c;
	}

	JFileChooser fc;
	JTextArea log;
    
    
	public JTabbedPane_User_Interface() {
		setResizable(false);
		setAlwaysOnTop(true);
		setBackground(new Color(102, 153, 255));
		getContentPane().setBackground(Color.WHITE);
		initComponents();
	}
	
    public agentA getA() {
		return A;
	}

	public void setA(agentA a) {
		A = a;
	}


	public JTabbedPane_User_Interface(String a,String c) {
		this.a=a;
		this.c=c;
		getContentPane().setBackground(new Color(255, 255, 255));
        initComponents();
        JTabbedPane_User_Interface.contacts.setText("");
        if(c.equals("IA")) {
        	
			for(int i=0;i<Acceuil.uA.size();i++) {
				if(!a.equals(Acceuil.uA.get(i))) {
					System.out.println(Acceuil.usersA.get(i)+"\n");
				contacts.append(Acceuil.uA.get(i)+"\n");}			
			}
			
		} 
        
         if(c.equals("SMA")) {
        	
			for(int i=0;i<Acceuil.uB.size();i++) {
				if(!a.equals(Acceuil.uB.get(i))) {
					System.out.println(Acceuil.usersB.get(i)+"\n");
				contacts.append(Acceuil.uB.get(i)+"\n");}
				
			}
			
		}
        
	}
       
     public static String descc;
     public static File doc;
     public static Map<String,Object> recep=new HashMap<>();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane2.setBorder(new CompoundBorder());
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        contacts = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        lblDocument = new javax.swing.JLabel();
        btnParcourir = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        desc = new javax.swing.JTextField();
        btnEnvoyer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texArea = new javax.swing.JTextArea();
        texArea.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        jLabel3 = new javax.swing.JLabel();
        Retour = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBorder(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon image;
        image=new ImageIcon(getClass().getResource("images.png"));
        ImageIcon image2;
        image2=new ImageIcon(getClass().getResource("images22.png")); 

        jPanel1.setBackground(new Color(240, 248, 255));

        contacts.setColumns(10);
        contacts.setFont(new Font("Comic Sans MS", Font.BOLD, 15)); // NOI18N
        contacts.setRows(5);
        jScrollPane2.setViewportView(contacts);

        jLabel1.setFont(new Font("Comic Sans MS", Font.BOLD, 22)); // NOI18N
        jLabel1.setText("Contacts");

        lblDocument.setFont(new Font("Comic Sans MS", Font.BOLD, 22)); // NOI18N
        lblDocument.setText("Document : ");

        fc = new JFileChooser();
        btnParcourir.setFont(new Font("Comic Sans MS", Font.BOLD, 22)); // NOI18N
        btnParcourir.setText("Parcourir");
        btnParcourir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            	File file = null ;
           	 int returnVal = fc.showOpenDialog(JTabbedPane_User_Interface.this);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    file = fc.getSelectedFile();
                    doc=file;
                    jTextField1.setText(file.getName());
                    docs.add(file.getName());
                    
                } else {
                   // log.append("Open command cancelled by user." + newline);
                }
                if(file!=null){
                //A.sendFile(file,a);
                //A.receiveFile();
                }
                }
        });

        jTextField1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        lblDescription.setFont(new Font("Comic Sans MS", Font.BOLD, 22)); // NOI18N
        lblDescription.setText("Description: ");

        desc.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descActionPerformed(evt);
            }
        });

        
        texArea.setColumns(20);
        texArea.setRows(5);
        jScrollPane1.setViewportView(texArea);

        
        btnEnvoyer.setFont(new Font("Comic Sans MS", Font.BOLD, 22)); // NOI18N
        btnEnvoyer.setText("Envoier");
        btnEnvoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	List<String> l=null;
            	descc=desc.getText();
            	
             if(c.equals("IA")) {
        			
        			for(int i=0;i<Acceuil.uA.size();i++) {
        				if(!a.equals(Acceuil.uA.get(i))) {
        					 
        					 System.out.println("one is here");
        	                 // hna bach yb3at les parametre a onGuiEvent**************************************
        	                 Map<String,Object> params=new HashMap<>();
        	                 GuiEvent gev=new GuiEvent(this,1);
        	                 // hada a le nom ta3 l user ****************************************************
        	                 params.put("sender", a);
        	                 params.put("file", doc);
        	                 params.put("receiver",Acceuil.uA.get(i));
        	                 if(recep!=null && recep.containsKey(Acceuil.uA.get(i))){
        	                	 l=(List<String>) recep.get(Acceuil.uA.get(i)); System.out.println(l.get(0)+" 1");}
        	                 else
        	                	 l=new ArrayList<>();
        	                 l.add(doc.getName()+"   desc :"+descc+"  sender :"+a+"  path: C:/JADE_test/"+Acceuil.uA.get(i)+"_"+doc.getName());
        	                 System.out.println(l.get(0)+" 2");
        	                 recep.put(Acceuil.uA.get(i),l);
        	                 //on peut ajouter le nom de receiver li nkhyrouh mel contact ********************************
        	                 gev.addParameter(params);
        	                 A.onGuiEvent(gev);
        				
        				}
        				
        			}
        			
        		}
        		
        		
        		
        		
               if(c.equals("SMA")) {
                	
        			for(int i=0;i<Acceuil.uB.size();i++) {
        				if(!a.equals(Acceuil.uB.get(i))) {
        					 System.out.println("one is here");
        	                 // hna bach yb3at les parametre a onGuiEvent**************************************
        	                 Map<String,Object> params=new HashMap<>();
        	                 GuiEvent gev=new GuiEvent(this,1);
        	                 // hada a le nom ta3 l user ****************************************************
        	                 params.put("sender", a);
        	                 params.put("file", doc);
        	                 params.put("receiver", Acceuil.uB.get(i));
        	                 //on peut ajouter le nom de receiver li nkhyrouh mel contact ********************************
        	                 gev.addParameter(params);
        	                 A.onGuiEvent(gev);
        				
        				}
        				
        			}
        			
        		}
               
               
   			   texArea.append(doc.getName()+"  desc : "+descc+"\n");     	
            }
        });

       
        jLabel3.setFont(new Font("Comic Sans MS", Font.BOLD, 22)); // NOI18N
        jLabel3.setText("Documents envoy\u00E9 ");

        Retour.setFont(new Font("Comic Sans MS", Font.BOLD, 22)); // NOI18N
        Retour.setText("Déconnexion");
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });
        jPanel4 = new javax.swing.JPanel();
        
                jPanel4.setBackground(new java.awt.Color(255, 255, 255));
                
                        jTabbedPane2.addTab("Accueil", jPanel4);
                        jTabbedPane2.setEnabledAt(0, true);
                        
                        JButton button_1 = new JButton();
                        button_1.setText("D\u00E9connexion");
                        button_1.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
                        button_1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                RetourActionPerformed(evt);
                            }
                        });
                        
                        panel_1 = new JPanel();
                        panel_1.setBackground(new Color(65, 105, 225));
                        
                        lblDansVotreEspace = new JLabel("Bienvenue "+a+" dans votre espace");
                        lblDansVotreEspace.setHorizontalAlignment(SwingConstants.CENTER);
                        lblDansVotreEspace.setForeground(Color.WHITE);
                        lblDansVotreEspace.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
                        panel_1.add(lblDansVotreEspace);
                        icon = new JLabel(image);
                        JLabel icon2 = new JLabel(image2);
                        
                        txtrBienvenueDansLespace = new JTextArea();
                        txtrBienvenueDansLespace.setLineWrap(true);
                        txtrBienvenueDansLespace.setForeground(new Color(0, 0, 0));
                        txtrBienvenueDansLespace.setEditable(false);
                        txtrBienvenueDansLespace.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
                        txtrBienvenueDansLespace.setText("Bienvenue dans l'espace docsShare \r\ncette application vous permet de communiquer avec des personnes \r\nayant le m\u00EAme centre d'int\u00E9r\u00EAt que vous en partageant des documents");
                        GroupLayout gl_jPanel4 = new GroupLayout(jPanel4);
                        gl_jPanel4.setHorizontalGroup(
                        	gl_jPanel4.createParallelGroup(Alignment.LEADING)
                        		.addGroup(gl_jPanel4.createSequentialGroup()
                        			.addGap(48)
                        			.addComponent(icon2)
                        			.addPreferredGap(ComponentPlacement.RELATED)
                        			.addComponent(txtrBienvenueDansLespace, GroupLayout.PREFERRED_SIZE, 787, GroupLayout.PREFERRED_SIZE)
                        			.addPreferredGap(ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        			.addGroup(gl_jPanel4.createParallelGroup(Alignment.TRAILING)
                        				.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
                        				.addComponent(icon))
                        			.addGap(141))
                        		.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 1495, Short.MAX_VALUE)
                        );
                        gl_jPanel4.setVerticalGroup(
                        	gl_jPanel4.createParallelGroup(Alignment.LEADING)
                        		.addGroup(Alignment.TRAILING, gl_jPanel4.createSequentialGroup()
                        			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                        			.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        			.addGroup(gl_jPanel4.createParallelGroup(Alignment.TRAILING)
                        				.addGroup(gl_jPanel4.createSequentialGroup()
                        					.addGroup(gl_jPanel4.createParallelGroup(Alignment.TRAILING)
                        						.addComponent(icon2)
                        						.addGroup(gl_jPanel4.createSequentialGroup()
                        							.addComponent(icon)
                        							.addGap(54)
                        							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
                        					.addGap(59))
                        				.addGroup(gl_jPanel4.createSequentialGroup()
                        					.addComponent(txtrBienvenueDansLespace, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                        					.addGap(115))))
                        );
                        jPanel4.setLayout(gl_jPanel4);
        
        panel_2 = new JPanel();
        panel_2.setBackground(new Color(65, 105, 225));
        
        lblBoiteDenvoi = new JLabel("Boite d'envoi");
        lblBoiteDenvoi.setHorizontalAlignment(SwingConstants.CENTER);
        lblBoiteDenvoi.setForeground(Color.WHITE);
        lblBoiteDenvoi.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
        panel_2.add(lblBoiteDenvoi);

        
        
        
        
        
        
        
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(49)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(40)
        					.addComponent(jLabel1)
        					.addPreferredGap(ComponentPlacement.RELATED, 676, Short.MAX_VALUE)
        					.addComponent(jLabel3)
        					.addGap(217))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(lblDocument)
        							.addGap(18)
        							.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(btnParcourir))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(lblDescription)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(desc, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGap(243)
        							.addComponent(btnEnvoyer)))
        					.addPreferredGap(ComponentPlacement.RELATED, 749, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 407, Short.MAX_VALUE)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 620, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(Retour)
        			.addGap(55))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 1507, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
        			.addGap(66)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel1)
        				.addComponent(jLabel3))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblDocument)
        				.addComponent(btnParcourir)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblDescription, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(desc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnEnvoyer)
        				.addComponent(Retour))
        			.addGap(27))
        );
        jPanel1.setLayout(jPanel1Layout);

        jTabbedPane2.addTab("Boite d'envoi", jPanel1);

        jPanel2.setBackground(new Color(240, 248, 255));

        jTabbedPane2.addTab("Boite de récéption", jPanel2);
        
        panel = new JPanel();
        panel.setBackground(new Color(65, 105, 225));
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        lblVoiciLaListe = new JLabel("Liste des documents re\u00E7u ");
        lblVoiciLaListe.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblVoiciLaListe);
        lblVoiciLaListe.setForeground(new Color(255, 255, 255));
        lblVoiciLaListe.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
        
        JButton button = new JButton();
        button.setText("D\u00E9connexion");
        button.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });
        GroupLayout gl_jPanel2 = new GroupLayout(jPanel2);
        gl_jPanel2.setHorizontalGroup(
        	gl_jPanel2.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_jPanel2.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(gl_jPanel2.createParallelGroup(Alignment.TRAILING)
        				.addGroup(gl_jPanel2.createSequentialGroup()
        					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1151, GroupLayout.PREFERRED_SIZE)
        					.addGap(318))
        				.addGroup(gl_jPanel2.createSequentialGroup()
        					.addComponent(button, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
        					.addGap(68))))
        		.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1495, Short.MAX_VALUE)
        );
        gl_jPanel2.setVerticalGroup(
        	gl_jPanel2.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_jPanel2.createSequentialGroup()
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
        			.addGap(80)
        			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
        			.addComponent(button, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        
        resception = new JTextArea();
        resception.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        resception.setEditable(false);
        resception.setBackground(new Color(255, 255, 255));
        
        
        
        if(recep!=null ){
        	
        	if(recep.containsKey(this.a)){
            List<String> l=null;
        l=(List<String>)recep.get(a);
        for(String e : l){
        	resception.append(e+"\n");
        	}
        }
        }
        scrollPane.setViewportView(resception);
        jPanel2.setLayout(gl_jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jTabbedPane2, GroupLayout.PREFERRED_SIZE, 1500, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jTabbedPane2, GroupLayout.PREFERRED_SIZE, 601, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(28, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descActionPerformed

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
      new Acceuil().setVisible(true);
      this.setVisible(false);

    }//GEN-LAST:event_RetourActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JTabbedPane_User_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTabbedPane_User_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTabbedPane_User_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTabbedPane_User_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTabbedPane_User_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retour;
    private javax.swing.JButton btnEnvoyer;
    private javax.swing.JButton btnParcourir;
    public static javax.swing.JTextArea contacts;
    private javax.swing.JTextField desc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDocument;
    public static javax.swing.JTextArea texArea;
    private JPanel panel;
    private JLabel lblVoiciLaListe;
    private JTextArea resception;
    private JPanel panel_2;
    private JLabel lblBoiteDenvoi;
    private JPanel panel_1;
    private JLabel lblDansVotreEspace;
    private JLabel icon;
    private JTextArea txtrBienvenueDansLespace;
}
