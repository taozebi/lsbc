app.controller("newStorageController",['$scope','request','dialog',function($scope,request,dialog){
	$scope.goodsList = new Array(1);
	$scope.select = -1;
	for (var i = 0; i < $scope.goodsList.length; i++) {
		$scope.goodsList[i] = {};
	};
	$scope.chooseGoods = function(){
		dialog.open({
			templateUrl : 'page/dialog/dialog-searchGoods.html',
			controller : 'searchGoodsController',
			size : 'search-goods',
			items : {},
			success : function(data){
				for(var i = 0; i < data.length; i++){
					var temp = false;
					for(var j = 0; j < $scope.goodsList.length; j++){
						if(data[i].id === $scope.goodsList[j].id){
							temp = false;
							break;
						}
						temp = true;
					};
					if(temp){
						data[i].price = data[i].outPrice;
						$scope.goodsList.splice(0,0,data[i]);
					}
				};
				$scope.select = -1;
			},
			fail : function(data){
				
			}
		});
	};
	$scope.goodsSelect = function(index){
		if(($scope.goodsList.length-1) === index){
			$scope.select = -1;
		}else{
			$scope.select = index;
		}
	};
	$scope.goodsRowMoney = function(goods){
		if(goods.id != null && goods.id != ''){
			return goods.price * goods.number;
		}
		return '';
	};
	$scope.goodsRowMoney_ = function(goods){
		return goods.outPrice * goods.number || 0;
	};
	$scope.goodMoney = function(){
		var sum = 0;
		for(var i = 0; i < ($scope.goodsList.length-1);i++){
			sum = sum + $scope.goodsRowMoney($scope.goodsList[i]);
		}
		return sum;
	};
	$scope.goodMoney_ = function(){
		var sum = 0;
		for(var i = 0; i < ($scope.goodsList.length-1);i++){
			sum = sum + $scope.goodsRowMoney_($scope.goodsList[i]);
		}
		return sum;
	};
	
}]);