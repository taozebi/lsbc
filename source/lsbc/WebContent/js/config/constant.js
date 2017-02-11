app.constant('constant',{
	server : 'http://localhost/lsbc'
});
app.constant('power',{
	boss : [
		{state:'main.stock.stocklist',icon:'glyphicon glyphicon-home',name:'库存统计',
		items:[
			{state:'main.stock.stocklist',icon:'glyphicon glyphicon-list-alt',name:'库存列表'}
		]},
		{state:'main.storage.addstorage',icon:'glyphicon glyphicon-cloud-download',name:'出库管理',
		items:[
			{state:'main.storage.addstorage',icon:'glyphicon glyphicon-file',name:'创建订单'},
			{state:'main.storage.storagelist',icon:'glyphicon glyphicon-list-alt',name:'订单列表'}
		]},
		{state:'main.delivery.adddelivery',icon:'glyphicon glyphicon-cloud-upload',name:'入库管理',
		items:[
			{state:'main.delivery.adddelivery',icon:'glyphicon glyphicon-file',name:'创建订单'},
			{state:'main.delivery.deliverylist',icon:'glyphicon glyphicon-list-alt',name:'订单列表'}
		]},
		{state:'main.finance.addfinance',icon:'glyphicon glyphicon-book',name:'财务管理',
		items:[
			{state:'main.finance.addfinance',icon:'glyphicon glyphicon-plus',name:'添加支出信息'},
			{state:'main.finance.financelist',icon:'glyphicon glyphicon-list-alt',name:'支出信息列表'}
		]},
		{state:'main.system.adduser',icon:'glyphicon glyphicon-cog',name:'系统设置',
		items:[
			{state:'main.system.adduser',icon:'glyphicon glyphicon-plus',name:'用户信息录入'},
			{state:'main.system.userlist',icon:'glyphicon glyphicon-list-alt',name:'用户信息列表'},
			{state:'main.system.addgoods',icon:'glyphicon glyphicon-plus',name:'商品信息录入'},
			{state:'main.system.goodslist',icon:'glyphicon glyphicon-list-alt',name:'商品信息列表'},
			{state:'main.system.warnset',icon:'glyphicon glyphicon-warning-sign',name:'库存警戒线设置'}
		]}
	],
	staff :[{state:'main.storage.addstorage',icon:'glyphicon glyphicon-cloud-download',name:'出库管理',
		items:[
			{state:'main.storage.addstorage',icon:'glyphicon glyphicon-file',name:'创建订单'},
			{state:'main.storage.storagelist',icon:'glyphicon glyphicon-list-alt',name:'订单列表'}
		]}
	]
});
