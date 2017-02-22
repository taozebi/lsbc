app.controller("loginController",['$scope','$state','request','dialog','power','user',function($scope,$state,request,dialog,power,user){

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
		$state.go(power.boss[0].state, {}, {reload: true});
		request.get('/userInfo/login.action',$scope.login,function(data){
			if(data.status == '0'){
				$state.go(power.boss[0].state, {}, {reload: true});
				user.set(data.data);
				alert(user.get().username);
				return;
			}else{
				dialog.info({
					items : {title:'登录失败',content:'用户名密码错误!',type:'warn'}
				});
			}
		});
	};
}]);