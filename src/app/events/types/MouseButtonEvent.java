package app.events.types;

import app.events.Event;

public class MouseButtonEvent extends Event {

	private int x, y, keyCode;
	
	protected MouseButtonEvent(Type type, int x, int y, int keyCode) {
		super(type);
		this.keyCode = keyCode;
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getKeyCode() {
		return keyCode;
	}
}
