class Stack {
  constructor() {
    this.arr = [];
    this.index = 0;
  }
  push(item) {
    this.arr[this.index++] = item;
  }
  pop() {
    if (this.index <= 0) return null;
    const result = this.arr[--this.index];
    return result;
  }
  peek() {
    const result = this.arr[this.index - 1];
    return result;
  }
  size() {
    return this.index;
  }
}

function solution(S) {
  if (S.charAt(0) == ')') return 0;
  let stack = new Stack();

  for (let i = 0; i < S.length; i++) {
    let temp = S.charAt(i);
    if (temp == '(') {
      stack.push(temp);
    } else {
      if (stack.size() > 0) {
        stack.pop();
      } else {
        return 0;
      }
    }
  }
  if (stack.size() == 0) return 1;
  else return 0;
}
