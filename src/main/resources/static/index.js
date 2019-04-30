var vm = new Vue({
    el: '#app',
    data() {
        return {
            dataList: null,
            detailDialogShow: false,
            visible: false,
            value1: true,
            value2: true,
            dialogVisible: false,
            initObj: {
                name: "",
                userId: "",
                status: 0
            }
        }
    },
    mounted: function () {
        self = this;
        axios
            .get('./kbp/test/users/pageList')
            .then(function (response) {
                console.log(response.data.records);
                self.dataList = response.data.records;
            })
    },
    methods: {
        del: function (id) {
            if (!confirm("是否删除数据？")) {
                return;
            }
            //调用list.findIndex()方法，根据传入的id获取到这个要删除数据的索引值
            var index = this.dataList.findIndex(function (item) {
                return item.id == id;
            });
            //调用list.splice(删除的索引，删除的元素个数)
            this.dataList.splice(index, 1);
        },
        save: function () {
            axios.post('./kbp/test/users/addOrUpdate', this.dataList).then(function () {

            }).catch(function () {

            })
        },
        add: function () {
            var item = {
                name: this.initObj.name,
                userId: this.initObj.userId,
                status: this.initObj.status
            }
            this.dataList.push(item);
            //清空页面上的文本框中的数据
            this.initObj.userId = "";
            this.initObj.name = "";
            this.initObj.status = 0;
            this.dialogVisible = false;
        },
        showDetail: function () {
            this.detailDialogShow = true;
        },
        handleClose: function (done) {

        }
    }
})