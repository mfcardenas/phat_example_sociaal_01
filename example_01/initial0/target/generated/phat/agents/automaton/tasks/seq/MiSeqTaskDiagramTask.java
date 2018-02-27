
package phat.agents.automaton.tasks.seq;

import phat.agents.automaton.*;
import phat.agents.automaton.conditions.*;
import phat.agents.automaton.uses.*;
import phat.agents.events.*;
import phat.agents.Agent;

public class MiSeqTaskDiagramTask extends SeqTaskAutomaton {

	public MiSeqTaskDiagramTask(Agent agent) {
        super(agent, "MiSeqTaskDiagram");
        setMetadata("SOCIAALML_ENTITY_ID", "MiSeqTaskDiagram");
        setMetadata("SOCIAALML_ENTITY_TYPE", "SequentialTaskDiagram");
    }
	
	@Override
	public void initTasks() {
		
		{ 
		Automaton automaton = new MoveToSpace(agent, "GoToLivingRoom", "LivingRoom")
.setCanBeInterrupted(true).setMetadata("SOCIAALML_ENTITY_ID","GoToLivingRoom")
.setMetadata("SOCIAALML_ENTITY_TYPE","BGoToTask");;
		
    	addTransition(automaton, false);
    	} 
    	
		{ 
		Automaton automaton = UseObjectAutomatonFactory.getAutomaton( agent, "LcdTV1"
).setFinishCondition(new TimerFinishedCondition(0, 0, 10))
.setCanBeInterrupted(true).setMetadata("SOCIAALML_ENTITY_ID","SwitchOnTV")
.setMetadata("SOCIAALML_ENTITY_TYPE","BUseTask");;
		
    	addTransition(automaton, false);
    	} 
    	
		{ 
		Automaton automaton = new SitDownAutomaton(agent, "Sofa3Seats")
.setCanBeInterrupted(true).setMetadata("SOCIAALML_ENTITY_ID","SitDown0")
.setMetadata("SOCIAALML_ENTITY_TYPE","SitDown");;
		
    	addTransition(automaton, false);
    	} 
    	
		{ 
		Automaton automaton = new DoNothing(agent,"Wait30secs")
.setFinishCondition(new TimerFinishedCondition(0, 0, 30)).setCanBeInterrupted(true).setMetadata("SOCIAALML_ENTITY_ID","Wait30secs")
.setMetadata("SOCIAALML_ENTITY_TYPE","WaitTask");;
		
    	addTransition(automaton, false);
    	} 
    	
		{ 
		Automaton automaton = new StandUpAutomaton( agent, "StandUp0")
.setFinishCondition(new TimerFinishedCondition(0, 0, -1))
.setCanBeInterrupted(true).setMetadata("SOCIAALML_ENTITY_ID","StandUp0")
.setMetadata("SOCIAALML_ENTITY_TYPE","StandUp");;
		
    	addTransition(automaton, false);
    	} 
    	
		{ 
		Automaton automaton = new MoveToSpace(agent, "BGoToBathRoom", "BathRoom1")
.setCanBeInterrupted(true).setMetadata("SOCIAALML_ENTITY_ID","BGoToBathRoom")
.setMetadata("SOCIAALML_ENTITY_TYPE","BGoToTask");;
		
    	addTransition(automaton, false);
    	} 
    	
		{ 
		Automaton automaton = new DoNothing(agent,"Wait5Sec")
.setFinishCondition(new TimerFinishedCondition(0, 0, 5)).setCanBeInterrupted(false).setMetadata("SOCIAALML_ENTITY_ID","Wait5Sec")
.setMetadata("SOCIAALML_ENTITY_TYPE","WaitTask");;
		
    	addTransition(automaton, false);
    	} 
    	
		{ 
		Automaton automaton = new GoIntoBedAutomaton( agent, null)
.setFinishCondition(new TimerFinishedCondition(0, 0, 10)).setCanBeInterrupted(true).setMetadata("SOCIAALML_ENTITY_ID","GoIntoBed10sec")
.setMetadata("SOCIAALML_ENTITY_TYPE","GoIntoBed");;
		
    	addTransition(automaton, false);
    	} 
    	
		{ 
		Automaton automaton = new DoNothing(agent,"Wait2sec")
.setFinishCondition(new TimerFinishedCondition(0, 0, 2)).setCanBeInterrupted(true).setMetadata("SOCIAALML_ENTITY_ID","Wait2sec")
.setMetadata("SOCIAALML_ENTITY_TYPE","WaitTask");;
		
    	addTransition(automaton, false);
    	} 
    	
		{ 
		Automaton automaton = new MoveToSpace(agent, "BGoToKitchen", "Kitchen")
.setCanBeInterrupted(true).setMetadata("SOCIAALML_ENTITY_ID","BGoToKitchen")
.setMetadata("SOCIAALML_ENTITY_TYPE","BGoToTask");;
		
    	addTransition(automaton, false);
    	} 
    	
		{ 
		Automaton automaton = new DrinkAutomaton(agent)
.setFinishCondition(new TimerFinishedCondition(0, 0, 5))
.setCanBeInterrupted(true).setMetadata("SOCIAALML_ENTITY_ID","Drink5sec")
.setMetadata("SOCIAALML_ENTITY_TYPE","Drink");;
		
    	addTransition(automaton, false);
    	} 
    	
		{ 
		Automaton automaton = new MoveToSpace(agent, "BGoToHall", "Hall")
.setCanBeInterrupted(true).setMetadata("SOCIAALML_ENTITY_ID","BGoToHall")
.setMetadata("SOCIAALML_ENTITY_TYPE","BGoToTask");;
		
    	addTransition(automaton, false);
    	} 
    	
	}
}
