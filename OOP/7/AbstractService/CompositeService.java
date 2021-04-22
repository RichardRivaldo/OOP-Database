// Richard Rivaldo 13519185 K04

public class CompositeService extends AbstractService {
    private ArrayList<AbstractService> serviceList;

    public CompositeService(string name) {
        super(name);
        serviceList = new ArrayList<AbstractService>();
    }

    public ArrayList<AbstractService> getServices() {
        return this.serviceList;
    }

    public void addService(AbstractService as) {
        if (as.getServiceState != DIE) {
            serviceList.add(as);
        }
    }

    public void removeService(AbstractService as) {
        for (AbstractService abs : serviceList) {
            if (abs == as) {
                if (abs.getServiceState != DIE) {
                    serviceList.remove(abs);
                }
            }
        }
    }

    public void init() {
        for (AbstractService as : serviceList) {
            as.setServiceState(INIT);
        }
    }

    public void start() {
        for (AbstractService as : serviceList) {
            as.setServiceState(RUNNING);
        }
    }

    public void stop() {
        int count = 0;

        for (AbstractService as : serviceList) {
            if (as.getServiceState == RUNNING) {
                count++;
            }
            as.setServiceState(DIE);
        }
        StdOut.println("RUNNING service total : " + count);
    }
}