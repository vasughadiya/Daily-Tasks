function count_digit(n) {
    let count = 0;
    while (n > 0) {
        n /= 10;
        n = Math.floor(n)
        count++;
    }
    return count;
}

let num = 12543
console.log(count_digit(num));