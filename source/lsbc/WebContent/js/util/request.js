/*http请求*/
app.factory("request",['$http','dialog','constant',function($http,dialog,constant){
	
	function request(jsonR){
		return $http(jsonR);
	};
	
	function getJson(action,data,method){
		action = action.indexOf('/') == 0 ? action : '/' + action;
		var jsonR = {};
		jsonR.url = constant.server + action;
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
			dialog.info({
				items : {title:'系统异常',content:'数据请求失败,请检查服务器是否正常运行!',type:'error'}
			});
		});
	};
	
	return{
		post:httpPost,
		get:httpGet
	}
}]);
