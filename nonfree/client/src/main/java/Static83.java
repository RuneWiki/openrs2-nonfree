import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ii", name = "N", descriptor = "[I")
	public static int[] anIntArray179;

	@OriginalMember(owner = "client!ii", name = "ab", descriptor = "I")
	public static int anInt1853;

	@OriginalMember(owner = "client!ii", name = "cb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!ii", name = "U", descriptor = "[S")
	public static final short[] aShortArray24 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
	public static int anInt1850 = 0;

	@OriginalMember(owner = "client!ii", name = "Z", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_17 = new Class8(64);

	@OriginalMember(owner = "client!ii", name = "db", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_674 = Static161.method2452("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V")
	public static void method1435() {
		for (@Pc(11) Class5_Sub9 local11 = (Class5_Sub9) Static210.aClass91_7.method2684(); local11 != null; local11 = (Class5_Sub9) Static210.aClass91_7.method2678()) {
			if (local11.aClass5_Sub11_Sub1_2 != null) {
				Static43.aClass5_Sub11_Sub4_1.method2877(local11.aClass5_Sub11_Sub1_2);
				local11.aClass5_Sub11_Sub1_2 = null;
			}
			if (local11.aClass5_Sub11_Sub1_3 != null) {
				Static43.aClass5_Sub11_Sub4_1.method2877(local11.aClass5_Sub11_Sub1_3);
				local11.aClass5_Sub11_Sub1_3 = null;
			}
		}
		Static210.aClass91_7.method2682();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V")
	public static void method1438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class69 local8 = Static201.method1363(arg1, arg2);
		if (local8 != null && local8.anObjectArray11 != null) {
			@Pc(17) Class5_Sub10 local17 = new Class5_Sub10();
			local17.anObjectArray3 = local8.anObjectArray11;
			local17.aClass69_3 = local8;
			Static184.method2781(local17);
		}
		Static22.anInt2837 = arg0;
		Static28.aBoolean32 = true;
		Static14.anInt301 = arg1;
		Static133.anInt2781 = arg2;
		Static184.method2779(local8);
	}

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "(I)V")
	public static void method1439() {
		@Pc(1) Object local1 = Static46.anObject1;
		synchronized (Static46.anObject1) {
			if (Static47.anInt4217 != 0) {
				Static47.anInt4217 = 1;
				try {
					Static46.anObject1.wait();
				} catch (@Pc(16) InterruptedException local16) {
				}
			}
		}
	}
}
