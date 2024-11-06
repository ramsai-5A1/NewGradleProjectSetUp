package CodeWithDurgesh.PrototypeDP;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String importantData;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadImportabtData() throws InterruptedException {
        System.out.println("Loading very important data");
        Thread.sleep(3000);
        this.importantData = "very very important data";
        System.out.println("Loading completed");
    }

    @Override
    public String toString() {
        return this.ip + " : " + this.importantData;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
