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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Topup\\01.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Top Up/01. ViewGroup-Tap Icon Inbox'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Topup\\02.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Top Up/02. ViewGroup-Top Up'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Topup\\03.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Top Up/03. ViewGroup-Tap Baris 1'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Topup\\04.png')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Top Up/04. TextView-Top Up Berhasil'), 
	'Top Up Berhasil!')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Top Up/05. TextView-Rp.  41.000'), 
	'Rp.  41.000')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Top Up/06. TextView-0895703376666'), 
	'0895703376666')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Top Up/07. TextView-Rp. 41.000'), 
	'Rp. 41.000')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Top Up/08. TextView-Rp. 0'), 
	'Rp. 0')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Top Up/09. TextView-Rp.  41.000'), 
	'Rp.  41.000')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Topup\\05.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Top Up/10. ViewGroup-Bagikan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Topup\\06.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Top Up/11. ImageView-WhatsApp'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Topup\\07.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Top Up/12. Button-Search Contact'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Topup\\08.png')

Mobile.setText(findTestObject('Object Repository/Inbox/Transaksi/Top Up/13. EditText-Search name or number'),
	'Data', 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Topup\\09.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Top Up/14. LinearLayout-Click Contact'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Topup\\10.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Top Up/15. ImageButton-Share to contact'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Topup\\11.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Top Up/16. ImageButton-Share to contact 2'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Topup\\12.png')

Mobile.pressBack()
Mobile.pressBack()
Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Top Up/17. GroupView-Close Button'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Topup\\13.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Top Up/18. ViewGroup-Top Up'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Top Up/19. TextView-TRI'), 
	'TRI')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Top Up/20. TextView-0895703376666'), 
	'0895703376666')

Mobile.verifyElementText(findTestObject('Object Repository/Inbox/Transaksi/Top Up/21. TextView-Rp. 41.000'), 
	'Rp. 41.000')

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Topup\\14.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Top Up/22. ViewGroup-Icon Delete'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Topup\\15.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Top Up/23. ImageView-Ceklis Item'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Topup\\16.png')

Mobile.tap(findTestObject('Object Repository/Inbox/Transaksi/Top Up/24. ViewGroup-Hapus'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-INBOX - Transaksi - Topup\\17.png')

Mobile.pressBack()
Mobile.pressBack()

Mobile.closeApplication()

