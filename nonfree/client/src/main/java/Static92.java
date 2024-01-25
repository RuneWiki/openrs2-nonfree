import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "Lclient!ra;")
	public static Class170 aClass170_39;

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "Lclient!ra;")
	public static Class170 aClass170_40;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "Z")
	public static boolean aBoolean136 = false;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "[I")
	public static final int[] anIntArray125 = new int[13];

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)I")
	public static int method1968() {
		return Static241.anInt4679;
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)V")
	public static void method1969() {
		for (@Pc(14) Class5_Sub9_Sub7 local14 = (Class5_Sub9_Sub7) Static316.aClass211_37.method5608(); local14 != null; local14 = (Class5_Sub9_Sub7) Static316.aClass211_37.method5603()) {
			@Pc(19) Class25_Sub1_Sub5 local19 = local14.aClass25_Sub1_Sub5_1;
			if (local19.aByte62 != Static156.anInt3123 || local19.aBoolean429) {
				local14.method5803();
				local19.method5105();
			} else if (Static180.anInt3606 >= local19.anInt5791) {
				local19.method5103(Static346.anInt6449);
				if (local19.aBoolean429) {
					local14.method5803();
				} else {
					Static82.method1817(local19, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZI)Lclient!ik;")
	public static Class5_Sub2 method1970(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class5_Sub2_Sub17();
		} else if (arg0 == 1) {
			return new Class5_Sub2_Sub36();
		} else if (arg0 == 2) {
			return new Class5_Sub2_Sub21();
		} else if (arg0 == 3) {
			return new Class5_Sub2_Sub34();
		} else if (arg0 == 4) {
			return new Class5_Sub2_Sub22();
		} else if (arg0 == 5) {
			return new Class5_Sub2_Sub14();
		} else if (arg0 == 6) {
			return new Class5_Sub2_Sub33();
		} else if (arg0 == 7) {
			return new Class5_Sub2_Sub12();
		} else if (arg0 == 8) {
			return new Class5_Sub2_Sub32();
		} else if (arg0 == 9) {
			return new Class5_Sub2_Sub8();
		} else if (arg0 == 10) {
			return new Class5_Sub2_Sub24();
		} else if (arg0 == 11) {
			return new Class5_Sub2_Sub5();
		} else if (arg0 == 12) {
			return new Class5_Sub2_Sub20();
		} else if (arg0 == 13) {
			return new Class5_Sub2_Sub30();
		} else if (arg0 == 14) {
			return new Class5_Sub2_Sub39();
		} else if (arg0 == 15) {
			return new Class5_Sub2_Sub27();
		} else if (arg0 == 16) {
			return new Class5_Sub2_Sub1();
		} else if (arg0 == 17) {
			return new Class5_Sub2_Sub25();
		} else if (arg0 == 18) {
			return new Class5_Sub2_Sub18_Sub1();
		} else if (arg0 == 19) {
			return new Class5_Sub2_Sub13();
		} else if (arg0 == 20) {
			return new Class5_Sub2_Sub2();
		} else if (arg0 == 21) {
			return new Class5_Sub2_Sub31();
		} else if (arg0 == 22) {
			return new Class5_Sub2_Sub37();
		} else if (arg0 == 23) {
			return new Class5_Sub2_Sub10();
		} else if (arg0 == 24) {
			return new Class5_Sub2_Sub7();
		} else if (arg0 == 25) {
			return new Class5_Sub2_Sub19();
		} else if (arg0 == 26) {
			return new Class5_Sub2_Sub38();
		} else if (arg0 == 27) {
			return new Class5_Sub2_Sub9();
		} else if (arg0 == 28) {
			return new Class5_Sub2_Sub26();
		} else if (arg0 == 29) {
			return new Class5_Sub2_Sub15();
		} else if (arg0 == 30) {
			return new Class5_Sub2_Sub16();
		} else if (arg0 == 31) {
			return new Class5_Sub2_Sub23();
		} else if (arg0 == 32) {
			return new Class5_Sub2_Sub11();
		} else if (arg0 == 33) {
			return new Class5_Sub2_Sub35();
		} else if (arg0 == 34) {
			return new Class5_Sub2_Sub29();
		} else if (arg0 == 35) {
			return new Class5_Sub2_Sub28();
		} else if (arg0 == 36) {
			return new Class5_Sub2_Sub3();
		} else if (arg0 == 37) {
			return new Class5_Sub2_Sub4();
		} else if (arg0 == 38) {
			return new Class5_Sub2_Sub6();
		} else if (arg0 == 39) {
			return new Class5_Sub2_Sub18();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)V")
	public static void method1971() {
		Static70.method1548();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static117.aClass49Array1[local8].method1236();
		}
		Static211.method3742();
		Static123.method2410();
		System.gc();
	}
}
