import java.util.Arrays;
public class arrayexample
{
public static void main(String[]args)
{
int[]array = new int[]{12,45,2,36,14};
Arrays.sort(array);
System.out.println();
System.out.println("Array Sorted in Ascending Orede");
System.out.println("------------------");
for(int i=0;i<array.length;i++)
{
System.out.println(array[i]);
}
}
}