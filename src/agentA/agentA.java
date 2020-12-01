package agentA;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.domain.AMSService;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.AMSAgentDescription;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.SearchConstraints;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import jade.lang.acl.ACLMessage;

public class agentA extends GuiAgent{
    
	private JTabbedPane_User_Interface gui;
	private List<AID> mesAgents=new ArrayList<AID>();

	protected void setup() {
		gui=new JTabbedPane_User_Interface();
		gui.setA(this);
		
		
		
addBehaviour(new CyclicBehaviour() {
    		
    		@Override
    		public void action() {
    	
    	ACLMessage msg = receive();
    	if (msg != null) {
    		FileOutputStream fos = null;
    		System.out.println("three2 is here");
    	  String fileName = msg.getUserDefinedParameter("file-name");
    	  System.out.println("three3 is here");
    	  
    	  
    	  File d = new File("C:/JADE_test");
    	  d.mkdir();
    	  File f = new File("C:/JADE_test/"+fileName);
    	  
    	  byte[] fileContent = msg.getByteSequenceContent();
    	  // write fileContent to f
    	
    	  
    	  try {
    		// if file doesnt exists, then create it
				if (!f.exists()) {
					f.createNewFile();
				}
    		  System.out.println("three is here");
              fos = new FileOutputStream(f);
              // Writes bytes from the specified byte array to this file output stream 
              fos.write(fileContent);
          }
          catch (FileNotFoundException e) {
              System.out.println("File not found" + e);
          }
          catch (IOException ioe) {
              System.out.println("Exception while writing file " + ioe);
          }
          finally {
              // close the streams using close method
              try {
                  if (fos != null) {
                      fos.close();
                  }
              }
              catch (IOException ioe) {
                  System.out.println("Error while closing stream: " + ioe);
              }
          }
    	} }});
		
		//r�cuperer la communaut� de l'agent depuis les arguments
		Object[] args = getArguments();
		
		
		 String communauteAgent=args[0].toString();
			
			AMSAgentDescription [] agents = null;
	        try {
	            SearchConstraints c = new SearchConstraints();// object to searh                    //the container exist on the System
	            c.setMaxResults (new Long(-1));//define infinity result to C
	            agents = AMSService.search( this, new AMSAgentDescription (), c );//putt all agent found on the system to the agents list
	        }
	        catch (Exception e) {
	            System.out.println( "Problem searching AMS: " + e );
	            e.printStackTrace();
	        }
	        for(int i=0;i<agents.length;i++) {
	            AID agentID = agents[i].getName();
	            
	            if(agentID.getLocalName().equals("rma") || agentID.getLocalName().equals("df") || agentID.getLocalName().equals("ams")) {
	            	continue;
	            }
	                        
	            mesAgents.add(agentID);
	        }
   
		System.out.println("Demarrage agent A");
		
		// Register service in the yellow pages
        DFAgentDescription dfd = new DFAgentDescription();
        dfd.setName(getAID());
        ServiceDescription sd = new ServiceDescription();
        sd.setType((String) args[0]);
        sd.setName(getLocalName());
        dfd.addServices(sd);
        try {
            DFService.register(this, dfd);
        } catch (FIPAException fe) {
            fe.printStackTrace();
        }

        
        
	}
	
	
	public void afficher_Mes_Contacts() {
		addBehaviour(new OneShotBehaviour() {

            @Override
            public void action() {
                Object[] args = getArguments();

                DFAgentDescription df = new DFAgentDescription();
                ServiceDescription sd = new ServiceDescription();
                df.addServices(sd);
                
                AID [] agentsCommunaute = searchDF((String)args[0]);
                for(int i=0;i<agentsCommunaute.length;i++) {
                	if(!agentsCommunaute[i].getLocalName().equals(getLocalName())) {
                		System.out.println("Les agents de ma communaut� ("+args[0]+") sont ");
        				System.out.println(agentsCommunaute[i].getName());
                	}
                	
                }
               
            }
        });
	}
	
	
	
