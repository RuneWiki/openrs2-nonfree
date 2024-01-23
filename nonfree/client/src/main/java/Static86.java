import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!gg", name = "r", descriptor = "[[[Lclient!aa;")
	public static Class1_Sub2[][][] aClass1_Sub2ArrayArrayArray3;

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString118;

	@OriginalMember(owner = "client!gg", name = "u", descriptor = "Lclient!wc;")
	public static Class1_Sub3_Sub24 aClass1_Sub3_Sub24_4;

	@OriginalMember(owner = "client!gg", name = "y", descriptor = "[Lclient!ch;")
	public static Class2_Sub3[] aClass2_Sub3Array2 = new Class2_Sub3[4];

	@OriginalMember(owner = "client!gg", name = "C", descriptor = "[S")
	public static short[] aShortArray64 = new short[500];

	@OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
	public static int anInt2119 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!th;)I")
	public static int method1566(@OriginalArg(1) Class168 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4038(Static145.anInt6067)) {
			local5++;
		}
		if (arg0.method4038(Static55.anInt1220)) {
			local5++;
		}
		if (arg0.method4038(Static18.anInt493)) {
			local5++;
		}
		if (arg0.method4038(Static182.anInt4018)) {
			local5++;
		}
		if (arg0.method4038(Static31.anInt771)) {
			local5++;
		}
		if (arg0.method4038(Static117.anInt4597)) {
			local5++;
		}
		if (arg0.method4038(Static146.anInt4440)) {
			local5++;
		}
		if (arg0.method4038(Static260.anInt5267)) {
			local5++;
		}
		if (arg0.method4038(Static190.anInt4208)) {
			local5++;
		}
		if (arg0.method4038(Static49.anInt1171)) {
			local5++;
		}
		if (arg0.method4038(Static169.anInt3796)) {
			local5++;
		}
		if (arg0.method4038(Static196.anInt4275)) {
			local5++;
		}
		if (arg0.method4038(Static208.anInt4499)) {
			local5++;
		}
		if (arg0.method4038(Static279.anInt5611)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!qm;)Lclient!qi;")
	public static Class31_Sub3 method1568(@OriginalArg(1) Class1_Sub14 arg0) {
		return new Class31_Sub3(arg0.method2248(), arg0.method2248(), arg0.method2248(), arg0.method2248(), arg0.method2215(), arg0.method2215(), arg0.method2199());
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLclient!wf;)V")
	public static void method1569(@OriginalArg(1) Class191 arg0) {
		@Pc(13) int local13 = arg0.anInt6115;
		if (local13 == 324) {
			if (Static109.anInt2413 == -1) {
				Static109.anInt2413 = arg0.anInt6140;
				Static36.anInt914 = arg0.anInt6100;
			}
			if (Static280.aClass167_2.aBoolean332) {
				arg0.anInt6140 = Static109.anInt2413;
			} else {
				arg0.anInt6140 = Static36.anInt914;
			}
		} else if (local13 == 325) {
			if (Static109.anInt2413 == -1) {
				Static109.anInt2413 = arg0.anInt6140;
				Static36.anInt914 = arg0.anInt6100;
			}
			if (Static280.aClass167_2.aBoolean332) {
				arg0.anInt6140 = Static36.anInt914;
			} else {
				arg0.anInt6140 = Static109.anInt2413;
			}
		} else if (local13 == 327) {
			arg0.anInt6091 = 150;
			arg0.anInt6118 = (int) (Math.sin((double) Static133.anInt3061 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt6149 = 5;
			arg0.anInt6171 = -1;
		} else if (local13 == 328) {
			if (Static56.aClass2_Sub4_Sub2_1.aString182 == null) {
				arg0.anInt6171 = 0;
				arg0.anInt6160 = 0;
			} else {
				arg0.anInt6091 = 150;
				arg0.anInt6118 = (int) (Math.sin((double) Static133.anInt3061 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt6149 = 5;
				arg0.anInt6171 = 2047;
				arg0.anInt6160 = Static104.method1735(Static56.aClass2_Sub4_Sub2_1.aString182);
				arg0.anInt6104 = Static56.aClass2_Sub4_Sub2_1.anInt2826;
				arg0.anInt6103 = 0;
				arg0.anInt6080 = Static56.aClass2_Sub4_Sub2_1.anInt2820;
				arg0.anInt6116 = Static56.aClass2_Sub4_Sub2_1.anInt2812;
			}
		}
	}
}
