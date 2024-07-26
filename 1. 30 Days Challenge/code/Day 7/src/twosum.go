package main

import "fmt"


func twoSum(nums []int, target int) []int {
   
    numToIndex := make(map[int]int)

    
    for i, num := range nums {
        
        complement := target - num

        
        if index, found := numToIndex[complement]; found {
            
            return []int{index, i}
        }

       
        numToIndex[num] = i
    }

    return []int{}
}

func main() {
    
    nums := []int{2, 7, 11, 15}
    target := 9
    result := twoSum(nums, target)
    fmt.Println(result) 
}
