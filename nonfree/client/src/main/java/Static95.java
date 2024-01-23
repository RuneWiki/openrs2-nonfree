import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!k", name = "G", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!k", name = "hb", descriptor = "I")
	public static int anInt2353;

	@OriginalMember(owner = "client!k", name = "xb", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_62;

	@OriginalMember(owner = "client!k", name = "D", descriptor = "Lclient!i;")
	public static Class41 aClass41_692 = Static184.method2923(":");

	@OriginalMember(owner = "client!k", name = "F", descriptor = "Lclient!i;")
	private static Class41 aClass41_693 = Static184.method2923("as it was used to break our rules)3");

	@OriginalMember(owner = "client!k", name = "N", descriptor = "[S")
	public static short[] aShortArray67 = new short[256];

	@OriginalMember(owner = "client!k", name = "gb", descriptor = "Lclient!i;")
	private static Class41 aClass41_698 = Static184.method2923("Please remove ");

	@OriginalMember(owner = "client!k", name = "Q", descriptor = "Lclient!i;")
	public static Class41 aClass41_694 = aClass41_698;

	@OriginalMember(owner = "client!k", name = "S", descriptor = "Lclient!i;")
	public static Class41 aClass41_695 = Static184.method2923(" x ");

	@OriginalMember(owner = "client!k", name = "X", descriptor = "Lclient!i;")
	public static Class41 aClass41_696 = aClass41_698;

	@OriginalMember(owner = "client!k", name = "bb", descriptor = "Lclient!i;")
	public static Class41 aClass41_697 = Static184.method2923("; Expires=");

	@OriginalMember(owner = "client!k", name = "nb", descriptor = "Lclient!i;")
	public static Class41 aClass41_699 = Static184.method2923("settings");

	@OriginalMember(owner = "client!k", name = "rb", descriptor = "Lclient!i;")
	public static Class41 aClass41_700 = aClass41_693;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIZII)I")
	public static int method1653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(16) int local16 = arg4;
			arg4 = arg3;
			arg3 = local16;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 1 + 7 - arg4 - arg1;
		} else if (local3 == 2) {
			return 1 + 7 - arg0 - arg3;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIILclient!q;B)V")
	public static void method1654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class80 arg3) {
		if (Static219.anInt4791 < 3) {
			((Class2_Sub2_Sub16_Sub1) Static43.aClass2_Sub2_Sub16_1).method2413(arg1, arg2, arg3.anInt3635, arg3.anInt3660, Static43.aClass2_Sub2_Sub16_1.anInt3493 / 2, Static43.aClass2_Sub2_Sub16_1.anInt3491 / 2, Static183.anInt1324, arg3.anIntArray384, arg3.anIntArray385);
		} else {
			Static64.method1177(arg1, arg2, arg3.anIntArray384, arg3.anIntArray385);
		}
		Static187.aBooleanArray22[arg0] = true;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIII)V")
	public static void method1656(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static204.method3147(arg3 - arg2, arg1, arg2 + arg3, Static3.anIntArrayArray1[arg0]);
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = arg2;
		@Pc(31) int local31 = -1;
		@Pc(34) int local34 = -arg2;
		while (local27 < local29) {
			local31 += 2;
			local34 += local31;
			local27++;
			if (local34 >= 0) {
				local29--;
				local34 -= local29 << 1;
				@Pc(57) int[] local57 = Static3.anIntArrayArray1[local29 + arg0];
				@Pc(64) int[] local64 = Static3.anIntArrayArray1[arg0 - local29];
				@Pc(68) int local68 = local27 + arg3;
				@Pc(73) int local73 = arg3 - local27;
				Static204.method3147(local73, arg1, local68, local57);
				Static204.method3147(local73, arg1, local68, local64);
			}
			@Pc(89) int local89 = arg3 + local29;
			@Pc(94) int local94 = arg3 - local29;
			@Pc(100) int[] local100 = Static3.anIntArrayArray1[arg0 + local27];
			@Pc(107) int[] local107 = Static3.anIntArrayArray1[arg0 - local27];
			Static204.method3147(local94, arg1, local89, local100);
			Static204.method3147(local94, arg1, local89, local107);
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(II)Z")
	public static boolean method1657(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BII)I")
	public static int method1658(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub22 local12 = (Class2_Sub22) Static57.aClass70_3.method2205((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 >= 0 && local12.anIntArray396.length > arg1) {
			return local12.anIntArray396[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1659(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static39.aClass11_1);
		arg0.addMouseMotionListener(Static39.aClass11_1);
		arg0.addFocusListener(Static39.aClass11_1);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(IIIII)V")
	public static void method1664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg1 > arg3) {
			for (local10 = arg3; local10 < arg1; local10++) {
				Static3.anIntArrayArray1[local10][arg2] = arg0;
			}
		} else {
			for (local10 = arg1; local10 < arg3; local10++) {
				Static3.anIntArrayArray1[local10][arg2] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V")
	public static void method1666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class2_Sub2_Sub22 local3 = Static138.method2199(arg0);
		@Pc(10) int local10 = local3.anInt4485;
		@Pc(21) int local21 = local3.anInt4486;
		@Pc(24) int local24 = local3.anInt4489;
		@Pc(31) int local31 = Class2_Sub2_Sub8.anIntArray223[local24 - local21];
		if (arg1 < 0 || arg1 > local31) {
			arg1 = 0;
		}
		local31 <<= local21;
		Static99.anIntArray243[local10] = ~local31 & Static99.anIntArray243[local10] | local31 & arg1 << local21;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!u;B)V")
	public static void method1667(@OriginalArg(0) Class12_Sub3 arg0) {
		@Pc(14) int local14 = arg0.anInt3959 - Static103.anInt2511;
		if (arg0.anInt3964 == 0) {
			arg0.anInt3947 = 1024;
		}
		arg0.anInt3937 = 0;
		if (arg0.anInt3964 == 1) {
			arg0.anInt3947 = 1536;
		}
		if (arg0.anInt3964 == 2) {
			arg0.anInt3947 = 0;
		}
		if (arg0.anInt3964 == 3) {
			arg0.anInt3947 = 512;
		}
		@Pc(62) int local62 = arg0.anInt3923 * 128 + arg0.anInt3932 * 64;
		arg0.anInt3949 += (local62 - arg0.anInt3949) / local14;
		@Pc(84) int local84 = arg0.anInt3932 * 64 + arg0.anInt3942 * 128;
		arg0.anInt3961 += (local84 - arg0.anInt3961) / local14;
	}
}
