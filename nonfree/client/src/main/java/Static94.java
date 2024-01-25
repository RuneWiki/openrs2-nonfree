import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
	public static int anInt2261;

	@OriginalMember(owner = "client!ee", name = "G", descriptor = "Z")
	public static boolean aBoolean149 = false;

	@OriginalMember(owner = "client!ee", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZII)I")
	public static int method1626(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 - 1 & arg0 >> 31;
		return ((arg0 >>> 31) + arg0) % arg1 + local16;
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(B)Lclient!fb;")
	public static Class82 method1627() {
		try {
			return (Class82) Class.forName("Class82_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!za;I)V")
	public static void method1630(@OriginalArg(0) Class106 arg0) {
		if (Static175.aClass203_31.method4552() == 0) {
			return;
		}
		@Pc(50) Class1_Sub23 local50;
		if (Static262.anInt2805 == 0) {
			for (local50 = (Class1_Sub23) Static175.aClass203_31.method4548(); local50 != null; local50 = (Class1_Sub23) Static175.aClass203_31.method4545()) {
				Static43.aClass57_1.method1406(false, local50.anInt4196, local50.anInt4192, local50.anInt4195, arg0, local50.anInt4189, local50.aBoolean260 ? Static429.aClass30_Sub1_Sub1_Sub2_2.aClass210_1 : null, arg0, local50.anInt4197, Static180.aClass20_3, false);
				local50.method6178();
			}
			Static179.method3014();
			return;
		}
		if (Static264.aClass106_9 == null) {
			@Pc(20) Canvas local20 = new Canvas();
			local20.setSize(36, 32);
			Static264.aClass106_9 = Static461.method5919(local20, Static150.aClass183_3, 0, Static284.anInterface7_4, 0);
			Static190.aClass20_4 = Static264.aClass106_9.method5968(Static341.method4804(Static24.aClass211_8, Static6.anInt82), Static470.method6051(Static140.aClass211_38, Static6.anInt82));
		}
		for (local50 = (Class1_Sub23) Static175.aClass203_31.method4548(); local50 != null; local50 = (Class1_Sub23) Static175.aClass203_31.method4545()) {
			Static43.aClass57_1.method1406(false, local50.anInt4196, local50.anInt4192, local50.anInt4195, arg0, local50.anInt4189, local50.aBoolean260 ? Static429.aClass30_Sub1_Sub1_Sub2_2.aClass210_1 : null, Static264.aClass106_9, local50.anInt4197, Static190.aClass20_4, false);
			local50.method6178();
		}
	}
}
