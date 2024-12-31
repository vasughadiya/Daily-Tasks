function check_substring(st) {
    if (st.includes('ee')) {
        return true;
    } else {
        return false;
    }
}
let str = "Hello, Worlde!";
console.log(check_substring(str));