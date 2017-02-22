app.controller("stockListController",['$scope','request','dialog',function($scope,request,dialog){
	$scope.goodsList = new Array();
	$scope.search = {
			goodsName : '',
			goodsTypeId : ''
	};
	$scope.findStockList = function(){
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
	$scope.searchChange = function(){
		$scope.findStockList();
	};
	$scope.resetSearch = function(){
		$scope.search = {goodsName : '',goodsTypeId : ''};
		$scope.findStockList();
	};
	$scope.findStockList();
}]);