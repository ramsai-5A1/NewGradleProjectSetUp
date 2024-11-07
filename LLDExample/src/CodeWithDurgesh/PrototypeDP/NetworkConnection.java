package CodeWithDurgesh.PrototypeDP;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();

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

    public void addDomainName(String name) {
        System.out.println("Domain name: " + name + " added successfully");
        domains.add(name);
    }

    public void loadImportabtData() throws InterruptedException {
        System.out.println("Loading very important data");

        domains.add("www.pepcoding.com");
        domains.add("www.takeuforward.org");
        domains.add("www.codeforces.com");
        domains.add("www.leetcode.com");
        domains.add("www.geeksforgeeks.org");

        Thread.sleep(3000);
        this.importantData = "very very important data";
        System.out.println("Loading completed");
    }

    @Override
    public String toString() {
        return this.ip + " : " + this.importantData + " : " + this.domains;
    }
    

    @Override
    protected Object clone() throws CloneNotSupportedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setImportantData(this.importantData);
        networkConnection.setIp(this.ip);

        for (String domainName: this.domains) {
            networkConnection.domains.add(domainName);
        }
        return networkConnection;
    }
}
