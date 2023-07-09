let token = localStorage.getItem('access_token');
let idtoken = localStorage.getItem('id');


let headers = {
    "Authorization": `Bearer ${localStorage.getItem("access_token")}`
}

const datas = [
    {
      id: 1,
      item: 'velopert',
    },
    {
      id: 2,
      item: 'tester',

    },
    {
      id: 3,
      item: 'liz',

    }
  ];

axios.get("http://localhost:8080",{headers: headers} )
.then((resp) => {

}).catch((err) => {
 
});


function logout(){


    let idtoken = localStorage.getItem('id');
    alert(idtoken + "님, 성공적으로 로그아웃 됐습니다 🔒");
    headers = null
    localStorage.removeItem("access_token");
    localStorage.removeItem("id");
  
    
     window.location.reload();
}