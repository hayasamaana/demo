/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.parseTreeConstruction;

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;

import org.xtext.example.mydsl.services.MyDslGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class MyDslParsetreeConstructor extends org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor {
		
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	protected AbstractToken getRootToken(IEObjectConsumer inst) {
		return new ThisRootNode(inst);	
	}
	
protected class ThisRootNode extends RootToken {
	public ThisRootNode(IEObjectConsumer inst) {
		super(inst);
	}
	
	@Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Animation_Alternatives(this, this, 0, inst);
			case 1: return new Appear_Group(this, this, 1, inst);
			case 2: return new Move_Group(this, this, 2, inst);
			case 3: return new Trigger_Group(this, this, 3, inst);
			case 4: return new Sequence_Group(this, this, 4, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule Animation ****************
 *
 * Animation:
 * 	Appear | Move | Trigger | Sequence;
 *
 **/

// Appear | Move | Trigger | Sequence
protected class Animation_Alternatives extends AlternativesToken {

	public Animation_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getAnimationAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Animation_AppearParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Animation_MoveParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new Animation_TriggerParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new Animation_SequenceParserRuleCall_3(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getAppearAccess().getAppearAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMoveRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getSequenceAccess().getSequenceAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getTriggerAccess().getTriggerAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// Appear
protected class Animation_AppearParserRuleCall_0 extends RuleCallToken {
	
	public Animation_AppearParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getAnimationAccess().getAppearParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Appear_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getAppearAccess().getAppearAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(Appear_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// Move
protected class Animation_MoveParserRuleCall_1 extends RuleCallToken {
	
	public Animation_MoveParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getAnimationAccess().getMoveParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Move_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMoveRule().getType().getClassifier())
			return null;
		if(checkForRecursion(Move_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// Trigger
protected class Animation_TriggerParserRuleCall_2 extends RuleCallToken {
	
	public Animation_TriggerParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getAnimationAccess().getTriggerParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Trigger_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getTriggerAccess().getTriggerAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(Trigger_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// Sequence
protected class Animation_SequenceParserRuleCall_3 extends RuleCallToken {
	
	public Animation_SequenceParserRuleCall_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getAnimationAccess().getSequenceParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Sequence_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getSequenceAccess().getSequenceAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(Sequence_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule Animation ****************/


/************ begin Rule Appear ****************
 *
 * Appear:
 * 	{Appear}
 * 	'Appear'
 * 	geometry=ID;
 *
 **/

// {Appear} 'Appear' geometry=ID
protected class Appear_Group extends GroupToken {
	
	public Appear_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getAppearAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Appear_GeometryAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getAppearAccess().getAppearAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {Appear}
protected class Appear_AppearAction_0 extends ActionToken  {

	public Appear_AppearAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getAppearAccess().getAppearAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// 'Appear'
protected class Appear_AppearKeyword_1 extends KeywordToken  {
	
	public Appear_AppearKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getAppearAccess().getAppearKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Appear_AppearAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// geometry=ID
protected class Appear_GeometryAssignment_2 extends AssignmentToken  {
	
	public Appear_GeometryAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getAppearAccess().getGeometryAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Appear_AppearKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("geometry",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("geometry");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getAppearAccess().getGeometryIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getAppearAccess().getGeometryIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule Appear ****************/


/************ begin Rule Move ****************
 *
 * Move:
 * 	'Move'
 * 	geometry=ID
 * 	'{'
 * 	'speed' speed=EFloat
 * 	'}';
 *
 **/

// 'Move' geometry=ID '{' 'speed' speed=EFloat '}'
protected class Move_Group extends GroupToken {
	
	public Move_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMoveAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Move_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMoveRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'Move'
protected class Move_MoveKeyword_0 extends KeywordToken  {
	
	public Move_MoveKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMoveAccess().getMoveKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// geometry=ID
protected class Move_GeometryAssignment_1 extends AssignmentToken  {
	
	public Move_GeometryAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMoveAccess().getGeometryAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Move_MoveKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("geometry",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("geometry");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMoveAccess().getGeometryIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMoveAccess().getGeometryIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// '{'
protected class Move_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public Move_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Move_GeometryAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'speed'
protected class Move_SpeedKeyword_3 extends KeywordToken  {
	
	public Move_SpeedKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMoveAccess().getSpeedKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Move_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// speed=EFloat
protected class Move_SpeedAssignment_4 extends AssignmentToken  {
	
	public Move_SpeedAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMoveAccess().getSpeedAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Move_SpeedKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("speed",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("speed");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMoveAccess().getSpeedEFloatParserRuleCall_4_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMoveAccess().getSpeedEFloatParserRuleCall_4_0();
			return obj;
		}
		return null;
	}

}

// '}'
protected class Move_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public Move_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMoveAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Move_SpeedAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule Move ****************/


/************ begin Rule Trigger ****************
 *
 * Trigger:
 * 	{Trigger}
 * 	'Trigger'
 * 	geometry=ID;
 *
 **/

// {Trigger} 'Trigger' geometry=ID
protected class Trigger_Group extends GroupToken {
	
	public Trigger_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getTriggerAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Trigger_GeometryAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getTriggerAccess().getTriggerAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {Trigger}
protected class Trigger_TriggerAction_0 extends ActionToken  {

	public Trigger_TriggerAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getTriggerAccess().getTriggerAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// 'Trigger'
protected class Trigger_TriggerKeyword_1 extends KeywordToken  {
	
	public Trigger_TriggerKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getTriggerAccess().getTriggerKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Trigger_TriggerAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// geometry=ID
protected class Trigger_GeometryAssignment_2 extends AssignmentToken  {
	
	public Trigger_GeometryAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getTriggerAccess().getGeometryAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Trigger_TriggerKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("geometry",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("geometry");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getTriggerAccess().getGeometryIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getTriggerAccess().getGeometryIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule Trigger ****************/


/************ begin Rule Sequence ****************
 *
 * Sequence:
 * 	{Sequence}
 * 	'Sequence'
 * 	geometry=ID
 * 	'{' ('animations' '{' animations+=Animation ("," animations+=Animation)* '}')?
 * 	'}';
 *
 **/

// {Sequence} 'Sequence' geometry=ID '{' ('animations' '{' animations+=Animation ("," animations+=Animation)* '}')? '}'
protected class Sequence_Group extends GroupToken {
	
	public Sequence_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getSequenceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Sequence_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getSequenceAccess().getSequenceAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {Sequence}
protected class Sequence_SequenceAction_0 extends ActionToken  {

	public Sequence_SequenceAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getSequenceAccess().getSequenceAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// 'Sequence'
protected class Sequence_SequenceKeyword_1 extends KeywordToken  {
	
	public Sequence_SequenceKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getSequenceAccess().getSequenceKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Sequence_SequenceAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// geometry=ID
protected class Sequence_GeometryAssignment_2 extends AssignmentToken  {
	
	public Sequence_GeometryAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getSequenceAccess().getGeometryAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Sequence_SequenceKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("geometry",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("geometry");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getSequenceAccess().getGeometryIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getSequenceAccess().getGeometryIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// '{'
protected class Sequence_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public Sequence_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Sequence_GeometryAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('animations' '{' animations+=Animation ("," animations+=Animation)* '}')?
protected class Sequence_Group_4 extends GroupToken {
	
	public Sequence_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getSequenceAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Sequence_RightCurlyBracketKeyword_4_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'animations'
protected class Sequence_AnimationsKeyword_4_0 extends KeywordToken  {
	
	public Sequence_AnimationsKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getSequenceAccess().getAnimationsKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Sequence_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class Sequence_LeftCurlyBracketKeyword_4_1 extends KeywordToken  {
	
	public Sequence_LeftCurlyBracketKeyword_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Sequence_AnimationsKeyword_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// animations+=Animation
protected class Sequence_AnimationsAssignment_4_2 extends AssignmentToken  {
	
	public Sequence_AnimationsAssignment_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getSequenceAccess().getAnimationsAssignment_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Animation_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("animations",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("animations");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAnimationRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_4_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new Sequence_LeftCurlyBracketKeyword_4_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," animations+=Animation)*
protected class Sequence_Group_4_3 extends GroupToken {
	
	public Sequence_Group_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getSequenceAccess().getGroup_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Sequence_AnimationsAssignment_4_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class Sequence_CommaKeyword_4_3_0 extends KeywordToken  {
	
	public Sequence_CommaKeyword_4_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getSequenceAccess().getCommaKeyword_4_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Sequence_Group_4_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Sequence_AnimationsAssignment_4_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// animations+=Animation
protected class Sequence_AnimationsAssignment_4_3_1 extends AssignmentToken  {
	
	public Sequence_AnimationsAssignment_4_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getSequenceAccess().getAnimationsAssignment_4_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Animation_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("animations",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("animations");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getAnimationRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_4_3_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new Sequence_CommaKeyword_4_3_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// '}'
protected class Sequence_RightCurlyBracketKeyword_4_4 extends KeywordToken  {
	
	public Sequence_RightCurlyBracketKeyword_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Sequence_Group_4_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Sequence_AnimationsAssignment_4_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// '}'
protected class Sequence_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public Sequence_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Sequence_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Sequence_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


/************ end Rule Sequence ****************/


}
