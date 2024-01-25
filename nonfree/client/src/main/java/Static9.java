import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
	public static int anInt245;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "Z")
	public static boolean aBoolean2 = false;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "[I")
	public static final int[] anIntArray11 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
	public static int anInt246 = 0;

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "[I")
	public static final int[] anIntArray12 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
	public static int anInt248 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIILclient!ir;III)V")
	public static void method237(@OriginalArg(2) int arg0, @OriginalArg(3) Class26_Sub2_Sub2 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static294.method4792(arg3, 0, arg2, arg1.aByte95, arg0, arg1.anInt7065, arg1.anInt7068);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	public static void method238() {
		if (Static221.aClass176_5 != Static224.aClass176_6) {
			try {
				Static456.method694(Static185.aClient1, "tbrefresh");
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIZ)V")
	public static void method240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub2_Sub1 local8 = Static258.method5559(arg1, 16);
		local8.method202();
		local8.anInt214 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)V")
	public static void method241(@OriginalArg(1) boolean arg0) {
		Static41.anInt7067 = 0;
		Static74.anInt1467 = 0;
		Static107.method1654();
		Static267.method3899(arg0);
		Static372.method5742();
		@Pc(26) int local26;
		for (@Pc(20) int local20 = 0; local20 < Static41.anInt7067; local20++) {
			local26 = Static400.anIntArray576[local20];
			if (Static410.aClass26_Sub2_Sub2_Sub2Array1[local26].anInt7098 != Static403.anInt6978) {
				if (Static410.aClass26_Sub2_Sub2_Sub2Array1[local26].aClass66_1.method1456()) {
					Static425.method5710(Static410.aClass26_Sub2_Sub2_Sub2Array1[local26]);
				}
				Static410.aClass26_Sub2_Sub2_Sub2Array1[local26].method5546(null);
				Static410.aClass26_Sub2_Sub2_Sub2Array1[local26] = null;
			}
		}
		if (Static173.aClass1_Sub1_Sub1_1.anInt5056 != Static283.anInt4985) {
			throw new RuntimeException("gnp1 pos:" + Static173.aClass1_Sub1_Sub1_1.anInt5056 + " psize:" + Static283.anInt4985);
		}
		for (local26 = 0; local26 < Static288.anInt5039; local26++) {
			if (Static410.aClass26_Sub2_Sub2_Sub2Array1[Static212.anIntArray28[local26]] == null) {
				throw new RuntimeException("gnp2 pos:" + local26 + " size:" + Static288.anInt5039);
			}
		}
	}
}
