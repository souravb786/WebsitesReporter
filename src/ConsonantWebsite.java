public class ConsonantWebsite extends Website {

    public ConsonantWebsite(String name) {
        super(name);
    }


    @Override
    public void obtainMessage(String message) {
        StringBuilder sb = new StringBuilder();
        char[] chars = message.toCharArray();
        for (char c : chars)
            if (isConsonant(c)) {
                sb.append(String.valueOf(c).toUpperCase());
                value++;
            } else sb.append(String.valueOf(c).toLowerCase());
        System.out.println("(" + name + ", " + value + ") informs: " + sb);
    }


    private static boolean isConsonant(char c) {
        int x = 0;
		if(c<=65)x=c-65;
		else x=c-97;
		
		return (x!=0 && x!=4 && x!=8 && x!=14 && x!=20);
    }
}

