

function logout(){

    let idtoken = localStorage.getItem('id');
    alert(idtoken + "님, 성공적으로 로그아웃 됐습니다 🔒");
    headers = null
    localStorage.removeItem("access_token");
    localStorage.removeItem("id"); 
    window.location.reload();
}