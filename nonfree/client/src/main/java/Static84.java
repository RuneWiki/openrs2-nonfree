import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!du", name = "f", descriptor = "Lclient!br;")
	public static Class2_Sub1_Sub2 aClass2_Sub1_Sub2_3;

	@OriginalMember(owner = "client!du", name = "h", descriptor = "[Lclient!o;")
	public static Class13[] aClass13Array4;

	@OriginalMember(owner = "client!du", name = "i", descriptor = "I")
	public static int anInt1559;

	@OriginalMember(owner = "client!du", name = "b", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_59 = new Class102(42, 2);

	@OriginalMember(owner = "client!du", name = "g", descriptor = "I")
	public static int anInt1558 = 0;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BIIII)V")
	public static void method1209(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(22) int local22 = -arg3;
		@Pc(24) int local24 = -1;
		Static216.method2862(arg2 - arg3, arg2 - -arg3, arg0, Static229.anIntArrayArray26[arg1]);
		while (local7 < local9) {
			local24 += 2;
			local7++;
			local22 += local24;
			if (local22 >= 0) {
				local9--;
				local22 -= local9 << 1;
				@Pc(60) int[] local60 = Static229.anIntArrayArray26[arg1 + local9];
				@Pc(67) int[] local67 = Static229.anIntArrayArray26[arg1 - local9];
				@Pc(72) int local72 = arg2 + local7;
				@Pc(77) int local77 = arg2 - local7;
				Static216.method2862(local77, local72, arg0, local60);
				Static216.method2862(local77, local72, arg0, local67);
			}
			@Pc(93) int local93 = arg2 + local9;
			@Pc(97) int local97 = arg2 - local9;
			@Pc(103) int[] local103 = Static229.anIntArrayArray26[arg1 + local7];
			@Pc(110) int[] local110 = Static229.anIntArrayArray26[arg1 - local7];
			Static216.method2862(local97, local93, arg0, local103);
			Static216.method2862(local97, local93, arg0, local110);
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIIII)Lclient!ks;")
	public static Class109 method1210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(41) long local41 = (long) arg4 * 76724863L ^ (long) arg2 * 475427L ^ (long) arg3 * 67481L ^ (long) arg0 * 97549L ^ (long) arg5 * 986053L ^ (long) arg1 * 32147369L;
		@Pc(47) Class109 local47 = (Class109) Static216.aClass132_29.method2701(local41);
		if (local47 == null) {
			local47 = Static420.aClass163_11.method5499(arg3, arg0, arg2, arg5, arg1, arg4);
			Static216.aClass132_29.method2711(local47, local41);
			return local47;
		} else {
			return local47;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IZZIJ)Ljava/lang/String;")
	public static String method1211(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		@Pc(12) char local12 = ',';
		@Pc(14) char local14 = '.';
		if (arg0 == 0) {
			local12 = '.';
			local14 = ',';
		}
		if (arg0 == 2) {
			local14 = ' ';
		}
		@Pc(29) boolean local29 = false;
		if (arg3 < 0L) {
			arg3 = -arg3;
			local29 = true;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		@Pc(47) int local47;
		@Pc(52) int local52;
		if (arg2 > 0) {
			for (local47 = 0; local47 < arg2; local47++) {
				local52 = (int) arg3;
				arg3 /= 10L;
				local43.append((char) (local52 + 48 - (int) arg3 * 10));
			}
			local43.append(local12);
		}
		local47 = 0;
		while (true) {
			local52 = (int) arg3;
			arg3 /= 10L;
			local43.append((char) (local52 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local29) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg1) {
				local47++;
				if (local47 % 3 == 0) {
					local43.append(local14);
				}
			}
		}
	}
}
