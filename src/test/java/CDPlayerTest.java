import com.springmvc.study1.CDPlayerConfig;
import com.springmvc.study1.soundsystem.CompactDisc;
import com.springmvc.study1.soundsystem.MediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

//使用这个SpringJUnit4ClassRunner，测试开始的时候自动创建spring的应用上下文
@RunWith(SpringJUnit4ClassRunner.class)
//告诉它需要在CDPlayerConfig中加载配置，因为CDPlayerConfig配置类包含了@ComponentScan，
//所以，最终的应用上下文应该包含CompactDisc的bean?
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private MediaPlayer player;
    @Autowired
    private CompactDisc cd;
    @Test
    public void cdShouldNotBeNull(){
        //断言cd不为null（cd不为null就说明CompactDisc的bean被spring发现、创建、注入了）
        //System.out.println("a");
        assertNotNull(cd);
    }
    @Test
    public void play(){
        player.play();
    }
}

