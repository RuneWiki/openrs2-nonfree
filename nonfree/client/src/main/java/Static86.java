import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
	public static int anInt2009;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_37 = new Class256("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "Lclient!en;")
	public static final Class69 aClass69_1 = new Class69();

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
	public static int anInt2008 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BZ)V")
	public static void method1481(@OriginalArg(1) boolean arg0) {
		Static379.anInt6725 = 0;
		Static254.anInt6998 = 0;
		Static6.method146();
		Static170.method2635(arg0);
		Static129.method5935();
		@Pc(30) int local30;
		for (@Pc(24) int local24 = 0; local24 < Static254.anInt6998; local24++) {
			local30 = Static149.anIntArray198[local24];
			if (Static164.anInt3206 != Static4.aClass4_Sub2_Sub2_Sub2Array1[local30].anInt6508) {
				if (Static4.aClass4_Sub2_Sub2_Sub2Array1[local30].aClass215_1.method4799()) {
					Static246.method3808(Static4.aClass4_Sub2_Sub2_Sub2Array1[local30]);
				}
				Static4.aClass4_Sub2_Sub2_Sub2Array1[local30].method5135(null);
				Static4.aClass4_Sub2_Sub2_Sub2Array1[local30] = null;
			}
		}
		if (Static426.aClass2_Sub20_Sub1_2.anInt4608 != Static193.anInt3787) {
			throw new RuntimeException("gnp1 pos:" + Static426.aClass2_Sub20_Sub1_2.anInt4608 + " psize:" + Static193.anInt3787);
		}
		for (local30 = 0; local30 < Static391.anInt6867; local30++) {
			if (Static4.aClass4_Sub2_Sub2_Sub2Array1[Static312.anIntArray202[local30]] == null) {
				throw new RuntimeException("gnp2 pos:" + local30 + " size:" + Static391.anInt6867);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([Ljava/lang/Object;III[I)V")
	public static void method1482(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(22) int local22 = (arg2 + arg1) / 2;
		@Pc(24) int local24 = arg1;
		@Pc(28) int local28 = arg3[local22];
		arg3[local22] = arg3[arg2];
		arg3[arg2] = local28;
		@Pc(42) Object local42 = arg0[local22];
		arg0[local22] = arg0[arg2];
		arg0[arg2] = local42;
		@Pc(59) int local59 = local28 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg1; local61 < arg2; local61++) {
			if (arg3[local61] < local28 + (local61 & local59)) {
				@Pc(77) int local77 = arg3[local61];
				arg3[local61] = arg3[local24];
				arg3[local24] = local77;
				@Pc(91) Object local91 = arg0[local61];
				arg0[local61] = arg0[local24];
				arg0[local24++] = local91;
			}
		}
		arg3[arg2] = arg3[local24];
		arg3[local24] = local28;
		arg0[arg2] = arg0[local24];
		arg0[local24] = local42;
		method1482(arg0, arg1, local24 - 1, arg3);
		method1482(arg0, local24 + 1, arg2, arg3);
	}
}
