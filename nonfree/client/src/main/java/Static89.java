import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
	public static int anInt2047;

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "Z")
	public static boolean aBoolean195 = false;

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString11 = null;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1856(@OriginalArg(0) String arg0) {
		Static234.method3619(0, "", "", "", arg0, 0);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIZILclient!uaa;)V")
	public static void method1860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class345 arg3) {
		@Pc(10) int local10 = arg3.anInt9649;
		@Pc(13) int local13 = arg3.anInt9606;
		if (arg3.aByte130 == 0) {
			arg3.anInt9649 = arg3.anInt9596;
		} else if (arg3.aByte130 == 1) {
			arg3.anInt9649 = arg1 - arg3.anInt9596;
		} else if (arg3.aByte130 == 2) {
			arg3.anInt9649 = arg1 * arg3.anInt9596 >> 14;
		}
		if (arg3.aByte131 == 0) {
			arg3.anInt9606 = arg3.anInt9614;
		} else if (arg3.aByte131 == 1) {
			arg3.anInt9606 = arg0 - arg3.anInt9614;
		} else if (arg3.aByte131 == 2) {
			arg3.anInt9606 = arg3.anInt9614 * arg0 >> 14;
		}
		if (arg3.aByte130 == 4) {
			arg3.anInt9649 = arg3.anInt9645 * arg3.anInt9606 / arg3.anInt9626;
		}
		if (arg3.aByte131 == 4) {
			arg3.anInt9606 = arg3.anInt9626 * arg3.anInt9649 / arg3.anInt9645;
		}
		if (Static202.aBoolean307 && (Static84.method1822(arg3).anInt507 != 0 || arg3.anInt9591 == 0)) {
			if (arg3.anInt9606 < 5 && arg3.anInt9649 < 5) {
				arg3.anInt9649 = 5;
				arg3.anInt9606 = 5;
			} else {
				if (arg3.anInt9649 <= 0) {
					arg3.anInt9649 = 5;
				}
				if (arg3.anInt9606 <= 0) {
					arg3.anInt9606 = 5;
				}
			}
		}
		if (arg3.anInt9644 == Static299.anInt5765) {
			Static655.aClass345_15 = arg3;
		}
		if (arg2 && arg3.anObjectArray14 != null && (local10 != arg3.anInt9649 || local13 != arg3.anInt9606)) {
			@Pc(183) Class5_Sub22 local183 = new Class5_Sub22();
			local183.aClass345_1 = arg3;
			local183.anObjectArray1 = arg3.anObjectArray14;
			Static637.aClass114_66.method2807(local183);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "([BI)Lclient!fba;")
	public static Class5_Sub3_Sub3 method1862(@OriginalArg(0) byte[] arg0) {
		@Pc(7) Class5_Sub3_Sub3 local7 = new Class5_Sub3_Sub3();
		@Pc(21) Class5_Sub41 local21 = new Class5_Sub41(arg0);
		local21.anInt9230 = local21.aByteArray93.length - 2;
		@Pc(32) int local32 = local21.method7860();
		@Pc(43) int local43 = local21.aByteArray93.length - local32 - 16 - 2;
		local21.anInt9230 = local43;
		@Pc(50) int local50 = local21.method7804();
		local7.anInt3179 = local21.method7860();
		local7.anInt3175 = local21.method7860();
		local7.anInt3177 = local21.method7860();
		local7.anInt3178 = local21.method7860();
		local7.anInt3180 = local21.method7860();
		local7.anInt3173 = local21.method7860();
		@Pc(84) int local84 = local21.method7816();
		@Pc(92) int local92;
		@Pc(97) int local97;
		if (local84 > 0) {
			local7.aClass300Array1 = new Class300[local84];
			for (local92 = 0; local92 < local84; local92++) {
				local97 = local21.method7860();
				@Pc(104) Class300 local104 = new Class300(Static67.method917(local97));
				local7.aClass300Array1[local92] = local104;
				while (local97-- > 0) {
					@Pc(114) int local114 = local21.method7804();
					@Pc(118) int local118 = local21.method7804();
					local104.method7191(new Class5_Sub47(local118), (long) local114);
				}
			}
		}
		local21.anInt9230 = 0;
		local7.aString18 = local21.method7815();
		local7.anIntArray136 = new int[local50];
		local92 = 0;
		while (local43 > local21.anInt9230) {
			local97 = local21.method7860();
			if (local97 == 3) {
				if (local7.aStringArray21 == null) {
					local7.aStringArray21 = new String[local50];
				}
				local7.aStringArray21[local92] = local21.method7847().intern();
			} else if (local97 == 54) {
				if (local7.aLongArray10 == null) {
					local7.aLongArray10 = new long[local50];
				}
				local7.aLongArray10[local92] = local21.method7823();
			} else {
				if (local7.anIntArray135 == null) {
					local7.anIntArray135 = new int[local50];
				}
				if (local97 >= 150 || local97 == 21 || local97 == 38 || local97 == 39) {
					local7.anIntArray135[local92] = local21.method7816();
				} else {
					local7.anIntArray135[local92] = local21.method7804();
				}
			}
			local7.anIntArray136[local92++] = local97;
		}
		return local7;
	}
}
