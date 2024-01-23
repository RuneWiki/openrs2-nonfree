import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "[Lclient!uj;")
	public static Class4_Sub3_Sub14[] aClass4_Sub3_Sub14Array8;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "[I")
	public static int[] anIntArray164 = new int[2];

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString113 = " from your friend list first.";

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!dj;")
	public static Class40 aClass40_9 = new Class40(128);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B[B)Z")
	public static boolean method1554(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class4_Sub10 local8 = new Class4_Sub10(arg0);
		@Pc(12) int local12 = local8.method4666();
		if (local12 != 1) {
			return false;
		}
		@Pc(38) boolean local38 = local8.method4666() == 1;
		if (local38) {
			Static68.method1072(local8);
		}
		Static222.method3583(local8);
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!fh;ILjava/lang/String;Z)Lclient!po;")
	public static Class141 method1555(@OriginalArg(0) Class58 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg0.method1362(arg1);
		if (local10 == -1) {
			return new Class141(0);
		}
		@Pc(23) int[] local23 = arg0.method1363(local10);
		@Pc(29) Class141 local29 = new Class141(local23.length);
		@Pc(31) int local31 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local29.anInt4220 > local31) {
				@Pc(59) Class4_Sub10 local59 = new Class4_Sub10(arg0.method1372(local10, local23[local39++]));
				@Pc(63) int local63 = local59.method4632();
				@Pc(67) int local67 = local59.method4653();
				@Pc(71) int local71 = local59.method4666();
				if (!arg2 && local71 == 1) {
					local29.anInt4220--;
				} else {
					local29.anIntArray448[local31] = local63;
					local29.aClass4_Sub3_Sub7Array1[local31] = new Class4_Sub3_Sub7();
					local29.aClass4_Sub3_Sub7Array1[local31].anInt1760 = local67;
					local31++;
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method1556() {
		Static182.aClass56Array5 = null;
		Static51.aClass4_Sub3_Sub5_Sub2_2 = null;
		Static125.aClass56Array3 = null;
		Static56.aClass4_Sub3_Sub14Array6 = null;
		Static251.aClass4_Sub3_Sub14Array12 = null;
		Static197.aClass4_Sub3_Sub5_2 = null;
		Static241.aClass4_Sub3_Sub14Array11 = null;
		Static10.aClass4_Sub3_Sub14Array1 = null;
		Static211.aClass4_Sub3_Sub5_3 = null;
		aClass4_Sub3_Sub14Array8 = null;
		Static32.aClass4_Sub3_Sub5_1 = null;
		Static254.aClass4_Sub3_Sub14_6 = null;
		Static63.aClass4_Sub3_Sub14Array7 = null;
		Static52.aClass4_Sub3_Sub14Array9 = null;
		Static11.aClass4_Sub3_Sub14Array2 = null;
		Static40.aClass4_Sub3_Sub14Array3 = null;
		Static52.aClass4_Sub3_Sub14Array10 = null;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void method1557() {
		Static27.method384(false);
		System.gc();
		Static15.method233(25);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)V")
	public static void method1559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static6.anInt113; local11++) {
			if (Static181.anIntArray383[local11] + Static261.anIntArray540[local11] > arg0 && Static261.anIntArray540[local11] < arg0 + arg3 && arg1 < Static299.anIntArray638[local11] + Static289.anIntArray616[local11] && arg2 + arg1 > Static299.anIntArray638[local11]) {
				Static259.aBooleanArray24[local11] = true;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void method1560(@OriginalArg(0) Class58 arg0) {
		Static118.aClass58_52 = arg0;
	}
}
