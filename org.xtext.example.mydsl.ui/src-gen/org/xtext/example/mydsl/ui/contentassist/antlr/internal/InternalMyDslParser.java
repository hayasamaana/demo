package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Appear'", "'Move'", "'{'", "'speed'", "'}'", "'Trigger'", "'Sequence'", "'animations'", "','", "'-'", "'.'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
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
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleAnimation"
    // InternalMyDsl.g:60:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // InternalMyDsl.g:61:1: ( ruleAnimation EOF )
            // InternalMyDsl.g:62:1: ruleAnimation EOF
            {
             before(grammarAccess.getAnimationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getAnimationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnimation"


    // $ANTLR start "ruleAnimation"
    // InternalMyDsl.g:69:1: ruleAnimation : ( ( rule__Animation__Alternatives ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:73:2: ( ( ( rule__Animation__Alternatives ) ) )
            // InternalMyDsl.g:74:1: ( ( rule__Animation__Alternatives ) )
            {
            // InternalMyDsl.g:74:1: ( ( rule__Animation__Alternatives ) )
            // InternalMyDsl.g:75:1: ( rule__Animation__Alternatives )
            {
             before(grammarAccess.getAnimationAccess().getAlternatives()); 
            // InternalMyDsl.g:76:1: ( rule__Animation__Alternatives )
            // InternalMyDsl.g:76:2: rule__Animation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleAppear"
    // InternalMyDsl.g:88:1: entryRuleAppear : ruleAppear EOF ;
    public final void entryRuleAppear() throws RecognitionException {
        try {
            // InternalMyDsl.g:89:1: ( ruleAppear EOF )
            // InternalMyDsl.g:90:1: ruleAppear EOF
            {
             before(grammarAccess.getAppearRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAppear();

            state._fsp--;

             after(grammarAccess.getAppearRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAppear"


    // $ANTLR start "ruleAppear"
    // InternalMyDsl.g:97:1: ruleAppear : ( ( rule__Appear__Group__0 ) ) ;
    public final void ruleAppear() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:101:2: ( ( ( rule__Appear__Group__0 ) ) )
            // InternalMyDsl.g:102:1: ( ( rule__Appear__Group__0 ) )
            {
            // InternalMyDsl.g:102:1: ( ( rule__Appear__Group__0 ) )
            // InternalMyDsl.g:103:1: ( rule__Appear__Group__0 )
            {
             before(grammarAccess.getAppearAccess().getGroup()); 
            // InternalMyDsl.g:104:1: ( rule__Appear__Group__0 )
            // InternalMyDsl.g:104:2: rule__Appear__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Appear__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppearAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAppear"


    // $ANTLR start "entryRuleMove"
    // InternalMyDsl.g:116:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalMyDsl.g:117:1: ( ruleMove EOF )
            // InternalMyDsl.g:118:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalMyDsl.g:125:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:129:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalMyDsl.g:130:1: ( ( rule__Move__Group__0 ) )
            {
            // InternalMyDsl.g:130:1: ( ( rule__Move__Group__0 ) )
            // InternalMyDsl.g:131:1: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalMyDsl.g:132:1: ( rule__Move__Group__0 )
            // InternalMyDsl.g:132:2: rule__Move__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleTrigger"
    // InternalMyDsl.g:144:1: entryRuleTrigger : ruleTrigger EOF ;
    public final void entryRuleTrigger() throws RecognitionException {
        try {
            // InternalMyDsl.g:145:1: ( ruleTrigger EOF )
            // InternalMyDsl.g:146:1: ruleTrigger EOF
            {
             before(grammarAccess.getTriggerRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getTriggerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalMyDsl.g:153:1: ruleTrigger : ( ( rule__Trigger__Group__0 ) ) ;
    public final void ruleTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:157:2: ( ( ( rule__Trigger__Group__0 ) ) )
            // InternalMyDsl.g:158:1: ( ( rule__Trigger__Group__0 ) )
            {
            // InternalMyDsl.g:158:1: ( ( rule__Trigger__Group__0 ) )
            // InternalMyDsl.g:159:1: ( rule__Trigger__Group__0 )
            {
             before(grammarAccess.getTriggerAccess().getGroup()); 
            // InternalMyDsl.g:160:1: ( rule__Trigger__Group__0 )
            // InternalMyDsl.g:160:2: rule__Trigger__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Trigger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleSequence"
    // InternalMyDsl.g:172:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // InternalMyDsl.g:173:1: ( ruleSequence EOF )
            // InternalMyDsl.g:174:1: ruleSequence EOF
            {
             before(grammarAccess.getSequenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getSequenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // InternalMyDsl.g:181:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:185:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // InternalMyDsl.g:186:1: ( ( rule__Sequence__Group__0 ) )
            {
            // InternalMyDsl.g:186:1: ( ( rule__Sequence__Group__0 ) )
            // InternalMyDsl.g:187:1: ( rule__Sequence__Group__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup()); 
            // InternalMyDsl.g:188:1: ( rule__Sequence__Group__0 )
            // InternalMyDsl.g:188:2: rule__Sequence__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleEFloat"
    // InternalMyDsl.g:200:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalMyDsl.g:201:1: ( ruleEFloat EOF )
            // InternalMyDsl.g:202:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalMyDsl.g:209:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:213:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalMyDsl.g:214:1: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalMyDsl.g:214:1: ( ( rule__EFloat__Group__0 ) )
            // InternalMyDsl.g:215:1: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalMyDsl.g:216:1: ( rule__EFloat__Group__0 )
            // InternalMyDsl.g:216:2: rule__EFloat__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "rule__Animation__Alternatives"
    // InternalMyDsl.g:228:1: rule__Animation__Alternatives : ( ( ruleAppear ) | ( ruleMove ) | ( ruleTrigger ) | ( ruleSequence ) );
    public final void rule__Animation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:232:1: ( ( ruleAppear ) | ( ruleMove ) | ( ruleTrigger ) | ( ruleSequence ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case 19:
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
                    // InternalMyDsl.g:233:1: ( ruleAppear )
                    {
                    // InternalMyDsl.g:233:1: ( ruleAppear )
                    // InternalMyDsl.g:234:1: ruleAppear
                    {
                     before(grammarAccess.getAnimationAccess().getAppearParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAppear();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getAppearParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:239:6: ( ruleMove )
                    {
                    // InternalMyDsl.g:239:6: ( ruleMove )
                    // InternalMyDsl.g:240:1: ruleMove
                    {
                     before(grammarAccess.getAnimationAccess().getMoveParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getMoveParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:245:6: ( ruleTrigger )
                    {
                    // InternalMyDsl.g:245:6: ( ruleTrigger )
                    // InternalMyDsl.g:246:1: ruleTrigger
                    {
                     before(grammarAccess.getAnimationAccess().getTriggerParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTrigger();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getTriggerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:251:6: ( ruleSequence )
                    {
                    // InternalMyDsl.g:251:6: ( ruleSequence )
                    // InternalMyDsl.g:252:1: ruleSequence
                    {
                     before(grammarAccess.getAnimationAccess().getSequenceParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSequence();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getSequenceParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalMyDsl.g:262:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:266:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:267:1: ( 'E' )
                    {
                    // InternalMyDsl.g:267:1: ( 'E' )
                    // InternalMyDsl.g:268:1: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:275:6: ( 'e' )
                    {
                    // InternalMyDsl.g:275:6: ( 'e' )
                    // InternalMyDsl.g:276:1: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__Appear__Group__0"
    // InternalMyDsl.g:290:1: rule__Appear__Group__0 : rule__Appear__Group__0__Impl rule__Appear__Group__1 ;
    public final void rule__Appear__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:294:1: ( rule__Appear__Group__0__Impl rule__Appear__Group__1 )
            // InternalMyDsl.g:295:2: rule__Appear__Group__0__Impl rule__Appear__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Appear__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Appear__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appear__Group__0"


    // $ANTLR start "rule__Appear__Group__0__Impl"
    // InternalMyDsl.g:302:1: rule__Appear__Group__0__Impl : ( () ) ;
    public final void rule__Appear__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:306:1: ( ( () ) )
            // InternalMyDsl.g:307:1: ( () )
            {
            // InternalMyDsl.g:307:1: ( () )
            // InternalMyDsl.g:308:1: ()
            {
             before(grammarAccess.getAppearAccess().getAppearAction_0()); 
            // InternalMyDsl.g:309:1: ()
            // InternalMyDsl.g:311:1: 
            {
            }

             after(grammarAccess.getAppearAccess().getAppearAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appear__Group__0__Impl"


    // $ANTLR start "rule__Appear__Group__1"
    // InternalMyDsl.g:321:1: rule__Appear__Group__1 : rule__Appear__Group__1__Impl rule__Appear__Group__2 ;
    public final void rule__Appear__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:325:1: ( rule__Appear__Group__1__Impl rule__Appear__Group__2 )
            // InternalMyDsl.g:326:2: rule__Appear__Group__1__Impl rule__Appear__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Appear__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Appear__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appear__Group__1"


    // $ANTLR start "rule__Appear__Group__1__Impl"
    // InternalMyDsl.g:333:1: rule__Appear__Group__1__Impl : ( 'Appear' ) ;
    public final void rule__Appear__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:337:1: ( ( 'Appear' ) )
            // InternalMyDsl.g:338:1: ( 'Appear' )
            {
            // InternalMyDsl.g:338:1: ( 'Appear' )
            // InternalMyDsl.g:339:1: 'Appear'
            {
             before(grammarAccess.getAppearAccess().getAppearKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAppearAccess().getAppearKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appear__Group__1__Impl"


    // $ANTLR start "rule__Appear__Group__2"
    // InternalMyDsl.g:352:1: rule__Appear__Group__2 : rule__Appear__Group__2__Impl ;
    public final void rule__Appear__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:356:1: ( rule__Appear__Group__2__Impl )
            // InternalMyDsl.g:357:2: rule__Appear__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Appear__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appear__Group__2"


    // $ANTLR start "rule__Appear__Group__2__Impl"
    // InternalMyDsl.g:363:1: rule__Appear__Group__2__Impl : ( ( rule__Appear__GeometryAssignment_2 ) ) ;
    public final void rule__Appear__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:367:1: ( ( ( rule__Appear__GeometryAssignment_2 ) ) )
            // InternalMyDsl.g:368:1: ( ( rule__Appear__GeometryAssignment_2 ) )
            {
            // InternalMyDsl.g:368:1: ( ( rule__Appear__GeometryAssignment_2 ) )
            // InternalMyDsl.g:369:1: ( rule__Appear__GeometryAssignment_2 )
            {
             before(grammarAccess.getAppearAccess().getGeometryAssignment_2()); 
            // InternalMyDsl.g:370:1: ( rule__Appear__GeometryAssignment_2 )
            // InternalMyDsl.g:370:2: rule__Appear__GeometryAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Appear__GeometryAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAppearAccess().getGeometryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appear__Group__2__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // InternalMyDsl.g:386:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:390:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalMyDsl.g:391:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Move__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // InternalMyDsl.g:398:1: rule__Move__Group__0__Impl : ( 'Move' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:402:1: ( ( 'Move' ) )
            // InternalMyDsl.g:403:1: ( 'Move' )
            {
            // InternalMyDsl.g:403:1: ( 'Move' )
            // InternalMyDsl.g:404:1: 'Move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // InternalMyDsl.g:417:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:421:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // InternalMyDsl.g:422:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Move__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // InternalMyDsl.g:429:1: rule__Move__Group__1__Impl : ( ( rule__Move__GeometryAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:433:1: ( ( ( rule__Move__GeometryAssignment_1 ) ) )
            // InternalMyDsl.g:434:1: ( ( rule__Move__GeometryAssignment_1 ) )
            {
            // InternalMyDsl.g:434:1: ( ( rule__Move__GeometryAssignment_1 ) )
            // InternalMyDsl.g:435:1: ( rule__Move__GeometryAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getGeometryAssignment_1()); 
            // InternalMyDsl.g:436:1: ( rule__Move__GeometryAssignment_1 )
            // InternalMyDsl.g:436:2: rule__Move__GeometryAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Move__GeometryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGeometryAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__2"
    // InternalMyDsl.g:446:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:450:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // InternalMyDsl.g:451:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Move__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2"


    // $ANTLR start "rule__Move__Group__2__Impl"
    // InternalMyDsl.g:458:1: rule__Move__Group__2__Impl : ( '{' ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:462:1: ( ( '{' ) )
            // InternalMyDsl.g:463:1: ( '{' )
            {
            // InternalMyDsl.g:463:1: ( '{' )
            // InternalMyDsl.g:464:1: '{'
            {
             before(grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2__Impl"


    // $ANTLR start "rule__Move__Group__3"
    // InternalMyDsl.g:477:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:481:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // InternalMyDsl.g:482:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Move__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3"


    // $ANTLR start "rule__Move__Group__3__Impl"
    // InternalMyDsl.g:489:1: rule__Move__Group__3__Impl : ( 'speed' ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:493:1: ( ( 'speed' ) )
            // InternalMyDsl.g:494:1: ( 'speed' )
            {
            // InternalMyDsl.g:494:1: ( 'speed' )
            // InternalMyDsl.g:495:1: 'speed'
            {
             before(grammarAccess.getMoveAccess().getSpeedKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getSpeedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3__Impl"


    // $ANTLR start "rule__Move__Group__4"
    // InternalMyDsl.g:508:1: rule__Move__Group__4 : rule__Move__Group__4__Impl rule__Move__Group__5 ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:512:1: ( rule__Move__Group__4__Impl rule__Move__Group__5 )
            // InternalMyDsl.g:513:2: rule__Move__Group__4__Impl rule__Move__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Move__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Move__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4"


    // $ANTLR start "rule__Move__Group__4__Impl"
    // InternalMyDsl.g:520:1: rule__Move__Group__4__Impl : ( ( rule__Move__SpeedAssignment_4 ) ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:524:1: ( ( ( rule__Move__SpeedAssignment_4 ) ) )
            // InternalMyDsl.g:525:1: ( ( rule__Move__SpeedAssignment_4 ) )
            {
            // InternalMyDsl.g:525:1: ( ( rule__Move__SpeedAssignment_4 ) )
            // InternalMyDsl.g:526:1: ( rule__Move__SpeedAssignment_4 )
            {
             before(grammarAccess.getMoveAccess().getSpeedAssignment_4()); 
            // InternalMyDsl.g:527:1: ( rule__Move__SpeedAssignment_4 )
            // InternalMyDsl.g:527:2: rule__Move__SpeedAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Move__SpeedAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getSpeedAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4__Impl"


    // $ANTLR start "rule__Move__Group__5"
    // InternalMyDsl.g:537:1: rule__Move__Group__5 : rule__Move__Group__5__Impl ;
    public final void rule__Move__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:541:1: ( rule__Move__Group__5__Impl )
            // InternalMyDsl.g:542:2: rule__Move__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Move__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__5"


    // $ANTLR start "rule__Move__Group__5__Impl"
    // InternalMyDsl.g:548:1: rule__Move__Group__5__Impl : ( '}' ) ;
    public final void rule__Move__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:552:1: ( ( '}' ) )
            // InternalMyDsl.g:553:1: ( '}' )
            {
            // InternalMyDsl.g:553:1: ( '}' )
            // InternalMyDsl.g:554:1: '}'
            {
             before(grammarAccess.getMoveAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__5__Impl"


    // $ANTLR start "rule__Trigger__Group__0"
    // InternalMyDsl.g:579:1: rule__Trigger__Group__0 : rule__Trigger__Group__0__Impl rule__Trigger__Group__1 ;
    public final void rule__Trigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:583:1: ( rule__Trigger__Group__0__Impl rule__Trigger__Group__1 )
            // InternalMyDsl.g:584:2: rule__Trigger__Group__0__Impl rule__Trigger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Trigger__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Trigger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__0"


    // $ANTLR start "rule__Trigger__Group__0__Impl"
    // InternalMyDsl.g:591:1: rule__Trigger__Group__0__Impl : ( () ) ;
    public final void rule__Trigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:595:1: ( ( () ) )
            // InternalMyDsl.g:596:1: ( () )
            {
            // InternalMyDsl.g:596:1: ( () )
            // InternalMyDsl.g:597:1: ()
            {
             before(grammarAccess.getTriggerAccess().getTriggerAction_0()); 
            // InternalMyDsl.g:598:1: ()
            // InternalMyDsl.g:600:1: 
            {
            }

             after(grammarAccess.getTriggerAccess().getTriggerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__0__Impl"


    // $ANTLR start "rule__Trigger__Group__1"
    // InternalMyDsl.g:610:1: rule__Trigger__Group__1 : rule__Trigger__Group__1__Impl rule__Trigger__Group__2 ;
    public final void rule__Trigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:614:1: ( rule__Trigger__Group__1__Impl rule__Trigger__Group__2 )
            // InternalMyDsl.g:615:2: rule__Trigger__Group__1__Impl rule__Trigger__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Trigger__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Trigger__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__1"


    // $ANTLR start "rule__Trigger__Group__1__Impl"
    // InternalMyDsl.g:622:1: rule__Trigger__Group__1__Impl : ( 'Trigger' ) ;
    public final void rule__Trigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:626:1: ( ( 'Trigger' ) )
            // InternalMyDsl.g:627:1: ( 'Trigger' )
            {
            // InternalMyDsl.g:627:1: ( 'Trigger' )
            // InternalMyDsl.g:628:1: 'Trigger'
            {
             before(grammarAccess.getTriggerAccess().getTriggerKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTriggerAccess().getTriggerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__1__Impl"


    // $ANTLR start "rule__Trigger__Group__2"
    // InternalMyDsl.g:641:1: rule__Trigger__Group__2 : rule__Trigger__Group__2__Impl ;
    public final void rule__Trigger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:645:1: ( rule__Trigger__Group__2__Impl )
            // InternalMyDsl.g:646:2: rule__Trigger__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Trigger__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__2"


    // $ANTLR start "rule__Trigger__Group__2__Impl"
    // InternalMyDsl.g:652:1: rule__Trigger__Group__2__Impl : ( ( rule__Trigger__GeometryAssignment_2 ) ) ;
    public final void rule__Trigger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:656:1: ( ( ( rule__Trigger__GeometryAssignment_2 ) ) )
            // InternalMyDsl.g:657:1: ( ( rule__Trigger__GeometryAssignment_2 ) )
            {
            // InternalMyDsl.g:657:1: ( ( rule__Trigger__GeometryAssignment_2 ) )
            // InternalMyDsl.g:658:1: ( rule__Trigger__GeometryAssignment_2 )
            {
             before(grammarAccess.getTriggerAccess().getGeometryAssignment_2()); 
            // InternalMyDsl.g:659:1: ( rule__Trigger__GeometryAssignment_2 )
            // InternalMyDsl.g:659:2: rule__Trigger__GeometryAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Trigger__GeometryAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getGeometryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__2__Impl"


    // $ANTLR start "rule__Sequence__Group__0"
    // InternalMyDsl.g:675:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:679:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // InternalMyDsl.g:680:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0"


    // $ANTLR start "rule__Sequence__Group__0__Impl"
    // InternalMyDsl.g:687:1: rule__Sequence__Group__0__Impl : ( () ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:691:1: ( ( () ) )
            // InternalMyDsl.g:692:1: ( () )
            {
            // InternalMyDsl.g:692:1: ( () )
            // InternalMyDsl.g:693:1: ()
            {
             before(grammarAccess.getSequenceAccess().getSequenceAction_0()); 
            // InternalMyDsl.g:694:1: ()
            // InternalMyDsl.g:696:1: 
            {
            }

             after(grammarAccess.getSequenceAccess().getSequenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0__Impl"


    // $ANTLR start "rule__Sequence__Group__1"
    // InternalMyDsl.g:706:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:710:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // InternalMyDsl.g:711:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Sequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1"


    // $ANTLR start "rule__Sequence__Group__1__Impl"
    // InternalMyDsl.g:718:1: rule__Sequence__Group__1__Impl : ( 'Sequence' ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:722:1: ( ( 'Sequence' ) )
            // InternalMyDsl.g:723:1: ( 'Sequence' )
            {
            // InternalMyDsl.g:723:1: ( 'Sequence' )
            // InternalMyDsl.g:724:1: 'Sequence'
            {
             before(grammarAccess.getSequenceAccess().getSequenceKeyword_1()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSequenceAccess().getSequenceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1__Impl"


    // $ANTLR start "rule__Sequence__Group__2"
    // InternalMyDsl.g:737:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:741:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // InternalMyDsl.g:742:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Sequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sequence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__2"


    // $ANTLR start "rule__Sequence__Group__2__Impl"
    // InternalMyDsl.g:749:1: rule__Sequence__Group__2__Impl : ( ( rule__Sequence__GeometryAssignment_2 ) ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:753:1: ( ( ( rule__Sequence__GeometryAssignment_2 ) ) )
            // InternalMyDsl.g:754:1: ( ( rule__Sequence__GeometryAssignment_2 ) )
            {
            // InternalMyDsl.g:754:1: ( ( rule__Sequence__GeometryAssignment_2 ) )
            // InternalMyDsl.g:755:1: ( rule__Sequence__GeometryAssignment_2 )
            {
             before(grammarAccess.getSequenceAccess().getGeometryAssignment_2()); 
            // InternalMyDsl.g:756:1: ( rule__Sequence__GeometryAssignment_2 )
            // InternalMyDsl.g:756:2: rule__Sequence__GeometryAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sequence__GeometryAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getGeometryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__2__Impl"


    // $ANTLR start "rule__Sequence__Group__3"
    // InternalMyDsl.g:766:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:770:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // InternalMyDsl.g:771:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Sequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sequence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__3"


    // $ANTLR start "rule__Sequence__Group__3__Impl"
    // InternalMyDsl.g:778:1: rule__Sequence__Group__3__Impl : ( '{' ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:782:1: ( ( '{' ) )
            // InternalMyDsl.g:783:1: ( '{' )
            {
            // InternalMyDsl.g:783:1: ( '{' )
            // InternalMyDsl.g:784:1: '{'
            {
             before(grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__3__Impl"


    // $ANTLR start "rule__Sequence__Group__4"
    // InternalMyDsl.g:797:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl rule__Sequence__Group__5 ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:801:1: ( rule__Sequence__Group__4__Impl rule__Sequence__Group__5 )
            // InternalMyDsl.g:802:2: rule__Sequence__Group__4__Impl rule__Sequence__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Sequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sequence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__4"


    // $ANTLR start "rule__Sequence__Group__4__Impl"
    // InternalMyDsl.g:809:1: rule__Sequence__Group__4__Impl : ( ( rule__Sequence__Group_4__0 )? ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:813:1: ( ( ( rule__Sequence__Group_4__0 )? ) )
            // InternalMyDsl.g:814:1: ( ( rule__Sequence__Group_4__0 )? )
            {
            // InternalMyDsl.g:814:1: ( ( rule__Sequence__Group_4__0 )? )
            // InternalMyDsl.g:815:1: ( rule__Sequence__Group_4__0 )?
            {
             before(grammarAccess.getSequenceAccess().getGroup_4()); 
            // InternalMyDsl.g:816:1: ( rule__Sequence__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:816:2: rule__Sequence__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Sequence__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSequenceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__4__Impl"


    // $ANTLR start "rule__Sequence__Group__5"
    // InternalMyDsl.g:826:1: rule__Sequence__Group__5 : rule__Sequence__Group__5__Impl ;
    public final void rule__Sequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:830:1: ( rule__Sequence__Group__5__Impl )
            // InternalMyDsl.g:831:2: rule__Sequence__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sequence__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__5"


    // $ANTLR start "rule__Sequence__Group__5__Impl"
    // InternalMyDsl.g:837:1: rule__Sequence__Group__5__Impl : ( '}' ) ;
    public final void rule__Sequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:841:1: ( ( '}' ) )
            // InternalMyDsl.g:842:1: ( '}' )
            {
            // InternalMyDsl.g:842:1: ( '}' )
            // InternalMyDsl.g:843:1: '}'
            {
             before(grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__5__Impl"


    // $ANTLR start "rule__Sequence__Group_4__0"
    // InternalMyDsl.g:868:1: rule__Sequence__Group_4__0 : rule__Sequence__Group_4__0__Impl rule__Sequence__Group_4__1 ;
    public final void rule__Sequence__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:872:1: ( rule__Sequence__Group_4__0__Impl rule__Sequence__Group_4__1 )
            // InternalMyDsl.g:873:2: rule__Sequence__Group_4__0__Impl rule__Sequence__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Sequence__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sequence__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4__0"


    // $ANTLR start "rule__Sequence__Group_4__0__Impl"
    // InternalMyDsl.g:880:1: rule__Sequence__Group_4__0__Impl : ( 'animations' ) ;
    public final void rule__Sequence__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:884:1: ( ( 'animations' ) )
            // InternalMyDsl.g:885:1: ( 'animations' )
            {
            // InternalMyDsl.g:885:1: ( 'animations' )
            // InternalMyDsl.g:886:1: 'animations'
            {
             before(grammarAccess.getSequenceAccess().getAnimationsKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSequenceAccess().getAnimationsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4__0__Impl"


    // $ANTLR start "rule__Sequence__Group_4__1"
    // InternalMyDsl.g:899:1: rule__Sequence__Group_4__1 : rule__Sequence__Group_4__1__Impl rule__Sequence__Group_4__2 ;
    public final void rule__Sequence__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:903:1: ( rule__Sequence__Group_4__1__Impl rule__Sequence__Group_4__2 )
            // InternalMyDsl.g:904:2: rule__Sequence__Group_4__1__Impl rule__Sequence__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Sequence__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sequence__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4__1"


    // $ANTLR start "rule__Sequence__Group_4__1__Impl"
    // InternalMyDsl.g:911:1: rule__Sequence__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Sequence__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:915:1: ( ( '{' ) )
            // InternalMyDsl.g:916:1: ( '{' )
            {
            // InternalMyDsl.g:916:1: ( '{' )
            // InternalMyDsl.g:917:1: '{'
            {
             before(grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4__1__Impl"


    // $ANTLR start "rule__Sequence__Group_4__2"
    // InternalMyDsl.g:930:1: rule__Sequence__Group_4__2 : rule__Sequence__Group_4__2__Impl rule__Sequence__Group_4__3 ;
    public final void rule__Sequence__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:934:1: ( rule__Sequence__Group_4__2__Impl rule__Sequence__Group_4__3 )
            // InternalMyDsl.g:935:2: rule__Sequence__Group_4__2__Impl rule__Sequence__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Sequence__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sequence__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4__2"


    // $ANTLR start "rule__Sequence__Group_4__2__Impl"
    // InternalMyDsl.g:942:1: rule__Sequence__Group_4__2__Impl : ( ( rule__Sequence__AnimationsAssignment_4_2 ) ) ;
    public final void rule__Sequence__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:946:1: ( ( ( rule__Sequence__AnimationsAssignment_4_2 ) ) )
            // InternalMyDsl.g:947:1: ( ( rule__Sequence__AnimationsAssignment_4_2 ) )
            {
            // InternalMyDsl.g:947:1: ( ( rule__Sequence__AnimationsAssignment_4_2 ) )
            // InternalMyDsl.g:948:1: ( rule__Sequence__AnimationsAssignment_4_2 )
            {
             before(grammarAccess.getSequenceAccess().getAnimationsAssignment_4_2()); 
            // InternalMyDsl.g:949:1: ( rule__Sequence__AnimationsAssignment_4_2 )
            // InternalMyDsl.g:949:2: rule__Sequence__AnimationsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sequence__AnimationsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getAnimationsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4__2__Impl"


    // $ANTLR start "rule__Sequence__Group_4__3"
    // InternalMyDsl.g:959:1: rule__Sequence__Group_4__3 : rule__Sequence__Group_4__3__Impl rule__Sequence__Group_4__4 ;
    public final void rule__Sequence__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:963:1: ( rule__Sequence__Group_4__3__Impl rule__Sequence__Group_4__4 )
            // InternalMyDsl.g:964:2: rule__Sequence__Group_4__3__Impl rule__Sequence__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Sequence__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sequence__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4__3"


    // $ANTLR start "rule__Sequence__Group_4__3__Impl"
    // InternalMyDsl.g:971:1: rule__Sequence__Group_4__3__Impl : ( ( rule__Sequence__Group_4_3__0 )* ) ;
    public final void rule__Sequence__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:975:1: ( ( ( rule__Sequence__Group_4_3__0 )* ) )
            // InternalMyDsl.g:976:1: ( ( rule__Sequence__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:976:1: ( ( rule__Sequence__Group_4_3__0 )* )
            // InternalMyDsl.g:977:1: ( rule__Sequence__Group_4_3__0 )*
            {
             before(grammarAccess.getSequenceAccess().getGroup_4_3()); 
            // InternalMyDsl.g:978:1: ( rule__Sequence__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:978:2: rule__Sequence__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    rule__Sequence__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSequenceAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4__3__Impl"


    // $ANTLR start "rule__Sequence__Group_4__4"
    // InternalMyDsl.g:988:1: rule__Sequence__Group_4__4 : rule__Sequence__Group_4__4__Impl ;
    public final void rule__Sequence__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:992:1: ( rule__Sequence__Group_4__4__Impl )
            // InternalMyDsl.g:993:2: rule__Sequence__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sequence__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4__4"


    // $ANTLR start "rule__Sequence__Group_4__4__Impl"
    // InternalMyDsl.g:999:1: rule__Sequence__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Sequence__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1003:1: ( ( '}' ) )
            // InternalMyDsl.g:1004:1: ( '}' )
            {
            // InternalMyDsl.g:1004:1: ( '}' )
            // InternalMyDsl.g:1005:1: '}'
            {
             before(grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4__4__Impl"


    // $ANTLR start "rule__Sequence__Group_4_3__0"
    // InternalMyDsl.g:1028:1: rule__Sequence__Group_4_3__0 : rule__Sequence__Group_4_3__0__Impl rule__Sequence__Group_4_3__1 ;
    public final void rule__Sequence__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1032:1: ( rule__Sequence__Group_4_3__0__Impl rule__Sequence__Group_4_3__1 )
            // InternalMyDsl.g:1033:2: rule__Sequence__Group_4_3__0__Impl rule__Sequence__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Sequence__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sequence__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4_3__0"


    // $ANTLR start "rule__Sequence__Group_4_3__0__Impl"
    // InternalMyDsl.g:1040:1: rule__Sequence__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Sequence__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1044:1: ( ( ',' ) )
            // InternalMyDsl.g:1045:1: ( ',' )
            {
            // InternalMyDsl.g:1045:1: ( ',' )
            // InternalMyDsl.g:1046:1: ','
            {
             before(grammarAccess.getSequenceAccess().getCommaKeyword_4_3_0()); 
            match(input,21,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSequenceAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4_3__0__Impl"


    // $ANTLR start "rule__Sequence__Group_4_3__1"
    // InternalMyDsl.g:1059:1: rule__Sequence__Group_4_3__1 : rule__Sequence__Group_4_3__1__Impl ;
    public final void rule__Sequence__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1063:1: ( rule__Sequence__Group_4_3__1__Impl )
            // InternalMyDsl.g:1064:2: rule__Sequence__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sequence__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4_3__1"


    // $ANTLR start "rule__Sequence__Group_4_3__1__Impl"
    // InternalMyDsl.g:1070:1: rule__Sequence__Group_4_3__1__Impl : ( ( rule__Sequence__AnimationsAssignment_4_3_1 ) ) ;
    public final void rule__Sequence__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1074:1: ( ( ( rule__Sequence__AnimationsAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:1075:1: ( ( rule__Sequence__AnimationsAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:1075:1: ( ( rule__Sequence__AnimationsAssignment_4_3_1 ) )
            // InternalMyDsl.g:1076:1: ( rule__Sequence__AnimationsAssignment_4_3_1 )
            {
             before(grammarAccess.getSequenceAccess().getAnimationsAssignment_4_3_1()); 
            // InternalMyDsl.g:1077:1: ( rule__Sequence__AnimationsAssignment_4_3_1 )
            // InternalMyDsl.g:1077:2: rule__Sequence__AnimationsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sequence__AnimationsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getAnimationsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4_3__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalMyDsl.g:1091:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1095:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalMyDsl.g:1096:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalMyDsl.g:1103:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1107:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1108:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1108:1: ( ( '-' )? )
            // InternalMyDsl.g:1109:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:1110:1: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1111:2: '-'
                    {
                    match(input,22,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalMyDsl.g:1122:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1126:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalMyDsl.g:1127:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalMyDsl.g:1134:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1138:1: ( ( ( RULE_INT )? ) )
            // InternalMyDsl.g:1139:1: ( ( RULE_INT )? )
            {
            // InternalMyDsl.g:1139:1: ( ( RULE_INT )? )
            // InternalMyDsl.g:1140:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalMyDsl.g:1141:1: ( RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1141:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalMyDsl.g:1151:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1155:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalMyDsl.g:1156:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalMyDsl.g:1163:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1167:1: ( ( '.' ) )
            // InternalMyDsl.g:1168:1: ( '.' )
            {
            // InternalMyDsl.g:1168:1: ( '.' )
            // InternalMyDsl.g:1169:1: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalMyDsl.g:1182:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1186:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalMyDsl.g:1187:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EFloat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalMyDsl.g:1194:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1198:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1199:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1199:1: ( RULE_INT )
            // InternalMyDsl.g:1200:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalMyDsl.g:1211:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1215:1: ( rule__EFloat__Group__4__Impl )
            // InternalMyDsl.g:1216:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EFloat__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalMyDsl.g:1222:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1226:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalMyDsl.g:1227:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalMyDsl.g:1227:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalMyDsl.g:1228:1: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalMyDsl.g:1229:1: ( rule__EFloat__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=11 && LA7_0<=12)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1229:2: rule__EFloat__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalMyDsl.g:1249:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1253:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalMyDsl.g:1254:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EFloat__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalMyDsl.g:1261:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1265:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalMyDsl.g:1266:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalMyDsl.g:1266:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalMyDsl.g:1267:1: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalMyDsl.g:1268:1: ( rule__EFloat__Alternatives_4_0 )
            // InternalMyDsl.g:1268:2: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalMyDsl.g:1278:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1282:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalMyDsl.g:1283:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EFloat__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalMyDsl.g:1290:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1294:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1295:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1295:1: ( ( '-' )? )
            // InternalMyDsl.g:1296:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalMyDsl.g:1297:1: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1298:2: '-'
                    {
                    match(input,22,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalMyDsl.g:1309:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1313:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalMyDsl.g:1314:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalMyDsl.g:1320:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1324:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1325:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1325:1: ( RULE_INT )
            // InternalMyDsl.g:1326:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__Appear__GeometryAssignment_2"
    // InternalMyDsl.g:1344:1: rule__Appear__GeometryAssignment_2 : ( RULE_ID ) ;
    public final void rule__Appear__GeometryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1348:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1349:1: ( RULE_ID )
            {
            // InternalMyDsl.g:1349:1: ( RULE_ID )
            // InternalMyDsl.g:1350:1: RULE_ID
            {
             before(grammarAccess.getAppearAccess().getGeometryIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAppearAccess().getGeometryIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appear__GeometryAssignment_2"


    // $ANTLR start "rule__Move__GeometryAssignment_1"
    // InternalMyDsl.g:1359:1: rule__Move__GeometryAssignment_1 : ( RULE_ID ) ;
    public final void rule__Move__GeometryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1363:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1364:1: ( RULE_ID )
            {
            // InternalMyDsl.g:1364:1: ( RULE_ID )
            // InternalMyDsl.g:1365:1: RULE_ID
            {
             before(grammarAccess.getMoveAccess().getGeometryIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getGeometryIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__GeometryAssignment_1"


    // $ANTLR start "rule__Move__SpeedAssignment_4"
    // InternalMyDsl.g:1374:1: rule__Move__SpeedAssignment_4 : ( ruleEFloat ) ;
    public final void rule__Move__SpeedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1378:1: ( ( ruleEFloat ) )
            // InternalMyDsl.g:1379:1: ( ruleEFloat )
            {
            // InternalMyDsl.g:1379:1: ( ruleEFloat )
            // InternalMyDsl.g:1380:1: ruleEFloat
            {
             before(grammarAccess.getMoveAccess().getSpeedEFloatParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getSpeedEFloatParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__SpeedAssignment_4"


    // $ANTLR start "rule__Trigger__GeometryAssignment_2"
    // InternalMyDsl.g:1389:1: rule__Trigger__GeometryAssignment_2 : ( RULE_ID ) ;
    public final void rule__Trigger__GeometryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1393:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1394:1: ( RULE_ID )
            {
            // InternalMyDsl.g:1394:1: ( RULE_ID )
            // InternalMyDsl.g:1395:1: RULE_ID
            {
             before(grammarAccess.getTriggerAccess().getGeometryIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTriggerAccess().getGeometryIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__GeometryAssignment_2"


    // $ANTLR start "rule__Sequence__GeometryAssignment_2"
    // InternalMyDsl.g:1404:1: rule__Sequence__GeometryAssignment_2 : ( RULE_ID ) ;
    public final void rule__Sequence__GeometryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1408:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1409:1: ( RULE_ID )
            {
            // InternalMyDsl.g:1409:1: ( RULE_ID )
            // InternalMyDsl.g:1410:1: RULE_ID
            {
             before(grammarAccess.getSequenceAccess().getGeometryIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSequenceAccess().getGeometryIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__GeometryAssignment_2"


    // $ANTLR start "rule__Sequence__AnimationsAssignment_4_2"
    // InternalMyDsl.g:1419:1: rule__Sequence__AnimationsAssignment_4_2 : ( ruleAnimation ) ;
    public final void rule__Sequence__AnimationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1423:1: ( ( ruleAnimation ) )
            // InternalMyDsl.g:1424:1: ( ruleAnimation )
            {
            // InternalMyDsl.g:1424:1: ( ruleAnimation )
            // InternalMyDsl.g:1425:1: ruleAnimation
            {
             before(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__AnimationsAssignment_4_2"


    // $ANTLR start "rule__Sequence__AnimationsAssignment_4_3_1"
    // InternalMyDsl.g:1434:1: rule__Sequence__AnimationsAssignment_4_3_1 : ( ruleAnimation ) ;
    public final void rule__Sequence__AnimationsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:1438:1: ( ( ruleAnimation ) )
            // InternalMyDsl.g:1439:1: ( ruleAnimation )
            {
            // InternalMyDsl.g:1439:1: ( ruleAnimation )
            // InternalMyDsl.g:1440:1: ruleAnimation
            {
             before(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__AnimationsAssignment_4_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000C00010L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C6000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400010L});
    }


}