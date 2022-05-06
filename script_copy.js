const textE1=document.getElementById("text")
const speed1=document.getElementById("speed")

text="I am Shakti singh !"

let index=1

let num=500
let time=num/speed1.value
//let index=1;
writeText()
 
function writeText(){

    textE1.innerHTML=text.slice(0,index)
     index++;
     if( index > text.length){
         index=1
     }
    setTimeout(writeText,time)
}
speed1.addEventListener("input",(e)=>{time=num/e.target.value})