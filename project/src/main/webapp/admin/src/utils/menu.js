const menu = {
    list() {
        return [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"专家","menuJump":"列表","tableName":"zhuanjia"}],"menu":"专家管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"科研人员","menuJump":"列表","tableName":"keyanrenyuan"}],"menu":"科研人员管理"},{"child":[{"buttons":["查看","删除","发布"],"menu":"申请专利","menuJump":"列表","tableName":"shenqingzhuanli"}],"menu":"申请专利管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"专利类型","menuJump":"列表","tableName":"zhuanlileixing"}],"menu":"专利类型管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"专利信息","menuJump":"列表","tableName":"zhuanlixinxi"}],"menu":"专利信息管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","审核"],"menu":"申请专利","menuJump":"列表","tableName":"shenqingzhuanli"}],"menu":"申请专利管理"},{"child":[{"buttons":["查看"],"menu":"专利信息","menuJump":"列表","tableName":"zhuanlixinxi"}],"menu":"专利信息管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"专家","tableName":"zhuanjia"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"申请专利","menuJump":"列表","tableName":"shenqingzhuanli"}],"menu":"申请专利管理"},{"child":[{"buttons":["查看"],"menu":"专利信息","menuJump":"列表","tableName":"zhuanlixinxi"}],"menu":"专利信息管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"科研人员","tableName":"keyanrenyuan"}]
    }
}
export default menu;
