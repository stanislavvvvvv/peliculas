function initialize(){
    var parrafo1 = document.getElementById("parrafo1");
    console.log(parrafo1);
    var parrafo2 = document.querySelector("body p");
    console.log(parrafo2);
    var parrafos = document.getElementsByClassName("titulo")
    console.log(parrafos);
    var varlisto = document.getElementsByTagName("li");
    console.log(varlisto);
    var inputs = document.getElementsByName("input");
    var parrafosDeVerdad = document.querySelectorAll("body p");
    console.log(parrafosDeVerdad.item(0));
    console.log(parrafosDeVerdad[1]);
    for (let index = 0; index < parrafosDeVerdad.length; index++) {
        console.log(parrafosDeVerdad[index].firstChild.textContent);
        
    }
    
}