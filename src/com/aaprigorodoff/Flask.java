package com.aaprigorodoff;

import java.util.ArrayList;

public class Flask {
	private int flaskSize;
	private ArrayList<Sip> sips;
	private int flaskIndex;

	public Flask(int sipsCount, ArrayList<Sip> sips, int flaskIndex) {
		this.flaskSize = sipsCount;
		this.sips = new ArrayList<>(sips);
		this.flaskIndex = flaskIndex;
	}

	public Sip getLastSipColor() {
		return !sips.isEmpty() ? sips.get(sips.size() - 1) : null;
	}

	public boolean isEmpty() {
		return sips.isEmpty();
	}

	public boolean isFull() {
		return sips.size() == flaskSize;
	}

	public void addSip(Sip sip) throws Exception {
		if (isEmpty()) {
			sips.add(sip);
		} else if (!isFull()) {
			if (getLastSipColor().equals(sip)) {
				sips.add(sip);
			} else {
				throw new Exception("Trying to add not matching sip");
			}
		} else {
			throw new Exception("The flask is full");
		}
	}

	public int getSameLastSipsCount() throws Exception {
		if (!isEmpty()) {
			return 1;
		} else {
			throw new Exception("The flask is empty");
		}
	}

	public int getFlaskSize() {
		return flaskSize;
	}

	public void setFlaskSize(int flaskSize) {
		this.flaskSize = flaskSize;
	}

	public ArrayList<Sip> getSips() {
		return sips;
	}

	public void setSips(ArrayList<Sip> sips) {
		this.sips = sips;
	}

	public int getFlaskIndex() {
		return flaskIndex;
	}

	public void setFlaskIndex(int flaskIndex) {
		this.flaskIndex = flaskIndex;
	}
}
