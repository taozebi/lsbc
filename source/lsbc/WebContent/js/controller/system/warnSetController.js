app.controller("warnSetController",['$scope','request','dialog',function($scope,request,dialog){
	$scope.goodsList = new Array();
	$scope.goodsChoose = {};
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
	$scope.chooseGoods = function(goods){
		if($scope.goodsChoose.id == goods.id){
			$scope.goodsChoose = {};
		}else{
			$scope.goodsChoose = goods;
		}
	};
	$scope.modify = function(){
		if($scope.goodsChoose.id == null){
			dialog.info({
				items : {title:'无效的操作',content:'请先选择需要修改的商品!',type:'warn'}
			});
			return;
		};
		dialog.open({
			templateUrl : 'page/dialog/dialog-update.html',
			controller : 'updateController',
			size : 'search',
			items : {
				title:'库存警戒线设置',
				item:[{name:'警戒线',data:'warnLine'}],
				data:$scope.goodsChoose
			},
			success : function(param){
				request.get('/goods/updateGoods.action',param,function(data){
					if(data.status == '0'){
						//修改成功,再次查询结果
						$scope.searchGoodsList();
					}else{
						dialog.info({
							items : {title:'设置商品库存警戒线失败',content:'请刷新页面后重新操作!',type:'warn'}
						});
					}
				});
			}
		});
	};
}]);