
sumar(1,2,3,4,6,78,9,9,3,2)
sumar()
sumar(1)
sumar(1,2,3)
function sumar(a,b){
    if (arguments.length>=2) {
        var valor = 0
        for (let index = 0; index < arguments.length; index++) {
            valor +=arguments[index]
        }
    }
    return valor
}
Array.prototype.funcionsumatoria=sumar
var miarray = new Array(1,3,4,5)
console.log(miarray.funcionsumatoria(1,8,9));
//concatenar
function concatenarobjeto(){
    let concat =""
    for (let index = 0; index < this.length; index++) {
        concat += " " + this[index];
    }
    return concat
}
Array.prototype.concatena = concatenarobjeto
console.log(miarray.concatena())

let hombreObjeto ={}
let cartadecubatas = [
    {
        yelos: 2,
        licor: "whiskey"
    },{
        yelos:5,
        licor: "no da igual"
    },{
        yelos:2,
        licor:"Cerveza"
    }
]
console.log(cartadecubatas[2].licor)