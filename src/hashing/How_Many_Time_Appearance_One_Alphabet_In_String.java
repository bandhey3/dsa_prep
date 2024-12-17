

package hashing;


public class How_Many_Time_Appearance_One_Alphabet_In_String {
    public static void main(String[] args) {
        String str = "absigurd";
        char alpha = 'j';
        System.out.println(appearance(str,alpha));
    }

    private static int appearance(String str, char alpha) {
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-'a']++;
        }

        return arr[alpha-'a'];

    }
}
