package main.java.com.it.app.domain;

import main.java.com.it.app.annotation.FileStorage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@FileStorage(name = "Subject")
public class Subject implements Serializable {
	private List<Integer> mathematics = new ArrayList<>();
	private List<Integer> fisics = new ArrayList<>();
	private List<Integer> english = new ArrayList<>();

	public List<Integer> getMathematics() {
		return mathematics;
	}

	public void setMathematics(List<Integer> mathematics) {
		this.mathematics = mathematics;
	}

	public List<Integer> getFisics() {
		return fisics;
	}

	public void setFisics(List<Integer> fisics) {
		this.fisics = fisics;
	}

	public List<Integer> getEnglish() {
		return english;
	}

	public void setEnglish(List<Integer> english) {
		this.english = english;
	}

	@Override
	public String toString() {
		return " mathematics=" + mathematics + ", fisics=" + fisics + ", english=" + english;
	}

}
