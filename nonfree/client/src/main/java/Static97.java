import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!ta", name = "Z", descriptor = "Lclient!se;")
	public static Class11 aClass11_1;

	@OriginalMember(owner = "client!ta", name = "ab", descriptor = "[Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1[] aClass1_Sub1_Sub6_Sub1Array9;

	@OriginalMember(owner = "client!ta", name = "lb", descriptor = "[I")
	public static int[] anIntArray344;

	@OriginalMember(owner = "client!ta", name = "fb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1429 = Static15.method178("On");

	@OriginalMember(owner = "client!ta", name = "Y", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1428 = aClass23_1429;

	@OriginalMember(owner = "client!ta", name = "bb", descriptor = "I")
	public static int anInt2526 = 127;

	@OriginalMember(owner = "client!ta", name = "db", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!ta", name = "gb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1430 = Static15.method178("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!ta", name = "hb", descriptor = "I")
	public static int anInt2529 = 0;

	@OriginalMember(owner = "client!ta", name = "kb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1431 = Static15.method178("Fps:");

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
	public static void method1642() {
		aClass23_1428 = null;
		aClass11_1 = null;
		aClass23_1430 = null;
		aClass1_Sub1_Sub6_Sub1Array9 = null;
		aClass23_1429 = null;
		anIntArray344 = null;
		aClass23_1431 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)Lclient!cb;")
	public static Class1_Sub1_Sub4 method1645(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub1_Sub4 local6 = (Class1_Sub1_Sub4) Static11.aClass5_8.method98((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static37.aClass55_19.method1867(arg0, 6);
		local6 = new Class1_Sub1_Sub4();
		local6.anInt330 = arg0;
		if (local25 != null) {
			local6.method170(new Class1_Sub5(local25));
		}
		local6.method177();
		if (local6.aBoolean15) {
			local6.aBoolean14 = false;
			local6.aBoolean21 = false;
		}
		Static11.aClass5_8.method97(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!rc;IIIIII)V")
	public static void method1646(@OriginalArg(1) Class1_Sub5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(37) int local37;
		if (arg1 < 0 || arg1 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				local37 = arg0.method716();
				if (local37 == 0) {
					return;
				}
				if (local37 == 1) {
					arg0.method716();
					return;
				}
				if (local37 <= 49) {
					arg0.method716();
				}
			}
			return;
		}
		Static95.aByteArrayArrayArray5[arg6][arg1][arg4] = 0;
		while (true) {
			local37 = arg0.method716();
			if (local37 == 0) {
				if (arg6 == 0) {
					Static72.anIntArrayArrayArray5[0][arg1][arg4] = -Static94.method1607(arg4 + arg3 + 556238, arg2 + 932731 + arg1) * 8;
					return;
				} else {
					Static72.anIntArrayArrayArray5[arg6][arg1][arg4] = Static72.anIntArrayArrayArray5[arg6 - 1][arg1][arg4] - 240;
					return;
				}
			}
			if (local37 == 1) {
				@Pc(99) int local99 = arg0.method716();
				if (local99 == 1) {
					local99 = 0;
				}
				if (arg6 == 0) {
					Static72.anIntArrayArrayArray5[0][arg1][arg4] = -local99 * 8;
					return;
				}
				Static72.anIntArrayArrayArray5[arg6][arg1][arg4] = Static72.anIntArrayArrayArray5[arg6 - 1][arg1][arg4] - local99 * 8;
				return;
			}
			if (local37 <= 49) {
				Static61.aByteArrayArrayArray3[arg6][arg1][arg4] = arg0.method699();
				Static109.aByteArrayArrayArray8[arg6][arg1][arg4] = (byte) ((local37 - 2) / 4);
				Static108.aByteArrayArrayArray7[arg6][arg1][arg4] = (byte) (arg5 + local37 - 2 & 0x3);
			} else if (local37 <= 81) {
				Static95.aByteArrayArrayArray5[arg6][arg1][arg4] = (byte) (local37 - 49);
			} else {
				Static21.aByteArrayArrayArray2[arg6][arg1][arg4] = (byte) (local37 - 81);
			}
		}
	}
}
