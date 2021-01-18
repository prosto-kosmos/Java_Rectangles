package app.events.types;

import app.events.Event;

public class MouseReleasedEvent extends MouseButtonEvent{

	public MouseReleasedEvent(int x, int y, int keyCode) {
		super(Event.Type.MOUSE_RELEASED, x, y, keyCode);
	}

}
