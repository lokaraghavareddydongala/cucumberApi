Feature: Google Search 

Scenario: correct key and quey parametres 
	Given Query Parameter and key 
		|AIzaSyDYO-iGLG1cpA3bNQMpOQsagf1tVJHx4ok|Tirupathi|
	When  hitting the google rsource server 
	|maps/api/place/textsearch/json|
	Then  status code should be 200 
	And   status line should be HTTP/1.1 200 OK 
	
Scenario: Incorrect key and quey parametres 
	Given Query Parameter and key 
		|AIzaSyDYO-iGLG1cpA3bNQMpOQsagf1tVJHx4o|Tirupathi|
	When  hitting the google rsource server 
	|maps/api/place/textsearch/json|
	Then  status code should be 200 
	And   status line should be HTTP/1.1 200 OK 
Scenario: wrong resource server
	Given Query Parameter and key 
		|AIzaSyDYO-iGLG1cpA3bNQMpOQsagf1tVJHx4o|Tirupathi|
	When  hitting the google rsource server 
	|maps/api/place/textsearch/jso|
	Then  status code should be 404 
	And   status line should be HTTP/1.1 404 Not Found
	
