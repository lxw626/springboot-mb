function hello(){
    alert('我是b.js')
}
function bb(){
    alert('我是b.js里面定义的方法,将在a.js里面调用')
}
function bta(){
    alert('我是bta')
    aa()
}
var b =new Object()
b.hello = function (){
    alert('我是b.js')
}