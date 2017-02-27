app.controller("userListController",['$scope','request','dialog','$state','nav',function($scope,request,dialog,$state,nav){
	$scope.userList = new Array();
	$scope.search = {};
	$scope.userChoose = {};
	$scope.searchUserList = function(){
		request.get('/userInfo/getUserInfoList.action',$scope.search,function(data){
			if(data.status == '0'){
				//data是一个list集合
				$scope.userList = data.data;
			}else{
				dialog.info({
					items : {title:'获取用户信息失败',content:'请检查服务器配置!',type:'warn'}
				});
			}
		});
	};
	$scope.searchUserList();
	$scope.searchChange = function(){
		$scope.searchUserList();
	};
	$scope.resetSearch = function(){
		$scope.search = {};
		$scope.searchUserList();
	};
	$scope.chooseUser = function(user){
		if($scope.userChoose.id == user.id){
			$scope.userChoose = {};
		}else{
			$scope.userChoose = user;
		}
	};
	$scope.add = function(){
		nav.setSub(0);
		$state.go('main.system.adduser', {}, {reload: true});
	};
	$scope.modify = function(){
		if($scope.userChoose.id == null){
			dialog.info({
				items : {title:'无效的操作',content:'请先选择需要修改的用户!',type:'warn'}
			});
			return;
		};
		dialog.open({
			templateUrl : 'page/dialog/dialog-update.html',
			controller : 'updateController',
			size : 'search',
			items : {
				title:'用户信息修改',
				item:[/*{name:'用户名',data:'username'},*/{name:'真实姓名',data:'realname'},{name:'联系方式',data:'phone'},{name:'地址',data:'address'}],
				data:$scope.userChoose
			},
			success : function(param){
				//请求修改用户信息
				request.get('/userInfo/updateUserInfo.action',param,function(data){
					if(data.status == '0'){
						//修改成功,再次查询结果
						$scope.searchUserList();
					}else{
						dialog.info({
							items : {title:'修改用户信息失败',content:'请刷新页面后重新操作!',type:'warn'}
						});
					}
				});
			}
		});
	};
	$scope.del = function(){
		if($scope.userChoose.id == null){
			dialog.info({
				items : {title:'无效的操作',content:'请先选择需要删除的用户!',type:'warn'}
			});
			return;
		};
		dialog.confirm({
			items : {title:'删除用户信息',content:'确定要删除该用户吗!',type:'warn'},
			success:function(param){
				//这里请求API删除用户信息
				request.get('/userInfo/deleteUserInfo.action',$scope.userChoose,function(data){
					if(data.status == '0'){
						//删除成功,再次查询结果
						$scope.searchUserList();
					}else{
						dialog.info({
							items : {title:'删除用户信息失败',content:'请刷新页面后重新操作!',type:'warn'}
						});
					}
				});
			}
		});
	};
}]);