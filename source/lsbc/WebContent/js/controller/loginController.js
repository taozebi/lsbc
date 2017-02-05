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
			alert(data);
		});
		//$state.go('main.storage.content', {}, {reload: true});
	};
}]);