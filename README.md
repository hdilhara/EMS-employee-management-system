# EMS-employee-management-system

#Guide to test with Postman

#For test and get the auth server token use same post request with form data and basic auth
data to http://localhost:9191/oauth/token .

form data : 
  username :thilina
  password : 1234
  grant_type : password
  
Basic Auth :
  username : web <-- client
  password : webpass <-- client id

#when we access authothenticated usrls we need to send request with Authorization header
  Authorization : bearer <token>
