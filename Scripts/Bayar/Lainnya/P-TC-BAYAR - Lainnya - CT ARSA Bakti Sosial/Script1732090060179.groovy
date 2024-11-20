import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.bankmega.msmiledev')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Lainnya - CT ARSA Bakti Sosial\\01.png')

Mobile.tap(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/01. ViewGroup-Bayar'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Lainnya - CT ARSA Bakti Sosial\\02.png')

Mobile.tap(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/02. ViewGroup-Lainnya'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Lainnya - CT ARSA Bakti Sosial\\03.png')

Mobile.tap(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/03. SvgView-Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Lainnya - CT ARSA Bakti Sosial\\04.png')

Mobile.tap(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/04. EditText-Daftar Produk'), 0)

Mobile.tap(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/05. TextView-CT ARSA PEDULI BAKTI SOSIAL'), 
    0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Lainnya - CT ARSA Bakti Sosial\\05.png')

Mobile.tap(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/06. TextView-Tap Nominal'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Lainnya - CT ARSA Bakti Sosial\\06.png')

Mobile.setText(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/07. EditText-Set Nominal'), '10000', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Lainnya - CT ARSA Bakti Sosial\\07.png')

Mobile.tap(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/08. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/09. TextView-verif CT ARSA PEDULI BAKTI SOSIAL'), 
    'CT ARSA PEDULI BAKTI SOSIAL')

Mobile.verifyElementText(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/10. TextView-verif BAKTI SOSIAL TEST'), 
    'BAKTI SOSIAL TEST')

Mobile.verifyElementText(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/11. TextView-verif Rp. 10.000'), 
	'Rp. 10.000')

Mobile.verifyElementText(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/12. TextView-verif adm Rp. 0'), 
	'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/13. TextView-verif total Rp. 10.000'), 
    'Rp. 10.000')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Lainnya - CT ARSA Bakti Sosial\\08.png')

Mobile.tap(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/14. TextView-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/15. EditText-Input M-PIN'), '111111', 
    0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Lainnya - CT ARSA Bakti Sosial\\09.png')

Mobile.tap(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/16. ViewGroup-Bayar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/17. TextView-verif Pembayaran Berhasil'), 
    'Pembayaran Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/18. TextView-verif Rp. 10.000'), 
	'Rp. 10.000')

Mobile.verifyElementText(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/19. TextView - BAKTI SOSIAL TEST'), 
    'BAKTI SOSIAL TEST             ')

Mobile.verifyElementText(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/20. TextView-verif Nominal Rp. 10.000'), 
    'Rp. 10.000')

Mobile.verifyElementText(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/21. TextView-verif adm Rp. 0'),
	'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/22. TextView-verif total Rp. 10.000'), 
    'Rp. 10.000')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Lainnya - CT ARSA Bakti Sosial\\10.png')

Mobile.tap(findTestObject('Object Repository/Lainnya/CT ARSA Bakti Sosial/23. ViewGroup-Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Lainnya - CT ARSA Bakti Sosial\\11.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Lainnya - CT ARSA Bakti Sosial\\12.png')

Mobile.tapAtPosition(1123, 452)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23120006\\Katalon Studio\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Lainnya - CT ARSA Bakti Sosial\\13.png')

Mobile.closeApplication()

