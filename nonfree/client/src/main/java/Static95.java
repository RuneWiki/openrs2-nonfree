import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "Lclient!in;")
	public static final Class169 aClass169_51 = new Class169(57, 8);

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
	public static int anInt1689 = 0;

	@OriginalMember(owner = "client!dba", name = "r", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)V")
	public static void method1627(@OriginalArg(0) int arg0) {
		Static22.anInt389 = -1;
		Static69.anInt1350 = -1;
		Static43.anInt8888 = arg0;
		Static366.method6212();
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)Lclient!jea;")
	public static Class2_Sub1_Sub9 method1628() {
		return Static331.aClass2_Sub1_Sub9_3;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IBII)V")
	public static void method1629(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class363 local9 = Static347.aClass363ArrayArray1[arg2][arg0];
		Static102.method1770(arg1, local9 == null ? Static50.aClass363_1 : local9);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZFIIIII)[I")
	public static int[] method1630(@OriginalArg(2) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub15_Sub21 local10 = new Class2_Sub15_Sub21();
		local10.anInt7715 = 8;
		local10.anInt7707 = 8;
		local10.anInt7718 = (int) (arg0 * 4096.0F);
		local10.anInt7710 = 35;
		local10.aBoolean573 = true;
		local10.anInt7712 = 4;
		local10.method9722();
		Static463.method7433(1, 2048);
		local10.method6894(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)Z")
	public static boolean method1631() {
		try {
			return Static389.method6557();
		} catch (@Pc(14) IOException local14) {
			Static175.method3431();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static14.aClass169_207 == null ? -1 : Static14.aClass169_207.method4517()) + "," + (Static275.aClass169_135 == null ? -1 : Static275.aClass169_135.method4517()) + "," + (Static446.aClass169_194 == null ? -1 : Static446.aClass169_194.method4517()) + " - " + Static538.anInt9383 + "," + (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray189[0] + Static640.anInt11085) + "," + (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray188[0] + Static490.anInt8763) + " - ";
			for (@Pc(79) int local79 = 0; local79 < Static538.anInt9383 && local79 < 50; local79++) {
				local77 = local77 + Static206.aClass2_Sub8_Sub2_1.lb[local79] + ",";
			}
			Static165.method3319(local19, local77);
			Static425.method7012(false);
			return true;
		}
	}
}
