app.controller("mainController",['$scope','$state','nav',function($scope,$state,nav){
	/*导航条初始化事件*/
	$scope.headerList = [{state:'main.storage.content'},
						{state:'main.delivery.content'},
						{state:'main.finance.content'},
						{state:'main.system.adduser'}];
	$scope.headerReset = function(){
		for (var i = 0; i < $scope.headerList.length; i++) {
			$scope.headerList[i].active = false;
		}
	};
	$scope.headerReset();
	$scope.headerList[nav.get()].active = true;
	$scope.headerClick = function(index){
		$scope.headerReset();
		$scope.headerList[index].active = true;
		nav.set(index);
		/*这里操作导航条的路由跳转*/
		$state.go($scope.headerList[index].state, {}, {reload: true});
	};
	$scope.systemExit = function(){
		$state.go('login', {}, {reload: true});
	}
	
	$scope.subMap = {
		'0':[{state:'main.storage.content'},{state:'main.storage.content'}],
		'1':[{state:'main.delivery.content'},{state:'main.delivery.content'}],
		'2':[{state:'main.finance.content'},{state:'main.finance.content'}],
		'3':[{state:'main.system.adduser'},{state:'main.system.userlist'},{state:'main.system.addgoods'},
			{state:'main.system.goodslist'},{state:'main.system.warnset'}]
	};
	
	$scope.subList = $scope.subMap[nav.get()];
	
	$scope.subReset = function(){
		for (var i = 0; i < $scope.subList.length; i++) {
			$scope.subList[i].active = false;
		}
	};
	
	$scope.subReset();
	$scope.subList[nav.getSub()].active = true;
	$scope.subClick = function(index){
		$scope.subReset();
		$scope.subList[index].active = true;
		nav.setSub(index);
		/*这里操作导航条的路由跳转*/
		$state.go($scope.subList[index].state, {}, {reload: true});
	};
	
}]);