/* 01_전역과 지역 스코프 */

var x = 'global x';
var y = 'global y';

function outer(){

    var z = "outer local z";

    console.log(x); // 전역이니까 함수 안에서 호출 가능
    console.log(y);
    console.log(z);

    function inner(){
        var x = "inner local x";

        console.log(x); // 지역 변수 호출
        console.log(y);
        console.log(z);
    }

    inner();
}

outer();

console.log(x);
// console.log(z); // ReferenceError: z is not defined