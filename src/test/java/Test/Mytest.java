package Test;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

public class Mytest {

    @Test
    public void testGenerator() {

        //1、此处默认有两个对应的实现类，不要导错包.import com.baomidou.mybatisplus.generator.config.GlobalConfig;
        GlobalConfig globalConfig = new GlobalConfig();
        //设置全局的配置
        globalConfig.setActiveRecord(true)  //是否支持AR模式
                .setAuthor("Wanghan")  //设置作者
                .setOutputDir("D:\\ideaworkspace\\HKvideo\\HKvideo\\src\\main\\java")  //设置生成路径
                .setFileOverride(true)  //设置文件覆盖
                .setIdType(IdType.AUTO) //设置主键生成策略
                .setServiceName("%sService")  //设置生成的serivce接口的名字。 默认的名字首字母为I。 %sService ：去掉I
                .setBaseResultMap(true)   //设置基本的结果集映射
                .setBaseColumnList(true);  //设置基本的列集合


        //2、设置数据源的配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://127.0.0.1:3306/hkvideo?autoReconnect=true&characterEncoding=utf-8&serverTimezone=UTC")
                .setUsername("root")
                .setPassword("wanghan817");


        // 3、进行策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true)//设置全局大写命名
                .setNaming(NamingStrategy.underline_to_camel)//数据库表映射到实体的命名策略
                .setTablePrefix("");//设置表名前缀
                //.setInclude("tbl_emp");//生成的表


        // 4、进行包名的策略配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com")
                .setModuleName("javen")
                .setMapper("mapping")
                .setService("service")
                .setController("controller")
                .setEntity("model")
                .setXml("mapping");  //和mapper接口放一起


        //5、整合配置
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator
                .setGlobalConfig(globalConfig)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig);

        //6、执行
        autoGenerator.execute();
    }
//可以在Controller层可以直接实现调用，这些调用的实现最核心的功能就在于ServiceImpl类，这个类中自动完成mapper的注入，同时提供了一系列CRUD的方法
}
