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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Upload QRIS - Photos\\01.png')

Mobile.tap(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/01. ViewGroup - Button QRIS'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Upload QRIS - Photos\\02.png')

Mobile.tapAtPosition(980, 2050)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Upload QRIS - Photos\\03.png')

Mobile.tapAtPosition(196, 840)

Mobile.tap(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/03. SvgView - Cek Saldo'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/04. TextView - FINDI NUR WITRIANI'),
	'FINDI NUR WITRIANI')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/05. TextView - 9360042613806500772'),
	'9360042613806500772')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/06. TextView - Bank Mega'),
	'Bank Mega')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/07. EditText - Rp. 10.000'),
	'Rp. 10.000')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Upload QRIS - Photos\\04.png')

Mobile.tap(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/08. ViewGroup - Button Lanjut'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/09. TextView - MEGA DANA ESTATEMENT'),
	'MEGA DANA ESTATEMENT')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/10. TextView - HADI RAHMAH ESA PUTRA'),
	'HADI RAHMAH ESA PUTRA')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/11. TextView - 010740021017780'),
	'010740021017780')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/12. TextView - Bank Mega'),
	'Bank Mega')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/13. TextView - FINDI UAT'),
	'FINDI UAT')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/14. TextView - 10740020459183'),
	'10740020459183')

Mobile.tap(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/15. ViewGroup - Pakai Kupon'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/16. Switch - Pakai MPC Points'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/17. TextView-Nominal Rp. 10.000'), 
	'Rp. 10.000')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/18. TextView-Total Rp. 10.000'), 
	'Rp. 10.000')

Mobile.tap(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/19. ViewGroup-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/20. EditText-Set M-PIN'), 
	'111111', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Upload QRIS - Photos\\05.png')

Mobile.tap(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/21. ViewGroup-Bayar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/22. TextView-Transfer Pakai QRIS Berhasil'), 
	'Transfer Pakai QRIS Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/23. TextView-Rp. 10.000'), 
	'Rp. 10.000')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/24. TextView-FINDI NUR WITRIANI'), 
	'FINDI NUR WITRIANI')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/25. TextView-Rp. 10.000'), 
	'Rp. 10.000')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/26. TextView-Rp. 0'), 
	'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/27. TextView-Rp. 10.000'), 
	'Rp. 10.000')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Upload QRIS - Photos\\06.png')

Mobile.tap(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/28. ViewGroup-Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Upload QRIS - Photos\\07.png')

Mobile.tap(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/29. ImageView-Click WhatsApp'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Upload QRIS - Photos\\08.png')

Mobile.tap(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/30. ImageButton-Search'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Upload QRIS - Photos\\09.png')

Mobile.setText(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/31. EditText-Search name or number'), 'Data', 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Upload QRIS - Photos\\10.png')

Mobile.tap(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/32. LinearLayout-Click Contact'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Upload QRIS - Photos\\11.png')

Mobile.tap(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/33. ImageButton-Sent to chat'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Upload QRIS - Photos\\12.png')

Mobile.tap(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/34. ImageButton-Sent to chat 2'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Upload QRIS - Photos\\13.png')

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Transfer/QRIS/Upload QRIS - Photos - Photos/35. PathView-Close Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-QRIS - Upload QRIS - Photos\\14.png')

Mobile.closeApplication()