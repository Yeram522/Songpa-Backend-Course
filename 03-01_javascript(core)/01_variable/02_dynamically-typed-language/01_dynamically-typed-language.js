/* 01_동적 타입 언어 */
// 재할당이 가능하다

var test;
console.log(typeof test); // undefined

test = 1;
console.log(typeof test); // number

test = 'Javascript';
console.log(typeof test);

test = true;
console.log(typeof test);

test = null; //어떤 것도 참조하고 있지 않은 상태
console.log(typeof test);

test = Symbol();

test = {}; // 객체리터럴

test = []; // 배열

test = function(){}; // 함수
console.log(typeof test);