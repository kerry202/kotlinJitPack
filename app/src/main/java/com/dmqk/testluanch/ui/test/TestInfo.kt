package com.dmqk.testluanch.ui.test

class TestInfo {
    /**
     * code : 1
     * message : 操作成功
     * data : {"bannerList":[{"id":1,"imagePath":"http://fileevery.reworldgame.com/banner/banner.png","url":"http://reworldgame.com/","minVersion":"1.0.0","maxVersion":"9.9.9"},{"id":3,"imagePath":"http://fileevery.reworldgame.com/banner/banner.png","url":"http://reworldgame.com/","minVersion":"1.0.0","maxVersion":"2.0.0"}],"hotMapList":[{"mapId":3054,"mapName":"100空底板","imgUrl":"http://fileevery.reworldgame.com/T1PaLTBvhT1RCvBVdK","mapCreateUserId":20,"mapCreaterUserCode":null,"mapCreateUserNick":"测试","mapCreaterHeadUrl":null,"recommendValue":9.8,"playNum":1000},{"mapId":3063,"mapName":"ccceeesss","imgUrl":"http://fileevery.reworldgame.com/T1DtdTBgVT1RCvBVdK","mapCreateUserId":null,"mapCreaterUserCode":null,"mapCreateUserNick":null,"mapCreaterHeadUrl":null,"recommendValue":0,"playNum":654},{"mapId":3058,"mapName":"tiao","imgUrl":"http://fileevery.reworldgame.com/T1PtLTBKdT1RCvBVdK","mapCreateUserId":null,"mapCreaterUserCode":null,"mapCreateUserNick":null,"mapCreaterHeadUrl":null,"recommendValue":0,"playNum":600}],"newMapList":[{"mapId":4072,"mapName":"测测测1","imgUrl":"http://fileevery.reworldgame.com/T1hyLTBCLv1RCvBVdK","mapCreateUserId":null,"mapCreaterUserCode":null,"mapCreateUserNick":null,"mapCreaterHeadUrl":null,"recommendValue":0,"playNum":0},{"mapId":4071,"mapName":"重启火箭1","imgUrl":"http://fileevery.reworldgame.com/T1fyLTB4xv1RCvBVdK","mapCreateUserId":null,"mapCreaterUserCode":null,"mapCreateUserNick":null,"mapCreaterHeadUrl":null,"recommendValue":0,"playNum":0},{"mapId":4070,"mapName":"重启车2","imgUrl":"http://fileevery.reworldgame.com/T1xRLTBjdT1RCvBVdK","mapCreateUserId":null,"mapCreaterUserCode":null,"mapCreateUserNick":null,"mapCreaterHeadUrl":null,"recommendValue":0,"playNum":0},{"mapId":4064,"mapName":"LLOP","imgUrl":"http://fileevery.reworldgame.com/T1iyLTBXdv1RCvBVdK","mapCreateUserId":null,"mapCreaterUserCode":null,"mapCreateUserNick":null,"mapCreaterHeadUrl":null,"recommendValue":0,"playNum":0}],"likeMapList":[{"mapId":4038,"mapName":"UU1","imgUrl":"http://fileevery.reworldgame.com/T1WRDTBsVT1RCvBVdK","mapCreateUserId":null,"mapCreaterUserCode":null,"mapCreateUserNick":null,"mapCreaterHeadUrl":null,"recommendValue":300,"playNum":0},{"mapId":3054,"mapName":"100空底板","imgUrl":"http://fileevery.reworldgame.com/T1PaLTBvhT1RCvBVdK","mapCreateUserId":20,"mapCreaterUserCode":"20190711140749929507","mapCreateUserNick":"123456","mapCreaterHeadUrl":"http://fileevery.reworldgame.com/head/default_head.png?imageMogr2/thumbnail/100x/interlace/0","recommendValue":9.8,"playNum":1000},{"mapId":3323,"mapName":"坑爹啊！","imgUrl":"http://fileevery.reworldgame.com/T1DydTBXYv1RCvBVdK","mapCreateUserId":null,"mapCreaterUserCode":null,"mapCreateUserNick":null,"mapCreaterHeadUrl":null,"recommendValue":0,"playNum":0},{"mapId":3604,"mapName":"D-DXB","imgUrl":"http://fileevery.reworldgame.com/T1.ydTByhv1RCvBVdK","mapCreateUserId":null,"mapCreaterUserCode":null,"mapCreateUserNick":null,"mapCreaterHeadUrl":null,"recommendValue":0,"playNum":0},{"mapId":3873,"mapName":"2-15迷城","imgUrl":"http://fileevery.reworldgame.com/T1dadTB4Av1RCvBVdK","mapCreateUserId":null,"mapCreaterUserCode":null,"mapCreateUserNick":null,"mapCreaterHeadUrl":null,"recommendValue":0,"playNum":0}]}
     */

