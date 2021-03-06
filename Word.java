public class Word extends Token{
	private String lexeme = "";
	private int type = Type.EMPTY;

	public static final Word and = new Word("&&", Tag.AND);
	public static final Word or = new Word("||", Tag.OR);
	public static final Word eq = new Word("==", Tag.EQ);
	public static final Word noteq = new Word("!=", Tag.NOTEQ);
	public static final Word le = new Word("<=", Tag.LE);
	public static final Word ge = new Word(">=", Tag.GE);
	public static final Word not = new Word("!", Tag.NOT);

	public Word(String s, int tag){
		super(tag);
		lexeme = s;
	}

	public Word(String s, int tag, int type){
		super(tag);
		lexeme = s;
		type = type;
	}

	public String getLexeme(){
		return lexeme;	
	}

	public void setType(int type){
		this.type = type;
	}

	public int getType(){
		return type;
	}

	public String toString(){
		return "" + lexeme;
	}
	
}
