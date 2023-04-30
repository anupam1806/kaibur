package com.anupam.kaiburr.controller;


import com.anupam.kaiburr.entities.Server;
import com.anupam.kaiburr.services.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servers")
public class ServerController {
    @Autowired
    private ServerService serverService;
    @PostMapping
    public ResponseEntity<Server> create(@RequestBody Server server){
        Server server1 = serverService.create(server);
        return ResponseEntity.status(HttpStatus.CREATED).body(server1);
    }
    @GetMapping
    public ResponseEntity<List<Server>> getServers(){
        return ResponseEntity.ok(serverService.getServers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Server> getServerById(@PathVariable String id){
        Server server = serverService.getServerById(id);
        if(server == null)
        {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(server);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Server> deleteServers(@PathVariable String id){
        return ResponseEntity.ok(serverService.deleteServer(id));
    }

}
