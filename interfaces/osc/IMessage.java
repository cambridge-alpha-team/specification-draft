package osc;

/**
 * This is the interface for the representation of an OSC (open sound
 * control) message. Subject to change.
 *
 * @author Robert Kovacsics &lt;rmk35@cam.ac.uk&gt;, Alpha group, CL 2015
 * @version 0.1 Specification draft
 */

public interface IMessage
{
  /**
   * Sets the path (string containing at least one slash, the first
   * character) for the message. The path is like UNIX file paths and
   * is always present in a message, so constructor may also need to set
   * the path.
   *
   * @param path Path parameter of the message.
   */
  public void setPath(String path);

  /**
   * Returns the path (a parameter of the message) of the message.
   *
   * @return Path parameter of the message.
   */
  public String getPath();

  /**
   * Adds an object to the message, if it can. Otherwise throws an
   * exception.
   *
   * @param object Object to add to the message.
   * @throws InvalidObjectException When an object can not be encoded
   * into an open sound control message.
   */
  public void add(Object object) throws InvalidObjectException;

  /**
   * Gets the objects contained in the message.
   *
   * @return All the objects in the message, at the moment as an array
   * but may change.
   */
  public Object[] listObjects();
}
