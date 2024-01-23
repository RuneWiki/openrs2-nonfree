import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
	public static int anInt1744;

	@OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
	public static int anInt1749;

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
	public static int anInt1742 = 0;

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "Lclient!bo;")
	public static Class24 aClass24_14 = new Class24();

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
	public static int anInt1746 = 0;

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "Z")
	public static boolean aBoolean136 = false;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1359(@OriginalArg(0) Component arg0) {
		@Pc(5) Method local5 = Static181.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(20) Throwable local20) {
			}
		}
		arg0.addKeyListener(Static154.aClass176_1);
		arg0.addFocusListener(Static154.aClass176_1);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	public static void method1362() {
		Static147.aClass169_84.method4014();
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
	public static void method1363() {
		Static109.aClass37_1.method2928();
		@Pc(11) int local11;
		for (local11 = 0; local11 < 32; local11++) {
			Static216.aLongArray90[local11] = 0L;
		}
		for (local11 = 0; local11 < 32; local11++) {
			Static115.aLongArray48[local11] = 0L;
		}
		Static82.anInt1505 = 0;
	}
}
