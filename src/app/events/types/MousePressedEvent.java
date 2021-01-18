package app.events.types;

import app.events.Event;

public class MousePressedEvent extends MouseButtonEvent{

	public MousePressedEvent(int x, int y, int keyCode) {
		super(Event.Type.MOUSE_PRESSED, x, y, keyCode);
	}
	

}
