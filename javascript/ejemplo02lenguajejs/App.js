console.log("mi primer log en nodejs");
var variableGlobal ="ni variable global";

laFuncionDeIrAlVar()
laFuncionDeIrAlLet()
//se puede ejecutar la funcion lineas antes de declararlas
function laFuncionDeIrAlVar() {
    var variableLocal ="lcoal";
    variableGlobal ="declarada sin querer"
    for(var i=0;i<10;i++){
        console.log("i es igual a = " + i );
    }
    //se guarda el ambito de la variable i
    console.log("i es igual a =  " + i );
    
}
function laFuncionDeIrAlLet() {
    var variableLocal ="lcoal";
    for(let i=0;i<10;i++){
        console.log("i es igual a = " + i );
    }
    //este console log falla pq no tiene el ambito de i
    //console.log("i es igual a =  " + i );
}


console.log("_________________________________")
console.log("evaluaicion de tipos de datos")
var tipoDeDatoNumerico = 8
var tipoDeDatoCadena = "cadena"
var tipoDeDatoFecha = new Date()
var referenciaAUnaFecha = tipoDeDatoFecha
cambiemosLaFecha(tipoDeDatoFecha)
console.log("fecha original " + tipoDeDatoFecha)
console.log("fecha de la referencia a una fecha " + referenciaAUnaFecha)


function cambiemosLaFecha(fecha) {
    fecha.setFullYear(1999);
    console.log("fecha cambiada a " + fecha);
}

console.log("dime el tipo de la variable tipo de dato numerico: " + typeof tipoDeDatoNumerico)
console.log("dime el tipo de la variable tipo de dato cadena: " + typeof tipoDeDatoCadena)
console.log("dime el tipo de la variable tipo de dato decha: " + typeof tipoDeDatoFecha)
operacionesNumericas(1,3,5,7)
operacionesNumericas()

function operacionesNumericas () {
    let miNumero = new Number(3.141592654)
    console.log("valor almacenado" + miNumero.valueOf())
    console.log("valor almacenado" + miNumero.toFixed())
    console.log("valor almacenado" + miNumero.toFixed(4))
}
funcionGuay()
funcionGuay(1)
funcionGuay("mega","guay")
funcionGuay(2,13,12,31,231,3133)
function funcionGuay() {
    console.log("numero de parametros recibidos" + arguments.length)
    console.log("numero de parametros esperados" + arguments.callee.length)
    // if (arguments.length==arguments.callee.length) {
    //     console.log(mega + " " + guay);
    // }
    // if (arguments.length==1) {
    //     console.log("con " + mega + " meconformo");
        
        
    // }
}

function losArrays(){
    let miArray = new Array()
    miArray[0] = 7
    miArray[1] = "mis mierdas"
    console.log("el ultimo elemento es " + miArray[miArray.length-1] );
    let otroArray = [0,"valor",new Date()]
    let arrayAsociativo = new Array()
    arrayAsociativo["clave"] = "valor"
    let persona = new Array()
    persona.nombre = "stan"
    persona.apellido ="hiz"
    persona.funcion = funcionGuay
    persona.funcion("soy guay")
}
function Cubata(yelos,licorsillo){
    this.losyelos=yelos
    this.licor=licorsillo
    this.echarUnTrago = function (){
        return this.losyelos + " " + this.licor
    }
}
Cubata.prototype.generameUnString = function(){
    return this.losyelos +" " + licor
}
var micubata =new Cubata("dos yelos","whisky")
console.log(micubata.echarUnTrago())

