/* 01_프로퍼티 : 객체는 프로퍼티의 집합이며, 프로퍼티는키와 값으로 구성 된다.*/

var student = {
    name:'유관순',
    age : 16
};

/*
    프로퍼티 키 : 빈 문자열을 포함하는 모든 문자열이므로 따옴표를 사용하지만
                식별자 네이밍 규칙을 따르는 경우 사용하지 않아도 된다.
    프로퍼티 값 : 자바스크립트에서 사용할 수 있는 모든 값
*/
var obj = {
    normal :'normal value',
    '@ s p a c e @' : 'space value',
    '' : '', // 오류 발생하지는 않지만 논리적으로 문제가 생길 수 있어서 권장하지 않는다.
    0 : 1, // 숫자 키는 내부적으로 문자열로 변환된다.
    var : 'var', // 예약어 키는 오류가 발생하지는 않지만 권장하지 않는다.
    normal : 'new value', // 이미 존재하는 키를 중복 선언하면 나중에 선언한 프로퍼티로 덮어쓴다.
};

console.log(obj['normal']);

var key = 'test';
obj[key] = 'test value';

console.log(obj)