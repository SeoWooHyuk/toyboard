
function logout(){


    let idtoken = localStorage.getItem('id');

    localStorage.removeItem("bbs_access_token");
    localStorage.removeItem("id");
    alert(idtoken + "님, 성공적으로 로그아웃 됐습니다 🔒");
    
     window.location.reload();
}