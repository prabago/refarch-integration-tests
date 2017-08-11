/**
Use the login and then get items api exposed at the secure gateway proxy
*/
var querystring = require('querystring');
var https = require('https');

//https.debug = 2;
var request = require('request').defaults({strictSSL: false});
var fs = require('fs');
//var https = require('https');
var path = require('path');
//var clientCert = fs.readFileSync(path.resolve(__dirname, '../ssl/qsn47KM8iTa_O495D_destCert.pem'));
//var clientKey = fs.readFileSync(path.resolve(__dirname, '../ssl/qsn47KM8iTa_O495D_destKey.pem'));

var clientKey= fs.readFileSync(path.resolve(__dirname, '../ssl/client1-key.pem'));
var clientCert= fs.readFileSync(path.resolve(__dirname, '../ssl/client1-crt.pem'));
var caCerts =fs.readFileSync(path.resolve(__dirname, '../ssl/ca.all.crt.pem'));
// to avoid the Error: self signed certificate
process.env.NODE_TLS_REJECT_UNAUTHORIZED = "0";
/**
Login request to secure gateway
*/
var loginFct = function(user,next){
  var builtUrl='https://cap-sg-prd-5.integration.ibmcloud.com:16582/csplab/sb/sample-inventory-api/login?'+querystring.stringify(user);
  var options={
    hostname: 'cap-sg-prd-5.integration.ibmcloud.com',
    port: 16582,
    path: '/csplab/sb/sample-inventory-api/login?'+querystring.stringify(user),
    method: 'GET',
    rejectUnauthorized: true,
    headers: {
      'X-IBM-Client-Id': "5d2a6edb-793d-4193-b9b0-0a087ea6c123",
      'accept': 'application/json',
      'content-type' : 'application/x-www-form-urlencoded'
    }
  }
  console.log("Call login url:"+builtUrl);
  var req = https.request(options, function(res) {
      res.on('data', function(data) {
          var token=JSON.parse(data).access_token;
          next(token);
      });
  });
  req.end();
  req.on('error', function(e) {
      console.error(e);
  });
}


var getItems = function(token){
  var options={
    url: 'https://cap-sg-prd-5.integration.ibmcloud.com:16582/csplab/sb/sample-inventory-api/items',
    hostname: 'cap-sg-prd-5.integration.ibmcloud.com',
    port: 16582,
    path: '/csplab/sb/sample-inventory-api/items',
    method: 'GET',
    rejectUnauthorized: true,
    headers: {
      'X-IBM-Client-Id': "5d2a6edb-793d-4193-b9b0-0a087ea6c123",
      'accept': 'application/json',
      'Authorization': 'Bearer '+token
    }
  }
  var req=request.get(
      options,
      function (error, response, body) {
        console.log("In get items processing:"+JSON.stringify(response));
        console.log("In get items error:"+JSON.stringify(error));
      }
     );
  console.log(req);
   req.end();
   req.on('error', function(e) {
       console.error(e);
   });
}

/**
Main processing
*/
loginFct({ username: 'boyerje',password:'case01'},
    function(token){
      console.log(token);
      console.log("now use the token to call items");
      getItems(token);
    });
