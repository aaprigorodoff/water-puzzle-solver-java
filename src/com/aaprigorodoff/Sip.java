package com.aaprigorodoff;

import java.util.Objects;

public class Sip {
	private int color;

	public int getColor() {
		return color;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Sip sip = (Sip) o;
		return getColor() == sip.getColor();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getColor());
	}

	public void setColor(int color) {
		this.color = color;
	}
}
