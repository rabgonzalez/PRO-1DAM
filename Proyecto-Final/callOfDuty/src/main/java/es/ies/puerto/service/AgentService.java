package es.ies.puerto.service;

import org.springframework.web.bind.annotation.RestController;

import es.ies.puerto.controller.AgentController;
import es.ies.puerto.model.entity.Agent;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/agent")
@Service
public class AgentService {
    Logger logger = LoggerFactory.getLogger(AgentService.class);
    private AgentController agentController;

    @Autowired
    public void setAgentController(AgentController agentController) {
        this.agentController = agentController;
    }

    @GetMapping
    public List<Agent> getAllAgent() {
        return agentController.findAll();
    }
}
