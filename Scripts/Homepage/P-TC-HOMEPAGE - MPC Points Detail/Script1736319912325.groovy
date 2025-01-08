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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\01.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/01. TextView-MPC Points Detail'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/MPC Points/02. TextView-verif 602.003'), 
	'602.003')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\02.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/03. EditText-Semua Transaksi'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\03.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/04. TextView-Semua Transaksi'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\04.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/05. EditText-Semua Transaksi'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\05.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/06. TextView-Redeem'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\06.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/07. EditText-Redeem'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\07.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/08. TextView-Penarikan Point'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\08.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/09. EditText-Penarikan Point'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\09.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/10. TextView-Pengembalian Point'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\10.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/11. EditText-Pengembalian Point'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\11.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/12. TextView-Reward'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\12.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/13. EditText-Reward'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\13.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/14. TextView-Expire'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\14.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/15. EditText-Expire'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\15.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/16. TextView-Semua Transaksi'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\16.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/17. EditText-Pilih Periode'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\17.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/18. TextView-30'), 0)

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/19. TextView-31'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\18.png')

Mobile.tap(findTestObject('Object Repository/Homepage/MPC Points/20. TextView-DONE'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\19.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - MPC Points\\20.png')

Mobile.closeApplication()

