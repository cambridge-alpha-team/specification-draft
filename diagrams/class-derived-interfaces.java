class Main {
  public static void main(String[] args);
}

class Frontend extends Thread {
  public void run(); /* Thread run */
  private void saveAll(); /* Button callback */
  private void runLoop(); /* Button callback */
  private void stopAll(); /* Button callback */
}

class Serialiser {
  public Piece load(Path);
  public void save(Piece, Path);
}

class Piece {
  private List<Loop> loops; /* get, set */
  private Loop active; /* get, set */
}

class Loop {
  private name; /* get, set */
  private source; /* get, set */
  private List<Integer> parameters; /* get, set */

  public Loop(String name, String source);
}

class Backend extends Thread {
  private osc.Connection;
  private cubelets.Connection;

  public void run(); /* Thread run */
}

class MessageQueue /* Thread communication */ {
  public void add(Message m);
  public Message get();
}

interface Message {
}

class UpdateLoopMessage implements Message {
  private int index; /* get, set */
  private Loop newLoop; /* get, set */
}

class SetActiveMessage implements Message  {
  private int ActiveIndex; /* get, set */
}

class StopAllMessage implements Message  {
}

class ParameterValues implements Message  {
  private List<Integer> values; /* get, set */
}

class osc.Connection {
  /* private Connection state; */

  public Connection(String host, int port);
  public void close();
  public void sendMessage(osc.Message message);
}

class osc.Message {
  /* private Message state; */

  public void setPath(String path);
  public String getPath();
  public void add(Object);
  public Object[] listObjects();
}

class cubelets.Connection {
    /* Polls for cubelet values
     * in the background */

  public Connect(host, port);
  public void close();
  public List<Integer> getCubeletValues();
}
