class Main {
  public main(String args);
}

class Frontend extends Thread {
  public run(); /* Thread run */
  private saveAll(); /* Button */
  private runLoop(); /* Button */
  private stopAll(); /* Button */
}

class Serialiser {
  public load(Piece, Path);
  public save(Piece, Path);
}

class Piece {
  public List<Loop> loops;
  public Loop active;
}

class Loop {
  private name: get, set;
  private source: get, set;
  private List<Integer> parameters: get, set;

  public Loop(String code);
  public stop();
}

class Backend extends Thread {
  private osc.Connection;
  private cubelets.Connection;

  public run(); /* Thread run */
}

class MessageQueue /* Thread communication */ {
  public add(Message);
  public Message get();
}

interface Message {
}

class UpdateLoopMessage {
  private index: get, set;
  private Loop;
}

class SetActiveMessage {
  private ActiveIndex;
}

class StopAllMessage {
}

class ParameterValues {
  private List<Integer> values;
}

class osc.Connection {
  private "Connection state";

  public Connection(String host, int port);
  public close();
  public sendMessage(osc.Message message);
}

class osc.Message {
  private "Message state";

  public setPath(String path);
  public getPath();
  public add(Object);
  public Object[] listObjects();
}

class cubelets.Connection {
    /* Polls for cubelet values
     * in the background */

  public Connect(host, port);
  public close();
  public getCubeletValues();
}
