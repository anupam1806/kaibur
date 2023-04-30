package com.anupam.kaiburr.services.impl;

import com.anupam.kaiburr.entities.Server;
import com.anupam.kaiburr.repository.ServerRepository;
import com.anupam.kaiburr.services.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ServerServiceImplementation implements ServerService {

    @Autowired
    private com.anupam.kaiburr.repository.ServerRepository serverRepository;
    @Override
    public Server create(Server Server) {
        return serverRepository.save(Server);
    }

    @Override
    public List<Server> getServers() {
        return serverRepository.findAll();
    }

    @Override
    public Server getServerById(String id) {
        Optional<Server> server = serverRepository.findById(id);
        if(server.isPresent())
        {
            return server.get();
        }
        else
        {
            return null;
        }
    }

    @Override
    public Server deleteServer(String id) {
        Server server = getServerById(id);
        serverRepository.deleteById(id);
        return server;
    }

}
