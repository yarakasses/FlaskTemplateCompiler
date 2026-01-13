// Generated from C:/Users/Yara/IdeaProjects/FlaskTemplateCompiler/src/grammar/TemplateLexer.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TemplateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR_OPEN=1, VAR_CLOSE=2, SHOW=3, ADD=4, DETAILS=5, PRODUCT=6, PRODUCTS=7, 
		STRING=8, NUMBER=9, ID=10, TEXT=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VAR_OPEN", "VAR_CLOSE", "SHOW", "ADD", "DETAILS", "PRODUCT", "PRODUCTS", 
			"STRING", "NUMBER", "ID", "TEXT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{{'", "'}}'", "'show'", "'add'", "'details'", "'product'", "'products'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VAR_OPEN", "VAR_CLOSE", "SHOW", "ADD", "DETAILS", "PRODUCT", "PRODUCTS", 
			"STRING", "NUMBER", "ID", "TEXT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public TemplateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TemplateLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\fj\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007D\b\u0007\n\u0007\f\u0007G\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0004\bL\b\b\u000b\b\f\bM\u0001\b\u0001\b\u0004\b"+
		"R\b\b\u000b\b\f\bS\u0003\bV\b\b\u0001\t\u0001\t\u0005\tZ\b\t\n\t\f\t]"+
		"\t\t\u0001\n\u0004\n`\b\n\u000b\n\f\na\u0001\u000b\u0004\u000be\b\u000b"+
		"\u000b\u000b\f\u000bf\u0001\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001\u0000\u0006\u0003\u0000\n"+
		"\n\r\r\"\"\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000"+
		"{{}}\u0003\u0000\t\n\r\r  p\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003\u001c\u0001"+
		"\u0000\u0000\u0000\u0005\u001f\u0001\u0000\u0000\u0000\u0007$\u0001\u0000"+
		"\u0000\u0000\t(\u0001\u0000\u0000\u0000\u000b0\u0001\u0000\u0000\u0000"+
		"\r8\u0001\u0000\u0000\u0000\u000fA\u0001\u0000\u0000\u0000\u0011K\u0001"+
		"\u0000\u0000\u0000\u0013W\u0001\u0000\u0000\u0000\u0015_\u0001\u0000\u0000"+
		"\u0000\u0017d\u0001\u0000\u0000\u0000\u0019\u001a\u0005{\u0000\u0000\u001a"+
		"\u001b\u0005{\u0000\u0000\u001b\u0002\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0005}\u0000\u0000\u001d\u001e\u0005}\u0000\u0000\u001e\u0004\u0001\u0000"+
		"\u0000\u0000\u001f \u0005s\u0000\u0000 !\u0005h\u0000\u0000!\"\u0005o"+
		"\u0000\u0000\"#\u0005w\u0000\u0000#\u0006\u0001\u0000\u0000\u0000$%\u0005"+
		"a\u0000\u0000%&\u0005d\u0000\u0000&\'\u0005d\u0000\u0000\'\b\u0001\u0000"+
		"\u0000\u0000()\u0005d\u0000\u0000)*\u0005e\u0000\u0000*+\u0005t\u0000"+
		"\u0000+,\u0005a\u0000\u0000,-\u0005i\u0000\u0000-.\u0005l\u0000\u0000"+
		"./\u0005s\u0000\u0000/\n\u0001\u0000\u0000\u000001\u0005p\u0000\u0000"+
		"12\u0005r\u0000\u000023\u0005o\u0000\u000034\u0005d\u0000\u000045\u0005"+
		"u\u0000\u000056\u0005c\u0000\u000067\u0005t\u0000\u00007\f\u0001\u0000"+
		"\u0000\u000089\u0005p\u0000\u00009:\u0005r\u0000\u0000:;\u0005o\u0000"+
		"\u0000;<\u0005d\u0000\u0000<=\u0005u\u0000\u0000=>\u0005c\u0000\u0000"+
		">?\u0005t\u0000\u0000?@\u0005s\u0000\u0000@\u000e\u0001\u0000\u0000\u0000"+
		"AE\u0005\"\u0000\u0000BD\b\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\"\u0000"+
		"\u0000I\u0010\u0001\u0000\u0000\u0000JL\u0007\u0001\u0000\u0000KJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NU\u0001\u0000\u0000\u0000OQ\u0005.\u0000\u0000"+
		"PR\u0007\u0001\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000"+
		"\u0000\u0000UO\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0012"+
		"\u0001\u0000\u0000\u0000W[\u0007\u0002\u0000\u0000XZ\u0007\u0003\u0000"+
		"\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0014\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000^`\b\u0004\u0000\u0000_^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000b\u0016\u0001\u0000\u0000\u0000ce\u0007\u0005\u0000\u0000dc\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0006\u000b\u0000"+
		"\u0000i\u0018\u0001\u0000\u0000\u0000\b\u0000EMSU[af\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}