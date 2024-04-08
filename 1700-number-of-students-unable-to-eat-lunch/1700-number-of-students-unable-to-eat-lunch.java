class Solution {
    public int[] rotateArray(int[] arr, int start)
    {
        int arrFirst = arr[start];
        for(int i = start; i < arr.length-1; i++)
        {
            arr[i] = arr[i+1]; 
        }
        arr[arr.length-1] = arrFirst;
        return arr;
    }
    
    public int countStudents(int[] students, int[] sandwiches) {
        int count = 0;
        int i = 0;
        while(i < students.length && count < students.length)
        {
            if(students[i] != sandwiches[i])
            {
                students = rotateArray(students, i);
            }
            else
            {
                i++;
                count = 0;
            }
            count++;
        }
        return students.length-i;
    }
}