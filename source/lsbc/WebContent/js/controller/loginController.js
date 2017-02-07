app.controller("loginController",['$scope','$state','request','dialog',function($scope,$state,request,dialog){

$scope.login = {
		username:'',
		password:''
	};
	$scope.checkSubmit = function(){
		if('' === $scope.login.username || '' === $scope.login.password){
			return false;
		}
		return true;
	};
	$scope.submit = function(){
		//$state.go('main.storage.addstorage', {}, {reload: true});
		request.get('/userInfo/login.action',$scope.login,function(data){
			if(data.status == '0'){
				$state.go('main.storage.addstorage', {}, {reload: true});
				return;
			}else{
				dialog.info({
					items : {title:'登录失败',content:'用户名密码错误!',type:'warn'}
				});
			}
		});
	};
}]);