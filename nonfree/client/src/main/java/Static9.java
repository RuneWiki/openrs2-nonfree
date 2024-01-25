import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!al", name = "F", descriptor = "[I")
	public static final int[] anIntArray13 = new int[5];

	@OriginalMember(owner = "client!al", name = "G", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_4 = new Class117("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!al", name = "L", descriptor = "I")
	public static int anInt151 = 0;

	@OriginalMember(owner = "client!al", name = "N", descriptor = "I")
	public static int anInt153 = 0;

	@OriginalMember(owner = "client!al", name = "O", descriptor = "I")
	public static int anInt154 = 0;

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(II)Lclient!n;")
	public static Class11_Sub2 method115(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class11_Sub2_Sub3();
		} else if (arg0 == 1) {
			return new Class11_Sub2_Sub38();
		} else if (arg0 == 2) {
			return new Class11_Sub2_Sub35();
		} else if (arg0 == 3) {
			return new Class11_Sub2_Sub39();
		} else if (arg0 == 4) {
			return new Class11_Sub2_Sub13();
		} else if (arg0 == 5) {
			return new Class11_Sub2_Sub18();
		} else if (arg0 == 6) {
			return new Class11_Sub2_Sub19();
		} else if (arg0 == 7) {
			return new Class11_Sub2_Sub17();
		} else if (arg0 == 8) {
			return new Class11_Sub2_Sub34();
		} else if (arg0 == 9) {
			return new Class11_Sub2_Sub22();
		} else if (arg0 == 10) {
			return new Class11_Sub2_Sub7();
		} else if (arg0 == 11) {
			return new Class11_Sub2_Sub15();
		} else if (arg0 == 12) {
			return new Class11_Sub2_Sub27();
		} else if (arg0 == 13) {
			return new Class11_Sub2_Sub14();
		} else if (arg0 == 14) {
			return new Class11_Sub2_Sub8();
		} else if (arg0 == 15) {
			return new Class11_Sub2_Sub5();
		} else if (arg0 == 16) {
			return new Class11_Sub2_Sub33();
		} else if (arg0 == 17) {
			return new Class11_Sub2_Sub10();
		} else if (arg0 == 18) {
			return new Class11_Sub2_Sub29_Sub1();
		} else if (arg0 == 19) {
			return new Class11_Sub2_Sub37();
		} else if (arg0 == 20) {
			return new Class11_Sub2_Sub21();
		} else if (arg0 == 21) {
			return new Class11_Sub2_Sub28();
		} else if (arg0 == 22) {
			return new Class11_Sub2_Sub24();
		} else if (arg0 == 23) {
			return new Class11_Sub2_Sub11();
		} else if (arg0 == 24) {
			return new Class11_Sub2_Sub4();
		} else if (arg0 == 25) {
			return new Class11_Sub2_Sub32();
		} else if (arg0 == 26) {
			return new Class11_Sub2_Sub31();
		} else if (arg0 == 27) {
			return new Class11_Sub2_Sub23();
		} else if (arg0 == 28) {
			return new Class11_Sub2_Sub25();
		} else if (arg0 == 29) {
			return new Class11_Sub2_Sub36();
		} else if (arg0 == 30) {
			return new Class11_Sub2_Sub30();
		} else if (arg0 == 31) {
			return new Class11_Sub2_Sub6();
		} else if (arg0 == 32) {
			return new Class11_Sub2_Sub12();
		} else if (arg0 == 33) {
			return new Class11_Sub2_Sub2();
		} else if (arg0 == 34) {
			return new Class11_Sub2_Sub20();
		} else if (arg0 == 35) {
			return new Class11_Sub2_Sub1();
		} else if (arg0 == 36) {
			return new Class11_Sub2_Sub26();
		} else if (arg0 == 37) {
			return new Class11_Sub2_Sub9();
		} else if (arg0 == 38) {
			return new Class11_Sub2_Sub16();
		} else if (arg0 == 39) {
			return new Class11_Sub2_Sub29();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZI)V")
	public static void method116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class11_Sub4_Sub12 local15 = Static35.method512(7, arg0);
		local15.method3858();
		local15.anInt4390 = arg1;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method117(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) boolean local7 = false;
		for (@Pc(9) int local9 = 0; local9 < Static331.anInt6366; local9++) {
			@Pc(22) Class67_Sub3_Sub3_Sub2 local22 = Static105.aClass67_Sub3_Sub3_Sub2Array1[Static87.anIntArray104[local9]];
			if (local22 != null && local22.aString50 != null && local22.aString50.equalsIgnoreCase(arg1)) {
				local7 = true;
				if (arg0 == 1) {
					Static313.aClass11_Sub25_Sub1_5.method2454(31);
					Static313.aClass11_Sub25_Sub1_5.method5170(Static87.anIntArray104[local9]);
					Static313.aClass11_Sub25_Sub1_5.method5214(0);
				} else if (arg0 == 4) {
					Static313.aClass11_Sub25_Sub1_5.method2454(189);
					Static313.aClass11_Sub25_Sub1_5.method5214(0);
					Static313.aClass11_Sub25_Sub1_5.method5196(Static87.anIntArray104[local9]);
				} else if (arg0 == 5) {
					Static313.aClass11_Sub25_Sub1_5.method2454(162);
					Static313.aClass11_Sub25_Sub1_5.method5191(Static87.anIntArray104[local9]);
					Static313.aClass11_Sub25_Sub1_5.method5214(0);
				} else if (arg0 == 6) {
					Static313.aClass11_Sub25_Sub1_5.method2454(51);
					Static313.aClass11_Sub25_Sub1_5.method5191(Static87.anIntArray104[local9]);
					Static313.aClass11_Sub25_Sub1_5.method5189(0);
				} else if (arg0 == 7) {
					Static313.aClass11_Sub25_Sub1_5.method2454(168);
					Static313.aClass11_Sub25_Sub1_5.method5186(0);
					Static313.aClass11_Sub25_Sub1_5.method5170(Static87.anIntArray104[local9]);
				}
				break;
			}
		}
		if (!local7) {
			Static17.method228(Static19.aClass117_41.method2684(Static230.anInt4634) + arg1);
		}
	}

	@OriginalMember(owner = "client!al", name = "e", descriptor = "(B)V")
	public static void method118() {
		Static141.aClass26_22.method333();
		Static132.aClass26_21.method333();
		Static136.aClass26_59.method333();
		Static222.aClass26_42.method333();
		Static157.aClass26_28.method333();
	}
}