	AID [] searchDF( String service ){
		DFAgentDescription dfd = new DFAgentDescription();
   		ServiceDescription sd = new ServiceDescription();
   		sd.setType( service );
		dfd.addServices(sd);
		
		SearchConstraints ALL = new SearchConstraints();
		ALL.setMaxResults(new Long(-1));

		try
		{
			DFAgentDescription[] result = DFService.search(this, dfd, ALL);
			AID[] agents = new AID[result.length];
			for (int i=0; i<result.length; i++) 
				agents[i] = result[i].getName() ;
			return agents;

		}
        catch (FIPAException fe) { fe.printStackTrace(); }
		
		
		

		
		
		
		
        
      	return null;
	}



	
	//**********************************************************************************************
	/*
public void sendFile(File f,AID a){
    	
    	
    		
    		
    	
    	
			System.out.println("Two1 is here");
					
					FileInputStream fin = null;
					try {
			            // create FileInputStream object
			            fin = new FileInputStream(f);
			           
			            byte fileContent[] = new byte[(int)f.length()];
			             
			            // Reads up to certain bytes of data from this input stream into an array of bytes.
			            fin.read(fileContent);
			            
			            
			            ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
						msg.addReceiver(new AID ("hadjer",AID.ISLOCALNAME));
						System.out.println("Two2 is here");
						msg.setByteSequenceContent(fileContent);
						msg.addUserDefinedParameter("file-name", f.getName());
						send(msg);
			            //create string from byte array
			            String s = new String(fileContent);
			            //System.out.println("File content: " + s);
			        }
			        catch (FileNotFoundException e) {
			            System.out.println("File not found" + e);
			        }
			        catch (IOException ioe) {
			            System.out.println("Exception while reading file " + ioe);
			        }
			        finally {
			            // close the streams using close method
			            try {
			                if (fin != null) {
			                    fin.close();
			                }
			            }
			            catch (IOException ioe) {
			                System.out.println("Error while closing stream: " + ioe);
			            }
			        }
					
    			
    		}
    	
    
    
    public void receiveFile(){
    	
    	System.out.println("three1 is here");
    	
    	addBehaviour(new CyclicBehaviour() {
    		
    		@Override
    		public void action() {
    	
    	ACLMessage msg = receive();
    	if (msg != null) {
    		System.out.println("three2 is here");
    	  String fileName = msg.getUserDefinedParameter("file-name");
    	  System.out.println("three3 is here");
    	  System.out.println("three is here");
    	  File f = new File("C:\\Users\\siraj\\Desktop\\derias"+fileName+"2");
    	  byte[] fileContent = msg.getByteSequenceContent();
    	  // write fileContent to f
    	  FileOutputStream fos = null;
    	  try {
              fos = new FileOutputStream(f);
              // Writes bytes from the specified byte array to this file output stream 
              fos.write(fileContent);
          }
          catch (FileNotFoundException e) {
              System.out.println("File not found" + e);
          }
          catch (IOException ioe) {
              System.out.println("Exception while writing file " + ioe);
          }
          finally {
              // close the streams using close method
              try {
                  if (fos != null) {
                      fos.close();
                  }
              }
              catch (IOException ioe) {
                  System.out.println("Error while closing stream: " + ioe);
              }
          }
    	} }});
    }
*/
    
    
    //***************************************************************************************************
	
	
	
	
	
	
	
	


	@Override
	protected void onGuiEvent(GuiEvent ev) {
		
		
		
		
		switch (ev.getType()) {
		case 1:
			 for(int i=0; i<mesAgents.size();i++)
	                System.out.println(mesAgents.get(i).getLocalName());
			Map<String,Object> params=(Map<String, Object>) ev.getParameter(0);
			File f=(File)params.get("file");
			String s=(String)params.get("sender");
			String r=(String)params.get("receiver");
			//pour le sender ID*******************************************
			AID a=new AID(s,AID.ISLOCALNAME);
			FileInputStream fin=null;
			try{
			fin = new FileInputStream(f);
			 
            byte fileContent[] = new byte[(int)f.length()];
             
            // Reads up to certain bytes of data from this input stream into an array of bytes.
            fin.read(fileContent);
            
            
            ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
            //pour definir the sender
            msg.setSender(a);
			msg.addReceiver(new AID (r,AID.ISLOCALNAME));
			System.out.println("Two2 is here");
			msg.setContent ("bonjour mon ami ");
			msg.setByteSequenceContent(fileContent);
			msg.addUserDefinedParameter("file-name", r+"_"+f.getName());
			this.send(msg);
            //create string from byte array
            //String s = new String(fileContent);
            //System.out.println("File content: " + s);
		 }
        catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        }
        catch (IOException ioe) {
            System.out.println("Exception while reading file " + ioe);
        }
        finally {
            // close the streams using close method
            try {
                if (fin != null) {
                    fin.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }
        }
            
            
            
			break;

		default:
			break;
		}
		
	}
	
		
		
		
		
	}
	
	
	
	
