package osc;

import java.io.IOException;

/**
 * This is the interface for the representation of an OSC (open sound
 * control) connection. It may end up being a wrapper for an external
 * class, such as Java OSC if we decide not to make our own. Subject to
 * change.
 *
 * @author Robert Kovacsics &lt;rmk35@cam.ac.uk&gt;, Alpha group, CL 2015
 * @version 0.1 Specification draft
 */

public interface IConnection
{
  /*
   * Need a constructor to open connection, but can not specify
   * constructors in interfaces.
   */

  /**
   * Closes the connection associated with this instance.
   * Constructor should create connection.
   */
  public void close() throws IOException;

  /**
   * Method to send a message. Always succeeds, or throws an exception.
   * @see osc.IMessage
   * @param message An instance of the {@link osc.IMessage} to send.
   */
  public void sendMessage(IMessage message) throws IOException;

  /**
   * Subscribe to incoming messages with this method.
   * Unspecified behaviour on subscribing multiple times (may change).
   * May have to subscribe with additional parameters representing
   * parameters from the message to filter for.
   *
   * @param listener A class implementing {@link osc.IMessageListener}
   * whose handleMessage(osc.IMessage) method will be called with the
   * message.
   */
  public void subscribe(IMessageListener listener);

  /**
   * Unsubscribe from incoming messages.
   * Unspecified behaviour on unsubscribing if not subscribed (may
   * change).
   *
   * @param listener The same class that is subscribed using the method
   * above.
   */
  public void unsubscribe(IMessageListener listener);
}
