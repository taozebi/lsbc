app.controller("mainController",['$scope','$state','nav','$window',function($scope,$state,nav,$window){
	/*导航条初始化事件*/
	$scope.headerList = [{state:'main.storage.addstorage'},
						{state:'main.delivery.adddelivery'},
						{state:'main.finance.addfinance'},
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
		$window.sessionStorage.clear();
		$state.go('login', {}, {reload: true});
	}
	
	$scope.subMap = {
		'0':[{state:'main.storage.addstorage'},{state:'main.storage.storagelist'}],
		'1':[{state:'main.delivery.adddelivery'},{state:'main.delivery.deliverylist'}],
		'2':[{state:'main.finance.addfinance'},{state:'main.finance.financelist'}],
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