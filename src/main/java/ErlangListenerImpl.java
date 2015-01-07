import bhunt.erlang.parser.ErlangListener;
import bhunt.erlang.parser.ErlangParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ErlangListenerImpl implements ErlangListener {
    @Override
    public void enterFunClauses(@NotNull ErlangParser.FunClausesContext ctx) {

    }

    @Override
    public void exitFunClauses(@NotNull ErlangParser.FunClausesContext ctx) {

    }

    @Override
    public void enterFunctionClause(@NotNull ErlangParser.FunctionClauseContext ctx) {

    }

    @Override
    public void exitFunctionClause(@NotNull ErlangParser.FunctionClauseContext ctx) {

    }

    @Override
    public void enterTokChar(@NotNull ErlangParser.TokCharContext ctx) {

    }

    @Override
    public void exitTokChar(@NotNull ErlangParser.TokCharContext ctx) {

    }

    @Override
    public void enterRecordField(@NotNull ErlangParser.RecordFieldContext ctx) {

    }

    @Override
    public void exitRecordField(@NotNull ErlangParser.RecordFieldContext ctx) {

    }

    @Override
    public void enterTypedAttrVal(@NotNull ErlangParser.TypedAttrValContext ctx) {

    }

    @Override
    public void exitTypedAttrVal(@NotNull ErlangParser.TypedAttrValContext ctx) {

    }

    @Override
    public void enterType(@NotNull ErlangParser.TypeContext ctx) {

    }

    @Override
    public void exitType(@NotNull ErlangParser.TypeContext ctx) {

    }

    @Override
    public void enterClauseBody(@NotNull ErlangParser.ClauseBodyContext ctx) {

    }

    @Override
    public void exitClauseBody(@NotNull ErlangParser.ClauseBodyContext ctx) {

    }

    @Override
    public void enterBitTypeList(@NotNull ErlangParser.BitTypeListContext ctx) {

    }

    @Override
    public void exitBitTypeList(@NotNull ErlangParser.BitTypeListContext ctx) {

    }

    @Override
    public void enterArgumentList(@NotNull ErlangParser.ArgumentListContext ctx) {

    }

    @Override
    public void exitArgumentList(@NotNull ErlangParser.ArgumentListContext ctx) {

    }

    @Override
    public void enterTypeSig(@NotNull ErlangParser.TypeSigContext ctx) {

    }

    @Override
    public void exitTypeSig(@NotNull ErlangParser.TypeSigContext ctx) {

    }

    @Override
    public void enterExpr500(@NotNull ErlangParser.Expr500Context ctx) {

    }

    @Override
    public void exitExpr500(@NotNull ErlangParser.Expr500Context ctx) {

    }

    @Override
    public void enterRecordTuple(@NotNull ErlangParser.RecordTupleContext ctx) {

    }

    @Override
    public void exitRecordTuple(@NotNull ErlangParser.RecordTupleContext ctx) {

    }

    @Override
    public void enterType200(@NotNull ErlangParser.Type200Context ctx) {

    }

    @Override
    public void exitType200(@NotNull ErlangParser.Type200Context ctx) {

    }

    @Override
    public void enterTopType(@NotNull ErlangParser.TopTypeContext ctx) {

    }

    @Override
    public void exitTopType(@NotNull ErlangParser.TopTypeContext ctx) {

    }

    @Override
    public void enterBinaryComprehension(@NotNull ErlangParser.BinaryComprehensionContext ctx) {

    }

    @Override
    public void exitBinaryComprehension(@NotNull ErlangParser.BinaryComprehensionContext ctx) {

    }

    @Override
    public void enterRecordExpr(@NotNull ErlangParser.RecordExprContext ctx) {

    }

    @Override
    public void exitRecordExpr(@NotNull ErlangParser.RecordExprContext ctx) {

    }

    @Override
    public void enterPrefixOp(@NotNull ErlangParser.PrefixOpContext ctx) {

    }

    @Override
    public void exitPrefixOp(@NotNull ErlangParser.PrefixOpContext ctx) {

    }

    @Override
    public void enterExpr100(@NotNull ErlangParser.Expr100Context ctx) {

    }

    @Override
    public void exitExpr100(@NotNull ErlangParser.Expr100Context ctx) {

    }

    @Override
    public void enterTryCatch(@NotNull ErlangParser.TryCatchContext ctx) {

    }

    @Override
    public void exitTryCatch(@NotNull ErlangParser.TryCatchContext ctx) {

    }

    @Override
    public void enterTypeGuard(@NotNull ErlangParser.TypeGuardContext ctx) {

    }

    @Override
    public void exitTypeGuard(@NotNull ErlangParser.TypeGuardContext ctx) {

    }

    @Override
    public void enterAtomOrVar(@NotNull ErlangParser.AtomOrVarContext ctx) {

        System.err.println(ctx);

    }

    @Override
    public void exitAtomOrVar(@NotNull ErlangParser.AtomOrVarContext ctx) {

    }

    @Override
    public void enterTokInteger(@NotNull ErlangParser.TokIntegerContext ctx) {
        System.err.println(ctx);
    }

    @Override
    public void exitTokInteger(@NotNull ErlangParser.TokIntegerContext ctx) {

    }

    @Override
    public void enterBinary(@NotNull ErlangParser.BinaryContext ctx) {
        System.err.println(ctx);
    }

    @Override
    public void exitBinary(@NotNull ErlangParser.BinaryContext ctx) {

    }

    @Override
    public void enterFunctionCall(@NotNull ErlangParser.FunctionCallContext ctx) {

    }

    @Override
    public void exitFunctionCall(@NotNull ErlangParser.FunctionCallContext ctx) {

    }

    @Override
    public void enterAtomic(@NotNull ErlangParser.AtomicContext ctx) {
        System.err.println(ctx);
    }

    @Override
    public void exitAtomic(@NotNull ErlangParser.AtomicContext ctx) {

    }

    @Override
    public void enterFieldType(@NotNull ErlangParser.FieldTypeContext ctx) {

    }

    @Override
    public void exitFieldType(@NotNull ErlangParser.FieldTypeContext ctx) {

    }

    @Override
    public void enterBitType(@NotNull ErlangParser.BitTypeContext ctx) {

    }

    @Override
    public void exitBitType(@NotNull ErlangParser.BitTypeContext ctx) {

    }

    @Override
    public void enterBitSizeExpr(@NotNull ErlangParser.BitSizeExprContext ctx) {

    }

    @Override
    public void exitBitSizeExpr(@NotNull ErlangParser.BitSizeExprContext ctx) {

    }

    @Override
    public void enterFunClause(@NotNull ErlangParser.FunClauseContext ctx) {

    }

    @Override
    public void exitFunClause(@NotNull ErlangParser.FunClauseContext ctx) {

    }

    @Override
    public void enterGuard(@NotNull ErlangParser.GuardContext ctx) {

    }

    @Override
    public void exitGuard(@NotNull ErlangParser.GuardContext ctx) {

    }

    @Override
    public void enterIntegerOrVar(@NotNull ErlangParser.IntegerOrVarContext ctx) {
        System.err.println(ctx);
    }

    @Override
    public void exitIntegerOrVar(@NotNull ErlangParser.IntegerOrVarContext ctx) {

    }

    @Override
    public void enterClauseArgs(@NotNull ErlangParser.ClauseArgsContext ctx) {

    }

    @Override
    public void exitClauseArgs(@NotNull ErlangParser.ClauseArgsContext ctx) {

    }

    @Override
    public void enterListComprehension(@NotNull ErlangParser.ListComprehensionContext ctx) {

    }

    @Override
    public void exitListComprehension(@NotNull ErlangParser.ListComprehensionContext ctx) {

    }

    @Override
    public void enterFunType100(@NotNull ErlangParser.FunType100Context ctx) {

    }

    @Override
    public void exitFunType100(@NotNull ErlangParser.FunType100Context ctx) {

    }

    @Override
    public void enterTuple(@NotNull ErlangParser.TupleContext ctx) {
        System.err.println(ctx);
    }

    @Override
    public void exitTuple(@NotNull ErlangParser.TupleContext ctx) {

    }

    @Override
    public void enterFieldTypes(@NotNull ErlangParser.FieldTypesContext ctx) {

    }

    @Override
    public void exitFieldTypes(@NotNull ErlangParser.FieldTypesContext ctx) {

    }

    @Override
    public void enterListOp(@NotNull ErlangParser.ListOpContext ctx) {

    }

    @Override
    public void exitListOp(@NotNull ErlangParser.ListOpContext ctx) {

    }

    @Override
    public void enterExpr600(@NotNull ErlangParser.Expr600Context ctx) {

    }

    @Override
    public void exitExpr600(@NotNull ErlangParser.Expr600Context ctx) {

    }

    @Override
    public void enterTypedExpr(@NotNull ErlangParser.TypedExprContext ctx) {

    }

    @Override
    public void exitTypedExpr(@NotNull ErlangParser.TypedExprContext ctx) {

    }

    @Override
    public void enterIfExpr(@NotNull ErlangParser.IfExprContext ctx) {

    }

    @Override
    public void exitIfExpr(@NotNull ErlangParser.IfExprContext ctx) {

    }

    @Override
    public void enterAttribute(@NotNull ErlangParser.AttributeContext ctx) {

    }

    @Override
    public void exitAttribute(@NotNull ErlangParser.AttributeContext ctx) {

    }

    @Override
    public void enterType500(@NotNull ErlangParser.Type500Context ctx) {

    }

    @Override
    public void exitType500(@NotNull ErlangParser.Type500Context ctx) {

    }

    @Override
    public void enterBinaryType(@NotNull ErlangParser.BinaryTypeContext ctx) {
        System.err.println(ctx);
    }

    @Override
    public void exitBinaryType(@NotNull ErlangParser.BinaryTypeContext ctx) {

    }

    @Override
    public void enterClauseGuard(@NotNull ErlangParser.ClauseGuardContext ctx) {

    }

    @Override
    public void exitClauseGuard(@NotNull ErlangParser.ClauseGuardContext ctx) {

    }

    @Override
    public void enterRecordFields(@NotNull ErlangParser.RecordFieldsContext ctx) {

    }

    @Override
    public void exitRecordFields(@NotNull ErlangParser.RecordFieldsContext ctx) {

    }

    @Override
    public void enterExpr200(@NotNull ErlangParser.Expr200Context ctx) {

    }

    @Override
    public void exitExpr200(@NotNull ErlangParser.Expr200Context ctx) {

    }

    @Override
    public void enterTail(@NotNull ErlangParser.TailContext ctx) {

    }

    @Override
    public void exitTail(@NotNull ErlangParser.TailContext ctx) {

    }

    @Override
    public void enterIfClause(@NotNull ErlangParser.IfClauseContext ctx) {

    }

    @Override
    public void exitIfClause(@NotNull ErlangParser.IfClauseContext ctx) {

    }

    @Override
    public void enterExpr160(@NotNull ErlangParser.Expr160Context ctx) {

    }

    @Override
    public void exitExpr160(@NotNull ErlangParser.Expr160Context ctx) {

    }

    @Override
    public void enterCompOp(@NotNull ErlangParser.CompOpContext ctx) {

    }

    @Override
    public void exitCompOp(@NotNull ErlangParser.CompOpContext ctx) {

    }

    @Override
    public void enterBinElements(@NotNull ErlangParser.BinElementsContext ctx) {

    }

    @Override
    public void exitBinElements(@NotNull ErlangParser.BinElementsContext ctx) {

    }

    @Override
    public void enterRuleClauses(@NotNull ErlangParser.RuleClausesContext ctx) {

    }

    @Override
    public void exitRuleClauses(@NotNull ErlangParser.RuleClausesContext ctx) {

    }

    @Override
    public void enterBitExpr(@NotNull ErlangParser.BitExprContext ctx) {

    }

    @Override
    public void exitBitExpr(@NotNull ErlangParser.BitExprContext ctx) {

    }

    @Override
    public void enterOptBitSizeExpr(@NotNull ErlangParser.OptBitSizeExprContext ctx) {

    }

    @Override
    public void exitOptBitSizeExpr(@NotNull ErlangParser.OptBitSizeExprContext ctx) {

    }

    @Override
    public void enterTypedExprs(@NotNull ErlangParser.TypedExprsContext ctx) {

    }

    @Override
    public void exitTypedExprs(@NotNull ErlangParser.TypedExprsContext ctx) {

    }

    @Override
    public void enterBinUnitType(@NotNull ErlangParser.BinUnitTypeContext ctx) {

    }

    @Override
    public void exitBinUnitType(@NotNull ErlangParser.BinUnitTypeContext ctx) {

    }

    @Override
    public void enterCaseExpr(@NotNull ErlangParser.CaseExprContext ctx) {

    }

    @Override
    public void exitCaseExpr(@NotNull ErlangParser.CaseExprContext ctx) {

    }

    @Override
    public void enterTokAtom(@NotNull ErlangParser.TokAtomContext ctx) {

    }

    @Override
    public void exitTokAtom(@NotNull ErlangParser.TokAtomContext ctx) {

    }

    @Override
    public void enterBinBaseType(@NotNull ErlangParser.BinBaseTypeContext ctx) {

    }

    @Override
    public void exitBinBaseType(@NotNull ErlangParser.BinBaseTypeContext ctx) {

    }

    @Override
    public void enterTryClause(@NotNull ErlangParser.TryClauseContext ctx) {

    }

    @Override
    public void exitTryClause(@NotNull ErlangParser.TryClauseContext ctx) {

    }

    @Override
    public void enterFunExpr(@NotNull ErlangParser.FunExprContext ctx) {

    }

    @Override
    public void exitFunExpr(@NotNull ErlangParser.FunExprContext ctx) {

    }

    @Override
    public void enterSpecFun(@NotNull ErlangParser.SpecFunContext ctx) {

    }

    @Override
    public void exitSpecFun(@NotNull ErlangParser.SpecFunContext ctx) {

    }

    @Override
    public void enterExpr150(@NotNull ErlangParser.Expr150Context ctx) {

    }

    @Override
    public void exitExpr150(@NotNull ErlangParser.Expr150Context ctx) {

    }

    @Override
    public void enterMultOp(@NotNull ErlangParser.MultOpContext ctx) {

    }

    @Override
    public void exitMultOp(@NotNull ErlangParser.MultOpContext ctx) {

    }

    @Override
    public void enterTokFloat(@NotNull ErlangParser.TokFloatContext ctx) {

    }

    @Override
    public void exitTokFloat(@NotNull ErlangParser.TokFloatContext ctx) {

    }

    @Override
    public void enterFunction(@NotNull ErlangParser.FunctionContext ctx) {

    }

    @Override
    public void exitFunction(@NotNull ErlangParser.FunctionContext ctx) {

    }

    @Override
    public void enterTokString(@NotNull ErlangParser.TokStringContext ctx) {
        System.err.println(ctx);
    }

    @Override
    public void exitTokString(@NotNull ErlangParser.TokStringContext ctx) {

    }

    @Override
    public void enterExpr700(@NotNull ErlangParser.Expr700Context ctx) {

    }

    @Override
    public void exitExpr700(@NotNull ErlangParser.Expr700Context ctx) {

    }

    @Override
    public void enterType400(@NotNull ErlangParser.Type400Context ctx) {

    }

    @Override
    public void exitType400(@NotNull ErlangParser.Type400Context ctx) {

    }

    @Override
    public void enterTypedRecordFields(@NotNull ErlangParser.TypedRecordFieldsContext ctx) {

    }

    @Override
    public void exitTypedRecordFields(@NotNull ErlangParser.TypedRecordFieldsContext ctx) {

    }

    @Override
    public void enterCrClauses(@NotNull ErlangParser.CrClausesContext ctx) {

    }

    @Override
    public void exitCrClauses(@NotNull ErlangParser.CrClausesContext ctx) {

    }

    @Override
    public void enterExpr300(@NotNull ErlangParser.Expr300Context ctx) {

    }

    @Override
    public void exitExpr300(@NotNull ErlangParser.Expr300Context ctx) {

    }

    @Override
    public void enterList(@NotNull ErlangParser.ListContext ctx) {
        System.err.println(ctx);
    }

    @Override
    public void exitList(@NotNull ErlangParser.ListContext ctx) {

    }

    @Override
    public void enterCrClause(@NotNull ErlangParser.CrClauseContext ctx) {

    }

    @Override
    public void exitCrClause(@NotNull ErlangParser.CrClauseContext ctx) {

    }

    @Override
    public void enterTypeSigs(@NotNull ErlangParser.TypeSigsContext ctx) {

    }

    @Override
    public void exitTypeSigs(@NotNull ErlangParser.TypeSigsContext ctx) {

    }

    @Override
    public void enterAttrVal(@NotNull ErlangParser.AttrValContext ctx) {

    }

    @Override
    public void exitAttrVal(@NotNull ErlangParser.AttrValContext ctx) {

    }

    @Override
    public void enterTopType100(@NotNull ErlangParser.TopType100Context ctx) {

    }

    @Override
    public void exitTopType100(@NotNull ErlangParser.TopType100Context ctx) {

    }

    @Override
    public void enterTypeSpec(@NotNull ErlangParser.TypeSpecContext ctx) {

    }

    @Override
    public void exitTypeSpec(@NotNull ErlangParser.TypeSpecContext ctx) {

    }

    @Override
    public void enterFunType(@NotNull ErlangParser.FunTypeContext ctx) {

    }

    @Override
    public void exitFunType(@NotNull ErlangParser.FunTypeContext ctx) {

    }

    @Override
    public void enterRuleBody(@NotNull ErlangParser.RuleBodyContext ctx) {

    }

    @Override
    public void exitRuleBody(@NotNull ErlangParser.RuleBodyContext ctx) {

    }

    @Override
    public void enterRuleClause(@NotNull ErlangParser.RuleClauseContext ctx) {

    }

    @Override
    public void exitRuleClause(@NotNull ErlangParser.RuleClauseContext ctx) {

    }

    @Override
    public void enterLcExpr(@NotNull ErlangParser.LcExprContext ctx) {

    }

    @Override
    public void exitLcExpr(@NotNull ErlangParser.LcExprContext ctx) {

    }

    @Override
    public void enterExprMax(@NotNull ErlangParser.ExprMaxContext ctx) {

    }

    @Override
    public void exitExprMax(@NotNull ErlangParser.ExprMaxContext ctx) {

    }

    @Override
    public void enterExprs(@NotNull ErlangParser.ExprsContext ctx) {

    }

    @Override
    public void exitExprs(@NotNull ErlangParser.ExprsContext ctx) {

    }

    @Override
    public void enterExpr(@NotNull ErlangParser.ExprContext ctx) {
        System.err.println(ctx);
    }

    @Override
    public void exitExpr(@NotNull ErlangParser.ExprContext ctx) {

    }

    @Override
    public void enterExpr800(@NotNull ErlangParser.Expr800Context ctx) {

    }

    @Override
    public void exitExpr800(@NotNull ErlangParser.Expr800Context ctx) {

    }

    @Override
    public void enterType300(@NotNull ErlangParser.Type300Context ctx) {

    }

    @Override
    public void exitType300(@NotNull ErlangParser.Type300Context ctx) {

    }

    @Override
    public void enterTryClauses(@NotNull ErlangParser.TryClausesContext ctx) {

    }

    @Override
    public void exitTryClauses(@NotNull ErlangParser.TryClausesContext ctx) {

    }

    @Override
    public void enterReceiveExpr(@NotNull ErlangParser.ReceiveExprContext ctx) {

    }

    @Override
    public void exitReceiveExpr(@NotNull ErlangParser.ReceiveExprContext ctx) {

    }

    @Override
    public void enterIfClauses(@NotNull ErlangParser.IfClausesContext ctx) {

    }

    @Override
    public void exitIfClauses(@NotNull ErlangParser.IfClausesContext ctx) {

    }

    @Override
    public void enterExpr400(@NotNull ErlangParser.Expr400Context ctx) {

    }

    @Override
    public void exitExpr400(@NotNull ErlangParser.Expr400Context ctx) {

    }

    @Override
    public void enterAddOp(@NotNull ErlangParser.AddOpContext ctx) {

    }

    @Override
    public void exitAddOp(@NotNull ErlangParser.AddOpContext ctx) {

    }

    @Override
    public void enterOptBitTypeList(@NotNull ErlangParser.OptBitTypeListContext ctx) {

    }

    @Override
    public void exitOptBitTypeList(@NotNull ErlangParser.OptBitTypeListContext ctx) {

    }

    @Override
    public void enterLcExprs(@NotNull ErlangParser.LcExprsContext ctx) {

    }

    @Override
    public void exitLcExprs(@NotNull ErlangParser.LcExprsContext ctx) {

    }

    @Override
    public void enterForm(@NotNull ErlangParser.FormContext ctx) {
        System.err.println(ctx);
    }

    @Override
    public void exitForm(@NotNull ErlangParser.FormContext ctx) {

    }

    @Override
    public void enterTryExpr(@NotNull ErlangParser.TryExprContext ctx) {

    }

    @Override
    public void exitTryExpr(@NotNull ErlangParser.TryExprContext ctx) {

    }

    @Override
    public void enterTokVar(@NotNull ErlangParser.TokVarContext ctx) {

    }

    @Override
    public void exitTokVar(@NotNull ErlangParser.TokVarContext ctx) {

    }

    @Override
    public void enterTypeGuards(@NotNull ErlangParser.TypeGuardsContext ctx) {

    }

    @Override
    public void exitTypeGuards(@NotNull ErlangParser.TypeGuardsContext ctx) {

    }

    @Override
    public void enterTopTypes(@NotNull ErlangParser.TopTypesContext ctx) {

    }

    @Override
    public void exitTopTypes(@NotNull ErlangParser.TopTypesContext ctx) {

    }

    @Override
    public void enterForms(@NotNull ErlangParser.FormsContext ctx) {

    }

    @Override
    public void exitForms(@NotNull ErlangParser.FormsContext ctx) {

    }

    @Override
    public void enterBinElement(@NotNull ErlangParser.BinElementContext ctx) {
        System.err.println(ctx);
    }

    @Override
    public void exitBinElement(@NotNull ErlangParser.BinElementContext ctx) {

    }

    @Override
    public void visitTerminal(@NotNull TerminalNode terminalNode) {
        System.err.println(terminalNode);
    }

    @Override
    public void visitErrorNode(@NotNull ErrorNode errorNode) {
        System.err.println(errorNode);
    }

    @Override
    public void enterEveryRule(@NotNull ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(@NotNull ParserRuleContext parserRuleContext) {

    }
}
