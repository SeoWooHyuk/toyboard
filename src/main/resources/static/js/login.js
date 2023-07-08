
function login(){

    const id = document.getElementsByName("id")[0].value;
    const pwd = document.getElementsByName("pwd")[0].value;

    const req = {
        id: id,
        pwd: pwd
    }

    axios.post("http://localhost:8080/user/login", req)
    .then((resp) => {
        console.log("[Login.js] login() success :D");
        console.log(resp.data);

            alert(resp.data.id + "님, 성공적으로 로그인 되었습니다 🔐");

            // JWT 토큰 저장
            localStorage.setItem("access_token", resp.data.jwt);
            localStorage.setItem("id", resp.data.id);
            window.history.back();
            // window.location.reload();

            // var html = '<p th:text="${message}">'+ idtoken + '</p>';
            // document.body.insertAdjacentHTML('beforeend', html);

    }).catch((err) => {
        console.log("[Login.js] login() error :<");
        console.log(err);

        alert("⚠️ " + err.response.data);
    });
}
