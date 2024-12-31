const soryByAscii = (lst) => {
    return lst.sort((a, b) => a.charCodeAt(0) - b.charCodeAt(0))
}

const ary = ['b', 'B', 'w', 'W', 'a', 'A', 'c', 'C']
console.log(soryByAscii(ary))