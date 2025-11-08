public class count
{
    public static void main(String[] args) {
        int key=5;
        int count=0;
        int arr[]={1,2,3,3,3,5,6,5,7,8,9};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==key){
                count++;
            }
        }
        System.out.println(count);
    }
    
}