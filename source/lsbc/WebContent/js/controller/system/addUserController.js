app.controller("addUserController",['$scope','request','dialog',function($scope,request,dialog){
	/*这里存储添加用户的信息*/
	$scope.regist = {
			sex : '1',
			roleId : '1'
	};
	/*注册按钮点击事件*/
	$scope.registSubmit = function(){
		request.get('/userInfo/addUserInfo.action'/*URL*/,$scope.regist/*参数*/,function(data){
			if(data.status == '0'){
				/*添加成果*/
				dialog.info({
					items : {title:'提示信息',content:'添加用户成功!',type:'success',success:function(data){
						alert('success');
					}}
				});
			}else{
				dialog.info({
					items : {title:'获取商品信息失败',content:'请检查服务器配置!',type:'warn'}
				});
			}
		}/*回调*/);
	};
}]);