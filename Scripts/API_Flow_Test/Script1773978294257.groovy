import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

def response = WS.sendRequest(findTestObject('POST_CreateUser'))

def userId = WS.getElementPropertyValue(response, 'id')

println("User ID: " + userId)

WS.sendRequest(findTestObject('GET_User', ['id': userId]))