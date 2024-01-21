import java.awt.Canvas;
import java.math.BigInteger;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!re;")
	public static Class4_Sub13 aClass4_Sub13_4;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
	public static int anInt1978;

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "[I")
	public static int[] anIntArray199;

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "J")
	public static long aLong72;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
	public static int anInt1974 = 1;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!qc;")
	public static Class60 aClass60_811 = Static121.method2047(")1");

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
	public static int anInt1975 = 0;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
	public static int anInt1976 = 0;

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!qc;")
	public static Class60 aClass60_812 = Static121.method2047(")3");

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "Lclient!qc;")
	public static Class60 aClass60_813 = Static121.method2047("http:)4)4");

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "Lclient!qc;")
	public static Class60 aClass60_814 = Static121.method2047("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "[I")
	public static int[] anIntArray198 = new int[5];

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "Lclient!qc;")
	private static Class60 aClass60_815 = Static121.method2047("Loading title screen )2 ");

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_816 = aClass60_815;

	@OriginalMember(owner = "client!oe", name = "y", descriptor = "Lclient!qc;")
	private static Class60 aClass60_820 = Static121.method2047("Cancel");

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "Lclient!qc;")
	public static Class60 aClass60_817 = aClass60_820;

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "Lclient!qc;")
	public static Class60 aClass60_818 = Static121.method2047("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "Lclient!qc;")
	public static Class60 aClass60_819 = Static121.method2047("blinken3:");

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
	public static int anInt1979 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)V")
	public static void method1467(@OriginalArg(1) boolean arg0) {
		@Pc(7) int local7 = Static43.anInt1107;
		if (arg0) {
			local7 = 1;
		}
		if (Static81.anInt1951 == Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620 >> 7 && Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601 >> 7 == Static123.anInt2922) {
			Static81.anInt1951 = 0;
		}
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(41) Class4_Sub4_Sub1_Sub2_Sub2 local41;
			@Pc(47) int local47;
			if (arg0) {
				local47 = 33538048;
				local41 = Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1;
			} else {
				local41 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[Static94.anIntArray231[local31]];
				local47 = Static94.anIntArray231[local31] << 14;
			}
			if (local41 != null && local41.method1877()) {
				local41.aBoolean114 = false;
				@Pc(67) int local67 = local41.anInt2601 >> 7;
				@Pc(72) int local72 = local41.anInt2620 >> 7;
				if ((Static61.aBoolean57 && Static43.anInt1107 > 50 || Static43.anInt1107 > 200) && !arg0 && local41.anInt2632 == local41.anInt2594) {
					local41.aBoolean114 = true;
				}
				if (local72 >= 0 && local72 < 104 && local67 >= 0 && local67 < 104) {
					if (local41.aClass4_Sub4_Sub1_Sub6_3 == null || local41.anInt2656 > Static81.anInt1944 || local41.anInt2661 <= Static81.anInt1944) {
						if ((local41.anInt2620 & 0x7F) == 64 && (local41.anInt2601 & 0x7F) == 64) {
							if (Static87.anInt2044 == Static107.anIntArrayArray28[local72][local67]) {
								continue;
							}
							Static107.anIntArrayArray28[local72][local67] = Static87.anInt2044;
						}
						local41.anInt2670 = Static54.method1001(local41.anInt2620, local41.anInt2601, Static129.anInt3003);
						Static7.aClass28_3.method774(Static129.anInt3003, local41.anInt2620, local41.anInt2601, local41.anInt2670, 60, local41, local41.anInt2591, local47, local41.aBoolean112);
					} else {
						local41.aBoolean114 = false;
						local41.anInt2670 = Static54.method1001(local41.anInt2620, local41.anInt2601, Static129.anInt3003);
						Static7.aClass28_3.method781(Static129.anInt3003, local41.anInt2620, local41.anInt2601, local41.anInt2670, local41, local41.anInt2591, local47, local41.anInt2667, local41.anInt2654, local41.anInt2662, local41.anInt2659);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static void method1468() {
		if (!Static93.aBoolean105) {
			Static112.aClass60Array24[0] = aClass60_817;
			Static36.anIntArray71[0] = 1003;
			Static25.anInt693 = 1;
			Static9.aClass60Array2[0] = Static22.aClass60_241;
		}
		if (Static23.anInt664 != -1) {
			Static66.method1106(Static23.anInt664);
		}
		for (@Pc(33) int local33 = 0; local33 < Static92.anInt2256; local33++) {
			if (Static69.aBooleanArray8[local33]) {
				Static74.aBooleanArray9[local33] = true;
			}
			Static41.aBooleanArray6[local33] = Static69.aBooleanArray8[local33];
			Static69.aBooleanArray8[local33] = false;
		}
		Static74.anInt1858 = -1;
		Static127.anInt2974 = Static81.anInt1944;
		Static30.aClass4_Sub17_3 = null;
		Static130.anInt3018 = -1;
		if (Static23.anInt664 != -1) {
			Static92.anInt2256 = 0;
			Static43.method721(Static23.anInt664, 0, 0, -1, 503, 0, 765, 0);
		}
		Static39.method670();
		if (Static93.aBoolean105) {
			Static69.method1338();
		} else if (Static130.anInt3018 != -1) {
			Static130.method2132(Static74.anInt1858, Static130.anInt3018);
		}
		if (Static31.anInt847 == 3) {
			Static80.method1711();
			for (@Pc(108) int local108 = 0; local108 < Static92.anInt2256; local108++) {
				if (Static41.aBooleanArray6[local108]) {
					Static80.method1714(Static60.anIntArray235[local108], Static125.anIntArray330[local108], Static109.anIntArray290[local108], Static101.anIntArray276[local108], 16711935, 128);
				} else if (Static74.aBooleanArray9[local108]) {
					Static80.method1714(Static60.anIntArray235[local108], Static125.anIntArray330[local108], Static109.anIntArray290[local108], Static101.anIntArray276[local108], 16711680, 128);
				}
			}
		}
		Static121.method2049(Static129.anInt3003, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601, Static15.anInt2962);
		Static15.anInt2962 = 0;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	public static void method1469() {
		for (@Pc(10) Class4_Sub4_Sub1_Sub4 local10 = (Class4_Sub4_Sub1_Sub4) Static129.aClass70_19.method1939(); local10 != null; local10 = (Class4_Sub4_Sub1_Sub4) Static129.aClass70_19.method1936()) {
			if (Static129.anInt3003 != local10.anInt996 || local10.anInt1007 < Static81.anInt1944) {
				local10.method2124();
			} else if (local10.anInt1008 <= Static81.anInt1944) {
				if (local10.anInt997 > 0) {
					@Pc(42) Class4_Sub4_Sub1_Sub2_Sub1 local42 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local10.anInt997 - 1];
					if (local42 != null && local42.anInt2620 >= 0 && local42.anInt2620 < 13312 && local42.anInt2601 >= 0 && local42.anInt2601 < 13312) {
						local10.method673(Static54.method1001(local42.anInt2620, local42.anInt2601, local10.anInt996) - local10.anInt1006, local42.anInt2620, local42.anInt2601, Static81.anInt1944);
					}
				}
				if (local10.anInt997 < 0) {
					@Pc(91) int local91 = -local10.anInt997 - 1;
					@Pc(96) Class4_Sub4_Sub1_Sub2_Sub2 local96;
					if (Static18.anInt467 == local91) {
						local96 = Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1;
					} else {
						local96 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local91];
					}
					if (local96 != null && local96.anInt2620 >= 0 && local96.anInt2620 < 13312 && local96.anInt2601 >= 0 && local96.anInt2601 < 13312) {
						local10.method673(Static54.method1001(local96.anInt2620, local96.anInt2601, local10.anInt996) - local10.anInt1006, local96.anInt2620, local96.anInt2601, Static81.anInt1944);
					}
				}
				local10.method671(Static15.anInt2962);
				Static7.aClass28_3.method774(Static129.anInt3003, (int) local10.aDouble2, (int) local10.aDouble4, (int) local10.aDouble5, 60, local10, local10.anInt1011, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
	public static void method1470() {
		aClass60_811 = null;
		aBigInteger2 = null;
		aClass60_813 = null;
		aClass60_817 = null;
		aClass4_Sub13_4 = null;
		aCRC32_2 = null;
		aClass60_814 = null;
		aClass60_818 = null;
		aClass60_816 = null;
		aClass60_812 = null;
		anIntArray199 = null;
		aClass60_820 = null;
		aClass60_815 = null;
		aCanvas1 = null;
		anIntArray198 = null;
		aClass60_819 = null;
	}
}