    var code: Int = 0
    var message: String? = null
    var data: DataBean? = null

    class DataBean {
        var bannerList: List<BannerListBean>? = null
        var hotMapList: List<HotMapListBean>? = null
        var newMapList: List<NewMapListBean>? = null
        var likeMapList: List<LikeMapListBean>? = null

        class BannerListBean {
            /**
             * id : 1
             * imagePath : http://fileevery.reworldgame.com/banner/banner.png
             * url : http://reworldgame.com/
             * minVersion : 1.0.0
             * maxVersion : 9.9.9
             */

            var id: Int = 0
            var imagePath: String? = null
            var url: String? = null
            var minVersion: String? = null
            var maxVersion: String? = null
        }

        class HotMapListBean {
            /**
             * mapId : 3054
             * mapName : 100空底板
             * imgUrl : http://fileevery.reworldgame.com/T1PaLTBvhT1RCvBVdK
             * mapCreateUserId : 20
             * mapCreaterUserCode : null
             * mapCreateUserNick : 测试
             * mapCreaterHeadUrl : null
             * recommendValue : 9.8
             * playNum : 1000
             */

            var mapId: Int = 0
            var mapName: String? = null
            var imgUrl: String? = null
            var mapCreateUserId: Int = 0
            var mapCreaterUserCode: Any? = null
            var mapCreateUserNick: String? = null
            var mapCreaterHeadUrl: Any? = null
            var recommendValue: Double = 0.toDouble()
            var playNum: Int = 0
        }

        class NewMapListBean {
            /**
             * mapId : 4072
             * mapName : 测测测1
             * imgUrl : http://fileevery.reworldgame.com/T1hyLTBCLv1RCvBVdK
             * mapCreateUserId : null
             * mapCreaterUserCode : null
             * mapCreateUserNick : null
             * mapCreaterHeadUrl : null
             * recommendValue : 0
             * playNum : 0
             */

            var mapId: Int = 0
            var mapName: String? = null
            var imgUrl: String? = null
            var mapCreateUserId: Any? = null
            var mapCreaterUserCode: Any? = null
            var mapCreateUserNick: Any? = null
            var mapCreaterHeadUrl: Any? = null
            var recommendValue: Int = 0
            var playNum: Int = 0
        }

        class LikeMapListBean {
            /**
             * mapId : 4038
             * mapName : UU1
             * imgUrl : http://fileevery.reworldgame.com/T1WRDTBsVT1RCvBVdK
             * mapCreateUserId : null
             * mapCreaterUserCode : null
             * mapCreateUserNick : null
             * mapCreaterHeadUrl : null
             * recommendValue : 300
             * playNum : 0
             */

            var mapId: Int = 0
            var mapName: String? = null
            var imgUrl: String? = null
            var mapCreateUserId: Any? = null
            var mapCreaterUserCode: Any? = null
            var mapCreateUserNick: Any? = null
            var mapCreaterHeadUrl: Any? = null
            var recommendValue: Int = 0
            var playNum: Int = 0
        }
    }
}
