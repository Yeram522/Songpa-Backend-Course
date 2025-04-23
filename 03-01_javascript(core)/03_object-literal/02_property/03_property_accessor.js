/* 03_프로퍼티 접근 */

var dog = {
    name: '뽀삐',
    eat: function (food) {
        console.log(`${this.name}(은)는 ${food}를 맛있게 먹어요`);
    }
};

// 마침표 표기법
dog.eat('고구마');
console.log(dog.name);

// 대괄호 표기법
console.log(dog['name']) // 왜 감싸서?
dog['eat']('고구마');

var obj = {
    'dash-key': 'dash-value',
    0: 1
};

// 키 값에 특수문자가 들어있으면 대괄호 표기법으로만 접근이 가능하다.
//console.log(obj.dash-key);//ReferenceError: key is not defined
//console.log(obj.'dash-key');//ReferenceError: key is not defined
//console.log(obj[dash-key]);//ReferenceError: key is not defined
console.log(obj['dash-key']);
