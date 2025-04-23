/* 아래의 코드를 실행했을 때 출력결과가 나오도록 Person 생성자 함수를 정의하세요.

const person = new Person("홍길동", 20);
person.sayHello();

------- 출력 결과 --------
안녕하세요, 제 이름은 홍길동 이고 나이는 20세입니다.
*/

/* 생성자 함수 정의, 생성자 함수의 필요 이유 */ 

/*// 생성자 함수에 의한 객체 생성 -> 동일한 객체 여러 개 간편하게 생성할 수 있다.
function Student(name,age){

    // 생성자 함수 내부의 this는 생성자 함수가 생성할 인스턴스를 가리킨다.
    this.name = name;
    this.age = age;
    this.getInfo = function(){
        return `${this.name}(은)는 ${this.age}세 입니다.`;
    }
}

const student3 = Student("장보고", 30);
const student4 = Student("신사임당", 40); */


// 생성자 함수에 의한 객체 생성 -> 동일한 객체 여러 개 간편하게 생성할 수 있다.
function Student(name,age){

    // 생성자 함수 내부의 this는 생성자 함수가 생성할 인스턴스를 가리킨다.
    this.name = name;
    this.age = age;
    this.getInfo = function(){
        return `안녕하세요, 제 이름은 ${this.name} 이고 나이는 ${this.age}입니다.`;    
    }
}

const student3 = new Student("장보고", 30);
const student4 = new Student("신사임당", 40);

// 메소드 호출
console.log(student3.getInfo());