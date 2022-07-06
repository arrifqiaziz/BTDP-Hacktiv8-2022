<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>POST Users</name>
   <tag></tag>
   <elementGuidId>3d8ac0e1-2049-454b-b366-938c47ff42b3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;id\&quot;: 11,\n    \&quot;name\&quot;: \&quot;This is Post Users\&quot;,\n    \&quot;username\&quot;: \&quot;postusers\&quot;,\n    \&quot;email\&quot;: \&quot;post.users@arrifqi.aziz\&quot;,\n    \&quot;address\&quot;: {\n      \&quot;street\&quot;: \&quot;Sadeng\&quot;,\n      \&quot;suite\&quot;: \&quot;Leuwisadeng\&quot;,\n      \&quot;city\&quot;: \&quot;Bogor\&quot;,\n      \&quot;zipcode\&quot;: \&quot;16640\&quot;,\n      \&quot;geo\&quot;: {\n        \&quot;lat\&quot;: \&quot;48.845\&quot;,\n        \&quot;lng\&quot;: \&quot;45.124\&quot;\n      }\n    },\n    \&quot;phone\&quot;: \&quot;082111178380\&quot;,\n    \&quot;website\&quot;: \&quot;arrifqiaziz.com\&quot;,\n    \&quot;company\&quot;: {\n      \&quot;name\&quot;: \&quot;Arrifqi Corp\&quot;,\n      \&quot;catchPhrase\&quot;: \&quot;Configurable multimedia task-force\&quot;,\n      \&quot;bs\&quot;: \&quot;generate enterprise e-tailers\&quot;\n    }\n  }&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>278d256c-7fb7-4161-8441-128a9e3d1a4f</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://jsonplaceholder.typicode.com/users</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
