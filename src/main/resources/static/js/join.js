function join(){

  const id = document.getElementsByName("id1")[0].value;
  const pwd = document.getElementsByName("pwd1")[0].value;
  const checkPwd = document.getElementsByName("checkPwd")[0].value;
  const name = document.getElementsByName("name")[0].value;
  const bday = document.getElementsByName("bday")[0].value;
  const postcode = document.getElementsByName("postcode")[0].value;
  const address = document.getElementsByName("address")[0].value;
  const detailaddress = document.getElementsByName("detailaddress")[0].value;

  const req = {
      id: id,
      pwd: pwd,
      checkPwd : checkPwd,
      name : name,
      bday : bday,
      postcode : postcode,
      address : address,
      detailaddress : detailaddress,
  }


  axios.post("http://localhost:8080/user/join", req)
  .then((resp) => {

    window.location.reload();

  }).catch((err) => {
      console.log("[Login.js] login() error :<");
      console.log(err);

      alert("⚠️ " + err.response.data);
  });
}




function sample6_execDaumPostcode() {
  new daum.Postcode({
      oncomplete: function(data) {
          // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

          // 각 주소의 노출 규칙에 따라 주소를 조합한다.
          // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
          var addr = ''; // 주소 변수

          //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
          if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
              addr = data.roadAddress;
          } else { // 사용자가 지번 주소를 선택했을 경우(J)
              addr = data.jibunAddress;
          }

          // 우편번호와 주소 정보를 해당 필드에 넣는다.
          document.getElementById('sample6_postcode').value = data.zonecode;
          document.getElementById("sample6_address").value = addr;
          // 커서를 상세주소 필드로 이동한다.
          document.getElementById("sample6_detailAddress").focus();
      }
  }).open();
}




