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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Upload QRIS - Albums\\01.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/01. ViewGroup - Button QRIS'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Upload QRIS - Albums\\02.png')

Mobile.tapAtPosition(980, 2050)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Upload QRIS - Albums\\03.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/02. TextView-Albums'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Upload QRIS - Albums\\04.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/03. CardView-WhatsApp Album'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Upload QRIS - Albums\\05.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/04. ImageView-Barcode'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Upload QRIS - Albums\\06.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/05. SvgView - Cek Saldo'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/06. TextView - FINDI NUR WITRIANI'),
	'FINDI NUR WITRIANI')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/07. TextView - 9360042613806500772'),
	'9360042613806500772')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/08. TextView - Bank Mega'),
	'Bank Mega')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/09. EditText - Rp. 10.000'),
	'Rp. 10.000')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Upload QRIS - Albums\\07.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/10. ViewGroup - Button Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/11. TextView - MEGA DANA ESTATEMENT'),
	'MEGA DANA ESTATEMENT')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/12. TextView - HADI RAHMAH ESA PUTRA'),
	'HADI RAHMAH ESA PUTRA')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/13. TextView - 010740021017780'),
	'010740021017780')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/14. TextView - Bank Mega'),
	'Bank Mega')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/15. TextView - FINDI UAT'),
	'FINDI UAT')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/16. TextView - 10740020459183'),
	'10740020459183')

Mobile.tap(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/17. ViewGroup - Pakai Kupon'), 0)

Mobile.tap(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/18. Switch - Pakai MPC Points'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/19. TextView-Nominal Rp. 10.000'),
	'Rp. 10.000')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/20. TextView-Total Rp. 10.000'),
	'Rp. 10.000')

Mobile.tap(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/21. ViewGroup-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/22. EditText-Set M-PIN'),
	'111111', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Upload QRIS - Albums\\08.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/23. ViewGroup-Bayar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/24. TextView-Transfer Pakai QRIS Berhasil'),
	'Transfer Pakai QRIS Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/25. TextView-Rp. 10.000'),
	'Rp. 10.000')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/26. TextView-FINDI NUR WITRIANI'),
	'FINDI NUR WITRIANI')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/27. TextView-Rp. 10.000'),
	'Rp. 10.000')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/28. TextView-Rp. 0'),
	'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/29. TextView-Rp. 10.000'),
	'Rp. 10.000')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Upload QRIS - Albums\\09.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/30. ViewGroup-Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Upload QRIS - Albums\\10.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/31. ImageView-Click WhatsApp'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Upload QRIS - Albums\\11.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/32. ImageButton-Search'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Upload QRIS - Albums\\12.png')

Mobile.setText(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/33. EditText-Search name or number'), 'Data', 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Upload QRIS - Albums\\13.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/34. LinearLayout-Click Contact'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Upload QRIS - Albums\\14.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/35. ImageButton-Sent to chat'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Upload QRIS - Albums\\15.png')

Mobile.tap(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/36. ImageButton-Sent to chat 2'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Upload QRIS - Albums\\16.png')

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/QRIS/Upload QRIS - Albums/37. PathView-Close Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-QRIS - Upload QRIS - Albums\\17.png')

Mobile.closeApplication()