/*
Test get one item from DAL layer deployed on ICP
*/
var request = require('request').defaults({strictSSL: false});
var https = require('https');

var options={
  hostname: 'dal.brown.case',
  path: '/inventory/ws/item/13407',
  method: 'GET',
  headers: {
    'accept': 'application/json'
  }
}
console.log("Call get item ");
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
