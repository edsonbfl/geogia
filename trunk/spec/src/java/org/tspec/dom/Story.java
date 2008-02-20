package org.tspec.dom;

import java.util.ArrayList;
import java.util.List;

public class Story {
	
	private String name;
	private List<Scenario> scenarios = new ArrayList<Scenario>();

	public void setName(String name) {
		this.name = name;
	}

	public void addScenario(Scenario scenario) {
		this.scenarios.add(scenario);		
	}

	public String getName() {
		return name;
	}

	public List<Scenario> getScenarios() {
		return scenarios;
	}

}
