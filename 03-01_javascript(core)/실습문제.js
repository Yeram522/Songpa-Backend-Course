// 1번 문제 함수
function isOdd(num) {
    num % 2 == 0 && console.log("짝수입니다")
    num % 2 == 0 || console.log("홀수입니다")
};

// 2번 문제 객체
var person = {
    firstName: 'GilDong',
    lastName: 'Hong',
    age: 20
};

// 3번 문제 함수
function sum(a, b) {
    return a + b;
}

// 4번 문제 : 화살표 함수로 변환하기
greet = () => "Hello!";
getInfo = (name, age) => `name : ${name}, age:${age}`;

// 5번 문제 : Person 생성자 함수 정의하기
function Person(name, age) {
    this.name = name;
    this.age = age;

    this.sayHello = function () {
        console.log(`안녕하세요, 제 이름은 ${this.name}이고 나이는 ${this.age}세 입니다.`);
    }
}

// 6번 문제 : user 객체 다루기
const user = {
    name: "koala",
    age: 20
};

// 7번 문제 : car 객체와 fireCar 객체 정의하기.
const car = {
    brand : "brand",
}

const firecar = {
    __proto__ : car,
    color : "color"
}

// 정답 실행 함수
function test() {
    console.log(`1번 문제`);
    console.log('n = 10 isOdd(n)');
    isOdd(10);
    console.log('n = 9 isOdd(n)');
    isOdd(9);
    console.log('---------------');
    console.log('2번 문제')
    for (let prop in person) {
        console.log(`${prop} : ${person[prop]}`);
    };

    console.log('---------------');
    console.log('3번 문제');
    console.log(`sum(a,b) a=3 b=5 : ${sum(3, 5)}`);

    console.log('---------------');
    console.log('4번 문제');
    console.log(`${greet()}`);
    console.log(`${getInfo("김예람","26")}`);
    
    console.log('---------------');
    console.log('5번 문제');
    const person2 = new Person("홍길동", 20);
    person2.sayHello();

    console.log('---------------');
    console.log('6번 문제');
    user.email = "koala.ohgiraffers@gmail.com";
    user.age = 21;
    user.name = undefined;
    console.log(user)

    console.log('---------------');
    console.log('7번 문제');
    for(let prop in firecar){
        ownProp = firecar.hasOwnProperty(prop);

        if(ownProp){
            console.log(`${prop}는 자기 자신의 프로퍼티이다.`);
        }
        else{
            console.log(`${prop}는 상속받은 프로퍼티이다.`);
        }
    }

};


test()