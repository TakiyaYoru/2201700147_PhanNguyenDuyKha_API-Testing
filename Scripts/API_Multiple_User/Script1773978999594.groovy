import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

for (int i = 0; i < 3; i++) {
    def response = WS.sendRequest(findTestObject('POST_CreateUser'))
    def userId = WS.getElementPropertyValue(response, 'id')
    println("User ID: " + userId)
}