package edu.missouriwestern.csmp.gg.base;

import edu.missouriwestern.csmp.gg.base.events.CommandEvent;

/** represents an outside agent that acts within the game
 * not an {@link Entity} as an agent may potentially comprise multiple entities within the game.
 */
public interface Agent extends Container, HasProperties, EventListener {

	/** Isues a new {@link CommandEvent} to all {@link EventListener}'s in the game. */
	public default void issueCommand(String commandName, String parameter) {
		getGame().accept(new CommandEvent(getGame(), getAgentID(), commandName, parameter));
	}

	public String getAgentID();
	public String getRole();
}
