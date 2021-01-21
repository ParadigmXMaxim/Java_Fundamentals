package labs_examples.objects_classes_methods.labs.methods;
import java.util.ArrayList;
public class MethodTraining {
    public int year;

    public static int largestNum(int a, int b, int c, int d){
        int highestNum = a;
        if(b > highestNum){
            highestNum = b;
        }
        if(c > highestNum){
            highestNum = c;
        }
        if(d > highestNum){
            highestNum = d;
        }

        return highestNum;
    }

    public static int consonantCount(String word){
        int count = 0;
        word = word.toLowerCase();
        System.out.println("Your Word: " + word);
        for(int x = 0; x < word.length(); x++){
            if(word.charAt(x) == 'a' || word.charAt(x) == 'e' || word.charAt(x) == 'i' || word.charAt(x) == 'o' || word.charAt(x) == 'u' ){
                //System.out.println(word.charAt(x) + " is a vowel");
                continue;
            }else{
                //System.out.println(word.charAt(x) + " is a consonant");
                count++;
            }
        }
        return count;
    }

    public static String isPrime(int num){
        if(num < 2){
            return num + " is not a prime number";
        }else{
            int prime = 1;
            for(int x = 2; x <= num; x++){
                if(num % x == 0){
                    prime++;
                }
                if(prime > 2){
                    return num + " is not a prime number";
                }
            }
            return num + " is a prime number";
        }
    }

    public static int[] lowHighValue(int[] values){
        int[] container = new int[2];
        int lowest = values[0];
        int highest = values[0];
        for(int x = 0; x < values.length; x++){
            if(values[x] > highest){
                highest = values[x];
            }
            if(values[x] < lowest){
                lowest = values[x];
            }
        }
        container[0] = highest;
        container[1] = lowest;
        return container;
    }

    public static Integer arrayListLength(int maxNum, int divisor1, int divisor2){
        if(divisor1 == 0 || divisor2 == 0){
            return -1;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int x = 0; x < maxNum; x++){
            if(x / divisor1 != 0){
                if(x / divisor2 != 0){
                    System.out.println(x + " is added to the list");
                    list.add(x);
                }
            }else{
                continue;
            }
        }

        return list.size();
    }

    public static int[] reverseArray(int[] array){
        int temp;
        for(int x = 0; x < array.length / 2; x++){
            temp = array[x];
            array[x] = array[array.length - 1 - x];
            array[array.length - 1 - x] = temp;
        }

        return array;
    }

    public static void main(String[] args){
        System.out.println("largestNum Execution");
        int highest = largestNum(89,23,65,109);
        System.out.println("The largest number in my array is " + highest);
        System.out.println();

        System.out.println("consonantCount Execution");
        int consonants = consonantCount("Cornucopia");
        System.out.println("The number of consonants in your word is " + consonants);
        System.out.println();

        System.out.println("isPrime Execution");
        String prime = isPrime(127);
        System.out.println(prime);
        System.out.println();

        System.out.println("lowHighValue Execution");
        int[] array = {34,54,21,23,21,56,76,43,32,19};
        int[] numbers = lowHighValue(array);
        System.out.println("The highest and lowest value in my array:");
        System.out.println("Highest: " + numbers[0]);
        System.out.println("Lowest: " + numbers[1]);
        System.out.println();

        System.out.println("arrayListLength Execution");
        Integer count = arrayListLength(15,2,4);
        System.out.println("My arrayList length is " + count);
        System.out.println();

        System.out.println("reverseArray Execution");
        int[] initialArray = {23,54,64,32,13,211,213};
        System.out.print("Initial Array: ");
        for(int num: initialArray){
            System.out.print(num + " ");
        }
        System.out.println();
        int[] newArray = reverseArray(initialArray);
        System.out.print("New Array: ");
        for(int num: newArray){
            System.out.print(num + " ");
        }
        System.out.println();
    }


}
