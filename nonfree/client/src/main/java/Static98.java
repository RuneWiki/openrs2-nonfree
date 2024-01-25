import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ep", name = "s", descriptor = "Lclient!s;")
	public static final Class217 aClass217_45 = new Class217(14, 4);

	@OriginalMember(owner = "client!ep", name = "x", descriptor = "J")
	public static long aLong67 = 0L;

	@OriginalMember(owner = "client!ep", name = "z", descriptor = "Lclient!os;")
	public static final Class182 aClass182_76 = new Class182(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!ep", name = "A", descriptor = "I")
	public static int anInt2009 = 0;

	@OriginalMember(owner = "client!ep", name = "D", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_40 = new Class27(18, 8);

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(FIFFI)F")
	public static float method1770(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(15) float[] local15 = Static420.aFloatArrayArray6[arg1];
		return local15[2] * arg0 + local15[1] * arg3 + local15[0] * arg2;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IC)Z")
	public static boolean method1771(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static70.method1359(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static173.aCharArray2;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(46) char[] local46 = Static376.aCharArray6;
			for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
				@Pc(54) char local54 = local46[local48];
				if (local54 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BZ)V")
	public static void method1773(@OriginalArg(1) boolean arg0) {
		Static239.anInt4238 = 0;
		Static216.anInt4132 = 0;
		Static281.method5145();
		Static318.method4371(arg0);
		Static362.method4864();
		@Pc(18) boolean local18 = false;
		@Pc(26) int local26;
		for (@Pc(20) int local20 = 0; local20 < Static239.anInt4238; local20++) {
			local26 = Static409.anIntArray664[local20];
			@Pc(33) Class10_Sub26 local33 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local26);
			@Pc(36) Class24_Sub3_Sub2_Sub1 local36 = local33.aClass24_Sub3_Sub2_Sub1_2;
			if (Static35.aBoolean37 && Static382.method5566(local26)) {
				Static405.method5343();
			}
			if (local36.anInt6234 != Static400.anInt6752) {
				if (local36.aClass222_1.method4945()) {
					Static50.method853(local36);
				}
				local36.method2892(null);
				local33.method6033();
				local18 = true;
			}
		}
		if (local18) {
			Static134.anInt2764 = Static424.aClass167_33.method3698();
			Static424.aClass167_33.method3703(Static149.aClass10_Sub26Array1);
		}
		if (Static203.aClass10_Sub8_Sub2_1.anInt2989 != Static10.anInt154) {
			throw new RuntimeException("gnp1 pos:" + Static203.aClass10_Sub8_Sub2_1.anInt2989 + " psize:" + Static10.anInt154);
		}
		for (local26 = 0; local26 < Static219.anInt4155; local26++) {
			if (Static424.aClass167_33.method3709((long) Static57.anIntArray91[local26]) == null) {
				throw new RuntimeException("gnp2 pos:" + local26 + " size:" + Static219.anInt4155);
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)V")
	public static void method1774() {
		Static135.method5400(Static458.aClass89_14);
		Static233.anInt4304++;
		if (Static44.aBoolean49 && Static48.aBoolean51) {
			@Pc(28) int local28 = Static113.aClass13_1.method4116();
			@Pc(32) int local32 = Static113.aClass13_1.method4123();
			local32 -= Static182.anInt3704;
			local28 -= Static200.anInt3972;
			if (local28 < Static415.anInt6935) {
				local28 = Static415.anInt6935;
			}
			if (Static385.anInt6587 > local32) {
				local32 = Static385.anInt6587;
			}
			if (Static458.aClass89_14.anInt2703 + local28 > Static415.anInt6935 - -Static67.aClass89_2.anInt2703) {
				local28 = Static67.aClass89_2.anInt2703 + Static415.anInt6935 - Static458.aClass89_14.anInt2703;
			}
			if (Static385.anInt6587 + Static67.aClass89_2.anInt2682 < Static458.aClass89_14.anInt2682 + local32) {
				local32 = Static67.aClass89_2.anInt2682 + Static385.anInt6587 - Static458.aClass89_14.anInt2682;
			}
			@Pc(106) int local106 = Static67.aClass89_2.anInt2725 + local28 - Static415.anInt6935;
			@Pc(114) int local114 = Static67.aClass89_2.anInt2699 + local32 - Static385.anInt6587;
			@Pc(169) Class10_Sub40 local169;
			if (Static113.aClass13_1.method4117()) {
				if (Static458.aClass89_14.anInt2736 < Static233.anInt4304) {
					@Pc(131) int local131 = local28 - Static310.anInt5396;
					@Pc(136) int local136 = local32 - Static313.anInt5430;
					if (local131 > Static458.aClass89_14.anInt2683 || local131 < -Static458.aClass89_14.anInt2683 || Static458.aClass89_14.anInt2683 < local136 || -Static458.aClass89_14.anInt2683 > local136) {
						Static95.aBoolean121 = true;
					}
				}
				if (Static458.aClass89_14.anObjectArray22 != null && Static95.aBoolean121) {
					local169 = new Class10_Sub40();
					local169.anInt6386 = local114;
					local169.aClass89_12 = Static458.aClass89_14;
					local169.anInt6391 = local106;
					local169.anObjectArray36 = Static458.aClass89_14.anObjectArray22;
					Static79.method1501(local169);
					return;
				}
			} else {
				if (Static95.aBoolean121) {
					Static456.method6051();
					if (Static458.aClass89_14.anObjectArray9 != null) {
						local169 = new Class10_Sub40();
						local169.anInt6391 = local106;
						local169.anObjectArray36 = Static458.aClass89_14.anObjectArray9;
						local169.anInt6386 = local114;
						local169.aClass89_12 = Static458.aClass89_14;
						local169.aClass89_11 = Static356.aClass89_10;
						Static79.method1501(local169);
					}
					if (Static356.aClass89_10 != null && Static56.method1005(Static458.aClass89_14) != null) {
						Static297.method4133(Static356.aClass89_10, Static458.aClass89_14);
					}
				} else if ((Static334.anInt5660 == 1 || Static282.method4003()) && Static207.anInt4055 > 2) {
					Static130.method2266(Static313.anInt5430 + Static182.anInt3704, Static200.anInt3972 + Static310.anInt5396);
				} else if (Static51.method865()) {
					Static130.method2266(Static182.anInt3704 + Static313.anInt5430, Static200.anInt3972 - -Static310.anInt5396);
				}
				Static458.aClass89_14 = null;
			}
		} else if (Static233.anInt4304 > 1) {
			Static458.aClass89_14 = null;
		}
	}
}
