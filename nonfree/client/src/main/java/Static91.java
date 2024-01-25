import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!er", name = "C", descriptor = "I")
	public static int anInt2991;

	@OriginalMember(owner = "client!er", name = "K", descriptor = "I")
	public static int anInt2998;

	@OriginalMember(owner = "client!er", name = "L", descriptor = "[I")
	public static int[] anIntArray351;

	@OriginalMember(owner = "client!er", name = "z", descriptor = "I")
	public static int anInt2989 = -1;

	@OriginalMember(owner = "client!er", name = "B", descriptor = "Lclient!us;")
	public static final Class234 aClass234_65 = new Class234(86, 9);

	@OriginalMember(owner = "client!er", name = "J", descriptor = "J")
	public static volatile long aLong116 = 0L;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2642(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg3; local12 <= arg0; local12++) {
			for (@Pc(16) int local16 = arg2; local16 <= arg4; local16++) {
				if (Static97.anIntArrayArray21[local12][local16] == arg1 && Static387.anIntArrayArray59[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!rp;I)Lclient!jd;")
	public static Class3_Sub1 method2643(@OriginalArg(0) Class3_Sub5 arg0) {
		arg0.method2739();
		@Pc(24) int local24 = arg0.method2739();
		@Pc(28) Class3_Sub1 local28 = Static369.method5525(local24);
		local28.anInt6208 = arg0.method2739();
		@Pc(37) int local37 = arg0.method2739();
		for (@Pc(39) int local39 = 0; local39 < local37; local39++) {
			@Pc(45) int local45 = arg0.method2739();
			local28.method5545(arg0, local45);
		}
		local28.method5552();
		return local28;
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(B)V")
	public static void method2645() {
		Static113.aBoolean163 = true;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIZIIIII)V")
	public static void method2646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg0;
		@Pc(21) int local21 = arg1 - arg0;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg1 << 1;
		@Pc(66) int local66 = local21 << 1;
		@Pc(75) int local75 = local41 + local25 * (1 - local57);
		@Pc(84) int local84 = local29 - (local57 - 1) * local45;
		@Pc(92) int local92 = local49 + (1 - local66) * local33;
		@Pc(101) int local101 = local37 - (local66 - 1) * local53;
		@Pc(105) int local105 = local25 << 2;
		@Pc(109) int local109 = local29 << 2;
		@Pc(113) int local113 = local33 << 2;
		@Pc(117) int local117 = local37 << 2;
		@Pc(121) int local121 = local41 * 3;
		@Pc(127) int local127 = (local57 - 3) * local45;
		@Pc(131) int local131 = local49 * 3;
		@Pc(137) int local137 = local53 * (local66 - 3);
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = (arg1 - 1) * local105;
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = local113 * (local21 - 1);
		@Pc(157) int[] local157 = Static325.anIntArrayArray50[arg3];
		Static349.method5265(arg5 - arg2, arg5 + -local16, arg4, local157);
		Static349.method5265(arg5 - local16, local16 + arg5, arg6, local157);
		Static349.method5265(arg5 + local16, arg2 + arg5, arg4, local157);
		while (local9 > 0) {
			@Pc(200) boolean local200 = local21 >= local9;
			if (local200) {
				if (local92 < 0) {
					while (local92 < 0) {
						local92 += local131;
						local101 += local147;
						local131 += local117;
						local147 += local117;
						local11++;
					}
				}
				if (local101 < 0) {
					local101 += local147;
					local92 += local131;
					local11++;
					local131 += local117;
					local147 += local117;
				}
				local92 += -local153;
				local101 += -local137;
				local137 -= local113;
				local153 -= local113;
			}
			if (local75 < 0) {
				while (local75 < 0) {
					local75 += local121;
					local84 += local139;
					local7++;
					local139 += local109;
					local121 += local109;
				}
			}
			if (local84 < 0) {
				local75 += local121;
				local84 += local139;
				local139 += local109;
				local121 += local109;
				local7++;
			}
			local84 += -local127;
			local75 += -local145;
			local145 -= local105;
			local127 -= local105;
			local9--;
			@Pc(336) int local336 = arg3 - local9;
			@Pc(340) int local340 = local9 + arg3;
			@Pc(344) int local344 = local7 + arg5;
			@Pc(348) int local348 = arg5 - local7;
			if (local200) {
				@Pc(354) int local354 = local11 + arg5;
				@Pc(359) int local359 = arg5 - local11;
				Static349.method5265(local348, local359, arg4, Static325.anIntArrayArray50[local336]);
				Static349.method5265(local359, local354, arg6, Static325.anIntArrayArray50[local336]);
				Static349.method5265(local354, local344, arg4, Static325.anIntArrayArray50[local336]);
				Static349.method5265(local348, local359, arg4, Static325.anIntArrayArray50[local340]);
				Static349.method5265(local359, local354, arg6, Static325.anIntArrayArray50[local340]);
				Static349.method5265(local354, local344, arg4, Static325.anIntArrayArray50[local340]);
			} else {
				Static349.method5265(local348, local344, arg4, Static325.anIntArrayArray50[local336]);
				Static349.method5265(local348, local344, arg4, Static325.anIntArrayArray50[local340]);
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIB)I")
	public static int method2649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = local12 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local12;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLjava/awt/Canvas;ILclient!wp;)Lclient!np;")
	public static Class155 method2650(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface10 arg2) {
		return new Class155_Sub2(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(Lclient!rp;I)Ljava/lang/String;")
	public static String method2651(@OriginalArg(0) Class3_Sub5 arg0) {
		return Static190.method3022(arg0);
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
	public static void method2652() {
		Static302.method4682();
		Static278.aClass155_6 = null;
		Static118.aClass8_3 = null;
		Static280.aClass102ArrayArray1 = null;
		Static53.aClass8_1 = null;
		Static71.aClass8_2 = null;
	}
}
