function reverseNumber(number) {
    // Convert the number to a string
    let numberString = number.toString();

    // Reverse the string
    let reversedString = numberString.split('').reverse().join('');

    // Convert the reversed string back to a number
    let reversedNumber = parseInt(reversedString);

    return reversedNumber;
}

// Test the function
let inputNumber = 12345;
let reversedNumber = reverseNumber(inputNumber);
console.log("Input:", inputNumber);
console.log("Reversed:", reversedNumber);
