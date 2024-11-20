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

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/01. ViewGroup - Button Transfer'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/02. ViewGroup - Transfer VA Bank Mega'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/03. EditText - Input Nomor Rekening Baru'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/03. EditText - Input Nomor Rekening Baru'), 
	'8111222000000009', 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/04. ScrollView - Tap Body'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/05. ViewGroup - Button OK'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/06. SvgView - Cek Saldo'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/06. SvgView - Cek Saldo'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/07. ViewGroup - Button Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/08. EditText - Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/08. EditText - Nominal'), '205000', 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/09. ScrollView - Tap Body'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/EditText - Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/EditText - Tap M-PIN'), 
	'111111', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/12. SvgView - Cek M-PIN'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/12. SvgView - Cek M-PIN'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/13. ViewGroup - Button Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/14. TextView - Transfer Berhasil'), 
	'Transfer Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/15. TextView - Mega - 8111222000000009'),
	'Mega - 8111222000000009')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/16. TextView - YAPEKA ANY'), 
	'YAPEKA ANY')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/ViewGroup - Bagikan'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/18. ImageView - WhatsApp'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/19. Button - Button Search'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/20. EditText - Search name or number'), 0)

Mobile.takeScreenshot()

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/20. EditText - Search name or number'), 'Data', 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/21. LinearLayout - Share to Chat'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/22. ImageButton - Button Share'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/23. ImageButton - Button Share 2'), 0)

Mobile.takeScreenshot()

Mobile.pressBack()

Mobile.takeScreenshot()

Mobile.pressBack()

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Virtual Account/24. GroupView - Button Close'), 0)

Mobile.takeScreenshot()

Mobile.closeApplication()