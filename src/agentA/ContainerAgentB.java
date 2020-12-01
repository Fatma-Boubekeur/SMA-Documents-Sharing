package agentA;

import java.util.ArrayList;
import java.util.List;

import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;
import jade.wrapper.StaleProxyException;

public class ContainerAgentB {

    AgentController agentA;
    AgentContainer agentContainer;
    List<AgentController> agentSMA = new  ArrayList<AgentController>(); 
	public ContainerAgentB(String name,String [] communaute) {
		try {
			Runtime runtime=Runtime.instance();
			ProfileImpl profileImpl=new ProfileImpl(false); 
			profileImpl.setParameter(ProfileImpl.MAIN_HOST,"localhost");
			agentContainer=runtime.createAgentContainer(profileImpl);
			
		} catch (Exception e) { e.printStackTrace(); }
			
	}

	public AgentController getAgentSMA() {
		return agentA;
	}
	public  List< AgentController> getAgents(){
		return agentSMA;
	}
	

public boolean addAgent (String name,String [] communaute) {
		
		try {
			AgentController agentController = agentContainer.createNewAgent(name, "agentA.agentA"
					,communaute);
			agentController.start();
			this.agentA=agentController;
			System.out.println("-----------------"+agentA);
			System.out.println("-----------------"+agentSMA.toString());
			this.agentSMA.add(agentA);
			System.out.println("-----------------"+agentA);
			System.out.println("-----------------"+agentSMA.toString());
			return true;
		} catch (StaleProxyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); return false;
		}
		
	}

}
