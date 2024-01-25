import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
	public static int anInt1911;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Lclient!vk;")
	public static Class207 aClass207_12 = new Class207(64);

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
	public static int anInt1912 = 0;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "Z")
	public static boolean aBoolean153 = false;

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "[I")
	public static final int[] anIntArray163 = new int[14];

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIBI)V")
	public static void method1574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static90.anInt1710 = arg1;
		Static320.anInt6361 = arg3;
		Static254.anInt5236 = arg2;
		Static221.anInt4694 = arg0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;IJIILjava/lang/String;IZZZI)V")
	public static void method1575(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(28) Class1_Sub21 local28 = new Class1_Sub21(128);
		local28.method5718(10);
		local28.method5698((arg6 ? 1 : 0) | (arg8 ? 2 : 0) | (arg7 ? 4 : 0));
		local28.method5744(arg2);
		local28.method5702(local8[0]);
		local28.method5752(arg0);
		local28.method5702(local8[1]);
		local28.method5698(Static76.anInt1569);
		local28.method5718(arg3);
		local28.method5718(arg9);
		local28.method5702(local8[2]);
		local28.method5698(arg5);
		local28.method5698(arg1);
		local28.method5702(local8[3]);
		local28.method5703(Static82.aBigInteger1, Static296.aBigInteger2);
		@Pc(114) Class1_Sub21 local114 = new Class1_Sub21(350);
		local114.method5752(arg4);
		@Pc(127) int local127 = 8 - Static165.method2895(arg4) % 8;
		for (@Pc(129) int local129 = 0; local129 < local127; local129++) {
			local114.method5718((int) (Math.random() * 255.0D));
		}
		local114.method5722(local8);
		Static305.aClass1_Sub21_Sub2_3.anInt6611 = 0;
		Static305.aClass1_Sub21_Sub2_3.method5718(22);
		Static305.aClass1_Sub21_Sub2_3.method5698(local114.anInt6611 + local28.anInt6611 + 2);
		Static305.aClass1_Sub21_Sub2_3.method5698(561);
		Static305.aClass1_Sub21_Sub2_3.method5729(local28.anInt6611, local28.aByteArray82);
		Static305.aClass1_Sub21_Sub2_3.method5729(local114.anInt6611, local114.aByteArray82);
		Static5.anInt50 = 0;
		Static51.anInt1261 = 1;
		Static3.anInt37 = -3;
		Static17.anInt339 = 0;
	}
}
