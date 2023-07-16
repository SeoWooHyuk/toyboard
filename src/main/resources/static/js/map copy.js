
//다음 주소 api
$(document).ready(function() {

	var xymap = null
  axios.get("http://localhost:8080/jsonapi")
  .then((resp) => {
    xymap = resp.data.data;

    console.log("", resp.data);
    var mapContainer = document.getElementById('map'), // 지도를 표시할 div  
    mapOption = { 
        center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
        level: 13 // 지도의 확대 레벨
    };

    var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

var latlng = [];  
var content = []; 


for (var i = 0; i < xymap.length; i ++) {

  latlng[i] = new kakao.maps.LatLng( parseFloat(xymap[i].위도) , parseFloat(xymap[i].경도));
  content[i] = '<div id="test">'+xymap[i].시설명+'</div>';

  // 마커를 생성합니다
  var marker = new kakao.maps.Marker({
      map: map, // 마커를 표시할 지도
      position: latlng[i] // 마커의 위치
  });

  // 마커에 표시할 인포윈도우를 생성합니다 
  var infowindow = new kakao.maps.InfoWindow({
      content: content[i] // 인포윈도우에 표시할 내용
  });

  // 마커에 mouseover 이벤트와 mouseout 이벤트를 등록합니다
  // 이벤트 리스너로는 클로저를 만들어 등록합니다 
  // for문에서 클로저를 만들어 주지 않으면 마지막 마커에만 이벤트가 등록됩니다
  kakao.maps.event.addListener(marker, 'mouseover', makeOverListener(map, marker, infowindow));
  kakao.maps.event.addListener(marker, 'mouseout', makeOutListener(infowindow));
}

// 인포윈도우를 표시하는 클로저를 만드는 함수입니다 
function makeOverListener(map, marker, infowindow) {
  return function() {
      infowindow.open(map, marker);
  };
}

// 인포윈도우를 닫는 클로저를 만드는 함수입니다 
function makeOutListener(infowindow) {
  return function() {
      infowindow.close();
  };
}

  }).catch((err) => {
      console.log(err);
  });

});  