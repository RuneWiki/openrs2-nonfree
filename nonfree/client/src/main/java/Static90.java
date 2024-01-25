import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dba", name = "h", descriptor = "[I")
	public static int[] anIntArray402;

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "Z")
	public static boolean aBoolean359 = false;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BIII)V")
	public static void method4172(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1003) {
			Static199.method3318(Static227.aClass195_5, arg2, arg0);
		} else if (arg1 == 1001) {
			Static199.method3318(Static572.aClass195_12, arg2, arg0);
		} else if (arg1 == 1010) {
			Static199.method3318(Static223.aClass195_4, arg2, arg0);
		} else if (arg1 == 1006) {
			Static199.method3318(Static284.aClass195_9, arg2, arg0);
			return;
		} else if (arg1 == 1011) {
			Static199.method3318(Static279.aClass195_8, arg2, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIII)V")
	public static void method4173(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class6_Sub5_Sub8 local11 = Static49.method760(11, arg2);
		local11.method3256();
		local11.anInt3740 = arg1;
		local11.anInt3739 = arg0;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)Lclient!hl;")
	public static Class133 method4174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static113.aClass133ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static113.aClass133ArrayArrayArray1[0][arg1][arg2] != null && Static113.aClass133ArrayArrayArray1[0][arg1][arg2].aClass133_1 != null;
			if (local28 && arg0 >= Static431.anInt7712 - 1) {
				return null;
			}
			Static256.method3972(arg0, arg1, arg2);
		}
		return Static113.aClass133ArrayArrayArray1[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BLclient!uq;)Z")
	public static boolean method4175(@OriginalArg(1) Interface22 arg0) {
		@Pc(10) Class192 local10 = Static85.aClass27_1.method516(arg0.method7171());
		if (local10.anInt5573 == -1) {
			return true;
		} else {
			@Pc(31) Class158 local31 = Static242.aClass274_3.method6292(local10.anInt5573);
			return local31.anInt4581 == -1 ? true : local31.method3899();
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BLclient!uea;ILclient!lt;IILclient!kw;I)V")
	public static void method4176(@OriginalArg(1) Class15_Sub2_Sub4_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class192 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15_Sub2_Sub4_Sub1 arg5, @OriginalArg(7) int arg6) {
		@Pc(9) Class6_Sub34 local9 = new Class6_Sub34();
		local9.anInt6887 = arg4;
		local9.anInt6879 = arg3 << 9;
		local9.anInt6886 = arg6 << 9;
		if (arg2 != null) {
			local9.aClass192_1 = arg2;
			@Pc(30) int local30 = arg2.anInt5577;
			@Pc(33) int local33 = arg2.anInt5570;
			if (arg1 == 1 || arg1 == 3) {
				local30 = arg2.anInt5570;
				local33 = arg2.anInt5577;
			}
			local9.anInt6880 = arg3 + local30 << 9;
			local9.anInt6881 = arg2.anInt5601;
			local9.aBoolean474 = arg2.aBoolean399;
			local9.anInt6875 = local33 + arg6 << 9;
			local9.anInt6876 = arg2.anInt5613 << 9;
			local9.aBoolean473 = arg2.aBoolean395;
			local9.anInt6877 = arg2.anInt5572;
			local9.anInt6883 = arg2.anInt5605;
			local9.anInt6882 = arg2.anInt5599;
			local9.anIntArray485 = arg2.anIntArray427;
			if (arg2.lb != null) {
				local9.aBoolean472 = true;
				local9.method5517();
			}
			if (local9.anIntArray485 != null) {
				local9.anInt6873 = (int) (Math.random() * (double) (local9.anInt6881 - local9.anInt6883)) + local9.anInt6883;
			}
			Static315.aClass298_124.method6812(local9);
		} else if (arg5 != null) {
			local9.aClass15_Sub2_Sub4_Sub1_1 = arg5;
			@Pc(137) Class88 local137 = arg5.aClass88_1;
			if (local137.anIntArray182 != null) {
				local9.aBoolean472 = true;
				local137 = local137.method1940(Static65.aClass51_1);
			}
			if (local137 != null) {
				local9.anInt6875 = arg6 + local137.anInt2171 << 9;
				local9.anInt6880 = arg3 + local137.anInt2171 << 9;
				local9.anInt6877 = Static276.method4135(arg5);
				local9.aBoolean473 = local137.aBoolean147;
				local9.anInt6876 = local137.anInt2152 << 9;
				local9.anInt6882 = local137.anInt2169;
			}
			Static377.aClass298_144.method6812(local9);
		} else if (arg0 != null) {
			local9.aClass15_Sub2_Sub4_Sub2_1 = arg0;
			local9.anInt6880 = arg3 + arg0.method7135() << 9;
			local9.anInt6875 = arg6 + arg0.method7135() << 9;
			local9.anInt6877 = Static69.method979(arg0);
			local9.anInt6876 = arg0.anInt9025 << 9;
			local9.anInt6882 = arg0.anInt9006;
			local9.aBoolean473 = arg0.aBoolean583;
			Static149.aClass234_31.method5466((long) arg0.anInt8924, local9);
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIZIIII)V")
	public static void method4177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (Static58.aClass6_Sub17_Sub1_1.anInt9279 != 0 && arg1 != 0 && Static300.anInt5490 < 50 && arg2 != -1) {
			Static486.aClass152Array1[Static300.anInt5490++] = new Class152((byte) 2, arg2, arg1, arg4, arg0, arg3);
		}
	}
}
