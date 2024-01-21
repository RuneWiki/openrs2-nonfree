import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "[I")
	public static int[] anIntArray595 = new int[128];

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray7 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1144 = Static170.method3101("FULL");

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "[S")
	public static short[] aShortArray34 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1145 = aClass28_1144;

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[8];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
	public static void method2671() {
		aShortArray34 = null;
		aClass28_1144 = null;
		aClass28_1145 = null;
		anIntArray595 = null;
		aShortArrayArray7 = null;
		aBooleanArray14 = null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZILclient!eh;Lclient!ah;Lclient!eh;I)V")
	public static void method2674(@OriginalArg(2) Class28 arg0, @OriginalArg(3) Class7 arg1, @OriginalArg(4) Class28 arg2) {
		@Pc(8) int local8 = arg1.method1029(arg2);
		@Pc(14) int local14 = arg1.method1031(arg0, local8);
		Static68.method1631(local8, local14, arg1, 255);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIII)V")
	public static void method2677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static78.anInt2324 == 1) {
			Static155.aClass3_Sub2_Sub2_Sub4Array8[Static176.anInt4190 / 100].method996(Static146.anInt3647 - 8, Static128.anInt3274 + -8);
		}
		if (Static78.anInt2324 == 2) {
			Static155.aClass3_Sub2_Sub2_Sub4Array8[Static176.anInt4190 / 100 + 4].method996(Static146.anInt3647 - 8, Static128.anInt3274 + -8);
		}
		Static1.method11();
		if (!Static108.aBoolean137) {
			return;
		}
		@Pc(48) int local48 = arg2 + 512 - 5;
		@Pc(52) int local52 = arg0 + 20;
		Static41.aClass3_Sub2_Sub2_Sub1_Sub1_1.method1803(Static4.method96(new Class28[] { Static42.aClass28_376, Static146.method2793(Static42.anInt1183) }), local48, local52, 16776960, -1);
		@Pc(73) int local73 = local52 + 15;
		@Pc(75) Runtime local75 = Runtime.getRuntime();
		@Pc(84) int local84 = (int) ((local75.totalMemory() - local75.freeMemory()) / 1024L);
		@Pc(86) int local86 = 16776960;
		if (local84 > 32768 && Static179.aBoolean202) {
			local86 = 16711680;
		}
		if (local84 > 65536 && !Static179.aBoolean202) {
			local86 = 16711680;
		}
		Static41.aClass3_Sub2_Sub2_Sub1_Sub1_1.method1803(Static4.method96(new Class28[] { Static73.aClass28_656, Static146.method2793(local84), Static12.aClass28_171 }), local48, local73, local86, -1);
		local52 = local73 + 15;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/Component;IIB)Lclient!rg;")
	public static Class70 method2683(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class70_Sub2");
			@Pc(10) Class70 local10 = (Class70) local6.getDeclaredConstructor().newInstance();
			local10.method2800(arg1, arg2, arg0);
			return local10;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class70_Sub1 local28 = new Class70_Sub1();
			local28.method2800(arg1, arg2, arg0);
			return local28;
		}
	}
}
