app.controller("userListController",['$scope','request','dialog',function($scope,request,dialog){
	$scope.userList = new Array();
	request.get('/userInfo/getUserInfoList.action',{},function(data){
		if(data.status == '0'){
			//data是一个list集合
			$scope.userList = data.data;
		}else{
			dialog.info({
				items : {title:'获取用户信息失败',content:'请检查服务器配置!',type:'warn'}
			});
		}
	});
}]);