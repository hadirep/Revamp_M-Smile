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

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\01.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/01. SvgView-Transfer'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\02.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/02. ViewGroup-Transfer ke Bank Mega'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\03.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/03. EditText-Tap Norek'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/04. EditText-Set Norek'), '20070021003093', 
    0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\04.png')

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\05.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/05. ViewGroup-OK'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\06.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/06. SvgView-Cek Saldo'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/07. ViewGroup-Tap Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/08. EditText-Set Nominal'), '100000', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/09. EditText-Tap Pesan'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/10. EditText-Set Pesan'), 'Sedekah 100 rb', 
    0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/11. TextView-verify 20070021003093'), 
	'20070021003093')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/12. EditText-verify 100.000'), 
	'100.000')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/13. EditText-verify Sedekah 100 rb'), 
	'Sedekah 100 rb')

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\07.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/14. ViewGroup-Lanjut'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\08.png')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/15. TextView-verify 20070021003093'),
	'20070021003093')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\09.png')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/16. TextView-HADI RAHMAH ESA PUT'),
	'HADI RAHMAH ESA PUT')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\10.png')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/17. TextView-Rp. 100.000'),
	'Rp. 100.000')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\11.png')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/18. TextView-verify Rp.0'),
	'Rp.0')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\12.png')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/19. TextView-verify Rp. 100.000'),
	'Rp. 100.000')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\13.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/21. EditText-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/21. EditText-Tap M-PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\14.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/22. ViewGroup-Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/23. TextView-verify Transfer Berhasil'),
	'Transfer Berhasil')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/24. TextView-verify Rp.100.000'), 
	'Rp.100.000')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/25. TextView-verify Bank Mega - 20070021003093'),
	'20070021003093')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/26. TextView-verify HADI RAHMAH ESA PUT'),
	'HADI RAHMAH ESA PUT')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/27. TextView-verify Rp. 100.000'),
	'Rp. 100.000')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/28. TextView-verify Rp.0'),
	'Rp.0')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/29. TextView-verify Rp. 100.000'),
	'Rp. 100.000')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\15.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/30. ViewGroup-Bagikan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\16.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\17.png')

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer - Bank Mega/31. GroupView-Close Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-TRANSFER - Bank Mega\\18.png')

Mobile.closeApplication()