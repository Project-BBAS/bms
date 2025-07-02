var container = document.getElementById('map');
var map;

function createMap(lat, lon) {
    var locPosition = new kakao.maps.LatLng(lat, lon);
    var options = {
        center: locPosition,
        level: 2
    };
    map = new kakao.maps.Map(container, options);
}

// HTML5의 geolocation 사용 여부 확인
if (navigator.geolocation) {

    // 접속 위치 얻어오기
    navigator.geolocation.getCurrentPosition(function (position) {
        var lat = position.coords.latitude, // 위도
            lon = position.coords.longitude;    // 경도

        createMap(lat, lon);
    })
} else {
    // geolocation 미지원 시 기본 위치 사용
    createMap(33.450701, 126.570667);
}