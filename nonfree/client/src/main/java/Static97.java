import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "[I")
	public static int[] anIntArray219 = new int[2048];

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString63 = "Connected to update server";

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIII)V")
	public static void method1569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) Class22 local4 = Static172.method2702(arg1, arg4);
		if (local4 != null && local4.anObjectArray19 != null) {
			@Pc(13) Class4_Sub22 local13 = new Class4_Sub22();
			local13.anObjectArray32 = local4.anObjectArray19;
			local13.aClass22_15 = local4;
			Static125.method2089(local13);
		}
		Static26.aBoolean30 = true;
		Static105.anInt2258 = arg5;
		Static240.anInt5014 = arg3;
		Static117.anInt2591 = arg0;
		Static52.anInt1044 = arg1;
		Static161.anInt3204 = arg4;
		Static112.anInt2457 = arg2;
		Static81.method3274(local4);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
	public static void method1571() {
		@Pc(9) Container local9;
		if (Static55.aFrame2 != null) {
			local9 = Static55.aFrame2;
		} else if (Static27.aFrame3 == null) {
			local9 = Static87.aClass164_2.anApplet1;
		} else {
			local9 = Static27.aFrame3;
		}
		Static179.anInt3545 = local9.getSize().width;
		Static210.anInt4102 = local9.getSize().height;
		@Pc(35) Insets local35;
		if (local9 == Static27.aFrame3) {
			local35 = Static27.aFrame3.getInsets();
			Static179.anInt3545 -= local35.right + local35.left;
			Static210.anInt4102 -= local35.top + local35.bottom;
		}
		if (Static40.method683() >= 2) {
			Static111.anInt2450 = Static179.anInt3545;
			Static216.anInt4287 = Static210.anInt4102;
			Static35.anInt709 = 0;
			Static122.anInt2660 = 0;
		} else {
			Static216.anInt4287 = 503;
			Static122.anInt2660 = 0;
			Static111.anInt2450 = 765;
			Static35.anInt709 = (Static179.anInt3545 - 765) / 2;
		}
		if (Static178.aBoolean216) {
			Static178.method2752(Static111.anInt2450, Static216.anInt4287);
		}
		Static235.aCanvas1.setSize(Static111.anInt2450, Static216.anInt4287);
		if (Static27.aFrame3 == local9) {
			local35 = Static27.aFrame3.getInsets();
			Static235.aCanvas1.setLocation(local35.left + Static35.anInt709, Static122.anInt2660 + local35.top);
		} else {
			Static235.aCanvas1.setLocation(Static35.anInt709, Static122.anInt2660);
		}
		if (Static25.anInt448 != -1) {
			Static161.method2519(true);
		}
		Static59.method2488();
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public static void method1572() {
		Class57.anIntArray222 = null;
		anIntArray219 = null;
		aString63 = null;
	}
}
