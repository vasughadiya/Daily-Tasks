const upper_left = (st) => {
    let new_str = ''
    for (let i = 0; i < st.length; i++) {
        if (st[i] === st[i].toUpperCase()) {
            new_str += st[i]
        }
    }
    for (let i = 0; i < st.length; i++) {
        if (st[i] === st[i].toLowerCase()) {
            new_str += st[i]
        }
    }
    // console.log(new_str);
    return new_str
    // document.getElementById('t9').innerHTML += new_str
}

const str = prompt("Enter string : ", "hApPyWrAa");

// upper_left(str);
document.getElementById('t9').innerHTML += upper_left(str)