/* 01_옵셔널 체이닝 연산자 */
var obj = null;
//var val = obj.value; //null은 값에 접근 할 수 없기 때문에 오류가 난다.
var val = obj?.value; 
console.log(`var val = obj?.value; : ${val}`);

var str = '';
var len = str && str.length; //빈 문자열은 fasly 이므로 str을 반환함.
console.log(`var len = str && str.length; : ${len}`);
/* ✅ 왜 ''를 && 연산에서는 falsy로 취급할까?
  == 비교에서는 타입을 boolean으로 변환 후 비교하기 때문에 '' == false는 true가 나온다.
  반면에, &&는 타입변환이 없기 때문에, ''(빈문자열)은 falsy 이므로 첫 falsy 값을 반환한다.
  '' === false 를 하면 false가 나온다. 그 이유는 타입 변환을 하지 않고 비교하기 때문.
 */
/* ✅ 자바스크립트에서 falsy 한 값들
false
0
-0
0n        // BigInt 0
''        // 빈 문자열
null
undefined
NaN

이외의 모든 값은 truthy 이다.
*/

var len = str?.length;
console.log(`var len = str?.length; : ${len}`);