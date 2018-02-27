
package phat.agents.automaton.tasks.seq;

import phat.agents.automaton.*;
import phat.agents.automaton.conditions.*;
import phat.agents.automaton.uses.*;
import phat.agents.events.*;
import phat.agents.Agent;

public class WatchTVSeqTasksTask extends SeqTaskAutomaton {

	public WatchTVSeqTasksTask(Agent agent) {
        super(agent, "WatchTVSeqTasks");
        setMetadata("SOCIAALML_ENTITY_ID", "WatchTVSeqTasks");
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
    	
	}
}
