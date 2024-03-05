function fibonacciSeries(N) {
    let fibSeries = [];
    if (N >= 1) {
        fibSeries.push(0);
    }
    if (N >= 2) {
        fibSeries.push(1);
    }
    for (let i = 2; i < N; i++) {
        fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
    }
    return fibSeries;
}

// Test the function
let N = 10;
let result = fibonacciSeries(N);
console.log(result.join(' ')); // Output: 0 1 1 2 3 5 8 13 21 34
