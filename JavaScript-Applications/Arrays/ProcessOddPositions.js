function solve(nums) {
    const odd = nums.filter((x, i) => i % 2);
    const doubled = odd.map(x => x * 2);
    doubled.reverse();

    console.log(doubled.join(' '));
}
solve([10, 15, 20, 25])
solve([3, 0, 10, 4, 7, 3])

const solve1 = (nums) => nums
        .filter((x, i) => i % 2)
        .map(x => x * 2)
        .reverse()
        .join(' ');


console.log(solve1([10, 15, 20, 25]))
console.log(solve1([3, 0, 10, 4, 7, 3]))