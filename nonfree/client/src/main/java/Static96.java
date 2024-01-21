import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!pc", name = "F", descriptor = "Lclient!db;")
	public static Class13 aClass13_2;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	public static int anInt547 = 0;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	public static int anInt549 = 0;

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "Lclient!ic;")
	private static Class34 aClass34_281 = Static56.method816("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!ic;")
	public static Class34 aClass34_278 = aClass34_281;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	public static int anInt552 = 0;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "Lclient!ic;")
	public static Class34 aClass34_279 = Static56.method816("<col=00ff00>");

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "Lclient!ic;")
	private static Class34 aClass34_280 = Static56.method816("Loaded sprites");

	@OriginalMember(owner = "client!pc", name = "I", descriptor = "Lclient!ic;")
	public static Class34 aClass34_282 = Static56.method816("Clientscript error in: ");

	@OriginalMember(owner = "client!pc", name = "L", descriptor = "Lclient!ic;")
	public static Class34 aClass34_283 = aClass34_280;

	@OriginalMember(owner = "client!pc", name = "N", descriptor = "Lclient!ic;")
	public static Class34 aClass34_284 = Static56.method816("event_opbase");

	@OriginalMember(owner = "client!pc", name = "R", descriptor = "Lclient!ic;")
	public static Class34 aClass34_285 = Static56.method816("b12_full");

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static void method333() {
		@Pc(10) int local10 = Static82.anInt1959 + (Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043 >> 7);
		Static10.anInt226 = 0;
		@Pc(23) int local23 = Static64.anInt2062 + (Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059 >> 7);
		if (local10 >= 3053 && local10 <= 3156 && local23 >= 3056 && local23 <= 3136) {
			Static10.anInt226 = 1;
		}
		if (local10 >= 3072 && local10 <= 3118 && local23 >= 9492 && local23 <= 9535) {
			Static10.anInt226 = 1;
		}
		if (Static10.anInt226 == 1 && local10 >= 3139 && local10 <= 3199 && local23 >= 3008 && local23 <= 3062) {
			Static10.anInt226 = 0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!f;B)V")
	public static void method334(@OriginalArg(0) Class21 arg0) {
		Static126.aClass21_3 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method335() {
		aClass34_280 = null;
		aClass34_283 = null;
		aClass34_278 = null;
		aClass34_284 = null;
		aClass13_2 = null;
		aClass34_281 = null;
		aClass34_285 = null;
		aClass34_282 = null;
		aClass34_279 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!dd;I)Lclient!ff;")
	public static Class8_Sub8 method338(@OriginalArg(1) Class14 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method1157(arg1);
		return local8 == null ? null : new Class8_Sub8(local8);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
	public static void method339(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class8_Sub1_Sub17 local11 = Static120.method1896(arg1);
		@Pc(14) int local14 = local11.anInt2494;
		@Pc(17) int local17 = local11.anInt2492;
		@Pc(20) int local20 = local11.anInt2495;
		@Pc(27) int local27 = Class23.anIntArray127[local14 - local17];
		if (arg0 < 0 || local27 < arg0) {
			arg0 = 0;
		}
		local27 <<= local17;
		Static78.anIntArray238[local20] = ~local27 & Static78.anIntArray238[local20] | local27 & arg0 << local17;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
	public static void method341(@OriginalArg(0) int arg0) {
		if (arg0 == -3) {
			Static74.method1091(Static64.aClass34_921, Static29.aClass34_433, Static83.aClass34_946);
		} else if (arg0 == -2) {
			Static74.method1091(Static29.aClass34_432, Static29.aClass34_424, Static32.aClass34_461);
		} else if (arg0 == -1) {
			Static74.method1091(Static80.aClass34_868, Static29.aClass34_408, Static83.aClass34_939);
		} else if (arg0 == 3) {
			Static74.method1091(Static29.aClass34_438, Static29.aClass34_426, Static4.aClass34_26);
		} else if (arg0 == 4) {
			Static74.method1091(Static100.aClass34_1102, Static29.aClass34_437, Static51.aClass34_680);
		} else if (arg0 == 5) {
			Static74.method1091(Static128.aClass34_1382, Static29.aClass34_430, Static73.aClass34_821);
		} else if (arg0 == 6) {
			Static74.method1091(Static133.aClass34_1426, Static29.aClass34_442, Static7.aClass34_41);
		} else if (arg0 == 7) {
			Static74.method1091(Static41.aClass34_524, Static29.aClass34_421, Static31.aClass34_452);
		} else if (arg0 == 8) {
			Static74.method1091(Static124.aClass34_1365, Static29.aClass34_422, Static130.aClass34_1414);
		} else if (arg0 == 9) {
			Static74.method1091(Static48.aClass34_1355, Static29.aClass34_425, Static125.aClass34_1377);
		} else if (arg0 == 10) {
			Static74.method1091(Static124.aClass34_1367, Static29.aClass34_414, Static20.aClass34_308);
		} else if (arg0 == 11) {
			Static74.method1091(Static20.aClass34_300, Static29.aClass34_429, Static64.aClass34_924);
		} else if (arg0 == 12) {
			Static74.method1091(Static95.aClass34_1043, Static29.aClass34_441, Static128.aClass34_1386);
		} else if (arg0 == 13) {
			Static74.method1091(Static21.aClass34_324, Static29.aClass34_444, Static83.aClass34_945);
		} else if (arg0 == 14) {
			Static74.method1091(Static59.aClass34_743, Static29.aClass34_447, Static111.aClass34_1397);
		} else if (arg0 == 16) {
			Static74.method1091(Static91.aClass34_1016, Static29.aClass34_410, Static59.aClass34_738);
		} else if (arg0 == 17) {
			Static74.method1091(Static24.aClass34_859, Static29.aClass34_413, Static73.aClass34_819);
		} else if (arg0 == 18) {
			Static74.method1091(Static53.aClass34_690, Static29.aClass34_418, aClass34_278);
		} else if (arg0 == 19) {
			Static74.method1091(Static97.aClass34_1054, Static31.aClass34_453, Static48.aClass34_1352);
		} else if (arg0 == 20) {
			Static74.method1091(Static29.aClass34_419, Static29.aClass34_417, Static83.aClass34_938);
		} else if (arg0 == 22) {
			Static74.method1091(Static2.aClass34_8, Static29.aClass34_445, Static113.aClass34_1206);
		} else if (arg0 == 23) {
			Static74.method1091(Static56.aClass34_704, Static29.aClass34_435, Static111.aClass34_1400);
		} else if (arg0 == 24) {
			Static74.method1091(Static73.aClass34_822, Static29.aClass34_423, Static81.aClass34_886);
		} else if (arg0 == 25) {
			Static74.method1091(Static73.aClass34_829, Static29.aClass34_436, Static83.aClass34_944);
		} else if (arg0 == 26) {
			Static74.method1091(Static86.aClass34_1003, Static29.aClass34_416, Static112.aClass34_1182);
		} else if (arg0 == 27) {
			Static74.method1091(Static29.aClass34_427, Static29.aClass34_409, Static130.aClass34_1413);
		} else {
			Static74.method1091(Static111.aClass34_1393, Static29.aClass34_412, Static83.aClass34_947);
		}
		Static82.method1201(10);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method345(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}
}
