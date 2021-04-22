import java.util.ArrayList;

// Richard Rivaldo 13519185 K04  

public class IdentityService extends AbstractService {
    private final ArrayList<String> identityList = new ArrayList<String>();

    public IdentityService(String name) {
        super(name);
    }

    public ArrayList<String> getIdentity() {

        return this.identityList;
    }

    public void addIdentity(String id) {
        if (super.getServiceState() == STATE.RUNNING) {
            this.identityList.add(id);
        }
    }

    public void removeIdentity(String id) {
        if (super.getServiceState() == STATE.RUNNING) {
            this.identityList.remove(id);
        }
    }

    public void init() {
        super.setServiceState(STATE.INIT);
    }

    public void start() {
        super.setServiceState(STATE.RUNNING);
    }

    public void stop() {
        super.setServiceState(STATE.DIE);
    }

    public Boolean isIdentityExist(String id) {
        if (super.getServiceState() == STATE.RUNNING) {
            return identityList.contains(id);
        }
        return null;
    }
}