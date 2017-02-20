app.controller("goodsListController",['$scope','request','dialog',function($scope,request,dialog){
	$scope.goodsList = new Array();
	request.get('/goods/getGoodsList.action',{},function(data){
		if(data.status == '0'){
			//data是一个list集合
			$scope.goodsList = data.data;
		}else{
			dialog.info({
				items : {title:'获取商品信息失败',content:'请检查服务器配置!',type:'warn'}
			});
		}
	});
}]);