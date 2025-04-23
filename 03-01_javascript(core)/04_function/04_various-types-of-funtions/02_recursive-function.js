/* 02_재귀 함수 */

// 5! = 1 * 2 * 3 * 4 * 5
// n! = 1 * 2 * ... * (n-1) * n;
function factorial(n){
    if(n<=1)
        return 1; //n이 1이하면 재귀호출 멈춘다.

    // 재귀호출
    return n * factorial(n - 1);
}

console.log(factorial(1));
console.log(factorial(2));
console.log(factorial(3));
console.log(factorial(4));
console.log(factorial(5));