document.addEventListener("DOMContentLoaded", function () {
    document.getElementById("clients").onclick = getClients;  
});
function getClients() {
    $.ajax({
        url: "localhost:8080/clients",
        type: "GET",
        sucess: function (response) {
            console.log(response);
        },
        error: function(xhr, status, error) {
            console.error(error)
        }
    })
}