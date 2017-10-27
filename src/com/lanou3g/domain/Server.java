package com.lanou3g.domain;

import java.util.List;

/**
 * Created by dllo on 17/10/27.
 */
public class Server {
    private int id;
    private String sname;
    private List<Server> servers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public List<Server> getServers() {
        return servers;
    }

    public void setServers(List<Server> servers) {
        this.servers = servers;
    }
}
