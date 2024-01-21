import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "[I")
	public static int[] anIntArray464 = new int[4000];

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
	public static int anInt2644 = 0;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "Lclient!eh;")
	public static Class28 aClass28_837 = Static170.method3101(":");

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public static void method2101() {
		Static181.aClass63_32.method2344();
		Static46.aClass63_6.method2344();
		Static135.aClass63_24.method2344();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
	public static void method2102(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static61.aBoolean101) {
			Static166.method3062();
		} else if (arg0 != -1 && (arg0 != Static93.anInt2608 || !Static83.method1906()) && Static126.anInt3243 != 0 && !Static61.aBoolean101) {
			Static152.method2880(0, arg0, Static164.aClass7_Sub1_17, Static126.anInt3243);
		}
		Static93.anInt2608 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public static void method2103() {
		anIntArray464 = null;
		aClass28_837 = null;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLclient!gf;)V")
	public static void method2104(@OriginalArg(1) Class33 arg0) {
		@Pc(11) int local11 = arg0.anInt1477;
		if (local11 == 324) {
			if (Static96.anInt4199 == -1) {
				Static100.anInt2654 = arg0.anInt1509;
				Static96.anInt4199 = arg0.anInt1510;
			}
			if (Static180.aClass76_2.aBoolean180) {
				arg0.anInt1510 = Static96.anInt4199;
			} else {
				arg0.anInt1510 = Static100.anInt2654;
			}
		} else if (local11 == 325) {
			if (Static96.anInt4199 == -1) {
				Static96.anInt4199 = arg0.anInt1510;
				Static100.anInt2654 = arg0.anInt1509;
			}
			if (Static180.aClass76_2.aBoolean180) {
				arg0.anInt1510 = Static100.anInt2654;
			} else {
				arg0.anInt1510 = Static96.anInt4199;
			}
		} else if (local11 == 327) {
			arg0.anInt1474 = 150;
			arg0.anInt1508 = (int) (Math.sin((double) Static14.anInt481 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1493 = 5;
			arg0.anInt1455 = -1;
		} else if (local11 == 328) {
			if (Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass28_296 == null) {
				arg0.anInt1455 = 0;
			} else {
				arg0.anInt1474 = 150;
				arg0.anInt1508 = (int) (Math.sin((double) Static14.anInt481 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt1493 = 5;
				arg0.anInt1455 = ((int) Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass28_296.method924() << 11) + 2047;
				arg0.anInt1523 = Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1827;
				arg0.anInt1467 = Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1814;
			}
		}
	}
}
