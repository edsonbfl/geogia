package org.tspec.dom;

import org.tspec.runtime.EnsureClosure;

import groovy.lang.Closure;

public class Then {

	private String name;
	private Closure body;
	private Scenario scenario;
	private String label;

	public Then(String label, String name, Closure body, Scenario scenario) {
		this.label = label;
		this.name = name;
		this.body = body;
		this.scenario = scenario;
		init();
	}

	private void init() {
		this.body.setProperty("รับรองว่าขว้าง", new EnsureClosure(this.scenario));
	}

	public Closure getBody() {
		return this.body;
	}

	public String getLabel() {
		return this.label;
	}
	
	public String getName() {
		return name;
	}

} 
