/* in 연산자 : 프로퍼티 존재 여부 확인하기 */
var student = {
    name: '유관순',
    age: 16,
    test: undefined
};

console.log(student.name === undefined);
console.log(student.height === undefined);
console.log(student.test === undefined); // 프로퍼티 값이 undefined라 프로퍼티는 존재하지만 true - 존재하지 않음으로 판별되는 문제

console.log("name" in student);
console.log("height" in student);
console.log("test" in student);