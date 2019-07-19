function initialize(){
    valor=0;
    numero= new Array()
    display = document.getElementById("display")
}
function sumar(){
    valor+=new Number(numero.join(''))
    numero.length=0
    display.value=valor
}
function dividir(){
    valor/=new Number(numero.join(''))
    numero.length=0
    display.value=valor
}
function restar(){
    valor-=new Number(numero.join(''))
    numero.length=0
    display.value=valor
}
function multiplicar(){
    valor*=new Number(numero.join(''))
    numero.length=0
    
    display.value=valor
}
function sendvalue(e){
    numero.push(e.value)
    display.value+=e.value
}
function calcular(){
    numero.length=0
    valor=0
}