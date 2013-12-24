public class Main{
    public static void main(String[] args){
	if(args.length != 2){
	    System.out.println("USAGE: java -Djava.library.path=. Main <word1> <word2>");
	    return ;
	} 

	System.loadLibrary("javaSpeak"); 
	javaSpeak.initialize() ;

	String a = javaSpeak.getPhonemes(args[0]);
	String b = javaSpeak.getPhonemes(args[1]);

	System.out.println(a);
	System.out.println(b);
	
	if (b.endsWith(a.substring(a.length() - 2))) {
	    System.out.println("Rhyme!");
	} else {
	    System.out.println("No rhyme!");
	}

	javaSpeak.terminate();
    }

    private static boolean isContain44greaterNos(String numCheck){
	return numCheck.matches("\\d{45,}") ;

    }
}

