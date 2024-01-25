import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!h;")
	public static Class90 aClass90_3;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "[Lclient!cq;")
	public static Class8[] aClass8Array5;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Lclient!lm;")
	public static Class134 aClass134_34;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "[Lclient!nj;")
	public static final Class1_Sub21[] aClass1_Sub21Array1 = new Class1_Sub21[2048];

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_31 = new Class37(10);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1319(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static288.method5035("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!lm;)V")
	public static void method1320(@OriginalArg(1) Class134 arg0) {
		Static293.aClass134_130 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIILjava/lang/String;B)V")
	public static void method1321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		@Pc(8) Class163 local8 = Static46.method931(arg0, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray22 != null) {
			@Pc(18) Class1_Sub8 local18 = new Class1_Sub8();
			local18.anInt1152 = arg2;
			local18.aClass163_3 = local8;
			local18.aString41 = arg3;
			local18.anObjectArray1 = local8.anObjectArray22;
			Static122.method1972(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt4926 > 0) {
			local35 = Static173.method3109(local8);
		}
		if (!local35 || !Static40.method857(local8).method1093(arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static305.aClass1_Sub21_Sub2_3.method5757(144);
			Static305.aClass1_Sub21_Sub2_3.method5702(arg1);
			Static305.aClass1_Sub21_Sub2_3.method5698(arg0);
		}
		if (arg2 == 2) {
			Static305.aClass1_Sub21_Sub2_3.method5757(96);
			Static305.aClass1_Sub21_Sub2_3.method5702(arg1);
			Static305.aClass1_Sub21_Sub2_3.method5698(arg0);
		}
		if (arg2 == 3) {
			Static305.aClass1_Sub21_Sub2_3.method5757(119);
			Static305.aClass1_Sub21_Sub2_3.method5702(arg1);
			Static305.aClass1_Sub21_Sub2_3.method5698(arg0);
		}
		if (arg2 == 4) {
			Static305.aClass1_Sub21_Sub2_3.method5757(52);
			Static305.aClass1_Sub21_Sub2_3.method5702(arg1);
			Static305.aClass1_Sub21_Sub2_3.method5698(arg0);
		}
		if (arg2 == 5) {
			Static305.aClass1_Sub21_Sub2_3.method5757(0);
			Static305.aClass1_Sub21_Sub2_3.method5702(arg1);
			Static305.aClass1_Sub21_Sub2_3.method5698(arg0);
		}
		if (arg2 == 6) {
			Static305.aClass1_Sub21_Sub2_3.method5757(54);
			Static305.aClass1_Sub21_Sub2_3.method5702(arg1);
			Static305.aClass1_Sub21_Sub2_3.method5698(arg0);
		}
		if (arg2 == 7) {
			Static305.aClass1_Sub21_Sub2_3.method5757(250);
			Static305.aClass1_Sub21_Sub2_3.method5702(arg1);
			Static305.aClass1_Sub21_Sub2_3.method5698(arg0);
		}
		if (arg2 == 8) {
			Static305.aClass1_Sub21_Sub2_3.method5757(186);
			Static305.aClass1_Sub21_Sub2_3.method5702(arg1);
			Static305.aClass1_Sub21_Sub2_3.method5698(arg0);
		}
		if (arg2 == 9) {
			Static305.aClass1_Sub21_Sub2_3.method5757(121);
			Static305.aClass1_Sub21_Sub2_3.method5702(arg1);
			Static305.aClass1_Sub21_Sub2_3.method5698(arg0);
		}
		if (arg2 == 10) {
			Static305.aClass1_Sub21_Sub2_3.method5757(204);
			Static305.aClass1_Sub21_Sub2_3.method5702(arg1);
			Static305.aClass1_Sub21_Sub2_3.method5698(arg0);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BIIII)V")
	public static void method1323(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static119.anInt2298 == 0 || arg2 == 0 || Static58.anInt1391 >= 50 || arg1 == -1) {
			return;
		}
		Static128.anIntArray341[Static58.anInt1391] = arg1;
		Static190.anIntArray377[Static58.anInt1391] = arg2;
		Static353.anIntArray677[Static58.anInt1391] = arg0;
		Static332.aClass110Array1[Static58.anInt1391] = null;
		Static293.anIntArray569[Static58.anInt1391] = 0;
		Static85.anIntArray126[Static58.anInt1391] = arg3;
		Static58.anInt1391++;
	}
}
