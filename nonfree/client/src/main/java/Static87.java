import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Lclient!br;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Lclient!ifa;")
	public static final Class163 aClass163_14 = new Class163();

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	public static int anInt1778 = 0;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!bja;")
	public static final Class27 aClass27_7 = new Class27(8, 0, 4, 1);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public static void method1771(@OriginalArg(1) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static155.method2704(local6.width, local6.height);
		if (Static106.anInt2134 == 1) {
			Static340.aClass33_9.method8098(arg0, Static235.anInt5516, Static118.anInt2257);
		} else {
			Static340.aClass33_9.method8098(arg0, Static445.anInt6953, Static461.anInt7413);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)Z")
	public static boolean method1773() {
		try {
			@Pc(7) Class237 local7 = new Class237();
			@Pc(12) byte[] local12 = local7.method4971(Static187.aByteArray40);
			Static111.method2114(local12);
			return true;
		} catch (@Pc(24) Exception local24) {
			return false;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([J[Ljava/lang/Object;B)V")
	public static void method1774(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Static201.method3061(arg1, arg0.length - 1, arg0, 0);
	}
}
