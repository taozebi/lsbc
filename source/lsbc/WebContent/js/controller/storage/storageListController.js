app.controller("storageListController",['$scope','request','dialog',function($scope,request,dialog){
	$scope.orders = new Array();
	request.get('/order/getAllOrder.action',{},function(data){
		if(data.status == '0'){
			//data是一个list集合
			$scope.orders = data.data;
		}else{
			dialog.info({
				items : {title:'获取订单信息失败',content:'请检查服务器配置!',type:'warn'}
			});
		}
	});
}]);