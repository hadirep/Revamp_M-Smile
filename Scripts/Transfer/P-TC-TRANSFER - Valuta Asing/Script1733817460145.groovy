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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\01.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/01. ViewGroup-Transfer'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\02.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/02. ViewGroup-Transfer Valuta Asing'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\03.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/03. EditText-Tap Field Norek'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\04.png')

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/04. EditText-Set Norek'), '010742029111292', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\05.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/05. ViewGroup-OK'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\06.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/06. ViewGroup-Tap Nominal'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\07.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/07. EditText-Tap Nominal Sumber'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\08.png')

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/08. EditText-Set Nominal Sumber'), '100000', 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\09.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/09. TextView-SAVE'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\10.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/10. ViewGroup-Centang TnC'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\11.png')

Mobile.scrollToText('Lanjut')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/11. ViewGroup-Lanjut'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\12.png')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/12. TextView-verif 010742029111292'), 
    '010742029111292 ')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/13. TextView-verif TRIA UAT'), 
    'TRIA UAT            ')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/14. TextView-verif IDR 100.000.00'),
	'IDR 100.000.00 ')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/15. TextView-verif USD 6.80'),
	'USD 6.80 ')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/16. TextView-verif USD 1,00 - IDR 14.705.00'), 
    'USD 1,00 -> IDR 14.705.00')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/17. TextView-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/18. EditText-Set M-PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\13.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/19. TextView - Lanjut'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\14.png')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/20. TextView-verif 10742029111292'), 
	'010742029111292')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/21. TextView-verif TRIA UAT'), 
	'TRIA UAT            ')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/22. TextView-verif IDR. 100.000.00'), 
	'IDR. 100.000.00')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/23. TextView-verif USD. 6.80'), 
	'USD. 6.80')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/24. TextView-verif USD 1.00 - IDR 14.705.00'), 
	'USD 1.00 -> IDR 14.705.00')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/25. TextView-verif IDR. 0'), 
	'IDR. 0')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\15.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/26. ViewGroup-Bagikan'), 0)

Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\16.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/27. Button-Cancel'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\17.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Valuta Asing/28. GroupView-Close Button'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\18.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Valuta Asing\\19.png')

Mobile.closeApplication()