function twoSum(nums: number[], target: number): number[] {
    
    const numToIndex: { [key: number]: number } = {};

    
    for (let i = 0; i < nums.length; i++) {
        
        const complement = target - nums[i];

        
        if (numToIndex[complement] !== undefined) {
            
            return [numToIndex[complement], i];
        }

       
        numToIndex[nums[i]] = i;
    }

    
    return [];
}


const nums = [2, 7, 11, 15];
const target = 9;
console.log(twoSum(nums, target));  
