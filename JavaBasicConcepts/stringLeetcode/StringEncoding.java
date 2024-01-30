public class StringEncoding{
    public static void main(String[] args){
        String word = "aaabbbababababew";

        String encodedString = stringEncoding(word);
        System.out.println(encodedString);
    }

    public static String stringEncoding(String message){
        int count=0;
		StringBuilder word = new StringBuilder();
		char[] arr = message.toCharArray();

		if(arr.length == 1){
			word.append(arr[0]);
			word.append(1);
			return word.toString();
		}
		for(int i=0; i<arr.length-1; i++){
			if(i == arr.length-2 && arr[i] == arr[i+1]){
				word.append(arr[i]);
				word.append(count+2);
				break;
			}else if(i == arr.length-2 && arr[i] != arr[i+1]){
				word.append(arr[i]);
				word.append(count+1);
				word.append(arr[i+1]);
				word.append(1);
				break;
			}
			if(arr[i] == arr[i+1]){
				count++;
			}else{
				word.append(arr[i]);
				word.append(count+1);
				count=0;
			}
		}
		return word.toString();
    }
}