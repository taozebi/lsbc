/*params转换*/
app.filter("params",function(){
	return function(input,type){
		if(type == 'role'){
			return getRoleName(input);
		}else if(type == 'order'){
			return getOrderType(input);
		}else if(type == 'pay'){
			return getPayType(input);
		}else if(type == 'order'){
			return getOrderType(input);
		}else if(type == 'goods'){
			return getGoodsType(input);
		}else{
			return '其他';
		}
	};
});
function getRoleName(roleId){
	if(roleId == 1){
		return '管理员';
	}else if(roleId == 2){
		return '营业员';
	}else{
		return '其他';
	}
};

function getOrderType(typeId){
	if(typeId == 1){
		return '进货单';
	}else if(typeId == 2){
		return '退货单';
	}else if(typeId == 3){
		return '销售单';
	}else if(typeId == 4){
		return '零售单';
	}else{
		return '其他';
	}
};
function getPayType(typeId){
	if(typeId == 1){
		return '现金';
	}else if(typeId == 2){
		return '刷卡';
	}else if(typeId == 3){
		return '现金+刷卡';
	}else{
		return '其他';
	}
};
function getGoodsType(typeId){
	if(typeId == 1){
		return '板材';
	}else if(typeId == 2){
		return '五金';
	}else if(typeId == 3){
		return '门';
	}else if(typeId == 4){
		return '地板';
	}else if(typeId == 5){
		return '方条';
	}else if(typeId == 6){
		return '吊顶';
	}else{
		return '其他';
	}
};