function hello(){
    alert('我是a.js')
}
function aa(){
    alert('我是a.js里面定义的方法,将在b.js里面调用')
}
function atb(){
    alert('我是atb')
    bb()
}

var a =new Object()
a.hello = function (){
    alert('我是a.js')
}
