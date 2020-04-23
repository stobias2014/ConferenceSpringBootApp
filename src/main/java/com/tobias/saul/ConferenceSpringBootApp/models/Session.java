package com.tobias.saul.ConferenceSpringBootApp.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity(name = "sessions")
public class Session {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "session_id")
	private Long sessionId;
	@Column(name = "session_name")
	private String sessionName;
	@Column(name = "session_description")
	private String sessionDescription;
	@Column(name = "session_length")
	private Integer sessionLength;
	@ManyToMany
	@JoinTable(
			name = "session_speakers",
			joinColumns = @JoinColumn(name = "session_id"),
			inverseJoinColumns = @JoinColumn(name = "speaker_id"))
			
	private Set<Speaker> speakers;
	
	//default constructor to help with serialization
	public Session() {}

	public Long getSessionId() {
		return sessionId;
	}

	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	public String getSessionDescription() {
		return sessionDescription;
	}

	public void setSessionDescription(String sessionDescription) {
		this.sessionDescription = sessionDescription;
	}

	public Integer getSessionLength() {
		return sessionLength;
	}

	public void setSessionLength(Integer sessionLength) {
		this.sessionLength = sessionLength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sessionDescription == null) ? 0 : sessionDescription.hashCode());
		result = prime * result + ((sessionId == null) ? 0 : sessionId.hashCode());
		result = prime * result + sessionLength;
		result = prime * result + ((sessionName == null) ? 0 : sessionName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Session other = (Session) obj;
		if (sessionDescription == null) {
			if (other.sessionDescription != null)
				return false;
		} else if (!sessionDescription.equals(other.sessionDescription))
			return false;
		if (sessionId == null) {
			if (other.sessionId != null)
				return false;
		} else if (!sessionId.equals(other.sessionId))
			return false;
		if (sessionLength != other.sessionLength)
			return false;
		if (sessionName == null) {
			if (other.sessionName != null)
				return false;
		} else if (!sessionName.equals(other.sessionName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Session [sessionId=" + sessionId + ", sessionName=" + sessionName + ", sessionDescription="
				+ sessionDescription + ", sessionLength=" + sessionLength + "]";
	}

	public Set<Speaker> getSpeakers() {
		return speakers;
	}

	public void setSpeakers(Set<Speaker> speakers) {
		this.speakers = speakers;
	}
	
	

}
