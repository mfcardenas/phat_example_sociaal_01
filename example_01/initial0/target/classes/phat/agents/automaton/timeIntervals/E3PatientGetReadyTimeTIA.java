
package phat.agents.automaton.timeIntervals;

import phat.agents.automaton.FSM;
import phat.agents.automaton.*;
import phat.agents.automaton.activities.*;
import phat.agents.automaton.conditions.*;
import phat.agents.automaton.TimeIntervalAutomaton;
import phat.agents.automaton.Transition;
import phat.agents.Agent;

public class E3PatientGetReadyTimeTIA extends TimeIntervalAutomaton {

	public E3PatientGetReadyTimeTIA(Agent agent) {
        super(agent, "E3PatientGetReadyTimeTIA");
        setMetadata("SOCIAALML_ENTITY_ID", "E3PatientGetReadyTime");
        setMetadata("SOCIAALML_ENTITY_TYPE", "TimeInterval");
    }
	
	@Override
	public void initSubAutomaton() {
		FSM fsm = new FSM(agent, 1,"FSM-E3PatientGetReadyTimeTIA");
		ActivityAutomaton WatchTVActivity = new WatchTVActivity(agent);
		ActivityAutomaton DoNothingForLongActivity = new DoNothingForLongActivity(agent);
		    	
    	fsm.registerStartState(WatchTVActivity);
    	
        
    	fsm.registerTransition(WatchTVActivity, DoNothingForLongActivity);
    	
        
        fsm.registerFinalState(DoNothingForLongActivity);
    	// DoNothing due to no activity defined
    	
    	
    	addTransition(fsm, true);
	}
}
