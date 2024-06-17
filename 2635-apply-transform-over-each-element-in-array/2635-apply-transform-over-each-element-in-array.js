/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    
    let ans=[];
    arr.forEach((item,index)=>{
        ans[index]=fn(item,index);
    })
    
    return ans;
};