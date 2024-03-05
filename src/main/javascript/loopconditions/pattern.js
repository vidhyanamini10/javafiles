function printPattern() {
    for (let i = 4; i >= 0; i--) {
        let line = '';
        for (let j = 0; j < 5; j++) {
            if (j < i) {
                line += '+';
            } else {
                line += '-';
            }
        }
        console.log(line);
    }
}

// Test the function
printPattern();
