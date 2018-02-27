
package phat.agents.automaton.activities;

import phat.agents.automaton.*;
import phat.agents.automaton.tasks.seq.*;
import phat.agents.Agent;

public class DoNothingForLongActivity extends ActivityAutomaton {

	public DoNothingForLongActivity(Agent agent) {
        super(agent, "DoNothingForLongActivity");
        setMetadata("SOCIAALML_ENTITY_ID", "DoNothingForLong");
        setMetadata("SOCIAALML_ENTITY_TYPE", "BActivity");
        setMetadata("SOCIAALML_DESCRIPTION", "");
    }
	
	@Override
	public void initTasks() {
		addTransition(new DoNothingSeqTaskTask(agent), false);
				
	}
}
