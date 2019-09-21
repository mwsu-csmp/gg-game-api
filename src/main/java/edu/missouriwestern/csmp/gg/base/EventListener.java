package edu.missouriwestern.csmp.gg.base;

import java.util.function.Consumer;

/** Interface for any class that listens for and acts on game events
 *
 */
public interface EventListener extends Consumer<Event> {
  public default void accept(Event event) {
      acceptEvent(event);
  }

  public void acceptEvent(Event event);
}
