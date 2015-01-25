package cubelets;

import java.io.IOException;

/**
 * This is the interface to represent a connection to a Node.js server
 * used to get the parameters from the cubelets. Available parameters
 * are settings of each sensors, but unfortunately not the physical
 * arrangement of the cubelets. Subject to change.
 *
 * @author Robert Kovacsics &lt;rmk35@cam.ac.uk&gt;, Alpha group, CL 2015
 * @version 0.1 Specification draft
 */

public interface IConnection
{
  /*
   * Constructor establishes a connection.
   */

  /**
   * Tears down the connection.
   */
  public void close() throws IOException;

  /**
   * Gets the values of each sensors from the server, in order of
   * attachment.
   *
   * @return Array of values, ordered by first attachment to bluetooth
   * cubelet.
   */
  public int[] getCubeletValues();
}
