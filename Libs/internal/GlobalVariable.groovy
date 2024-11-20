package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object rekMegaS
     
    /**
     * <p></p>
     */
    public static Object rekMegaD
     
    /**
     * <p></p>
     */
    public static Object pasLogin
     
    /**
     * <p></p>
     */
    public static Object mpin
     
    /**
     * <p></p>
     */
    public static Object LedgerBalance
     
    /**
     * <p></p>
     */
    public static Object SaldoAwal
     
    /**
     * <p></p>
     */
    public static Object rekening
     
    /**
     * <p></p>
     */
    public static Object rekSumber
     
    /**
     * <p></p>
     */
    public static Object SaldoFinalSumber
     
    /**
     * <p></p>
     */
    public static Object SaldoAwalSumber
     
    /**
     * <p></p>
     */
    public static Object SaldoAkhirSumber
     
    /**
     * <p></p>
     */
    public static Object NominalTrx
     
    /**
     * <p></p>
     */
    public static Object rekTujuan
     
    /**
     * <p></p>
     */
    public static Object SaldoAwalTujuan
     
    /**
     * <p></p>
     */
    public static Object SaldoFinalTujuan
     
    /**
     * <p></p>
     */
    public static Object SaldoAkhir
     
    /**
     * <p></p>
     */
    public static Object SaldoAkhirTujuan
     
    /**
     * <p></p>
     */
    public static Object SaldoFinalSumberTujuan
     
    /**
     * <p></p>
     */
    public static Object TransactionCode
     
    /**
     * <p></p>
     */
    public static Object rekMega
     
    /**
     * <p></p>
     */
    public static Object ccmega
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            rekMegaS = selectedVariables['rekMegaS']
            rekMegaD = selectedVariables['rekMegaD']
            pasLogin = selectedVariables['pasLogin']
            mpin = selectedVariables['mpin']
            LedgerBalance = selectedVariables['LedgerBalance']
            SaldoAwal = selectedVariables['SaldoAwal']
            rekening = selectedVariables['rekening']
            rekSumber = selectedVariables['rekSumber']
            SaldoFinalSumber = selectedVariables['SaldoFinalSumber']
            SaldoAwalSumber = selectedVariables['SaldoAwalSumber']
            SaldoAkhirSumber = selectedVariables['SaldoAkhirSumber']
            NominalTrx = selectedVariables['NominalTrx']
            rekTujuan = selectedVariables['rekTujuan']
            SaldoAwalTujuan = selectedVariables['SaldoAwalTujuan']
            SaldoFinalTujuan = selectedVariables['SaldoFinalTujuan']
            SaldoAkhir = selectedVariables['SaldoAkhir']
            SaldoAkhirTujuan = selectedVariables['SaldoAkhirTujuan']
            SaldoFinalSumberTujuan = selectedVariables['SaldoFinalSumberTujuan']
            TransactionCode = selectedVariables['TransactionCode']
            rekMega = selectedVariables['rekMega']
            ccmega = selectedVariables['ccmega']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
