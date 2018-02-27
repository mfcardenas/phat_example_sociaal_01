
package phat.agents.automaton.tasks.seq;

import phat.agents.automaton.*;
import phat.agents.automaton.conditions.*;
import phat.agents.automaton.uses.*;
import phat.agents.events.*;
import phat.agents.Agent;

public class DoNothingSeqTaskTask extends SeqTaskAutomaton {

	public DoNothingSeqTaskTask(Agent agent) {
        super(agent, "DoNothingSeqTask");
        setMetadata("SOCIAALML_ENTITY_ID", "DoNothingSeqTask");
        setMetadata("SOCIAALML_ENTITY_TYPE", "SequentialTaskDiagram");
    }
	
	@Override
	public void initTasks() {
		
		{ 
		Automaton automaton = new DoNothing(agent,"DoNothing1000secs")
.setFinishCondition(new TimerFinishedCondition(0, 0, 1000)).setCanBeInterrupted(true).setMetadata("SOCIAALML_ENTITY_ID","DoNothing1000secs")
.setMetadata("SOCIAALML_ENTITY_TYPE","WaitTask");;
		
    	addTransition(automaton, false);
    	} 
    	
	}
}
