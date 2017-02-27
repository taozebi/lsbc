app.controller("goodsListController",['$scope','request','dialog','$state','nav',function($scope,request,dialog,$state,nav){
	$scope.goodsList = new Array();
	$scope.search = {};
	$scope.goodsChoose = {};
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
	$scope.searchChange = function(){
		$scope.searchGoodsList();
	};
	$scope.resetSearch = function(){
		$scope.search = {};
		$scope.searchGoodsList();
	};
	$scope.chooseGoods = function(goods){
		if($scope.goodsChoose.id == goods.id){
			$scope.goodsChoose = {};
		}else{
			$scope.goodsChoose = goods;
		}
	};
	$scope.add = function(){
		nav.setSub(2);
		$state.go('main.system.addgoods', {}, {reload: true});
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
				title:'商品信息修改',
				item:[{name:'商品名称',data:'goodsName'},{name:'厂家',data:'factory'},{name:'产地',data:'address'},{name:'单位',data:'unit'}],
				data:$scope.goodsChoose
			},
			success : function(param){
				request.get('/goods/updateGoods.action',param,function(data){
					if(data.status == '0'){
						//修改成功,再次查询结果
						$scope.searchGoodsList();
					}else{
						dialog.info({
							items : {title:'修改商品信息失败',content:'请刷新页面后重新操作!',type:'warn'}
						});
					}
				});
			}
		});
	};
	
	$scope.del = function(){
		if($scope.goodsChoose.id == null){
			dialog.info({
				items : {title:'无效的操作',content:'请先选择需要删除的商品!',type:'warn'}
			});
			return;
		};
		dialog.confirm({
			items : {title:'删除商品信息',content:'确定要删除该商品信息吗!',type:'warn'},
			success:function(param){
				//这里请求API删除用户信息
				request.get('/goods/delGoods.action',$scope.goodsChoose,function(data){
					if(data.status == '0'){
						//删除成功,再次查询结果
						$scope.searchGoodsList();
					}else{
						dialog.info({
							items : {title:'删除商品信息失败',content:'请刷新页面后重新操作!',type:'warn'}
						});
					}
				});
			}
		});
	};
}]);