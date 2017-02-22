app.controller("addFinanceController",['$scope','request','dialog',function($scope,request,dialog){
	$scope.goodsList = new Array();
	/*request.get('/finance/addFinance.action',{},function(data){
		if(data.status == '0'){
			//data是一个list集合
			$scope.goodsList = data.data;
		}else{
			dialog.info({
				items : {title:'添加支出信息失败',content:'请检查服务器配置!',type:'warn'}
			});
		}
	});*/
}]);