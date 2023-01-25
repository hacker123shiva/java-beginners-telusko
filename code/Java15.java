public class Java15 {
    public static void main(String []args){
        /*
         *Unlike if-then and if-then-else statements, the switch statement can have a number of possible execution paths. A switch works with the byte, short, char, and int primitive data types. It also works with enumerated types (discussed in Enum Types), the String class, and a few special classes that wrap certain primitive types: Character, Byte, Short, and Integer
         */
        String str="shiva";
        switch(str){
            case "shiva":
                System.out.println("shiva");
                break;
            case "kumar":
                System.out.println("kumar");
                break;
            default:
                System.out.println("default");
        }
/*
 The break statements are necessary because without them, statements in switch blocks fall through: All statements after the matching case label are executed in sequence, regardless of the expression of subsequent case labels, until a break statement is encountered. The program SwitchDemoFallThrough shows statements in a switch block that fall through
 */
        enum Day{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY};
        
        Day day=Day.SUNDAY;
        switch(day){
            case SUNDAY:
                System.out.println("sunday");
                break;
            case MONDAY:
                System.out.println("monday");
                break;
            default:
                System.out.println("default");
        }

        int x=9;
        switch(x){
            case 8:
                System.out.println("8");
                break;
            case 7:
                System.out.println("7");
                break;
             
        }

/*
 The default section handles all values that are not explicitly handled by one of the case sections.
 */

    }
}
