
package phat.agents.impl;

import phat.agents.Agent;
import phat.agents.automaton.*;
import phat.agents.automaton.activities.*;
import phat.agents.automaton.conditions.*;
import phat.agents.automaton.timeIntervals.*;
import phat.agents.events.*;
import phat.agents.filters.*;

public class E3PatientAgent extends Agent {
    private String simulation="";
    
    public E3PatientAgent(String bodyId, String simName) {
        super(bodyId);
        this.simulation=simName;
    }
	

    @Override
    protected void initAutomaton() {
   	    	FSM fsm = new TimeIntervalManager(this, 1,"FSM-E3Patient");
	    	Transition E3PatientGetReadyTimeTransition = new Transition(new E3PatientGetReadyTimeTIA(this));
                     
	    	
	    	
	    	fsm.registerStartState(E3PatientGetReadyTimeTransition.getTarget());
	    	
	    	
	    	
                fsm.registerFinalState(E3PatientGetReadyTimeTransition.getTarget());
                
	    	MainAutomaton mainAutomaton = new MainAutomaton(this);
	    	mainAutomaton.addTransition(fsm, false);
	    	
	        mainAutomaton.addListener(new AutomatonIcon());
	        
	        setAutomaton(mainAutomaton);	   	
		
		    
	    	// Init EventManager
	    	

    	
    }
}
