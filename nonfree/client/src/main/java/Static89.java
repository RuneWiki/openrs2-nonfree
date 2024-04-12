import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Z")
	public static boolean aBoolean174;

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_21;

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_22;

	@OriginalMember(owner = "client!ub", name = "U", descriptor = "Lclient!ob;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!ub", name = "W", descriptor = "[I")
	public static int[] anIntArray503;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)Z", line = 17)
	public static boolean method1561() {
		@Pc(10) Class30 local10 = Class41.aClass30_1;
		synchronized (Class41.aClass30_1) {
			if (Class17.anInt437 == Class27.anInt1094) {
				return false;
			} else {
				Static35.anInt935 = Class54.anIntArray453[Class27.anInt1094];
				Static4.anInt135 = Class2_Sub2_Sub16.anIntArray545[Class27.anInt1094];
				Class27.anInt1094 = Class27.anInt1094 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V", line = 37)
	public static void method1562() {
		aClass2_Sub2_Sub2_Sub3_21 = null;
		Class2_Sub12.aClass40_673 = null;
		Class2_Sub12.aClass40_669 = null;
		Class2_Sub12.aClass40_672 = null;
		aClass42_1 = null;
		Class2_Sub12.aClass40_668 = null;
		Class2_Sub12.aClass2_Sub3_5 = null;
		Class2_Sub12.aClass40_670 = null;
		Class2_Sub12.aClass40_671 = null;
		Class2_Sub12.anIntArray500 = null;
		aClass2_Sub2_Sub2_Sub3_22 = null;
		Class2_Sub12.aLongArray6 = null;
		anIntArray503 = null;
		Class2_Sub12.anIntArray501 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([Lclient!o;III)Lclient!o;", line = 69)
	public static Class40 method1563(@OriginalArg(0) Class40[] arg0, @OriginalArg(3) int arg1) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			if (arg0[local7] == null) {
				arg0[local7] = Class2_Sub2_Sub13.aClass40_462;
			}
			local5 += arg0[local7].anInt1783;
		}
		@Pc(46) byte[] local46 = new byte[local5];
		@Pc(48) int local48 = 0;
		@Pc(58) Class40 local58;
		for (@Pc(50) int local50 = 0; local50 < arg1; local50++) {
			local58 = arg0[local50];
			Static107.method993(local58.aByteArray14, 0, local46, local48, local58.anInt1783);
			local48 += local58.anInt1783;
		}
		local58 = new Class40();
		local58.aByteArray14 = local46;
		local58.anInt1783 = local5;
		return local58;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Z", line = 120)
	public static boolean method1564(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0 && Class2_Sub2_Sub9.anInt1012 == arg1) {
			return true;
		} else if (arg0 == 1 && Class2_Sub2_Sub12_Sub1_Sub2.anInt2340 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && arg1 == Class32.anInt1501;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILclient!sd;[BI[Lclient!fb;)V", line = 176)
	public static void method1565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class55 arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) Class20[] arg4) {
		@Pc(10) Class2_Sub3 local10 = new Class2_Sub3(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method1698();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(28) int local28 = local10.method1698();
				if (local28 == 0) {
					break;
				}
				local24 += local28 - 1;
				@Pc(40) int local40 = local24 & 0x3F;
				@Pc(44) int local44 = local24 >> 12;
				@Pc(48) int local48 = local10.method1708();
				@Pc(52) int local52 = local48 >> 2;
				@Pc(56) int local56 = local48 & 0x3;
				@Pc(62) int local62 = local24 >> 6 & 0x3F;
				@Pc(66) int local66 = local62 + arg1;
				@Pc(70) int local70 = arg0 + local40;
				if (local66 > 0 && local70 > 0 && local66 < 103 && local70 < 103) {
					@Pc(87) int local87 = local44;
					if ((Class34.aByteArrayArrayArray7[1][local66][local70] & 0x2) == 2) {
						local87 = local44 - 1;
					}
					@Pc(101) Class20 local101 = null;
					if (local87 >= 0) {
						local101 = arg4[local87];
					}
					Static75.method1353(local44, local12, local66, local101, local56, local52, arg2, local70);
				}
			}
		}
	}
}
