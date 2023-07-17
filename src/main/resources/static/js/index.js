let logout = await import('./logout.js');

let token = localStorage.getItem("access_token");
let idtoken = localStorage.getItem("id");
let expiration = localStorage.getItem('expiration');

let expirationcheck =  new Date(expiration);
let timenow =  new Date();
console.log(expirationcheck);
console.log(timenow);

if(expiration != null)
{
  if(timenow > expirationcheck)
  {
    logout.logout();
  }
}

let headers = {
  "Authorization": `Bearer ${localStorage.getItem("access_token")}`
}  

axios.get("http://localhost:8080",{headers: headers} )
.then((resp) => {}).catch((err) => {});

//문서다읽고 를 제일나중에 실행해라
$(document).ready(function () {
  var html = ""; //리스트뽑아내는테스트
  // var html2 = ''; //리스트뽑아내는테스트

  if (idtoken == null) {
    html += '<button class="btns popup-btn">로그인</button>';
    html += '<button class="btns popup-btn-2">회원가입</button>';
  } else {
    html += '<div class="btn-area">';
    html +=
      '<button class="btns popup-btnlogout" onClick="logout()">Logout</button>';
    html += "</div>";
  }

  $("#loginout").html(html);
  // $('#loginoutbox2').html(html2); 테스트용

  $(".popup-btn").click(function () {
    $(".popup-1").addClass("active");
  });

  $(".popup-btn-2").click(function () {
    $(".popup-2").addClass("active");
  });

  $(".popup-1__btn-close").click(function () {
    $(".popup-1").removeClass("active");
  });

  $(".popup-2__btn-close").click(function () {
    $(".popup-2").removeClass("active");
  });

  //로그아웃버튼클릭
  $(".popup-btnlogout").click(function () {
    logout.logout();
  }); 
  

});

//나중을 위한 테스트용
// const datas = [ //리스트뽀아낼때를 위한 샘플데이터
//     {
//       id: 1,
//       item: 'velopert',
//     },
//     {
//       id: 2,
//       item: 'tester',

//     },
//     {
//       id: 3,
//       item: 'liz',

//     }
//   ];
