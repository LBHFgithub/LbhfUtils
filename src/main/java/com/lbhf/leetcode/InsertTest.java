package com.lbhf.leetcode;


import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
@SpringBootTest
public class InsertTest {

    public static void main(String[] args) {
        Long a = 1901442337882L;
        Long b = 1901680224842L;
        Long c = 1901680247891L;
        int d = 1;
        c=test04(a,b,c,"气垫式输送机检查表","气垫式输送机",new String[]{"电机、减速箱、机架等部位是否固定牢固",
                "运转过程中是否异响",
                "电机、线路等部位温度是否过热",
                "电机、托辊等部件是否异常抖动",
                "防护装置是否脱落或破损",
                "输送带是否跑偏或打滑",
                "机架、设备外壳是否变形",
                "控制箱指示灯是否显示正常",
                "漏电保护器是否完好有效",
                "畚斗与外壳是否碰撞或碰擦"});
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"斗式提升机检查表","斗式提升机",new String[]{"电机、减速箱、机架等部位是否固定牢固",
                "运转过程中是否异响",
                "电机、线路等部位温度是否过热",
                "电机、托辊等部件是否异常抖动",
                "防护装置是否脱落或破损",
                "输送带是否跑偏或打滑",
                "机架、设备外壳是否变形",
                "控制箱指示灯是否显示正常",
                "漏电保护器是否完好有效",
                "畚斗与外壳是否碰撞或碰擦"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"除尘器检查表","除尘器",new String[]{"除尘室、灰斗及风网管路是否积尘",
                "管道是否堵塞或漏风",
                "机架、设备外壳是否变形",
                "控制箱指示灯是否正常显示",
                "漏电保护器是否完好有效",
                "运转过程中是否异响"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"罗茨风机检查表","罗茨风机",new String[]{"吸气装置是否堵塞",
                "机架、设备外壳是否变形",
                "控制箱指示灯是否正常显示",
                "漏电保护器是否完好有效",
                "运转过程中是否异响"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"布料器检查表","布料器",new String[]{"电机、减速箱、机架等部位是否固定牢固",
                "机架、设备外壳是否变形变形",
                "调节螺杆是否完好有效常显示",
                "控制箱指示灯是否正常显示有效",
                "漏电保护器是否完好有效"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"空气压缩机检查表","空气压缩机",new String[]{"电机、减速箱、机架等部位是否固定牢固",
                "机架、设备外壳是否变形变形",
                "调节螺杆是否完好有效常显示",
                "控制箱指示灯是否正常显示有效",
                "漏电保护器是否完好有效"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"环流风机检查表","环流风机",new String[]{"风网是否堵塞",
                "过滤功能是否完好有效",
                "防护网是否脱落或破损",
                "外壳是否变形",
                "电机是否异响或高温"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"移动式输送机检查表","移动式输送机",new String[]{"电机、减速箱、机架等部位是否固定牢固",
                "运转过程中是否异响",
                "电机、线路等部位温度是否过热",
                "电机、托辊等部件是否异常抖动",
                "防护装置是否脱落或破损",
                "输送带是否跑偏或打滑",
                "机架、设备外壳是否变形",
                "控制箱指示灯是否显示正常",
                "漏电保护器是否完好有效",
                "轮胎气压是否充足",
                "限位器是否完好有效",
                "起升导轮是否脱轨"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"清理筛检查表","清理筛",new String[]{"振动电机是否振幅一致",
                "电机、轴承底座、滚筒等是否异响",
                "传动链轮是否串动",
                "托辊转动是否抖动",
                "输送带运行是否跑偏",
                "机架、设备外壳、支撑杆是否变形",
                "轮胎气压是否充足",
                "控制箱指示灯是否显示正常",
                "设备电源线布设是否规范"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"移动式转向输送机检查表","移动式转向输送机",new String[]{"电机、减速箱、机架等部位是否固定牢固",
                "运转过程中是否异响",
                "电机、线路等部位温度是否过热",
                "电机、托辊等部件是否异常抖动",
                "防护装置是否脱落或破损",
                "输送带是否跑偏或打滑",
                "机架、设备外壳是否变形",
                "控制箱指示灯是否显示正常",
                "漏电保护器是否完好有效",
                "轮胎气压是否充足",
                "限位器是否完好有效",
                "起升导轮是否脱轨",
                "液压油管是否破损或渗油",
                "液压油缸密封圈是否老化或破损"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"补仓机检查表","补仓机",new String[]{"电机、减速箱、机架等部位是否固定牢固",
                "运转过程中是否异响",
                "电机、线路等部位温度是否过热",
                "电机、托辊等部件是否异常抖动",
                "防护装置是否脱落或破损",
                "输送带是否跑偏或打滑",
                "机架、设备外壳是否变形",
                "控制箱指示灯是否显示正常",
                "漏电保护器是否完好有效",
                "轮胎气压是否充足",
                "限位器是否完好有效",
                "起升导轮是否脱轨",
                "液压油管是否破损或渗油",
                "液压油缸密封圈是否老化或破损"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"扒谷机检查表","扒谷机",new String[]{"电机、机架等部位是否固定牢固",
                "运转过程中是否异响",
                "电机、线路等部位温度是否过热",
                "电机、托辊等部件是否异常抖动",
                "防护装置是否脱落或破损",
                "机架、设备外壳是否变形",
                "控制箱指示灯是否显示正常",
                "漏电保护器是否完好有效",
                "轮胎气压是否充足",
                "转向头转动方向是否正常",
                "钢丝绳是否起毛或断裂"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"散粮卸车机检查表","散粮卸车机",new String[]{"电机、机架等部位是否固定牢固",
                "运转过程中是否异响",
                "电机、线路等部位温度是否过热",
                "电机、托辊等部件是否异常抖动",
                "防护装置是否脱落或破损",
                "机架、设备外壳是否变形",
                "控制箱指示灯是否显示正常",
                "漏电保护器是否完好有效",
                "轮胎气压是否充足"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"离心通风机检查表","离心通风机",new String[]{"电机、机架等部位是否固定牢固",
                "运转过程中是否异响",
                "电机、线路等部位温度是否过热",
                "电机、托辊等部件是否异常抖动",
                "防护装置是否脱落或破损",
                "控制箱指示灯是否显示正常",
                "漏电保护器是否完好有效",
                "风网是否堵塞",
                "过滤功能是否完好有效",
                "防护网是否脱落或破损"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"轴流式风机检查表","轴流式风机",new String[]{"电机、机架等部位是否固定牢固",
                "运转过程中是否异响",
                "电机、线路等部位温度是否过热",
                "电机、托辊等部件是否异常抖动",
                "防护装置是否脱落或破损",
                "风网是否堵塞",
                "过滤功能是否完好有效",
                "防护网是否脱落或破损"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"单管或多管风机检查表","单管或多管风机",new String[]{"电机、机架等部位是否固定牢固",
                "运转过程中是否异响",
                "电机、线路等部位温度是否过热",
                "线路铺设是否规范",
                "防护装置是否脱落或破损",
                "风网是否堵塞",
                "过滤功能是否完好有效",
                "防护网是否脱落或破损"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"谷物冷却机检查表","谷物冷却机",new String[]{"电机、机架等部位是否固定牢固",
                "运转过程中是否异响",
                "电机、线路等部位温度是否过热",
                "电机、托辊等部件是否异常抖动",
                "防护装置是否脱落或破损",
                "控制箱指示灯是否显示正常",
                "漏电保护器是否完好有效",
                "风网是否堵塞",
                "过滤功能是否完好有效",
                "防护网是否脱落或破损",
                "排水口是否堵塞"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"配电箱检查表","配电箱",new String[]{"箱体箱门是否未上锁或锈蚀",
                "空气短路开关是否规范连接",
                "箱内线路是否私拉乱接",
                "引入孔是否密封良好",
                "插座是否存在烧焦现象",
                "箱体是否跨接"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"高压配电柜检查表","高压配电柜",new String[]{"配电室外是否悬挂高压危险警示标识",
                "配电室门口是否设置挡鼠板",
                "地沟是否严密封堵",
                "操作区域地面是否铺设绝缘胶板",
                "配电柜信号装置是否显示异常",
                "高压防护用具是否检测到位"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"油浸式变压器检查表","油浸式变压器",new String[]{"围栏是否上锁或悬挂高压危险警示标识",
                "绝缘油是否存在渗漏现象",
                "配电室门口是否设置挡鼠板"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"低压配电柜检查表","低压配电柜",new String[]{"配电室外是否悬挂安全警示标识",
                "配电室门口是否设置挡鼠板",
                "地沟是否严密封堵",
                "操作区域地面是否铺设绝缘胶板",
                "配电柜信号装置是否显示异常",
                "安全防护用具是否检测到位"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"电缆检查表","电缆",new String[]{"电缆护套是否破损",
                "电缆支架是否变形或锈蚀"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"制氮机检查表","制氮机",new String[]{"压力表是否正常显示",
                "氮气储罐安全阀是否堵塞或失效",
                "控制柜指示灯是否正常显示",
                "操作区域地面是否铺设绝缘胶板",
                "气体管路是否泄漏"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"切割机检查表","切割机",new String[]{"电源线是否违规延长使用",
                "电源线前端是否设置漏电保护器",
                "防护罩是否变形或脱落",
                "切割片是否破裂或松动",
                "底座是否固定牢固"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"普通焊机检查表","普通焊机",new String[]{"氧气瓶是否固定摆放",
                "乙炔气瓶是否设置防回火器",
                "气瓶压力表是否正常显示",
                "气瓶软管是否老化或漏气",
                "作业过程气瓶间距是否达到要求"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"气割工具检查表","气割工具",new String[]{"电源线是否长度充足",
                "设备前段是否设置漏电保护器",
                "防雨措施或防护罩是否脱落",
                "焊把线是否老化"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"手拉葫芦检查表","手拉葫芦",new String[]{"挂钩是否裂缝",
                "挂钩是否设置防脱钩装置",
                "负载链条是否磨损严重",
                "链轮、摩擦片是否正常使用",
                "手拉链是否损坏"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"角磨机检查表","角磨机",new String[]{"驱动电机是否异响或高温",
                "切割片是否裂缝",
                "设备螺栓是否松动",
                "控制开关是否正常使用",
                "机体、手柄是否正常使用"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"砂轮机检查表","砂轮机",new String[]{"驱动电机是否异响或高温",
                "防护罩是否完整齐全",
                "螺栓是否松动",
                "砂轮是否裂缝或缺陷",
                "设备底座是否固定牢固",
                "控制开光是否正常使用"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"高空作业车检查表","高空作业车",new String[]{"电机是否存在异响或高温",
                "传动链轮是否串动",
                "液压油管是否破损或渗油",
                "液压油缸密封圈是否老化",
                "机架、机械臂是否变形",
                "支撑杆是否能够伸缩到位",
                "轮胎气压是否充足"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"电气检测工具检查表","电气检测工具",new String[]{"兆欧表是否电量充足或正常使用",
                "接地线是否严重锈蚀",
                "link棒是否老化",
                "绝缘鞋、绝缘手套是否破损或失效",
                "万用表是否正常使用"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"自动扦样器检查表","自动扦样器",new String[]{"扦样头是否松动或位置不当",
                "电机是否异响或高温",
                "链轮是否损坏",
                "输送管道是否堵塞",
                "吸风装置是否正常使用"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"检验烘箱检查表","检验烘箱",new String[]{"箱体、箱门是否正常使用",
                "通风系统是否完好",
                "电阻丝是否损坏",
                "温控装置是否正常使用",
                "仪器指示灯是否显示正常"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"车辆检查表","车辆",new String[]{"车辆胎压是否正常",
                "照明、转向等系统是否正常",
                "车辆电路、油路是否正常",
                "制动系统是否正常",
                "安全带是否正常",
                "车内消防器材是否正常",
                "车辆是否正常年检"

        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"监控设备检查表","监控设备",new String[]{"监控设备是否人为关闭",
                "监控设备是否损坏",
                "监控线路是否老化"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"柴油发电机检查表","柴油发电机",new String[]{"油箱是否接地",
                "油量是否充足",
                "发电机是否能正常启动",
                "柴油储罐是否独立设置"

        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"消防设施设备检查表","消防设施设备",new String[]{"水泵控制柜指示灯是否正常显示",
                "水泵控制柜是否能应急启动",
                "消防水泵是否渗漏",
                "水泵联轴器是否设置安全防护罩",
                "水泵泵体是否严重锈蚀",
                "消防水池是否水量充足",
                "消防阀门是否处于常开状态",
                "消防管网压力是否充足"
        });
        ////2
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"吊装作业检查表","吊装作业",new String[]{"吊装作业是否设置安全警戒区域",
                "吊装作业前是否进行试吊",
                "吊装车辆支撑脚是否打开且牢靠",
                "吊装作业回转半径是否有障碍物",
                "吊装作业下方是否有人停留或行走"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"检维修作业检查表","检维修作业",new String[]{"机电设备是否带病运行",
                "是否设备带电或运行中进行检维修",
                "非作业人员是否进入检维修现场",
                "支撑部位检维修是否设置防垮塌装置",
                "管道、孔洞维修是否设置阻火隔断装置",
                "作业结束后是否清点人员和工具"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"库区检查表","库区",new String[]{"高温天气是否落实防护降温措施",
                "雷电天气是否避免室外高处作业",
                "防雷设置是否有效",
                "排水系统是否及时清理",
                "大风天气是否避免高处作业或动火作业"

        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"有限空间作业检查表","有限空间作业",new String[]{"有限空间作业人员是否规范佩戴空气呼吸器",
                "作业是否严格执行先通风再检测后作业要求",
                "作业时是否每半小时分析一次空间氧气浓度",
                "作业现场是否有专人监护",
                "作业结束后是否清点人员和工具"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"高处作业检查表","高处作业",new String[]{"高处作业工具是否安全可靠",
                "登高作业车作业是否规范展开水平支撑脚",
                "登高作业人员是否规范佩戴安全绳",
                "登高作业时是否抛扔物品",
                "登高作业时高处物件是否加以固定",
                "登高作业时是否与高压线保持安全距离"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"动火作业检查表","动火作业",new String[]{"动火作业区域是否设置安全警示牌",
                "动火作业前是否清理现场可燃物资",
                "作业现场是否配置消防器材",
                "作业过程中气瓶安全间距是否符合要求",
                "作业现场是否有专人监管",
                "作业结束后是否彻底清理火源火种"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"临时用电作业检查表","临时用电作业",new String[]{"开关箱是否配备漏电、过载、短路保护装置",
                "检修作业配电箱是否悬挂禁止合闸标识牌",
                "送停电操作顺序是否规范",
                "作业现场是否有专人监管",
                "作业人员是否穿戴绝缘鞋、绝缘手套等防护用具",
                "作业结束后是否清点人员"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"清理挂壁作业检查表","清理挂壁作业",new String[]{"作业人员是否先关闭出粮闸口",
                "作业人员是否规范佩戴安全绳",
                "平房仓挂壁清理作业是否利用长杆或高空作业车",
                "立筒仓挂壁清理作业是否使用吊篮入仓",
                "浅圆仓挂壁清理作业是否使用装载机处置",
                "作业结束后是否清点人员"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"熏蒸作业检查表","熏蒸作业",new String[]{"熏蒸作业人员是否规范佩戴空气呼吸器",
                "熏蒸作业现场是否有专人监管",
                "熏蒸作业时是否切断仓内电源",
                "熏蒸投药是否从里向外、从远及近、由高向低",
                "熏蒸药剂是否落实五双管理要求",
                "熏蒸散气仓房是否规范设置警戒线",
                "熏蒸作业结束后是否清点人员"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"清仓作业检查表","清仓作业",new String[]{"清仓作业人员是否穿戴安全防护用具",
                "清仓作业时是否打开门窗或排气扇",
                "清仓机是否按规范操作",
                "作业现场灰尘是否严重超标"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"烘干作业检查表","烘干作业",new String[]{"烘干机水分、温度等检测装置是否完好有效",
                "烘前仓入粮与烘干作业是否同步",
                "烘干机内粮食是否保持流动状态",
                "换热器是否每月检查",
                "烘干塔周围是否存在可燃物资"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"出库作业检查表","出库作业",new String[]{"出仓作业前是否锁闭查粮门",
                "出仓作业现场是否专人监管",
                "开启挡粮门板是否关闭出粮口",
                "开启挡粮门板是否在仓外操作",
                "特殊情况进仓作业是否关闭出粮口且系好安全绳",
                "仓内线路与扒谷机是否保持安全距离",
                "出粮作业结束后是否清点人员"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"通风作业检查表","通风作业",new String[]{"移动风机是否规范操作",
                "风道口安装是否密闭",
                "电源线路铺设是否规范",
                "风机是否进行试运行检测",
                "风机防护罩是否完好",
                "风机是否固定牢固"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"检查粮面粮温作业检查表","检查粮面粮温作业",new String[]{"进仓前是否提前通风并检测氧气浓度",
                "仓内挡粮门上方是否设置安全警戒线",
                "离开仓房是否及时关闭照明灯"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"入库作业检查表","入库作业",new String[]{"仓内清扫作业人员是否佩戴防尘口罩",
                "清扫作业是否使用空气压缩机",
                "移动设备是否违规牵引或配重",
                "卸粮四周是否设置警戒线",
                "卸车出粮门栓是否牢固固定",
                "装仓作业是否现场有人指挥",
                "电气线路铺设是否规范",
                "平整粮面是否自上而下摊平粮食"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"检斤作业检查表","检斤作业",new String[]{"车辆上下地磅是否超速",
                "检斤车辆是否熄火",
                "检斤车辆是否停稳",
                "司机是否规范上下车"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"扦样作业检查表","扦样作业",new String[]{"扦样系统是否正常运转",
                "扦样人员是否规范操作",
                "作业现场是否设置监管人员"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"清扫作业检查表","清扫作业",new String[]{"道路清扫是否设置安全标识",
                "清扫人员是否佩戴安全防护用具",
                "垃圾倾倒是否在指定位置",
                "是否存在库区焚烧垃圾行为"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"绿化作业检查表","绿化作业",new String[]{"树穴开挖是否未按规范进行",
                "苗木运输是否超载、超速",
                "苗木捆扎是否牢固",
                "农药、除草剂是否规范储存和使用",
                "农药喷洒人员是否佩戴安全防护用具",
                "剪草机作业人员是否佩戴安全防护用具"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"施工作业检查表","施工作业",new String[]{"基坑周围是否设置安全围栏",
                "机械回转半径内是否有人交叉作业",
                "土方作业前是否进行现场检查",
                "基坑是否设置有效排水设施",
                "施工临时用电是否符合要求",
                "用电设备外壳是否安全接地",
                "施工动火人员是否持证上岗",
                "施工吊装是否严格执行“十不吊”要求",
                "施工人员是否佩戴安全帽、安全绳等防护用具",
                "施工现场是否存在吸烟现象"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"门卫活动检查表","门卫活动",new String[]{"门卫是否配备烟火探测仪器",
                "门卫是否进行安全告知",
                "门卫是否进行安全登记",
                "门卫是否进行入库人员安全检查",
                "门卫烟火管控是否到位",
                "门卫是否在岗在位"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"四防作业检查表","四防作业",new String[]{"防火检查是否定期进行",
                "库区是否规范配置灭火及消防器材",
                "库区是否存在违规吸烟",
                "库区是否存在违规动火",
                "是否未定期开展应急演练",
                "是否开展汛前检查",
                "是否及时清理沟渠管网",
                "是否定期对库区四周进行安保巡查",
                "是否定期检查库区围墙、大门等"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"车辆驾驶检查表","车辆驾驶",new String[]{"是否存在超速行驶",
                "是否存在酒驾、醉驾",
                "是否存在无证驾驶",
                "车辆是否未按指定位置停放"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"宿舍活动检查表","宿舍活动",new String[]{"是否存在违规吸烟现象",
                "是否存在违规使用电热毯、热得快等大功率用电器",
                "是否存在线路私拉乱接现象",
                "是否存在人走未断电现象"

        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"食堂作业检查表","食堂作业",new String[]{"厨师是否按期体检",
                "燃气灶、燃气瓶、管路、阀门等是否正规渠道购买",
                "厨房是否正确安装可燃气体报警器",
                "高压锅阀门是否正常使用",
                "油烟机、管道等是否定期清洗"
        });
        a++;
        b++;
        c++;
        d++;
        c=test04(a,b,c,"办公区活动检查表","办公区活动",new String[]{"办公电脑、打印机、照明灯、空调等电气设备是否落实人走断电",
                "充电器、插座等设备是否过载或过热",
                "电气线路是否私搭乱接",
                "烧水器是否水箱是否上锁",
                "楼道地面是否湿滑",
                "安全出口是否锁闭",
                "应急通道照度是否充足"
        });
        System.out.println(d);
    }

    public static void insertTest001(String str1,Long id) {
        StringBuffer sql1 = new StringBuffer();
        StringBuffer sql2;
        StringBuffer sql3;
        String id1 = "1";
        sql1.append("\n" +
                "        INSERT INTO\n" +
                "    \t\taj_scheck_schecktemplate(\n" +
                "    \t\t id,\n" +
                "\t         name,\n" +
                "\t         isStop,\n" +
                "\t         source,\n" +
                "            createtime\n" +
                "    \t)VALUES('");
        sql1.append(id);
        sql1.append("','");
        sql1.append(str1);
        sql1.append("',");
        sql1.append("1,");
        sql1.append("0,CURDATE());");
        System.out.println(sql1);
        id++;

    }
    public static void insertTest002(String str1,Long id,Long parentID) {
        StringBuffer sql1 = new StringBuffer();
        sql1.append("\n" +
                "        INSERT INTO\n" +
                "    \t\taj_scheck_schecktemplatesitem_specific(\n" +
                "    \t\t id,\n" +
                "\t         name,\n" +
                "\t         scheckTemplateId,\n" +
                "\t         isStop,\n" +
                "            source,\n" +
                "            sortIndex,\n" +
                "            createDate,\n" +
                "\t\t    createtime\n" +
                "    \t)VALUES('");
        sql1.append(id);
        sql1.append("','");
        sql1.append(str1);
        sql1.append("','");
        sql1.append(parentID);
        sql1.append("',");
        sql1.append("1,");
        sql1.append("0,");
        sql1.append("1,CURDATE(),");
        sql1.append("CURDATE());");
        System.out.println(sql1);

    }
    public static Long insertTest003(String[] str1,Long id,Long parentID) {
        StringBuffer sql1 = new StringBuffer();
        sql1.append("\n" +
                "        INSERT INTO\n" +
                "    \t\taj_scheck_schecktemplatescontent_specific(\n" +
                "            id,\n" +
                "            name,\n" +
                "\t\t    scheckItemId,\n" +
                "\t\t    standardScore,\n" +
                "\t\t    sortIndex,\n" +
                "\t\t    _parentId\n" +
                "    \t)VALUES");

        for (int i = 0; i < str1.length; i++) {
            sql1.append("('");
            sql1.append(id);
            sql1.append("','");
            sql1.append(str1[i]);
            sql1.append("','");
            sql1.append(parentID);
            sql1.append("','");
            sql1.append("0.0','");
            sql1.append("1.");
            sql1.append(i+1);
            sql1.append("','");
            sql1.append(parentID);
            sql1.append("'),");
            id++;
        }
        sql1.delete(sql1.length()-1,sql1.length());
        sql1.append(";");

        System.out.println(sql1);
        return id;
    }
    public static Long test04(Long a,Long b, Long c,String str1 ,String str2 ,String[] str3){
        insertTest001(str1,a);
        insertTest002(str2,b,a);
        c =insertTest003(str3,c,b);
        return c;
    }

}