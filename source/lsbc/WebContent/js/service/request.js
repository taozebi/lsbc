/*http请求*/
app.factory("request",['$http',function($http){
	
	var path = 'http://localhost/lsbc';
	
	function request(jsonR){
		return $http(jsonR);
	};
	
	function getJson(action,data,method){
		action = action.indexOf('/') == 0 ? action : '/' + action;
		var jsonR = {};
		jsonR.url = path + action;
		if('POST' == method.toUpperCase()){
			jsonR.method = 'POST';
			if(null != data && !('' === data)){
				jsonR.data = data;
			}
		}else{
			data.method = 'GET';
			if(null != data && !('' === data)){
				jsonR.params = data;
			}
		}
		return jsonR;
	}
	
	function httpPost(action,data,callBack){
		request(getJson(action,data,'POST')).then(function(response){
			callBack(response.data);
		},function(response){
			callBack(null);
		});
	};
	
	function httpGet(action,data,callBack){
		request(getJson(action,data,'GET')).then(function(response){
			callBack(response.data);
		},function(response){
			callBack(null);
		});
	};
	
	return{
		post:httpPost,
		get:httpGet
	}
}]);
