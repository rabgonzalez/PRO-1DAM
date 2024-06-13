const getAgentButton = document.getElementById('agents');
getAgentButton.addEventListener('click', fetchAgents);

function fetchUrl(url){
    fetch(url)
        .then(response => response.json())
        .then(jsonObj => type(jsonObj))
        .catch(() => alert('Algo no ha salido bien'))
}

function fetchAgents(){
    let url = 'http://localhost:8080/api-cod/agent/';
    fetchUrl(url);
}

function type(object){
    if (object.length > 1) {
        getAgents(object)
    } else {
        console.log('Esto esta vacío')
    }
}

function getAgents(agents){
    let objects = ``
    agents.forEach(agent => {
        objects += `<tr>
        <td>${agent.id}</td>
        <td>${agent.name}</td>
        <td>${agent.rarity}</td>
        <td>${agent.age}</td>
        <td>${agent.game_id}</td>
        </tr>`
    });
    const template = `
    <div>
    <table>
    <tr>
    <th>ID</th>
    <th>NAME</th>
    <th>RARITY</th>
    <th>AGE</th>
    <th>GAME<th>
    `+ objects + `
    </tr>
    </table>
    </div>`
    const agentsZone = document.getElementById('agentsInfo');
    agentsZone.innerHTML = template;
}

function getAgentByID(id){
    let objects = ``
    id.forEach(agent => {
        objects += `<tr>
        <td>${agent.id}</td>
        <td>${agent.name}</td>
        <td>${agent.rarity}</td>
        <td>${agent.age}</td>
        <td>${agent.game_id}</td>
        </tr>`
    });
    const template = `
    <div>
    <table>
    <tr>
    <th>ID</th>
    <th>NAME</th>
    <th>RARITY</th>
    <th>AGE</th>
    <th>GAME<th>
    `+ objects + `
    </tr>
    </table>
    </div>`
    const agentsZone = document.getElementById('agentsInfo');
    agentsZone.innerHTML = template;
}