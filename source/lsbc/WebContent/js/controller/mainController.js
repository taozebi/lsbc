app.controller("mainController",['$scope','$state','nav','$window','power','dialog',function($scope,$state,nav,$window,power,dialog){
	/*导航条初始化事件*/
	$scope.headerList = power.boss;
	$scope.headerReset = function(){
		for (var i = 0; i < $scope.headerList.length; i++) {
			$scope.headerList[i].active = false;
		}
	};
	$scope.headerClick = function(index){
		$scope.headerReset();
		$scope.headerList[index].active = true;
		nav.set(index);
		/*这里操作导航条的路由跳转*/
		$state.go($scope.headerList[index].state, {}, {reload: true});
	};
	$scope.headerReset();
	$scope.checkHeader = $scope.headerList[nav.get()];
	$scope.checkHeader.active = true;
	
	$scope.subList = $scope.checkHeader.items;
	$scope.subReset = function(){
		for (var i = 0; i < $scope.subList.length; i++) {
			$scope.subList[i].active = false;
		}
	};
	$scope.subClick = function(index){
		$scope.subReset();
		$scope.subList[index].active = true;
		nav.setSub(index);
		/*这里操作导航条的路由跳转*/
		$state.go($scope.subList[index].state, {}, {reload: true});
	};
	$scope.subReset();
	$scope.checkSub = $scope.subList[nav.getSub()];
	$scope.checkSub.active = true;
	
	$scope.systemExit = function(){
		$window.sessionStorage.clear();
		$state.go('login', {}, {reload: true});
	};
	
	$scope.open = function(){
		dialog.confirm({
			items : {title:'数据筛选',content:'在这里输入查询条件',type:'success'}
		});
	};
}]);