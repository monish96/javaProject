    /*

     *  Java Program to Check for balanced paranthesis by using Stacks

     */

     

    import java.util.*;

     

    public class Bracket

    {

        public static void main(String[] args) 

        {

          String str = "b.	} A recruitment was conducted in a college (ABC)  on April 20,2013 [Saturday] for all colleges}"; 

            Stack<Integer> stk = new Stack<Integer>();

            System.out.println("Parenthesis Matching Test\n");

             char[] strArray = str.toCharArray();  
        StringBuffer stringBuffer = new StringBuffer();  
        for (int i = 0; i < strArray.length; i++) {  
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
                stringBuffer.append(strArray[i]);  
            }  
        }  
        String noSpaceStr2 = stringBuffer.toString();  
        System.out.println(noSpaceStr2); 

            int len = noSpaceStr2.length();

            System.out.println("\nMatches and Mismatches:\n");

            for (int i = 0; i < len; i++)

            {    

                char ch = noSpaceStr2.charAt(i);

                if (ch == '{')

                    stk.push(i);

                else if (ch == '}')

                {

                    try

                    {

                        int p = stk.pop() + 1;

                        System.out.println("'}' at index "+(i+1)+" matched with '{' at index "+p);

                    }

                    catch(Exception e)

                    {

                        System.out.println("'}' at index "+(i+1)+" is unmatched");

                    }

                          

            }
  if (ch == '(')

                    stk.push(i);

                else if (ch == ')')

                {

                    try

                    {

                        int p = stk.pop() + 1;

                        System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);

                    }

                    catch(Exception e)

                    {

                        System.out.println("')' at index "+(i+1)+" is unmatched");

                    }

                }            

            
  if (ch == '[')

                    stk.push(i);

                else if (ch == ']')

                {

                    try

                    {

                        int p = stk.pop() + 1;

                        System.out.println("']' at index "+(i+1)+" matched with '[' at index "+p);

                    }

                    catch(Exception e)

                    {

                        System.out.println("']' at index "+(i+1)+" is unmatched");

                    }

                }            

        }

    }
}