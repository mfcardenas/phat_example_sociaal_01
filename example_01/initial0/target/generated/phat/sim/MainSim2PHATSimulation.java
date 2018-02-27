
package phat.sim;


import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import phat.agents.Agent;
import phat.body.BodiesAppState;
import phat.body.commands.*;
import phat.devices.commands.*;
import phat.server.commands.*;
import phat.config.*;
import phat.world.MonitorEventQueue;
import phat.world.MonitorEventQueueImp;
import phat.world.WorldAppState;
import phat.structures.houses.HouseFactory;
import phat.structures.houses.commands.*;
import phat.PHATInitializer;
import phat.PHATInterface;
import phat.agents.impl.*;

/**
 *
 * @author pablo
 */
public class MainSim2PHATSimulation implements PHATInitializer {
	static MonitorEventQueueImp meq=new MonitorEventQueueImp();
    public static void main(String[] args) throws RemoteException, AlreadyBoundException, NotBoundException {
    	meq.startServer(MonitorEventQueue.DefaultName);
        MainSim2PHATSimulation sim = new MainSim2PHATSimulation();
        PHATInterface phat = new PHATInterface(sim);
        phat.setSeed(0L);
        phat.start();
    }

    @Override
    public void initWorld(WorldConfigurator worldConfig) {
        worldConfig.setTime(2018, 2, 26, 8, 29, 50);
        worldConfig.setTimeVisible(true);
        worldConfig.setLandType(WorldAppState.LandType.Grass);
    }

    @Override
    public void initHouse(HouseConfigurator houseConfig) {
        houseConfig.addHouseType("House1", HouseFactory.HouseType.House3room2bath);
    }

    @Override
    public void initBodies(BodyConfigurator bodyConfig) {
       
       bodyConfig.createBody(BodiesAppState.BodyType.ElderLP, "E3Patient");
       bodyConfig.runCommand(new BodyLabelCommand("E3Patient", true));
       
       // Initial locations
       bodyConfig.setInSpace("E3Patient", "House1", "Kitchen");
        
       bodyConfig.runCommand(new SetBodyHeightCommand("E3Patient", 1.7f));
       
       
    }
    
    @Override
    public void initDevices(DeviceConfigurator deviceConfig) {
    	
        
    }
    
    @Override
    public void initServer(ServerConfigurator serverConfig) {
        
        
        
    }
    
    @Override
    public void initAgents(AgentConfigurator agentsConfig) {
       
       {E3PatientAgent patient=new E3PatientAgent("E3Patient","Sim2" );
       patient.registerListener(meq); 
       agentsConfig.add(patient);}
    }
    
    @Override
    public String getTittle() {
        return "PHAT-Sim2";
    }
}


