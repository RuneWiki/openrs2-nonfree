import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Lclient!nb;")
	public static Class24 aClass24_17;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1 aClass5_Sub1_Sub10_Sub1_21;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Lclient!oa;")
	public static Class7 aClass7_63;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "Lclient!fc;")
	public static Class24_Sub1 aClass24_Sub1_18;

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "Lclient!nb;")
	public static Class24 aClass24_18;

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "Lclient!fc;")
	public static Class24_Sub1 aClass24_Sub1_19;

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
	public static int[] anIntArray254 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
	public static int anInt2058 = -1;

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1036 = Static38.method736("slide:");

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1035 = aClass71_1036;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
	public static int anInt2060 = 0;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "[Lclient!ua;")
	public static Class65[] aClass65Array1 = new Class65[50];

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "J")
	public static long aLong76 = 0L;

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
	public static int anInt2064 = 0;

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "Lclient!qa;")
	public static Class54 aClass54_34 = new Class54(64);

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1037 = Static38.method736("::clientdrop");

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IJ)Lclient!vc;")
	public static Class71 method1396(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) long local27 = arg0;
			@Pc(29) int local29 = 0;
			while (local27 != 0L) {
				local29++;
				local27 /= 37L;
			}
			@Pc(45) byte[] local45 = new byte[local29];
			while (arg0 != 0L) {
				@Pc(49) long local49 = arg0;
				arg0 /= 37L;
				local29--;
				local45[local29] = Static48.aByteArray9[(int) (local49 - arg0 * 37L)];
			}
			@Pc(76) Class71 local76 = new Class71();
			local76.aByteArray28 = local45;
			local76.anInt2736 = local45.length;
			return local76;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLclient!nb;Lclient!nb;BI)Lclient!dc;")
	public static Class5_Sub1_Sub5 method1398(@OriginalArg(1) Class24 arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(4) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(17) int[] local17 = arg0.method669(arg2);
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(29) byte[] local29 = arg0.method653(arg2, local17[local19]);
			if (local29 == null) {
				local7 = false;
			} else {
				@Pc(49) int local49 = (local29[0] & 0xFF) << 8 | local29[1] & 0xFF;
				@Pc(65) byte[] local65 = arg1.method653(local49, 0);
				if (local65 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class5_Sub1_Sub5(arg0, arg1, arg2, false);
		} catch (@Pc(87) Exception local87) {
			return null;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!me;Lclient!me;IIIIIIBIII)Lclient!me;")
	public static Class5_Sub1_Sub11 method1400(@OriginalArg(0) Class5_Sub1_Sub11[] arg0, @OriginalArg(1) Class5_Sub1_Sub11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg3 > arg6 || arg7 > arg4 || arg5 <= arg6 || arg9 <= arg4) {
			return null;
		}
		for (@Pc(42) int local42 = 0; local42 < arg0.length; local42++) {
			@Pc(48) Class5_Sub1_Sub11 local48 = arg0[local42];
			if (local48 != null && arg10 == local48.anInt1785 && !Static6.method159(local48) && local48 != arg1) {
				@Pc(71) int local71 = arg3 + local48.anInt1804 - arg8;
				@Pc(80) int local80 = local48.anInt1817 + arg7 - arg2;
				if (local48.anInt1790 == 0) {
					@Pc(107) Class5_Sub1_Sub11 local107 = method1400(arg0, arg1, local48.anInt1774, local71, arg4, local71 + local48.anInt1776, arg6, local80, local48.anInt1778, local80 + local48.anInt1801, local48.anInt1760);
					if (local107 != null) {
						return local107;
					}
					if (local48.aClass5_Sub1_Sub11Array2 != null) {
						local107 = method1400(local48.aClass5_Sub1_Sub11Array2, arg1, local48.anInt1774, local71, arg4, local71 + local48.anInt1776, arg6, local80, local48.anInt1778, local48.anInt1801 + local80, local48.anInt1760);
						if (local107 != null) {
							return local107;
						}
					}
				}
				if (Static60.method1039(Static23.method545(local48)) && arg6 >= local71 && arg4 >= local80 && local48.anInt1776 + local71 > arg6 && local48.anInt1801 + local80 > arg4) {
					return local48;
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!eb;I)V")
	public static void method1401(@OriginalArg(1) Class5_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(11) Class5_Sub2 local11 = Static89.aClass5_Sub2Array1[local7];
		if (local11 == null) {
			Static109.aClass5_Sub2Array2[local7] = arg0;
		} else {
			local11.aClass5_Sub2_3 = arg0;
		}
		Static89.aClass5_Sub2Array1[local7] = arg0;
		arg0.anInt1630 = arg1;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIB)I")
	public static int method1404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V")
	public static void method1405() {
		anIntArray254 = null;
		aClass5_Sub1_Sub10_Sub1_21 = null;
		aClass7_63 = null;
		aClass71_1037 = null;
		aClass71_1036 = null;
		aClass24_18 = null;
		aClass24_Sub1_19 = null;
		aFont1 = null;
		aClass54_34 = null;
		aClass65Array1 = null;
		aClass24_17 = null;
		aClass24_Sub1_18 = null;
		aClass71_1035 = null;
	}
}
