const getAgentButton = document.getElementById('agents');
const getGunButton = document.getElementById('guns');
const getMapButton = document.getElementById('maps');
const getGamemodeButton = document.getElementById('gamemodes');
const getGameButton = document.getElementById('games');
getAgentButton.addEventListener('click', fetchAgents);
getGunButton.addEventListener('click', fetchGuns);
getMapButton.addEventListener('click', fetchMaps);
getGamemodeButton.addEventListener('click', fetchGamemodes);
getGameButton.addEventListener('click', fetchGames);

function fetchUrlGun(url) {
    fetch(url)
        .then(response => response.json())
        .then(jsonObj => typeGun(jsonObj))
        .catch(() => alert('Algo no ha salido bien'))
}

function fetchUrlAgent(url) {
    fetch(url)
        .then(response => response.json())
        .then(jsonObj => type(jsonObj))
        .catch(() => alert('Algo no ha salido bien'))
}

function fetchGuns() {
    let url = 'http://localhost:8080/api-cod/gun/';
    fetchUrlGun(url);
}

function fetchAgents() {
    let url = 'http://localhost:8080/api-cod/agent/';
    fetchUrlAgent(url);
}

function typeGun(object) {
    if (object.length = 1) {
        getGuns(object)
    } else {
        console.log('Esto esta vacío')
    }
}

function type(object) {
    if (object.length > 1) {
        getAgents(object)
    } else {
        console.log('Esto esta vacío')
    }
}

function getAgents(agents) {
    let objects = ``
    agents.forEach(agent => {
        objects += `
        <table>
        <tr>
        <td>ID</td>
        <th>${agent.id}</th>
        </tr>
        <tr>
        <td>NAME</td>
        <th>${agent.name}</th>
        </tr>
        <tr>
        <td>RARITY</td>
        <th>${agent.rarity}</th>
        </tr>
        <tr>
        <td>AGE</td>
        <th>${agent.age}</th>
        </tr>
        <tr>
        <td>GAME</td>
        <th>${agent.game_id}</th>
        </tr>
        </table>`
    });
    const agentsZone = document.getElementById('getAll');
    agentsZone.innerHTML = objects;
}

function getGuns(guns){
    let objects = ``
    guns.forEach(gun => {
        objects += `
        <table>
        <tr>
        <td>ID</td>
        <th>${gun.id}</th>
        </tr>
        <tr>
        <td>NAME</td>
        <th>${gun.name}</th>
        </tr>
        <tr>
        <td>TYPE</td>
        <th>${gun.type}</th>
        </tr>
        <tr>
        <td>RARITY</td>
        <th>${gun.rarity}</th>
        </tr>
        <tr>
        
        </table>`
    });
    const agentsZone = document.getElementById('getAll');
    agentsZone.innerHTML = objects;
}