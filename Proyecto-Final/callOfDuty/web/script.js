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
        .then(jsonObj => typeAgent(jsonObj))
        .catch(() => alert('Algo no ha salido bien'))
}

function fetchUrlMap(url) {
    fetch(url)
        .then(response => response.json())
        .then(jsonObj => typeMap(jsonObj))
        .catch(() => alert('Algo no ha salido bien'))
}

function fetchUrlGamemode(url) {
    fetch(url)
        .then(response => response.json())
        .then(jsonObj => typeGamemode(jsonObj))
        .catch(() => alert('Algo no ha salido bien'))
}

function fetchUrlGame(url) {
    fetch(url)
        .then(response => response.json())
        .then(jsonObj => typeGame(jsonObj))
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

function fetchMaps() {
    let url = 'http://localhost:8080/api-cod/map/';
    fetchUrlMap(url);
}

function fetchGamemodes() {
    let url = 'http://localhost:8080/api-cod/gamemode/';
    fetchUrlGamemode(url);
}

function fetchGames() {
    let url = 'http://localhost:8080/api-cod/game/';
    fetchUrlGame(url);
}

function typeGun(object) {
    if (object.length >= 1) {
        getGuns(object)
    } else {
        console.log('Esto esta vacío')
    }
}

function typeAgent(object) {
    if (object.length >= 1) {
        getAgents(object)
    } else {
        console.log('Esto esta vacío')
    }
}

function typeMap(object) {
    if (object.length >= 1) {
        getMaps(object)
    } else {
        console.log('Esto esta vacío')
    }
}

function typeGamemode(object) {
    if (object.length >= 1) {
        getGamemodes(object)
    } else {
        console.log('Esto esta vacío')
    }
}

function typeGame(object) {
    if (object.length >= 1) {
        getGames(object)
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
        </table>`
    });
    const agentsZone = document.getElementById('getAll');
    agentsZone.innerHTML = objects;
}

function getMaps(maps){
    let objects = ``
    maps.forEach(map => {
        objects += `
        <table>
        <tr>
        <td>ID</td>
        <th>${map.id}</th>
        </tr>
        <tr>
        <td>NAME</td>
        <th>${map.name}</th>
        </tr>
        <tr>
        <td>COUNTRY</td>
        <th>${map.country}</th>
        </tr>
        <tr>
        <td>GAME</td>
        <th>${map.game_id}</th>
        </tr>
        </table>`
    });
    const agentsZone = document.getElementById('getAll');
    agentsZone.innerHTML = objects;
}

function getGamemodes(gamemodes){
    let objects = ``
    gamemodes.forEach(gamemode => {
        objects += `
        <table>
        <tr>
        <td>ID</td>
        <th>${gamemode.id}</th>
        </tr>
        <tr>
        <td>NAME</td>
        <th>${gamemode.name}</th>
        </tr>
        </table>`
    });
    const agentsZone = document.getElementById('getAll');
    agentsZone.innerHTML = objects;
}

function getGames(games){
    let objects = ``
    games.forEach(game => {
        objects += `
        <table>
        <tr>
        <td>ID</td>
        <th>${game.id}</th>
        </tr>
        <tr>
        <td>NAME</td>
        <th>${game.gameName}</th>
        </tr>
        <tr>
        <td>RELEASE</td>
        <th>${game.releaseDate}</th>
        </tr>
        <tr>
        <td>RATING</td>
        <th>${game.rating}</th>
        </tr>
        </table>`
    });
    const agentsZone = document.getElementById('getAll');
    agentsZone.innerHTML = objects;
}