const weatherBox = document.querySelector('.weather');

function connect(position) {
  let lat = position.coords.latitude;
  let lon = position.coords.longitude;

  const API_KEY = `76f152e050b9691e3b75750fefa28c35`;
  const URL = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${API_KEY}&units=metric`;

  fetch(URL)
    .then((response) => response.json())
    .then((data) => {
      console.log(data);
      let weather = data.weather[0].main;
      let temp = data.main.temp;

      let pTag = document.createElement('p');
      pTag.innerHTML = `날씨 : ${weather} <br> 현재 기온 : ${temp}`; 

      weatherBox.append(pTag);

    })
    .catch(() => {
      console.log('실패');
    })
  
}
function error() {
  alert('위치 차단함');
};

navigator.geolocation.getCurrentPosition(connect, error);