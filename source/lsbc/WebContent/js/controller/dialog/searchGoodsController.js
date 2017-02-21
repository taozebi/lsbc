app.controller("searchGoodsController",['$scope','request','dialog','$uibModalInstance','items',function($scope,request,dialog,$uibModalInstance,items){
	
	$scope.goodsList = new Array();
	
	$scope.goodsChoose = new Array();
	
	$scope.search = {};
	
	$scope.searchGoodsList = function(){
		request.get('/goods/getGoodsList.action',$scope.search,function(data){
			if(data.status == '0'){
				//data是一个list集合
				$scope.goodsList = data.data;
			}else{
				dialog.info({
					items : {title:'获取商品信息失败',content:'请检查服务器配置!',type:'warn'}
				});
			}
		});
	};
	
	$scope.searchGoodsList();
	
	$scope.changeName = function(){
		$scope.searchGoodsList();
	};
	
	/*检测商品是否被选中*/
	$scope.checkChoose = function(goods){
		for(var i = 0; i < $scope.goodsChoose.length; i++){
			if($scope.goodsChoose[i].id === goods.id){
				return true;
			}
		};
		return false;
	};
	
	$scope.chooseGoods = function(goods){
		if($scope.checkChoose(goods)){
			var index = -1;
			for(var i = 0; i < $scope.goodsChoose.length; i++){
				if($scope.goodsChoose[i].id === goods.id){
					index = i;
					break;
				}
			};
			if(index > -1){
				$scope.goodsChoose.splice(index,1);
			}
		}else{
			$scope.goodsChoose.push(goods);
		}
	};
	
	$scope.ok = function () {
		$uibModalInstance.close($scope.goodsChoose);
	};

	$scope.cancel = function () {
		$uibModalInstance.dismiss('cancel');
	};
}]);