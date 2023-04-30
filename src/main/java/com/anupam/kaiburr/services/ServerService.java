package com.anupam.kaiburr.services;

import com.anupam.kaiburr.entities.Server;

import java.util.List;

public interface ServerService {
    //create
    Server create(Server Server);

    //get all Servers
    List<Server> getServers();

    Server getServerById(String id);

    Server deleteServer(String id);
}
