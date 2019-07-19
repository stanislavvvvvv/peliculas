function dameLoMio(){
    var ajax = new XMLHttpRequest();
    ajax.open("GET","data.json");
    ajax.onreadystatechange = function(){
        if(ajax.status==200 && ajax.readyState==4){
            var datos = JSON.parse(ajax.response);
            console.log(datos);
        }
    }
    ajax.send();
}
dameLoMio();