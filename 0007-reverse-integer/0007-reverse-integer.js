/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
  let isNeg=false
  if (x<0){
    x=Math.abs(x)
    isNeg=true
  }
  let rev=0
  let l=x
  while(x>0){
    let rem=x%10
    console.log(rem)
    rev=(rev*10)+rem
x=Math.floor(x/10)

  }
  if(isNeg===true){
    rev=rev*-1
  }
  if (rev>(Math.pow(2,31)-1) || rev<(-Math.pow(2,31))){
    return 0
  }
    return rev
};