import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	public static int anInt4194;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "[I")
	public static int[] anIntArray696;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!vd;")
	public static Class80 aClass80_103;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1472 = Static170.method3101("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1470 = aClass28_1472;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "[I")
	public static int[] anIntArray695 = new int[50];

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray112 = new byte[250][];

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1471 = Static170.method3101("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
	public static int anInt4199 = -1;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "[I")
	public static int[] anIntArray697 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!gf;)Lclient!gf;")
	public static Class33 method3164(@OriginalArg(1) Class33 arg0) {
		@Pc(9) int local9 = Static28.method746(Static4.method97(arg0));
		if (local9 == 0) {
			return null;
		}
		for (@Pc(18) int local18 = 0; local18 < local9; local18++) {
			arg0 = Static19.method576(arg0.anInt1488);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public static void method3166() {
		anIntArray696 = null;
		aClass80_103 = null;
		aByteArrayArray112 = null;
		aClass28_1470 = null;
		aClass28_1471 = null;
		anIntArray695 = null;
		aClass28_1472 = null;
		anIntArray697 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIILclient!kb;JLclient!kb;Lclient!kb;)V")
	public static void method3168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub2_Sub1 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class3_Sub2_Sub1 arg6, @OriginalArg(7) Class3_Sub2_Sub1 arg7) {
		@Pc(3) Class35 local3 = new Class35();
		local3.aClass3_Sub2_Sub1_4 = arg4;
		local3.anInt1551 = arg1 * 128 + 64;
		local3.anInt1553 = arg2 * 128 + 64;
		local3.anInt1558 = arg3;
		local3.aLong51 = arg5;
		local3.aClass3_Sub2_Sub1_5 = arg6;
		local3.aClass3_Sub2_Sub1_6 = arg7;
		@Pc(34) short local34 = 0;
		@Pc(42) Class3_Sub20 local42 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt3336; local46++) {
				if ((local42.aClass32Array3[local46].aLong49 & 0x400000L) == 4194304L && local42.aClass32Array3[local46].aClass3_Sub2_Sub1_3 instanceof Class3_Sub2_Sub1_Sub1) {
					@Pc(71) Class3_Sub2_Sub1_Sub1 local71 = (Class3_Sub2_Sub1_Sub1) local42.aClass32Array3[local46].aClass3_Sub2_Sub1_3;
					local71.method191();
					if (local71.aShort36 < local34) {
						local34 = local71.aShort36;
					}
				}
			}
		}
		local3.anInt1560 = -local34;
		if (Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub20(arg0, arg1, arg2);
		}
		Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass35_1 = local3;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)I")
	public static int method3169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) long local15 = (long) (arg0 + (arg1 << 16));
		return Static26.aClass3_Sub2_Sub6_1 != null && Static26.aClass3_Sub2_Sub6_1.aLong144 == local15 ? Static43.aClass3_Sub8_2.anInt1948 * 99 / (Static43.aClass3_Sub8_2.aByteArray19.length - Static26.aClass3_Sub2_Sub6_1.aByte2) + 1 : 0;
	}
}
