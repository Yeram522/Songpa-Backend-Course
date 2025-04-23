/* 05_symbol-and-object */


// 심벌 값 생성
var key = Symbol('key')
console.log(typeof key); // typeof 연산자로 자료형을 알 수 있다.

// 객체 생성
var obj = {};

obj[key] = 'value';
console.log(obj[key]);

/* 자바스크립트의 데이터 타입은 크게 원시 타입과 객체 타입으로 분류한다.
자바스크립트는 객체 기반의 언어이며, 자바스크립트를 이루고 있는 거의 모든 것이 객체이다.
number, string, boolean, undefined, null, symbol 6가지 데이터 타입 이외의 값은 모두 객체 타입이다.
*/
