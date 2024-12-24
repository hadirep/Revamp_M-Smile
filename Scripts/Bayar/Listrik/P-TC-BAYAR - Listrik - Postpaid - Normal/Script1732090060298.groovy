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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Listrik - Postpaid - Normal\\01.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/01. ViewGroup - Button Bayar'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Listrik - Postpaid - Normal\\02.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/02. ViewGroup - Icon Listrik'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Listrik - Postpaid - Normal\\03.png')


Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/03. SvgView - Cek Saldo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Listrik - Postpaid - Normal\\04.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/04. EditText - Daftar Produk'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Listrik - Postpaid - Normal\\05.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/05. TextView - PLN Postpaid'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Listrik - Postpaid - Normal\\06.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/06. EditText - IDPEL'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Listrik - Postpaid - Normal\\07.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/07. EditText - Input Baru'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/07. EditText - Input Baru'), 
	'544146107003', 0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Listrik - Postpaid - Normal\\08.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/08. ViewGroup - Button Ok'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Listrik - Postpaid - Normal\\09.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/09. ViewGroup - Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/10. TextView - PLN Postpaid'), 
	'PLN Postpaid')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/11. TextView - NRML-.SIT_NI46'), 
	'NRML~!@#$^*}?-&.SIT_NI*46')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/12. TextView - 544146107003'), 
	'544146107003')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/13. TextView - Rp. 100.100'), 
	'Rp. 100.100')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/14. TextView - Rp. 3500'), 
	'Rp. 3500')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/15. TextView - Rp. 103.600'), 
	'Rp. 103.600')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/16. EditText - M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/16. EditText - M-PIN'), '111111', 0)

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Listrik - Postpaid - Normal\\10.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/17. ViewGroup - Bayar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/18. TextView - Pembayaran Berhasil'), 
	'Pembayaran Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/19. TextView - Rp. 100.100'), 
	'Rp. 100.100')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/20. TextView - 544146107003'), 
	'544146107003')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/21. TextView - NRML-.SIT_NI46'), 
	'NRML~!@#$^*}?-&.SIT_NI*46')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/22. TextView - Rp. 100.100'), 
	'Rp. 100.100')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/23. TextView - Rp. 3500'), 
	'Rp. 3500')

Mobile.verifyElementText(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/24. TextView - Rp. 103.600'), 
	'Rp. 103.600')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Listrik - Postpaid - Normal\\11.png')

Mobile.tap(findTestObject('Object Repository/Bayar/Listrik/Postpaid-Positive/25. ViewGroup - Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Listrik - Postpaid - Normal\\12.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-BAYAR - Listrik - Postpaid - Normal\\13.png')

Mobile.tapAtPosition(1140, 430)

Mobile.closeApplication()