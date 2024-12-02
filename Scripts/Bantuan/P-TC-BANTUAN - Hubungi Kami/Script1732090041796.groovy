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

Mobile.tap(findTestObject('Object Repository/Bantuan/Hubungi Kami/01. GroupView-Bantuan'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Hubungi Kami\\01.png')

Mobile.scrollToText('instagram')

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Hubungi Kami\\02.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Hubungi Kami/02. ViewGroup-Mila'), 0)

Mobile.delay(3)

Mobile.scrollToText('Saat ini Bank Mega')

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Hubungi Kami\\03.png')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Hubungi Kami/03. TextView-verif Chat Mila'), 'Saat ini Bank Mega memiliki aplikasi Mobile Banking yang bernama M-Smile dengan segala fitur menarik di dalamnya. Segera unduh Aplikasi M-Smile di ')

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Hubungi Kami\\04.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Hubungi Kami/04. EditText-Tap Text Field'), 0)

Mobile.setText(findTestObject('Object Repository/Bantuan/Hubungi Kami/05. EditText-Set Pesan'), 'Hallo', 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Hubungi Kami/06. Button-Send Pesan'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Hubungi Kami/07. TextView-verif Chat Mila 1'), 'Halo juga, Selamat pagi')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Hubungi Kami/08. TextView-verif Chat Mila 2'), 'Aku MILA yang akan membantu kamu untuk mengetahui ')

Mobile.verifyElementText(findTestObject('Object Repository/Bantuan/Hubungi Kami/09. TextView-verif Chat Mila 3'), 'Mohon maaf, saat ini MILA sedang chat dengan siapa ya?')

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Hubungi Kami\\05.png')

Mobile.pressBack()

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Hubungi Kami\\06.png')

Mobile.delay(1)

Mobile.pressBack()

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Hubungi Kami\\07.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Hubungi Kami/10. ViewGroup-Form Pengaduan'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Hubungi Kami\\08.png')

Mobile.pressBack()

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Hubungi Kami\\09.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Hubungi Kami/11. ViewGroup-Mega Call'), 0)

Mobile.delay(3)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Hubungi Kami\\10.png')

Mobile.pressBack()

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Hubungi Kami\\11.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Hubungi Kami/12. ViewGroup-Twitter'), 0)

Mobile.delay(5)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Hubungi Kami\\12.png')

Mobile.pressBack()

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Hubungi Kami\\13.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Hubungi Kami/13. ViewGroup-Facebook'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Hubungi Kami\\14.png')

Mobile.pressBack()

Mobile.pressBack()

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Hubungi Kami\\15.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Hubungi Kami/14. ViewGroup-Instagram'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Hubungi Kami\\16.png')

Mobile.tap(findTestObject('Topik Populer/09.PathView - Home Button'), 0)

Mobile.delay(1)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Hubungi Kami\\17.png')

Mobile.closeApplication()//