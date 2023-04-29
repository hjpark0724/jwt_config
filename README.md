### Reference Documentation
JWT RSA 암호화 키 생성

resouces 에 공유키/개인키를 보관을 위한 certs 폴더 생성
cd resources/certs

개인키 생성  
$ openssl genrsa -out keypair.pem 2048

공유키 생성  
$ openssl rsa -in keypair.pem -pubout -out public.pem

생성된 개인키를 PEM 형식으로 변경  
$ openssl pkcs8 -topk8 -inform pem -in keypair.pem -outform pem -nocrypt -out private.pem
