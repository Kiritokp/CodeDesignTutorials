import com.kirito.design.IVideoUserService;
import com.kirito.design.impl.GuestVideoUserServiceImpl;
import com.kirito.design.impl.OrdinaryVideoUserServiceImpl;
import com.kirito.design.impl.VipVideoUserServiceImpl;
import org.junit.Test;

public class ApiTest {
    @Test
    public void test(){
        IVideoUserService iVideoUserService=new VipVideoUserServiceImpl();
        iVideoUserService.definition();
        iVideoUserService.advertisement();
        System.out.println("-------------------------------------------");
        IVideoUserService iVideoUserService2=new GuestVideoUserServiceImpl();
        iVideoUserService2.definition();
        iVideoUserService2.advertisement();
        System.out.println("-------------------------------------------");
        IVideoUserService iVideoUserService3=new OrdinaryVideoUserServiceImpl();
        iVideoUserService3.definition();
        iVideoUserService3.advertisement();
    }
}
