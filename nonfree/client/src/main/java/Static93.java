import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dea", name = "q", descriptor = "[I")
	public static int[] anIntArray83;

	@OriginalMember(owner = "client!dea", name = "g", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_21 = new Class200(120, 3);

	@OriginalMember(owner = "client!dea", name = "i", descriptor = "I")
	public static int anInt2201 = -1;

	@OriginalMember(owner = "client!dea", name = "n", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!dea", name = "p", descriptor = "[I")
	public static final int[] anIntArray82 = new int[25];

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method2083(@OriginalArg(0) String arg0) {
		return Static269.method4429(arg0);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILclient!qk;II)V")
	public static void method2084(@OriginalArg(0) int arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray23 != null) {
			@Pc(13) Class3_Sub21 local13 = new Class3_Sub21();
			local13.aClass279_5 = arg1;
			local13.anObjectArray1 = arg1.anObjectArray23;
			Static304.method4843(local13);
		}
		Static161.anInt3179 = arg1.anInt8185;
		Static190.aBoolean232 = true;
		Static540.anInt9171 = arg0;
		Static235.anInt4449 = arg1.anInt8217;
		Static433.anInt7818 = arg1.anInt8147;
		Static262.anInt4805 = arg1.anInt8138;
		Static37.anInt1189 = arg2;
		Static32.anInt7819 = arg1.anInt8165;
		Static482.method7193(arg1);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(JB)V")
	public static void method2086(@OriginalArg(0) long arg0) {
		if (Static330.aClass77ArrayArrayArray2 != null) {
			if (Static305.anInt5422 == 1 || Static305.anInt5422 == 5) {
				Static23.method990(arg0);
			} else if (Static305.anInt5422 == 4) {
				Static202.method2895(arg0);
			}
		}
		Static204.method3515((long) Static101.anInt2262, Static323.aClass5_9);
		if (Static307.anInt5465 != -1) {
			Static507.method7838(Static307.anInt5465);
		}
		for (@Pc(39) int local39 = 0; local39 < Static619.anInt10014; local39++) {
			if (Static477.aBooleanArray21[local39]) {
				Static314.aBooleanArray17[local39] = true;
			}
			Static504.aBooleanArray23[local39] = Static477.aBooleanArray21[local39];
			Static477.aBooleanArray21[local39] = false;
		}
		Static174.anInt3395 = Static101.anInt2262;
		Static556.method8021(-1, null, -1);
		Static464.method7045(null, -1, -1);
		if (Static307.anInt5465 != -1) {
			Static619.anInt10014 = 0;
			Static346.method5781();
		}
		Static323.aClass5_9.la();
		Static366.method5971(Static323.aClass5_9);
		@Pc(90) int local90 = Static141.method2609();
		if (local90 == -1) {
			local90 = Static32.anInt7819;
		}
		if (local90 == -1) {
			local90 = Static291.anInt5161;
		}
		Static563.method8100(local90);
		@Pc(114) int local114 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.method5059() << 8;
		Static600.method6746(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123, Static354.anInt6785, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916 + local114, local114 + Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911);
		Static354.anInt6785 = 0;
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(Ljava/lang/String;B)I")
	public static int method2088(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = Static270.method4452(arg0.charAt(local17)) + (local10 << 5) - local10;
		}
		return local10;
	}
}
