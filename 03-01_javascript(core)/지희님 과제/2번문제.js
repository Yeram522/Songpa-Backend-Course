/*2. 

아래의 객체를 for in 반복문을 사용하여, 객체의 모든 키와 그에 해당하는 값을 출력하는 코드를 작성하세요.

var person = {
    firstName: 'GilDong',
    lastName: 'Hong',
    age: 20
}; 

- for문 구조
- 객체 구조
- 객체 안에 있는 프로퍼티 접근 어떻게 하는지
02/04
*/

var person = {
    firstName: 'GilDong',
    lastName: 'Hong',
    age: 20
}; 

// for(var key in student){
//     console.log(`key : ${key}`); // 키
//     console.log(`student[key] : ${student[key]}`); // 키에 해당하는 값
// }

for (var key in person) { 
    console.log( `${key} ${person[key]}`);
}