function read(){
fetch('/board/11/replies')
  .then((response) => response.json())
  .then((json) => console.log(json));
}



function register(data){
fetch('/board/11/replies', {
  method: 'POST',
  body: JSON.stringify(data),
  headers: {
    'Content-type': 'application/json; charset=UTF-8',
  },
})
  .then((response) => response.json())
  .then((json) => console.log(json));
}