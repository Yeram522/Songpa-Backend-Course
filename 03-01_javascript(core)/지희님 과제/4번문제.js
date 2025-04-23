/* 아래의 함수들을 화살표 함수로 변환해보세요.

function greet() {
    return "Hello!";
}


function getInfo(name, age) {
    return `name: ${name}, age: ${age}`;
}
*/

/*
message = function(){
    return 'hello wold';
}

console.log(message());

// function 생략 가능
message = () => {
    return 'Arrow Function!'; 
*/ 

greet = () => {
    return "Hello!";
}
console.log(greet()); 

getInfo = (name, age) => {
    return `name: ${name}, age: ${age}`;
}
console.log(getInfo(`황지희`, 32)); 



