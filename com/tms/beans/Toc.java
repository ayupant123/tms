package com.tms.beans;

/**
 * 
 * @author Ayushi Pant
 * @see Bean Class for TOC module
 * @since Jan 2020
 * @version 1.0
 */


public class Toc {
      
	  private String csName;
	  private String csPreRequisites;
	  private String csObjective;
	  private String csOutcome;
	  private String csTargetedFor;
	  private int duration;
	  private String csSoftwareRequirements;
	  private String csTopics;
	  private String csPostReading;
	
 /**
 * 
 * @author Ayushi Pant
 * @see Bean Class for TOC module
 * @since Jan 2020
 * @version 1.0
 */

	  
	public String getCsName() {
		return csName;
	}

	public void setCsName(String csName) {
		this.csName = csName;
	}

	public String getCsPreRequisites() {
		return csPreRequisites;
	}

	public void setCsPreRequisites(String csPreRequisites) {
		this.csPreRequisites = csPreRequisites;
	}

	public String getCsObjective() {
		return csObjective;
	}

	public void setCsObjective(String csObjective) {
		this.csObjective = csObjective;
	}

	public String getCsOutcome() {
		return csOutcome;
	}

	public void setCsOutcome(String csOutcome) {
		this.csOutcome = csOutcome;
	}

	public String getCsTargetedFor() {
		return csTargetedFor;
	}

	public void setCsTargetedFor(String csTargetedFor) {
		this.csTargetedFor = csTargetedFor;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getCsSoftwareRequirements() {
		return csSoftwareRequirements;
	}

	public void setCsSoftwareRequirements(String csSoftwareRequirements) {
		this.csSoftwareRequirements = csSoftwareRequirements;
	}

	public String getCsTopics() {
		return csTopics;
	}

	public void setCsTopics(String csTopics) {
		this.csTopics = csTopics;
	}

	public String getCsPostReading() {
		return csPostReading;
	}

	public void setCsPostReading(String csPostReading) {
		this.csPostReading = csPostReading;
	}
	 	  
}
