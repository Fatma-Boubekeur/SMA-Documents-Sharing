package agentA;
import java.util.ArrayList;
import java.util.List;

import jade.core.Agent;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;
import jade.wrapper.StaleProxyException;

public class ContainerAgentA {

	AgentController agentA;
	static List<AgentController> agentIA = new  ArrayList<AgentController>(); 
	AgentContainer agentContainer;
	public ContainerAgentA(String name,String [] communaute) {
		
		try {
			Runtime runtime=Runtime.instance();
			ProfileImpl profileImpl=new ProfileImpl(false); 
			profileImpl.setParameter(ProfileImpl.MAIN_HOST,"localhost");
			agentContainer=runtime.createAgentContainer(profileImpl);
			
			
			
			
			
			
		} catch (Exception e) { e.printStackTrace(); }
			
	}

	public AgentController getAgentIA() {
		return agentA;
	
	}
	
	
	public  List< AgentController> getAgents(){
		return agentIA;
	}
	
	
	public boolean addAgent (String name,String [] communaute) {
		
		try {
			AgentController agentController = agentContainer.createNewAgent(name, "agentA.agentA"
					,communaute);
			agentController.start();
			System.out.println("-----------------"+agentController.getName());
			this.agentA=agentController;
			System.out.println("-----------------"+agentA);
			System.out.println("-----------------"+agentIA.toString());
			
			this.agentIA.add(agentA);
			System.out.println("-----------------"+agentIA.get(0).getName());
			return true;
		} catch (StaleProxyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); return false;
		}
		
	}

}
