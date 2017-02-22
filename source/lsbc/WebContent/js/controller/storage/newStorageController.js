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
	$scope.clearSelect = function(){
		if($scope.select > -1){
			$scope.goodsList.splice($scope.select,1);
			$scope.select = -1;
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
	$scope.order = {
		payType : '1',
		orderType : '1'
	};
	$scope.addOrder = function(){
		if($scope.goodsList.length > 1){
			/*订单信息*/
			$scope.order.money = $scope.goodMoney_();
			$scope.order.realMoney = $scope.goodMoney();
			$scope.order.orderLists = new Array($scope.goodsList.length-1);
			for(var i = 0; i < $scope.order.orderLists .length;i++){
				$scope.order.orderLists[i] = {};
				$scope.order.orderLists[i].goodsId = $scope.goodsList[i].id;
				$scope.order.orderLists[i].number = parseInt($scope.goodsList[i].number);
				$scope.order.orderLists[i].price = parseFloat($scope.goodsList[i].outPrice);
				$scope.order.orderLists[i].money = parseFloat($scope.goodsList[i].price);
				$scope.order.orderLists[i].remark = $scope.goodsList[i].remark;
			}
			request.get('/order/addOrder.action',$scope.order,function(data){
				if(data.status == '0'){
					dialog.info({
						items : {title:'出库成功',content:'操作成功',type:'success'}
					});
				}else{
					dialog.info({
						items : {title:'添加订单失败',content:'请检查服务器配置!',type:'warn'}
					});
				}
			});
		}else{
			//未添加商品信息
			dialog.info({
				items : {title:'添加订单失败',content:'未添加任何商品!',type:'warn'}
			});
		}
	};
	
}]);