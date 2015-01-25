/**
 * This interface represents a running Ruby thread in Sonic Pi. Used to
 * stop that thread and also, when active, to update that thread's
 * parameters (from cubelets). Subject to change.
 *
 * @author Robert Kovacsics &lt;rmk35@cam.ac.uk&gt;, Alpha group, CL 2015
 * @version 0.1 Specification draft
 */

public interface IMusicThread
{
  /*
   * Constructor takes ruby code, and perhaps a string array
   * representing the name of the cubelet parameters.
   */

  /**
   * Stops the running Sonic Pi thread represented by the instance of the
   * implementing class.
   */
  public void stop();

  /**
   * Sets the focus to be on this thread. May take action like
   * periodically update cubelet values.
   * Note: focus tracking may move to a different class to ensure only
   * one thread has focus; perhaps the user interface may want to keep
   * track of this, given that it also keeps track of which editor
   * buffer is in focus.
   */
  public void focus();

  /**
   * Removes focus from this thread. Stops any actions focus takes.
   */
  public void unfocus();
}
