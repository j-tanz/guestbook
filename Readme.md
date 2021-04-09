# Guestbook

Running app locally:
1) clone
2) `docker build -t guestbook-app .`
3) `docker run -d -p <PORT>:8080 --rm -e SPRING_PROFILES_ACTIVE=local --name gb-app guestbook-app`
4) ???
5) profit


## [LINK TO DEPLOYED APP](https://guestbook-rj.herokuapp.com/posts)

### request
GET `/posts` 

### response
HTTP/1.1 200 OK
Content-Type: application/json

```
[ 
  {
    "name":"Rajendra",
    "comment":"Test comment"
  } 
]
 ```
 
### request
POST `/posts `

RequestBody:
```
[ 
  {
    "name":"Rajendra",
    "comment":"Test comment"
  } 
]
```
### response
>HTTP/1.1 201 Created




![APISPEC ](./src/docs/api_spec.png)
