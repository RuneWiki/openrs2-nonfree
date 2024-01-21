import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!lc", name = "T", descriptor = "[I")
	public static int[] anIntArray226;

	@OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
	public static int anInt2207;

	@OriginalMember(owner = "client!lc", name = "X", descriptor = "I")
	public static int anInt2210;

	@OriginalMember(owner = "client!lc", name = "N", descriptor = "[I")
	public static int[] anIntArray225 = new int[50];

	@OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
	public static int anInt2208 = 0;

	@OriginalMember(owner = "client!lc", name = "Y", descriptor = "[I")
	public static int[] anIntArray227 = new int[2000];

	@OriginalMember(owner = "client!lc", name = "db", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!le;I)V")
	public static void method1501(@OriginalArg(0) Class3_Sub5 arg0) {
		if (arg0.aClass3_Sub9_5 != null) {
			arg0.aClass3_Sub9_5.anInt3889 = 0;
		}
		arg0.aBoolean167 = false;
		for (@Pc(26) Class3_Sub5 local26 = arg0.method2774(); local26 != null; local26 = arg0.method2775()) {
			method1501(local26);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZIBLclient!me;I)V")
	public static void method1502(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) Class44_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(11) long local11 = (long) ((arg2 << 16) + arg0);
		@Pc(17) Class3_Sub2_Sub13 local17 = (Class3_Sub2_Sub13) Static182.aClass54_13.method1602(local11);
		if (local17 != null) {
			return;
		}
		local17 = (Class3_Sub2_Sub13) Static9.aClass54_1.method1602(local11);
		if (local17 != null) {
			return;
		}
		local17 = (Class3_Sub2_Sub13) Static40.aClass54_4.method1602(local11);
		if (local17 == null) {
			if (!arg1) {
				local17 = (Class3_Sub2_Sub13) Static110.aClass54_7.method1602(local11);
				if (local17 != null) {
					return;
				}
			}
			local17 = new Class3_Sub2_Sub13();
			local17.aClass44_Sub1_13 = arg4;
			local17.anInt3281 = arg5;
			local17.aByte8 = arg3;
			if (arg1) {
				Static182.aClass54_13.method1603(local11, local17);
				Static137.anInt3204++;
			} else {
				Static80.aClass7_1.method300(local17);
				Static40.aClass54_4.method1603(local11, local17);
				Static74.anInt1883++;
			}
		} else if (arg1) {
			local17.method2886();
			Static182.aClass54_13.method1603(local11, local17);
			Static74.anInt1883--;
			Static137.anInt3204++;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)I")
	public static int method1503(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 >> 31 & arg0 - 1;
		return local16 + (arg1 + (arg1 >>> 31)) % arg0;
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	public static void method1504() {
		anIntArray227 = null;
		anIntArray226 = null;
		anIntArray225 = null;
	}
}
