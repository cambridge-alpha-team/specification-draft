package osc;

/**
 * This is the interface that subscribers to incoming OSC (open sound
 * control) messages should implement. Subject to change.
 *
 * @author Robert Kovacsics &lt;rmk35@cam.ac.uk&gt;, Alpha group, CL 2015
 * @version 0.1 Specification draft
 */

public interface IMessageListener
{
  /**
   * This will be run on an incoming message.
   * @param message The incoming message.
   */
  public void handleMessage(IMessage message);
}
