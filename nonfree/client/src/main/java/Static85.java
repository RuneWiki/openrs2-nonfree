import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "[Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1[] aClass2_Sub3_Sub2_Sub1Array4;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "Lclient!te;")
	public static Class2_Sub3_Sub2_Sub4_Sub1 aClass2_Sub3_Sub2_Sub4_Sub1_5;

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "Lclient!ai;")
	private static Class6 aClass6_643 = Static38.method685("Sorry invited players only)3");

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "Lclient!ai;")
	public static Class6 aClass6_642 = aClass6_643;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "Lclient!db;")
	public static Class16 aClass16_5 = new Class16(4096);

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "Lclient!ai;")
	public static Class6 aClass6_644 = Static38.method685(":clanreq:");

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)V")
	public static void method1459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = arg3; local3 <= arg0 + arg3; local3++) {
			for (@Pc(7) int local7 = arg1; local7 <= arg2 + arg1; local7++) {
				if (local7 >= 0 && local7 < 104 && local3 >= 0 && local3 < 104) {
					Static40.aByteArrayArrayArray2[0][local7][local3] = 127;
					if (local7 == arg1 && local7 > 0) {
						Static165.anIntArrayArrayArray10[0][local7][local3] = Static165.anIntArrayArrayArray10[0][local7 - 1][local3];
					}
					if (arg2 + arg1 == local7 && local7 < 103) {
						Static165.anIntArrayArrayArray10[0][local7][local3] = Static165.anIntArrayArrayArray10[0][local7 + 1][local3];
					}
					if (local3 == arg3 && local3 > 0) {
						Static165.anIntArrayArrayArray10[0][local7][local3] = Static165.anIntArrayArrayArray10[0][local7][local3 - 1];
					}
					if (local3 == arg3 + arg0 && local3 < 103) {
						Static165.anIntArrayArrayArray10[0][local7][local3] = Static165.anIntArrayArrayArray10[0][local7][local3 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method1460() {
		aClass2_Sub3_Sub2_Sub1Array4 = null;
		aClass2_Sub3_Sub2_Sub4_Sub1_5 = null;
		aClass16_5 = null;
		aClass6_644 = null;
		aClass6_642 = null;
		aClass6_643 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BZ)V")
	public static void method1461(@OriginalArg(1) boolean arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static81.anInt1985; local3++) {
			@Pc(21) int local21 = (Static149.anIntArray312[local3] << 14) + 536870912;
			@Pc(27) Class2_Sub3_Sub5_Sub1_Sub2 local27 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[Static149.anIntArray312[local3]];
			if (local27 != null && local27.method1806() && arg0 == local27.aClass2_Sub3_Sub17_1.aBoolean155 && local27.aClass2_Sub3_Sub17_1.method2647()) {
				@Pc(52) int local52 = local27.anInt2672 >> 7;
				@Pc(57) int local57 = local27.anInt2674 >> 7;
				if (local57 >= 0 && local57 < 104 && local52 >= 0 && local52 < 104) {
					if (local27.anInt2695 == 1 && (local27.anInt2674 & 0x7F) == 64 && (local27.anInt2672 & 0x7F) == 64) {
						if (Static51.anIntArrayArray24[local57][local52] == Static106.anInt4182) {
							continue;
						}
						Static51.anIntArrayArray24[local57][local52] = Static106.anInt4182;
					}
					if (!local27.aClass2_Sub3_Sub17_1.aBoolean157) {
						local21 += Integer.MIN_VALUE;
					}
					local27.anInt2697 = Static131.method2041(local27.anInt2695 * 64 + local27.anInt2674 - 64, local27.anInt2672 - -((local27.anInt2695 - 1) * 64), Static36.anInt1020);
					Static30.aClass44_1.method1267(Static36.anInt1020, local27.anInt2674, local27.anInt2672, local27.anInt2697, local27.anInt2695 * 64 + 60 - 64, local27, local27.anInt2681, local21, local27.aBoolean110);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!je;Lclient!mb;ZI)V")
	public static void method1462(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class10_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub12 local7 = new Class2_Sub12();
		local7.aClass10_Sub1_9 = arg1;
		local7.aLong241 = arg2;
		local7.anInt1762 = 1;
		local7.aClass40_1 = arg0;
		@Pc(22) Class84 local22 = Static25.aClass84_2;
		synchronized (Static25.aClass84_2) {
			Static25.aClass84_2.method2701(local7);
		}
		Static113.method1831();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZZ)V")
	public static void method1463(@OriginalArg(3) boolean arg0) {
		Static50.anInt1375 = 22050;
		Static23.aBoolean20 = arg0;
		Static61.anInt1524 = 2;
	}
}
