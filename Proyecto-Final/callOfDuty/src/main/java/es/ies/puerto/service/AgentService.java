package es.ies.puerto.service;

import org.springframework.web.bind.annotation.RestController;

import es.ies.puerto.controller.AgentController;
import es.ies.puerto.model.dto.AgentDTO;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/agent")
@Service
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public class AgentService {
    Logger logger = LoggerFactory.getLogger(AgentService.class);
    private AgentController agentController;

    public AgentController getAgentController() {
        return this.agentController;
    }

    @Autowired
    public void setAgentController(AgentController agentController) {
        this.agentController = agentController;
    }

    @GetMapping("/")
    public List<AgentDTO> getAllAgent() {
        return agentController.findAll();
    }

    @GetMapping("/{id}")
    public AgentDTO getAgentById(@PathVariable(name = "id") final Integer id) {
        return agentController.findById(id);
    }

    @PostMapping("/")
    public AgentDTO postAgent(@RequestBody final AgentDTO agent) {
        return agentController.save(agent);
    }
    
    @DeleteMapping("/{id}")
    public void deleteAgentById(@PathVariable(name = "id") final Integer id){
        agentController.deleteById(id);
    }
}
