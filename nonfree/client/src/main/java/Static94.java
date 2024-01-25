import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_30 = new Class349(36, 8);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BLjava/awt/Frame;Lclient!vo;)V")
	public static void method1458(@OriginalArg(1) Frame arg0, @OriginalArg(2) Class389 arg1) {
		while (true) {
			@Pc(12) Class163 local12 = arg1.method9278(arg0);
			while (local12.anInt3843 == 0) {
				Static570.method7907(10L);
			}
			if (local12.anInt3843 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static570.method7907(100L);
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IB)Z")
	public static boolean method1460(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg1 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static456.aCharArray7[local7 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(FIFIILclient!qa;BFFIF)[B")
	public static byte[] method1461(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(5) Class111 arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float arg4, @OriginalArg(10) float arg5) {
		@Pc(18) byte[] local18 = new byte[262144];
		Static582.method8089(arg3, arg4, arg0, arg1, arg5, local18, 0, arg2);
		return local18;
	}
}
