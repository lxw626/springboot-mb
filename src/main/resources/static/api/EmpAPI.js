// 此处src='./ajax.js'获取不到???需要从服务端获取到的路径???
// document.write("<script type='text/javascript' src='/api/ajax.js'></script>");
// document.write("<script type='text/javascript' src='/springbootmb/api/ajax.js'></script>");


function getEmpsBypage(url,params,type) {
    return ajax(url,params,type)
}

function saveEmp(url, emp, type) {
    return ajax(url, emp, type)
}

function deleteEmpByEmpno(url, empno, type) {
    return ajax(url, empno, type)
}
function getStatistics(url){
    return ajax(url)
}
