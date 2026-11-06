class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<operations.length;i++){
            
                if(operations[i].matches("-?[0-9]+")){
                int num=Integer.parseInt(operations[i]);
                stack.push(num);
                }
            
                else if(operations[i].equals("D")){
                    stack.push(stack.peek()*2);
                }
                else if(operations[i].equals("+")){
                    stack.push(stack.peek()+stack.get(stack.size()-2));
                }
                else if(operations[i].equals("C")){
                    stack.pop();
                }    
            }
            int sum=0;
            for(int x:stack){
                sum+=x;
            }
            return sum;
        }
    }
