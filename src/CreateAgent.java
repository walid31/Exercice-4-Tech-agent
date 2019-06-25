import jade.core.Agent;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.*;

public class CreateAgent {
	public static void main(String[] args) {
		try {Runtime rt = Runtime.instance();
		Object[] arg1 = new Object[2],arg2 = new Object[2];
		arg1[0] = "Clavier";
		arg1[1] = "1000";
		arg2[0] = "Souris";
		arg2[1] = "700";
		rt.setCloseVM(true);
			ProfileImpl p = new ProfileImpl("localhost",1099,null);
			ContainerController mc = rt.createMainContainer(p);
			AgentController ag1 = mc.createNewAgent("Agent1", "Vendeur",arg1);
			ag1.start();
			AgentController ag2 = mc.createNewAgent("Agent2", "Vendeur",arg2);
			ag2.start();
		}catch (Exception e) {e.printStackTrace();}
	}

}
