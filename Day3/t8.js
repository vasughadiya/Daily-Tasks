const count_vowels = (st) => {
    let count = 0;
    st = st.toLowerCase();
    for (let i = 0; i < st.length; i++) {
        if (st[i] == 'a' || st[i] == 'e' || st[i] == 'i' || st[i] == 'o' || st[i] == 'u') {
            count++;
        }
    }
    console.log(count)
}
count_vowels('Oelebration');