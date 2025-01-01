document.getElementById('inputfile').addEventListener('change', function () {
    const result = (word) => {
        const temp = {};
        for (let i = 0; i < word.length; i++) {
            if (temp[word[i]] !== undefined) {
                document.getElementById('output').innerHTML += 'Word "' + word + '" ➞ ' + JSON.stringify({ [word[i]]: [temp[word[i]], i] }) + '<br>';
                break
            }
            temp[word[i]] = i;
        }
    };

    var fr = new FileReader();
    fr.onload = function () {
        const words = fr.result.split('\n');
        words.forEach((word) => {
            result(word.trim());
        });
    };

    fr.readAsText(this.files[0]);
});
