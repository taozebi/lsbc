app.controller("newStorageController",['$scope','request','dialog',function($scope,request,dialog){
	$scope.orderList = new Array(1);
	for (var i = 0; i < $scope.orderList.length; i++) {
		$scope.orderList[i] = {};
	};
	$scope.chooseGoods = function(){
		dialog.open({
			templateUrl : 'page/dialog/dialog-searchGoods.html',
			controller : 'searchGoodsController',
			size : 'search-goods',
			items : {},
			success : function(data){
				$scope.orderList.push({});
			},
			fail : function(data){
				
			}
		});
	};
}]);