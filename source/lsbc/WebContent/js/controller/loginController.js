app.controller("loginController",['$scope','$state','request',function($scope,$state,request){

$scope.login = {
		username:'',
		password:''
	};
	$scope.checkSubmit = function(){
		if('' === $scope.login.username || '' === $scope.login.passWord){
			return false;
		}
		return true;
	};
	$scope.submit = function(){
		request.get('/userInfo/login.action',$scope.login,function(data){
			if(data.status == '0'){
				$state.go('main.storage.content', {}, {reload: true});
			}else{
				alert('登录失败');
			}
		});
	};
}]);