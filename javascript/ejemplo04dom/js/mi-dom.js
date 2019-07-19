function initialize(){
    var miH1 = document.createElement("h1");//<h1></h1>
    var mitxt = document.createTextNode("un texto muy mono");//<>un texto muy mono</>
    miH1.appendChild(mitxt); //<h1>un texto muyu mono</h1>
    var miBody = document.body;//tengo mi <body></body>
    miBody.appendChild(miH1);//h1 dentro del body
}