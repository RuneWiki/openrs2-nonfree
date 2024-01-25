import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "Lclient!f;")
	public static Class22 aClass22_3;

	@OriginalMember(owner = "client!dv", name = "o", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_59 = new Class175("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(BLclient!ej;)V")
	public static void method1459(@OriginalArg(1) Class3_Sub15 arg0) {
		if (Static151.aClass217ArrayArrayArray3 == null) {
			return;
		}
		@Pc(13) Interface12 local13 = null;
		if (arg0.anInt2010 == 0) {
			local13 = (Interface12) Static391.method5292(arg0.anInt2020, arg0.anInt2022, arg0.anInt2014);
		}
		if (arg0.anInt2010 == 1) {
			local13 = (Interface12) Static35.method4618(arg0.anInt2020, arg0.anInt2022, arg0.anInt2014);
		}
		if (arg0.anInt2010 == 2) {
			local13 = (Interface12) Static372.method1267(arg0.anInt2020, arg0.anInt2022, arg0.anInt2014, wk.class);
		}
		if (arg0.anInt2010 == 3) {
			local13 = (Interface12) Static11.method399(arg0.anInt2020, arg0.anInt2022, arg0.anInt2014);
		}
		if (local13 == null) {
			arg0.anInt2013 = 0;
			arg0.anInt2023 = 0;
			arg0.anInt2012 = -1;
		} else {
			arg0.anInt2012 = local13.method5847();
			arg0.anInt2013 = local13.method5848();
			arg0.anInt2023 = local13.method5851();
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "([II[III)V")
	public static void method1460(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(20) int local20 = (arg2 + arg3) / 2;
		@Pc(22) int local22 = arg2;
		@Pc(26) int local26 = arg1[local20];
		arg1[local20] = arg1[arg3];
		arg1[arg3] = local26;
		@Pc(40) int local40 = arg0[local20];
		arg0[local20] = arg0[arg3];
		arg0[arg3] = local40;
		@Pc(59) int local59 = ~local26 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg2; local61 < arg3; local61++) {
			if (arg1[local61] < (local59 & local61) + local26) {
				@Pc(76) int local76 = arg1[local61];
				arg1[local61] = arg1[local22];
				arg1[local22] = local76;
				@Pc(90) int local90 = arg0[local61];
				arg0[local61] = arg0[local22];
				arg0[local22++] = local90;
			}
		}
		arg1[arg3] = arg1[local22];
		arg1[local22] = local26;
		arg0[arg3] = arg0[local22];
		arg0[local22] = local40;
		method1460(arg0, arg1, arg2, local22 - 1);
		method1460(arg0, arg1, local22 + 1, arg3);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
	public static void method1461() {
		Static115.aClass75_3.V(Static177.anInt3620, Static123.aClass21_Sub1_1.aBoolean76 ? Static248.anInt4664 + 256 << 0 : -1, 256);
	}
}
