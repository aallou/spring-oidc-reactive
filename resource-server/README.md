This repo is a poc for using :
- Spring reactive
- Spring security
- Spring oauth2 resource server
- OIDC (OpenID Connect)

== How to test
1. Get Access token
POST /oauth2/{authorizationServerId}/v1/token HTTP/1.1
Host: dev-902988.okta.com
Content-Type: application/x-www-form-urlencoded
grant_type=client_credentials&client_id={client_id}&client_secret={client_secret}&scope={scpecific_scope}

For {authorizationServerId}, see : [Okta help](https://support.okta.com/help/s/article/Difference-Between-Okta-as-An-Authorization-Server-vs-Custom-Authorization-Server)

2. Call API with the access token :
GET / HTTP/1.1
Host: localhost:8080
Authorization: Bearer {access_token}

To be continued