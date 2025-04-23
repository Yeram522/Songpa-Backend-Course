/* 01_var */

// 1. 변수 중복 선언 허용
var msg = '안녕하세요';
console.log(msg);

// 자바스크립트 엔진에 의해 초기화된다.
var msg = '안녕히가세요';
console.log(msg);

var msg;
console.log(msg);

// 2. 함수 레벨 스코프 - 앞에서 봤음

// 3. 변수 호이스팅
console.log(test);
var test = '반갑습니다'; // 어디에 저장ㄴ되는거? stack? static?
console.log(test);