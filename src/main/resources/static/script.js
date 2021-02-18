function handleFormSubmit(event) {
    event.preventDefault();
    // extract the data from the form
    let data = {
        personnr: $('#personnr').val(),
        navn: $('#navn').val(),
        adresse: $('#adresse').val(),
        kjennetegn: $('#kjennetegn').val(),
        merke: $('#merke').val(),
        bilType: $('#type').val(),
    }

    // make POST request to server, to log form entry and print all registries to the webpage
    $.post("/register", data, () => {
        hentData();
    })



}
// make GET request to server, requesting all entries to the registry as JSON objects
const hentData = () => {
    $.get("register", data => {
        formaterData(data);
    });
}

// turn json objects into <tr>(data)</tr>
const formaterData = (data) => {
    let ut = '';
    for (let bil of data) {
        ut += `<tr>
                <td>${bil.personnr}</td>
                <td>${bil.navn}</td>
                <td>${bil.adresse}</td>
                <td>${bil.kjennetegn}</td>
                <td>${bil.merke}</td>
                <td>${bil.bilType}</td>
            </tr>`
    }
    $('#bilTabell').html(ut);
}

hentData();