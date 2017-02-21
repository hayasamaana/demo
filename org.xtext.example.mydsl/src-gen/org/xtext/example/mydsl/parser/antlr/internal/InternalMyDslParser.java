package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Appear'", "'Move'", "'{'", "'speed'", "'}'", "'Trigger'", "'Sequence'", "'animations'", "','", "'-'", "'.'", "'E'", "'e'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Animation";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAnimation"
    // InternalMyDsl.g:67:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // InternalMyDsl.g:68:2: (iv_ruleAnimation= ruleAnimation EOF )
            // InternalMyDsl.g:69:2: iv_ruleAnimation= ruleAnimation EOF
            {
             newCompositeNode(grammarAccess.getAnimationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnimation=ruleAnimation();

            state._fsp--;

             current =iv_ruleAnimation; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnimation"


    // $ANTLR start "ruleAnimation"
    // InternalMyDsl.g:76:1: ruleAnimation returns [EObject current=null] : (this_Appear_0= ruleAppear | this_Move_1= ruleMove | this_Trigger_2= ruleTrigger | this_Sequence_3= ruleSequence ) ;
    public final EObject ruleAnimation() throws RecognitionException {
        EObject current = null;

        EObject this_Appear_0 = null;

        EObject this_Move_1 = null;

        EObject this_Trigger_2 = null;

        EObject this_Sequence_3 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:79:28: ( (this_Appear_0= ruleAppear | this_Move_1= ruleMove | this_Trigger_2= ruleTrigger | this_Sequence_3= ruleSequence ) )
            // InternalMyDsl.g:80:1: (this_Appear_0= ruleAppear | this_Move_1= ruleMove | this_Trigger_2= ruleTrigger | this_Sequence_3= ruleSequence )
            {
            // InternalMyDsl.g:80:1: (this_Appear_0= ruleAppear | this_Move_1= ruleMove | this_Trigger_2= ruleTrigger | this_Sequence_3= ruleSequence )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 16:
                {
                alt1=3;
                }
                break;
            case 17:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:81:5: this_Appear_0= ruleAppear
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationAccess().getAppearParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Appear_0=ruleAppear();

                    state._fsp--;

                     
                            current = this_Appear_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:91:5: this_Move_1= ruleMove
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationAccess().getMoveParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Move_1=ruleMove();

                    state._fsp--;

                     
                            current = this_Move_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:101:5: this_Trigger_2= ruleTrigger
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationAccess().getTriggerParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Trigger_2=ruleTrigger();

                    state._fsp--;

                     
                            current = this_Trigger_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:111:5: this_Sequence_3= ruleSequence
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationAccess().getSequenceParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Sequence_3=ruleSequence();

                    state._fsp--;

                     
                            current = this_Sequence_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleAppear"
    // InternalMyDsl.g:127:1: entryRuleAppear returns [EObject current=null] : iv_ruleAppear= ruleAppear EOF ;
    public final EObject entryRuleAppear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppear = null;


        try {
            // InternalMyDsl.g:128:2: (iv_ruleAppear= ruleAppear EOF )
            // InternalMyDsl.g:129:2: iv_ruleAppear= ruleAppear EOF
            {
             newCompositeNode(grammarAccess.getAppearRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAppear=ruleAppear();

            state._fsp--;

             current =iv_ruleAppear; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppear"


    // $ANTLR start "ruleAppear"
    // InternalMyDsl.g:136:1: ruleAppear returns [EObject current=null] : ( () otherlv_1= 'Appear' ( (lv_geometry_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAppear() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_geometry_2_0=null;

         enterRule(); 
            
        try {
            // InternalMyDsl.g:139:28: ( ( () otherlv_1= 'Appear' ( (lv_geometry_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:140:1: ( () otherlv_1= 'Appear' ( (lv_geometry_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:140:1: ( () otherlv_1= 'Appear' ( (lv_geometry_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:140:2: () otherlv_1= 'Appear' ( (lv_geometry_2_0= RULE_ID ) )
            {
            // InternalMyDsl.g:140:2: ()
            // InternalMyDsl.g:141:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAppearAccess().getAppearAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getAppearAccess().getAppearKeyword_1());
                
            // InternalMyDsl.g:150:1: ( (lv_geometry_2_0= RULE_ID ) )
            // InternalMyDsl.g:151:1: (lv_geometry_2_0= RULE_ID )
            {
            // InternalMyDsl.g:151:1: (lv_geometry_2_0= RULE_ID )
            // InternalMyDsl.g:152:3: lv_geometry_2_0= RULE_ID
            {
            lv_geometry_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            			newLeafNode(lv_geometry_2_0, grammarAccess.getAppearAccess().getGeometryIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAppearRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"geometry",
                    		lv_geometry_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAppear"


    // $ANTLR start "entryRuleMove"
    // InternalMyDsl.g:176:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalMyDsl.g:177:2: (iv_ruleMove= ruleMove EOF )
            // InternalMyDsl.g:178:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalMyDsl.g:185:1: ruleMove returns [EObject current=null] : (otherlv_0= 'Move' ( (lv_geometry_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEFloat ) ) otherlv_5= '}' ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_geometry_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_speed_4_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:188:28: ( (otherlv_0= 'Move' ( (lv_geometry_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEFloat ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:189:1: (otherlv_0= 'Move' ( (lv_geometry_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEFloat ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:189:1: (otherlv_0= 'Move' ( (lv_geometry_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEFloat ) ) otherlv_5= '}' )
            // InternalMyDsl.g:189:3: otherlv_0= 'Move' ( (lv_geometry_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEFloat ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
                
            // InternalMyDsl.g:193:1: ( (lv_geometry_1_0= RULE_ID ) )
            // InternalMyDsl.g:194:1: (lv_geometry_1_0= RULE_ID )
            {
            // InternalMyDsl.g:194:1: (lv_geometry_1_0= RULE_ID )
            // InternalMyDsl.g:195:3: lv_geometry_1_0= RULE_ID
            {
            lv_geometry_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_4); 

            			newLeafNode(lv_geometry_1_0, grammarAccess.getMoveAccess().getGeometryIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"geometry",
                    		lv_geometry_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getSpeedKeyword_3());
                
            // InternalMyDsl.g:219:1: ( (lv_speed_4_0= ruleEFloat ) )
            // InternalMyDsl.g:220:1: (lv_speed_4_0= ruleEFloat )
            {
            // InternalMyDsl.g:220:1: (lv_speed_4_0= ruleEFloat )
            // InternalMyDsl.g:221:3: lv_speed_4_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getMoveAccess().getSpeedEFloatParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_7);
            lv_speed_4_0=ruleEFloat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMoveRule());
            	        }
                   		set(
                   			current, 
                   			"speed",
                    		lv_speed_4_0, 
                    		"org.xtext.example.mydsl.MyDsl.EFloat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleTrigger"
    // InternalMyDsl.g:249:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalMyDsl.g:250:2: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalMyDsl.g:251:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalMyDsl.g:258:1: ruleTrigger returns [EObject current=null] : ( () otherlv_1= 'Trigger' ( (lv_geometry_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_geometry_2_0=null;

         enterRule(); 
            
        try {
            // InternalMyDsl.g:261:28: ( ( () otherlv_1= 'Trigger' ( (lv_geometry_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:262:1: ( () otherlv_1= 'Trigger' ( (lv_geometry_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:262:1: ( () otherlv_1= 'Trigger' ( (lv_geometry_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:262:2: () otherlv_1= 'Trigger' ( (lv_geometry_2_0= RULE_ID ) )
            {
            // InternalMyDsl.g:262:2: ()
            // InternalMyDsl.g:263:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTriggerAccess().getTriggerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getTriggerKeyword_1());
                
            // InternalMyDsl.g:272:1: ( (lv_geometry_2_0= RULE_ID ) )
            // InternalMyDsl.g:273:1: (lv_geometry_2_0= RULE_ID )
            {
            // InternalMyDsl.g:273:1: (lv_geometry_2_0= RULE_ID )
            // InternalMyDsl.g:274:3: lv_geometry_2_0= RULE_ID
            {
            lv_geometry_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            			newLeafNode(lv_geometry_2_0, grammarAccess.getTriggerAccess().getGeometryIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTriggerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"geometry",
                    		lv_geometry_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleSequence"
    // InternalMyDsl.g:298:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // InternalMyDsl.g:299:2: (iv_ruleSequence= ruleSequence EOF )
            // InternalMyDsl.g:300:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // InternalMyDsl.g:307:1: ruleSequence returns [EObject current=null] : ( () otherlv_1= 'Sequence' ( (lv_geometry_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'animations' otherlv_5= '{' ( (lv_animations_6_0= ruleAnimation ) ) (otherlv_7= ',' ( (lv_animations_8_0= ruleAnimation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_geometry_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_animations_6_0 = null;

        EObject lv_animations_8_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:310:28: ( ( () otherlv_1= 'Sequence' ( (lv_geometry_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'animations' otherlv_5= '{' ( (lv_animations_6_0= ruleAnimation ) ) (otherlv_7= ',' ( (lv_animations_8_0= ruleAnimation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalMyDsl.g:311:1: ( () otherlv_1= 'Sequence' ( (lv_geometry_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'animations' otherlv_5= '{' ( (lv_animations_6_0= ruleAnimation ) ) (otherlv_7= ',' ( (lv_animations_8_0= ruleAnimation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalMyDsl.g:311:1: ( () otherlv_1= 'Sequence' ( (lv_geometry_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'animations' otherlv_5= '{' ( (lv_animations_6_0= ruleAnimation ) ) (otherlv_7= ',' ( (lv_animations_8_0= ruleAnimation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalMyDsl.g:311:2: () otherlv_1= 'Sequence' ( (lv_geometry_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'animations' otherlv_5= '{' ( (lv_animations_6_0= ruleAnimation ) ) (otherlv_7= ',' ( (lv_animations_8_0= ruleAnimation ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalMyDsl.g:311:2: ()
            // InternalMyDsl.g:312:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSequenceAccess().getSequenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getSequenceKeyword_1());
                
            // InternalMyDsl.g:321:1: ( (lv_geometry_2_0= RULE_ID ) )
            // InternalMyDsl.g:322:1: (lv_geometry_2_0= RULE_ID )
            {
            // InternalMyDsl.g:322:1: (lv_geometry_2_0= RULE_ID )
            // InternalMyDsl.g:323:3: lv_geometry_2_0= RULE_ID
            {
            lv_geometry_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_4); 

            			newLeafNode(lv_geometry_2_0, grammarAccess.getSequenceAccess().getGeometryIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSequenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"geometry",
                    		lv_geometry_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_8); 

                	newLeafNode(otherlv_3, grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalMyDsl.g:343:1: (otherlv_4= 'animations' otherlv_5= '{' ( (lv_animations_6_0= ruleAnimation ) ) (otherlv_7= ',' ( (lv_animations_8_0= ruleAnimation ) ) )* otherlv_9= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:343:3: otherlv_4= 'animations' otherlv_5= '{' ( (lv_animations_6_0= ruleAnimation ) ) (otherlv_7= ',' ( (lv_animations_8_0= ruleAnimation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_4); 

                        	newLeafNode(otherlv_4, grammarAccess.getSequenceAccess().getAnimationsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_9); 

                        	newLeafNode(otherlv_5, grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // InternalMyDsl.g:351:1: ( (lv_animations_6_0= ruleAnimation ) )
                    // InternalMyDsl.g:352:1: (lv_animations_6_0= ruleAnimation )
                    {
                    // InternalMyDsl.g:352:1: (lv_animations_6_0= ruleAnimation )
                    // InternalMyDsl.g:353:3: lv_animations_6_0= ruleAnimation
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_10);
                    lv_animations_6_0=ruleAnimation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
                    	        }
                           		add(
                           			current, 
                           			"animations",
                            		lv_animations_6_0, 
                            		"org.xtext.example.mydsl.MyDsl.Animation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalMyDsl.g:369:2: (otherlv_7= ',' ( (lv_animations_8_0= ruleAnimation ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==19) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:369:4: otherlv_7= ',' ( (lv_animations_8_0= ruleAnimation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_9); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getSequenceAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // InternalMyDsl.g:373:1: ( (lv_animations_8_0= ruleAnimation ) )
                    	    // InternalMyDsl.g:374:1: (lv_animations_8_0= ruleAnimation )
                    	    {
                    	    // InternalMyDsl.g:374:1: (lv_animations_8_0= ruleAnimation )
                    	    // InternalMyDsl.g:375:3: lv_animations_8_0= ruleAnimation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_10);
                    	    lv_animations_8_0=ruleAnimation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"animations",
                    	            		lv_animations_8_0, 
                    	            		"org.xtext.example.mydsl.MyDsl.Animation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_9, grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_10, grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleEFloat"
    // InternalMyDsl.g:407:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalMyDsl.g:408:2: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalMyDsl.g:409:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalMyDsl.g:416:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // InternalMyDsl.g:419:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalMyDsl.g:420:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalMyDsl.g:420:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalMyDsl.g:420:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalMyDsl.g:420:2: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:421:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_11); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // InternalMyDsl.g:426:3: (this_INT_1= RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:426:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_12); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,21,FollowSets000.FOLLOW_13); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_14); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
                
            // InternalMyDsl.g:446:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=22 && LA8_0<=23)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:446:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalMyDsl.g:446:2: (kw= 'E' | kw= 'e' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==22) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==23) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMyDsl.g:447:2: kw= 'E'
                            {
                            kw=(Token)match(input,22,FollowSets000.FOLLOW_15); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:454:2: kw= 'e'
                            {
                            kw=(Token)match(input,23,FollowSets000.FOLLOW_15); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // InternalMyDsl.g:459:2: (kw= '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==20) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:460:2: kw= '-'
                            {
                            kw=(Token)match(input,20,FollowSets000.FOLLOW_13); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

                    		current.merge(this_INT_7);
                        
                     
                        newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000300020L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000031800L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200020L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100020L});
    }


}