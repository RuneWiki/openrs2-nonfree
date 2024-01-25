import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dha", name = "e", descriptor = "I")
	public static int anInt1545;

	@OriginalMember(owner = "client!dha", name = "d", descriptor = "Lclient!du;")
	public static final Class81 aClass81_14 = new Class81(32);

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(BLclient!vfa;)V")
	public static void method1449(@OriginalArg(1) Class357 arg0) {
		if (Static347.anInt9482 != arg0.anInt9785) {
			return;
		}
		if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aString42 == null) {
			arg0.anInt9817 = 0;
			arg0.anInt9856 = 0;
			return;
		}
		arg0.anInt9849 = 150;
		arg0.anInt9788 = (int) (Math.sin((double) Static235.anInt3998 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt9817 = Static620.anInt10055;
		arg0.anInt9796 = 5;
		arg0.anInt9856 = Static160.method2420(Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aString42);
		arg0.anInt9827 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt2963;
		arg0.anInt9798 = 0;
		arg0.anInt9806 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt2924;
		arg0.anInt9800 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt2933;
		@Pc(77) Class200 local77 = arg0.anInt9806 == -1 ? null : Static396.aClass359_2.method8415(arg0.anInt9806);
		if (local77 != null) {
			Static91.method1412(local77, arg0.anInt9800);
		}
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "([FBI)[F")
	public static float[] method1450(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float[] local14 = new float[arg1];
		Static655.method4107(arg0, 0, local14, 0, arg1);
		return local14;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(III)Z")
	public static boolean method1451(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static416.method6342(arg0, arg1) || Static194.method3065(arg0, arg1);
	}
}
