
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Mar 31 22:59:46 ICT 2020
//----------------------------------------------------

package src;

import java.util.ArrayList;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Mar 31 22:59:46 ICT 2020
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\030\000\002\002\003\000\002\002\004\000\002\003" +
    "\005\000\002\003\005\000\002\003\003\000\002\004\005" +
    "\000\002\004\005\000\002\004\003\000\002\005\005\000" +
    "\002\005\003\000\002\002\003\000\002\010\005\000\002" +
    "\010\005\000\002\010\005\000\002\010\005\000\002\006" +
    "\003\000\002\006\003\000\002\002\003\000\002\011\005" +
    "\000\002\011\005\000\002\011\005\000\002\011\005\000" +
    "\002\007\003\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\016\004\012\005\004\006\007\007\005\010" +
    "\016\012\006\001\002\000\014\004\012\005\004\006\007" +
    "\007\005\012\044\001\002\000\014\004\012\005\004\006" +
    "\007\007\005\012\044\001\002\000\016\002\ufff8\004\ufff8" +
    "\005\ufff8\006\ufff8\007\ufff8\012\ufff1\001\002\000\014\004" +
    "\012\005\004\006\007\007\005\012\044\001\002\000\016" +
    "\002\ufffd\004\ufffd\005\ufffd\006\025\007\026\011\ufffd\001" +
    "\002\000\004\002\047\001\002\000\014\004\012\005\004" +
    "\006\007\007\005\012\044\001\002\000\004\002\ufff0\001" +
    "\002\000\006\002\ufff7\012\ufff2\001\002\000\004\012\036" +
    "\001\002\000\006\010\016\012\024\001\002\000\016\002" +
    "\ufffa\004\ufffa\005\ufffa\006\ufffa\007\ufffa\011\ufffa\001\002" +
    "\000\010\002\001\004\021\005\022\001\002\000\006\010" +
    "\016\012\024\001\002\000\006\010\016\012\024\001\002" +
    "\000\016\002\uffff\004\uffff\005\uffff\006\025\007\026\011" +
    "\uffff\001\002\000\016\002\ufff8\004\ufff8\005\ufff8\006\ufff8" +
    "\007\ufff8\011\ufff8\001\002\000\006\010\016\012\024\001" +
    "\002\000\006\010\016\012\024\001\002\000\016\002\ufffc" +
    "\004\ufffc\005\ufffc\006\ufffc\007\ufffc\011\ufffc\001\002\000" +
    "\016\002\ufffb\004\ufffb\005\ufffb\006\ufffb\007\ufffb\011\ufffb" +
    "\001\002\000\016\002\ufffe\004\ufffe\005\ufffe\006\025\007" +
    "\026\011\ufffe\001\002\000\010\004\021\005\022\011\033" +
    "\001\002\000\016\002\ufff9\004\ufff9\005\ufff9\006\ufff9\007" +
    "\ufff9\011\ufff9\001\002\000\014\004\ufff2\005\ufff2\006\ufff2" +
    "\007\ufff2\012\ufff2\001\002\000\014\004\040\005\041\006" +
    "\037\007\042\012\036\001\002\000\014\004\ufff1\005\ufff1" +
    "\006\ufff1\007\ufff1\012\ufff1\001\002\000\016\002\ufff4\004" +
    "\ufff4\005\ufff4\006\ufff4\007\ufff4\012\ufff4\001\002\000\016" +
    "\002\ufff6\004\ufff6\005\ufff6\006\ufff6\007\ufff6\012\ufff6\001" +
    "\002\000\016\002\ufff5\004\ufff5\005\ufff5\006\ufff5\007\ufff5" +
    "\012\ufff5\001\002\000\016\002\ufff3\004\ufff3\005\ufff3\006" +
    "\ufff3\007\ufff3\012\ufff3\001\002\000\014\004\012\005\004" +
    "\006\007\007\005\012\044\001\002\000\016\002\uffea\004" +
    "\uffea\005\uffea\006\uffea\007\uffea\012\uffea\001\002\000\016" +
    "\002\uffeb\004\uffeb\005\uffeb\006\uffeb\007\uffeb\012\uffeb\001" +
    "\002\000\016\002\uffef\004\uffef\005\uffef\006\uffef\007\uffef" +
    "\012\uffef\001\002\000\004\002\000\001\002\000\014\004" +
    "\012\005\004\006\007\007\005\012\044\001\002\000\016" +
    "\002\uffed\004\uffed\005\uffed\006\uffed\007\uffed\012\uffed\001" +
    "\002\000\014\004\012\005\004\006\007\007\005\012\044" +
    "\001\002\000\016\002\uffec\004\uffec\005\uffec\006\uffec\007" +
    "\uffec\012\uffec\001\002\000\014\004\012\005\004\006\007" +
    "\007\005\012\044\001\002\000\016\002\uffee\004\uffee\005" +
    "\uffee\006\uffee\007\uffee\012\uffee\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\020\002\010\003\017\004\007\005\016\006" +
    "\014\010\013\011\012\001\001\000\006\007\053\011\044" +
    "\001\001\000\006\007\051\011\044\001\001\000\002\001" +
    "\001\000\006\007\047\011\044\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\007\042\011\044\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\006\034\010\033" +
    "\001\001\000\010\003\031\004\007\005\016\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\004\030\005\016" +
    "\001\001\000\006\004\022\005\016\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\005\027\001\001\000\004" +
    "\005\026\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\006\034\010\033\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\007\045\011\044\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\007\050\011\044\001\001\000\002\001" +
    "\001\000\006\007\052\011\044\001\001\000\002\001\001" +
    "\000\006\007\054\011\044\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // J ::= NUMBER 
            {
              ParseTree RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  
          ParseTree pt = new ParseTree();
          pt.setType("Prefix");
          pt.setToken("   J   ");
          ArrayList<ParseTree> pts = pt.getNodes();
          ParseTree number = new ParseTree();
          number.setToken("NUMBER");
          number.setType("Prefix");
          number.setLexeme(n);
          pts.add(number);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("J",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // J ::= M 
            {
              ParseTree RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ParseTree m = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          RESULT = m;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("J",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // M ::= DIVIDE J J 
            {
              ParseTree RESULT =null;
		int j1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int j1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ParseTree j1 = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int j2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int j2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ParseTree j2 = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          ParseTree pt = new ParseTree();
          pt.setType("Prefix");
          pt.setToken("   M   ");
          ArrayList<ParseTree> pts = pt.getNodes();
          ParseTree divide = new ParseTree();
          divide.setToken("DIVIDE");
          divide.setType("Prefix");
          pts.add(divide);
          pts.add(j1);
          pts.add(j2);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("M",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // M ::= MULT J J 
            {
              ParseTree RESULT =null;
		int j1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int j1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ParseTree j1 = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int j2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int j2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ParseTree j2 = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          ParseTree pt = new ParseTree();
          pt.setType("Prefix");
          pt.setToken("   M   ");
          ArrayList<ParseTree> pts = pt.getNodes();
          ParseTree mult = new ParseTree();
          mult.setToken(" MULT");
          mult.setType("Prefix");
          pts.add(mult);
          pts.add(j1);
          pts.add(j2);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("M",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // M ::= MINUS J J 
            {
              ParseTree RESULT =null;
		int j1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int j1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ParseTree j1 = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int j2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int j2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ParseTree j2 = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          ParseTree pt = new ParseTree();
          pt.setType("Prefix");
          pt.setToken("   M   ");
          ArrayList<ParseTree> pts = pt.getNodes();
          ParseTree minus = new ParseTree();
          minus.setToken(" MINUS ");
          minus.setType("Prefix");
          pts.add(minus);
          pts.add(j1);
          pts.add(j2);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("M",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // M ::= PLUS J J 
            {
              ParseTree RESULT =null;
		int j1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int j1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ParseTree j1 = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int j2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int j2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ParseTree j2 = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  
            ParseTree pt = new ParseTree();
          pt.setType("Prefix");
          pt.setToken("   M   ");
          ArrayList<ParseTree> pts = pt.getNodes();
          ParseTree plus = new ParseTree();
          plus.setType("Prefix");
          plus.setToken(" PLUS ");
          pts.add(plus);
          pts.add(j1);
          pts.add(j2);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("M",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // S ::= M 
            {
              ParseTree RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ParseTree m = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            RESULT = m;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // K ::= NUMBER 
            {
              ParseTree RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  
          ParseTree pt = new ParseTree();
          pt.setType("Postfix");
          pt.setToken("   K   ");
          ArrayList<ParseTree> pts = pt.getNodes();
          ParseTree number = new ParseTree();
          number.setToken("NUMBER");
          number.setType("Postfix");
          number.setLexeme(n);
          pts.add(number);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("K",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // K ::= L 
            {
              ParseTree RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ParseTree l = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          RESULT = l;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("K",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // L ::= K K DIVIDE 
            {
              ParseTree RESULT =null;
		int k1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int k1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ParseTree k1 = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int k2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int k2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ParseTree k2 = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
          ParseTree pt = new ParseTree();
          pt.setType("Postfix");
          pt.setToken("   L   ");
          ArrayList<ParseTree> pts = pt.getNodes();
          ParseTree divide = new ParseTree();
          divide.setToken("DIVIDE");
          pts.add(k1);
          pts.add(k2);
          pts.add(divide);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("L",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // L ::= K K MULT 
            {
              ParseTree RESULT =null;
		int k1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int k1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ParseTree k1 = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int k2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int k2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ParseTree k2 = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
          ParseTree pt = new ParseTree();
          pt.setType("Postfix");
          pt.setToken("   L   ");
          ArrayList<ParseTree> pts = pt.getNodes();
          ParseTree mult = new ParseTree();
          mult.setToken(" MULT ");
          pts.add(k1);
          pts.add(k2);
          pts.add(mult);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("L",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // L ::= K K MINUS 
            {
              ParseTree RESULT =null;
		int k1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int k1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ParseTree k1 = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int k2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int k2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ParseTree k2 = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
            ParseTree pt = new ParseTree();
          pt.setType("Postfix");
          pt.setToken("   L   ");
          ArrayList<ParseTree> pts = pt.getNodes();
          ParseTree minus = new ParseTree();
          minus.setToken(" MINUS ");
          pts.add(k1);
          pts.add(k2);
          pts.add(minus);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("L",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // L ::= K K PLUS 
            {
              ParseTree RESULT =null;
		int k1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int k1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ParseTree k1 = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int k2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int k2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ParseTree k2 = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		  
          ParseTree pt = new ParseTree();
          pt.setType("Postfix");
          pt.setToken("   L   ");
          ArrayList<ParseTree> pts = pt.getNodes();
          ParseTree plus = new ParseTree();
          plus.setToken(" PLUS ");
          pts.add(k1);
          pts.add(k2);
          pts.add(plus);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("L",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // S ::= L 
            {
              ParseTree RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ParseTree l = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            RESULT = l;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // F ::= NUMBER 
            {
              ParseTree RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  
          ParseTree pt = new ParseTree();
          pt.setType("Infix");
          pt.setToken("   F   ");
          ArrayList<ParseTree> pts = pt.getNodes();
          ParseTree number = new ParseTree();
          number.setToken("NUMBER");
          number.setType("Infix");
          number.setLexeme(n);
          pts.add(number);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("F",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // F ::= OPAREN E CPAREN 
            {
              ParseTree RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ParseTree e = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
          ParseTree pt = new ParseTree();
          pt.setType("Infix");
          pt.setToken("   F   ");
          ArrayList<ParseTree> pts = pt.getNodes();
          ParseTree oparen = new ParseTree();
          oparen.setToken("OPAREN");
          oparen.setType("Infix");
          pts.add(oparen);
          pts.add(e);
          ParseTree cparen = new ParseTree();
          cparen.setType("Infix");
          cparen.setToken("CPAREN");
          pts.add(cparen);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("F",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // T ::= F 
            {
              ParseTree RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ParseTree f = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          ParseTree pt = new ParseTree();
          pt.setType("Infix");
          pt.setToken("   T   ");
          ArrayList<ParseTree> pts = pt.getNodes();
          pts.add(f);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("T",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // T ::= T MULT F 
            {
              ParseTree RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ParseTree t = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ParseTree f = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          ParseTree pt = new ParseTree();
          pt.setType("Infix");
          pt.setToken("   T   ");
          ArrayList<ParseTree> pts = pt.getNodes();
          ParseTree mult = new ParseTree();
          mult.setToken(" MULT ");
          mult.setType("Infix");
          pts.add(t);
          pts.add(mult);
          pts.add(f);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("T",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // T ::= T DIVIDE F 
            {
              ParseTree RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ParseTree t = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ParseTree f = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          ParseTree pt = new ParseTree();
          pt.setType("Infix");
          pt.setToken("   T   ");
          ArrayList<ParseTree> pts = pt.getNodes();
          ParseTree divide = new ParseTree();
          divide.setToken("DIVIDE");
          divide.setType("Infix");
          pts.add(t);
          pts.add(divide);
          pts.add(f);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("T",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // E ::= T 
            {
              ParseTree RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ParseTree t = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  
          ParseTree pt = new ParseTree();
          pt.setType("Infix");
          pt.setToken("   E   ");
          ArrayList<ParseTree> pts = pt.getNodes();
          pts.add(t);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // E ::= E PLUS T 
            {
              ParseTree RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ParseTree e = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ParseTree t = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          ParseTree pt = new ParseTree();
          pt.setType("Infix");
          pt.setToken("   E   ");
          ArrayList<ParseTree> pts = pt.getNodes();
          ParseTree plus = new ParseTree();
          plus.setToken("PLUS");
          plus.setType("Infix");
          pts.add(e);
          pts.add(plus);
          pts.add(t);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // E ::= E MINUS T 
            {
              ParseTree RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ParseTree e = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ParseTree t = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
          ParseTree pt = new ParseTree();
          pt.setType("Infix");
          pt.setToken("E");
          ArrayList<ParseTree> pts = pt.getNodes();
          ParseTree minus = new ParseTree();
          minus.setToken(" MINUS ");
          minus.setType("Infix");
          pts.add(e);
          pts.add(minus);
          pts.add(t);
          RESULT = pt;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= S EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ParseTree start_val = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // S ::= E 
            {
              ParseTree RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ParseTree e = (ParseTree)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            RESULT = e;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

