public abstract class Java36 {
    public static void main(String []args){
        // string buffer and string builder class in java used to create mutable string 
        //string buffer
        StringBuffer sb = new StringBuffer("Hello");
        //string buffer is mutable
        System.out.println(sb.capacity());
        //default capacity is 16
        System.out.println(sb.length());
        //length of string
        sb.append(" World");
        //append string
        String str=sb.toString();
        //convert to string
        System.out.println(str);
        sb.deleteCharAt(3);
        //delete character at index 3
        sb.insert(0, "Hi ");
        //insert string at index 0
        System.out.println(sb);

        // differenc between StringBuilder and StringBuffer
        // StringBuffer is thread safe
        // StringBuilder is not thread safe
    }
}
