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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Transfer\\01.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Transfer/01. ViewGroup-Inbox'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Transfer\\02.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Transfer/02. ViewGroup-Transfer'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Transfer/03. TextView-verif Transfer BIFAST'),
	'Transfer BIFAST')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Transfer/04. TextView-verif 081801060326530'),
	'081801060326530')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Transfer/05. TextView-verif Rp. 10.000'),
	'Rp. 10.000')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Transfer\\03.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Transfer/06. ViewGroup-Tap List 1'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Transfer/07. TextView-verif Transfer Berhasil'), 
    'Transfer Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Transfer/08. TextView-verif Rp. 10.000'),
	'Rp. 10.000')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Transfer/09. TextView-verif  081801060326530'), 
    ' 081801060326530')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Transfer/10. TextView-verif JOHN SMITH'),
	'JOHN SMITH')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Transfer/11. TextView-verif nominal Rp. 10.000'), 
    'Rp. 10.000')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Transfer/12. TextView-verif adm Rp. 0'),
	'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Transfer/13. TextView-verif total Rp.  10.000'), 
    'Rp.  10.000')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Transfer\\04.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Transfer/14. ViewGroup-Tap Split Bill'), 0)

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Transfer/15. ViewGroup-Tap Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Transfer\\05.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Transfer/16. ImageView-WhatsApp'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Transfer\\06.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Transfer/17. Button-Search Contact'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Transfer\\07.png')

Mobile.setText(findTestObject('Object Repository/Inbox/Transaksi/Transfer/18. EditText-Search name or number'),
	'Data', 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Transfer\\08.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Transfer/19. LinearLayout-Click Contact'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Transfer\\09.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Transfer/20. ImageButton-Share to contact'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Transfer\\10.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Transfer/21. ImageButton-Share to contact 2'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Transfer\\11.png')

Mobile.pressBack()
Mobile.pressBack()
Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Transfer/22. GroupView-Close Button'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

