import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
	public static int anInt5895;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray164 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "Z")
	public static boolean aBoolean436 = false;

	@OriginalMember(owner = "client!fl", name = "x", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_215 = new Class198(64);

	@OriginalMember(owner = "client!fl", name = "z", descriptor = "[I")
	public static final int[] anIntArray471 = new int[32];

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
	public static void method5018() {
		Static212.anInt2908 = 0;
		Static244.anInt4894 = 0;
		Static245.method4352();
		Static144.method2970();
		Static104.method2323();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static212.anInt2908; local17++) {
			local23 = Static227.anIntArray51[local17];
			if (Static169.aClass8_Sub1_Sub2_Sub2Array1[local23].anInt4940 != Static199.anInt4137) {
				if (Static169.aClass8_Sub1_Sub2_Sub2Array1[local23].aClass141_1.method3909()) {
					Static118.method2493(Static169.aClass8_Sub1_Sub2_Sub2Array1[local23]);
				}
				Static169.aClass8_Sub1_Sub2_Sub2Array1[local23].method4356(null);
				Static169.aClass8_Sub1_Sub2_Sub2Array1[local23] = null;
			}
		}
		if (Static127.aClass4_Sub11_Sub1_3.anInt3768 != Static133.anInt3104) {
			throw new RuntimeException("gnp1 pos:" + Static127.aClass4_Sub11_Sub1_3.anInt3768 + " psize:" + Static133.anInt3104);
		}
		for (local23 = 0; local23 < Static145.anInt3273; local23++) {
			if (Static169.aClass8_Sub1_Sub2_Sub2Array1[Static354.anIntArray510[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static145.anInt3273);
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II[Ljava/lang/Object;I[J)V")
	public static void method5019(@OriginalArg(0) int arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg2) / 2;
		@Pc(17) int local17 = arg0;
		@Pc(21) long local21 = arg3[local15];
		arg3[local15] = arg3[arg2];
		arg3[arg2] = local21;
		@Pc(35) Object local35 = arg1[local15];
		arg1[local15] = arg1[arg2];
		arg1[arg2] = local35;
		for (@Pc(47) int local47 = arg0; local47 < arg2; local47++) {
			if ((long) (local47 & 0x1) + local21 > arg3[local47]) {
				@Pc(68) long local68 = arg3[local47];
				arg3[local47] = arg3[local17];
				arg3[local17] = local68;
				@Pc(82) Object local82 = arg1[local47];
				arg1[local47] = arg1[local17];
				arg1[local17++] = local82;
			}
		}
		arg3[arg2] = arg3[local17];
		arg3[local17] = local21;
		arg1[arg2] = arg1[local17];
		arg1[local17] = local35;
		method5019(arg0, arg1, local17 - 1, arg3);
		method5019(local17 + 1, arg1, arg2, arg3);
	}
}
