/**
 * This is the base implementation class for services.
 */
public abstract class AbstractService {

  public enum STATE {
    NEW,INIT,RUNNING,DIE
  }

  /**
   * Service name.
   */
  private final String name;

  /** service state */
  private STATE serviceState;

  /**
   * Construct the service.
   * @param name service name
   */
  public AbstractService(String name) {
    this.name = name;
    this.serviceState = STATE.NEW;
  }

  public final STATE getServiceState() {
    return serviceState;
  }

  public abstract void init();

  public abstract void start();

  public abstract void stop(); 

  public String getName() {
    return name;
  }

  public void setServiceState(STATE state){
    this.serviceState = state;
  }

  public String toString() {
    return "Service " + name + " in state " + serviceState;
  }

}