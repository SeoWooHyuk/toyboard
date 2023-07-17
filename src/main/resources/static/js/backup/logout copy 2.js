

export function logout(){

    let idtoken = localStorage.getItem('id');

    const req = {
        id: idtoken,
    }

    axios.post("http://localhost:8080/user/logout", req)
    .then((resp) => {
        console.log("[logout.js] login() success :D");
        console.log(resp.data);
  
    
        localStorage.removeItem("access_token");
        localStorage.removeItem("id"); 
        localStorage.removeItem("expiration"); 
        window.location.reload();
  
    }).catch((err) => {
        console.log("[Login.js] login() error :<");
        console.log(err);
  
        alert("⚠️ " + err.response.data);
    });

    alert(idtoken + "님, 성공적으로 로그아웃 됐습니다 🔒");
}