import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!lh", name = "I", descriptor = "I")
	public static int anInt2077;

	@OriginalMember(owner = "client!lh", name = "G", descriptor = "Lclient!lf;")
	public static Class49 aClass49_994 = Static32.method683("<col=ff0000>");

	@OriginalMember(owner = "client!lh", name = "H", descriptor = "Lclient!lf;")
	public static Class49 aClass49_995 = Static32.method683("<col=ffff00>");

	@OriginalMember(owner = "client!lh", name = "cb", descriptor = "Lclient!lf;")
	private static Class49 aClass49_997 = Static32.method683("Free world");

	@OriginalMember(owner = "client!lh", name = "U", descriptor = "Lclient!lf;")
	public static Class49 aClass49_996 = aClass49_997;

	@OriginalMember(owner = "client!lh", name = "eb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_998 = Static32.method683("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)V")
	public static void method1697() {
		@Pc(1) Class67 local1 = Static79.aClass67_41;
		synchronized (Static79.aClass67_41) {
			Static182.anInt4058 = Static48.anInt1123;
			Static20.anInt449 = Static35.anInt893;
			Static96.anInt2022 = Static48.anInt1129;
			Static63.anInt1351 = Static18.anInt371;
			Static114.anInt2394 = Static70.anInt1443;
			Static61.anInt1320 = Static41.anInt1001;
			Static40.aLong40 = Static94.aLong91;
			Static18.anInt371 = 0;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!uc;I)V")
	public static void method1699(@OriginalArg(0) Class2_Sub2_Sub3_Sub7 arg0) {
		arg0.anInt3530 = 0;
		if (arg0.anInt3541 == 0) {
			arg0.anInt3571 = 1024;
		}
		@Pc(20) int local20 = arg0.anInt3526 - Static127.anInt2757;
		if (arg0.anInt3541 == 1) {
			arg0.anInt3571 = 1536;
		}
		@Pc(40) int local40 = arg0.anInt3576 * 128 + arg0.anInt3581 * 64;
		@Pc(50) int local50 = arg0.anInt3532 * 128 + arg0.anInt3581 * 64;
		if (arg0.anInt3541 == 2) {
			arg0.anInt3571 = 0;
		}
		arg0.anInt3578 += (local50 - arg0.anInt3578) / local20;
		if (arg0.anInt3541 == 3) {
			arg0.anInt3571 = 512;
		}
		arg0.anInt3529 += (local40 - arg0.anInt3529) / local20;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!oh;Lclient!wb;B)V")
	public static void method1701(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub1 arg1, @OriginalArg(2) Class88 arg2) {
		@Pc(3) byte[] local3 = null;
		@Pc(5) Class81 local5 = Static47.aClass81_4;
		synchronized (Static47.aClass81_4) {
			for (@Pc(12) Class2_Sub22 local12 = (Class2_Sub22) Static47.aClass81_4.method2682(); local12 != null; local12 = (Class2_Sub22) Static47.aClass81_4.method2686()) {
				if ((long) arg0 == local12.aLong157 && arg2 == local12.aClass88_2 && local12.anInt2507 == 0) {
					local3 = local12.aByteArray45;
					break;
				}
			}
		}
		if (local3 == null) {
			@Pc(71) byte[] local71 = arg2.method2979(arg0);
			arg1.method2083(local71, arg2, true, arg0);
		} else {
			arg1.method2083(local3, arg2, true, arg0);
		}
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)V")
	public static void method1703() {
		@Pc(8) int[] local8 = new int[Static134.anInt2913];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static134.anInt2913; local12++) {
			@Pc(18) Class2_Sub2_Sub10 local18 = Static113.method1913(local12);
			if (local18.anInt1585 >= 0 || local18.anInt1613 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static178.anIntArray365 = new int[local10];
		for (@Pc(52) int local52 = 0; local52 < local10; local52++) {
			Static178.anIntArray365[local52] = local8[local52];
		}
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)V")
	public static void method1704() {
		aClass49_997 = null;
		aClass49_995 = null;
		aClass49_994 = null;
		aClass49_998 = null;
		aClass49_996 = null;
	}
}
