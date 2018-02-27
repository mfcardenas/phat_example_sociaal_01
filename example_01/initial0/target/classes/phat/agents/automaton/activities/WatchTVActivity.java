
package phat.agents.automaton.activities;

import phat.agents.automaton.*;
import phat.agents.automaton.tasks.seq.*;
import phat.agents.Agent;

public class WatchTVActivity extends ActivityAutomaton {

	public WatchTVActivity(Agent agent) {
        super(agent, "WatchTVActivity");
        setMetadata("SOCIAALML_ENTITY_ID", "WatchTV");
        setMetadata("SOCIAALML_ENTITY_TYPE", "BActivity");
        setMetadata("SOCIAALML_DESCRIPTION", "");
    }
	
	@Override
	public void initTasks() {
		addTransition(new MiSeqTaskDiagramTask(agent), false);
				
	}
}
