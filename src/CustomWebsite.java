public class CustomWebsite extends Website {

    public CustomWebsite(String name) {
        super(name);
    }


    @Override
    public void obtainMessage(String message) {
        StringBuilder sb = new StringBuilder();
        char[] chars = message.toCharArray();
        for (char c : chars)
            if (isCustom(c)) {
                sb.append(String.valueOf(c).toUpperCase());
                value++;
            } else sb.append(String.valueOf(c).toLowerCase());
        System.out.println("(" + name + ", " + value + ") informs: " + sb);
    }


    private static boolean isCustom(char c) {
        return "ABCDEFGHIJKabcdefghijk".indexOf(c) != -1;
    }
}
