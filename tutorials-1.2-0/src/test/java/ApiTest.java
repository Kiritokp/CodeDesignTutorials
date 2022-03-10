import com.kirito.design.VideoUserService;
import org.junit.Test;

public class ApiTest {
    @Test
    public void test(){
        VideoUserService videoUserService = new VideoUserService();
        videoUserService.serveGrade("VIP用户");
        videoUserService.serveGrade("普通用户");
        videoUserService.serveGrade("访客用户");
    }
}
