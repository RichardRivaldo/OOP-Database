
// Richard Rivaldo 13519185 K04
import java.util.ArrayList;

public class CompositeService extends AbstractService {
    private ArrayList<AbstractService> serviceList = new ArrayList<AbstractService>();

    public CompositeService(String name) {
        super(name);
    }

    public ArrayList<AbstractService> getServices() {
        return this.serviceList;
    }

    public void addService(AbstractService as) {
        if (super.getServiceState() == STATE.DIE) {
            return;
        }
        this.serviceList.add(as);
    }

    public void removeService(AbstractService as) {
        if (super.getServiceState() == STATE.DIE) {
            return;
        }
        this.serviceList.remove(as);
    }

    public void init() {
        for (int i = 0; i < this.serviceList.size(); i++) {
            serviceList.get(i).init();
        }
        super.setServiceState(STATE.INIT);
    }

    public void start() {
        for (int i = 0; i < this.serviceList.size(); i++) {
            serviceList.get(i).start();
        }
        super.setServiceState(STATE.RUNNING);
    }

    public void stop() {
        int count = 0;

        for (int i = 0; i < this.serviceList.size(); i++) {
            if (serviceList.get(i).getServiceState() == STATE.RUNNING) {
                count++;
            }
            serviceList.get(i).stop();
        }
        super.setServiceState(STATE.DIE);
        System.out.println("RUNNING service total : " + count);
    }
}