const base = {
    get() {
        return {
            url : "http://localhost:8080/ptoject/",
            name: "project",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/project/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "专利查询与发布系统设计与实现"
        } 
    }
}
export default base
