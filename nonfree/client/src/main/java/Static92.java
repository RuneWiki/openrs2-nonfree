import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
	public static int anInt2170;

	@OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
	public static int anInt2174 = -1;

	@OriginalMember(owner = "client!jc", name = "ab", descriptor = "Lclient!kh;")
	private static Class60 aClass60_701 = Static200.method3116("To create a new account you need to");

	@OriginalMember(owner = "client!jc", name = "cb", descriptor = "I")
	public static int anInt2176 = -1;

	@OriginalMember(owner = "client!jc", name = "gb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_702 = aClass60_701;

	@OriginalMember(owner = "client!jc", name = "hb", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(B)Lclient!nb;")
	public static Class1_Sub1_Sub6_Sub1 method1614() {
		@Pc(13) int local13 = Static10.anIntArray46[0] * Static181.anIntArray504[0];
		@Pc(16) int[] local16 = new int[local13];
		@Pc(20) byte[] local20 = Static96.aByteArrayArray4[0];
		for (@Pc(31) int local31 = 0; local31 < local13; local31++) {
			local16[local31] = Static110.anIntArray317[local20[local31] & 0xFF];
		}
		@Pc(66) Class1_Sub1_Sub6_Sub1 local66 = new Class1_Sub1_Sub6_Sub1(Static97.anInt2261, Static176.anInt777, Static91.anIntArray251[0], Static97.anIntArray263[0], Static181.anIntArray504[0], Static10.anIntArray46[0], local16);
		Static43.method711();
		return local66;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!gg;Z)V")
	public static void method1615(@OriginalArg(1) Class1_Sub11 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(7) int local7 = (int) arg0.aLong150;
		@Pc(16) int local16 = arg0.anInt1626;
		arg0.method3530();
		if (arg1) {
			Static181.method2861(local16);
		}
		method1617(local16);
		@Pc(33) Class6 local33 = Static107.method1857(local7);
		if (local33 != null) {
			Static57.method1068(local33);
		}
		Static162.aBoolean261 = false;
		Static91.anInt2134 = 0;
		Static191.method2989(Static29.anInt709, Static102.anInt2345, Static108.anInt2506, Static89.anInt2075);
		if (Static83.anInt1958 != -1) {
			Static140.method2400(Static83.anInt1958, 1);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!kh;ILclient!ai;Lclient!kh;)Lclient!nb;")
	public static Class1_Sub1_Sub6_Sub1 method1616(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Class60 arg2) {
		@Pc(15) int local15 = arg1.method3222(arg0);
		@Pc(21) int local21 = arg1.method3240(arg2, local15);
		return Static200.method3119(local21, local15, arg1);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
	private static void method1617(@OriginalArg(0) int arg0) {
		for (@Pc(4) Class1_Sub16 local4 = (Class1_Sub16) Static163.aClass33_13.method1067(); local4 != null; local4 = (Class1_Sub16) Static163.aClass33_13.method1070()) {
			if ((long) arg0 == (local4.aLong150 >> 48 & 0xFFFFL)) {
				local4.method3530();
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)Lclient!ah;")
	public static Class6 method1619(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class6 local14 = Static107.method1857(arg0);
		if (arg1 == -1) {
			return local14;
		} else if (local14 == null || local14.aClass6Array1 == null || arg1 >= local14.aClass6Array1.length) {
			return null;
		} else {
			return local14.aClass6Array1[arg1];
		}
	}
}
