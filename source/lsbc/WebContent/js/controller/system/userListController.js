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
	$scope.modify = function(){
		alert('modify userInfo');
		/*$scope.modifyUser = {};
		request.modify('/userInfo/updateUserInfo.action',$scope.modifyUser,function(data){
			if(data.status == '0'){
				添加成果
				dialog.info({
					items : {title:'提示信息',content:'修改用户信息成功!',type:'success',success:function(data){
						alert('success');
					}}
				});
			}else{
				dialog.info({
					items : {title:'获取用户信息失败',content:'请检查服务器配置!',type:'warn'}
				});
			}
		});*/
	};
	$scope.del = function(){
		alert('delete user');
		/*dialog.info({
			items : {title:'提示信息',content:'确定删除该用户?',type:'success',success:function(data){
				alert('success');
				$scope.delUser = {};
				request.modify('/userInfo/delUserInfo.action',$scope.delUser,function(data){
					if(data.status == '0'){
						添加成果
						dialog.info({
							items : {title:'提示信息',content:'删除用户成功!',type:'success',success:function(data){
								alert('success');
							}}
						});
					}else{
						dialog.info({
							items : {title:'删除用户失败',content:'请检查服务器配置!',type:'warn'}
						});
					}
				});
			}}
		});*/
	}; 
}]);