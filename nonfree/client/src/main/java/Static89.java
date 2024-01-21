import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
	public static int anInt2374;

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
	public static int anInt2372 = 0;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "Lclient!ec;")
	public static Class22 aClass22_680 = Static60.method1113(" loggt sich ein)3");

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "[Z")
	public static boolean[] aBooleanArray18 = new boolean[112];

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "Lclient!ec;")
	private static Class22 aClass22_681 = Static60.method1113("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
	public static int anInt2376 = 0;

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "Lclient!ec;")
	public static Class22 aClass22_682 = Static60.method1113("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!pc", name = "D", descriptor = "Lclient!ec;")
	public static Class22 aClass22_683 = Static60.method1113("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "Lclient!ec;")
	public static Class22 aClass22_684 = aClass22_681;

	@OriginalMember(owner = "client!pc", name = "G", descriptor = "Lclient!ec;")
	public static Class22 aClass22_685 = Static60.method1113("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)V")
	public static void method1566(@OriginalArg(1) int arg0) {
		for (@Pc(6) Class4_Sub9 local6 = (Class4_Sub9) Static96.aClass81_12.method2017(); local6 != null; local6 = (Class4_Sub9) Static96.aClass81_12.method2013()) {
			if ((long) arg0 == (local6.aLong99 >> 48 & 0xFFFFL)) {
				local6.method1999();
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method1567() {
		Static110.anIntArray303 = new int[33];
		Static31.anIntArray90 = new int[33];
		Static2.anIntArray1 = new int[151];
		Static80.anIntArray225 = new int[151];
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(27) int local27;
		for (@Pc(19) int local19 = 0; local19 < 33; local19++) {
			local23 = 999;
			local25 = 0;
			for (local27 = 0; local27 < 34; local27++) {
				if (Static16.aClass4_Sub1_Sub2_Sub3_2.aByteArray11[Static16.aClass4_Sub1_Sub2_Sub3_2.anInt1206 * local19 + local27] == 0) {
					if (local23 == 999) {
						local23 = local27;
					}
				} else if (local23 != 999) {
					local25 = local27;
					break;
				}
			}
			Static31.anIntArray90[local19] = local23;
			Static110.anIntArray303[local19] = local25 - local23;
		}
		for (local23 = 5; local23 < 156; local23++) {
			local25 = 999;
			local27 = 0;
			for (@Pc(94) int local94 = 25; local94 < 172; local94++) {
				if (Static16.aClass4_Sub1_Sub2_Sub3_2.aByteArray11[local94 + Static16.aClass4_Sub1_Sub2_Sub3_2.anInt1206 * local23] == 0 && (local94 > 34 || local23 > 34)) {
					if (local25 == 999) {
						local25 = local94;
					}
				} else if (local25 != 999) {
					local27 = local94;
					break;
				}
			}
			Static80.anIntArray225[local23 - 5] = local25 - 25;
			Static2.anIntArray1[local23 - 5] = local27 - local25;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([BIIII[Lclient!qf;I)V")
	public static void method1568(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class60[] arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (local11 + arg5 > 0 && local11 + arg5 < 103 && arg2 + local15 > 0 && arg2 + local15 < 103) {
						arg4[local7].anIntArrayArray27[local11 + arg5][local15 + arg2] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(91) Class4_Sub11 local91 = new Class4_Sub11(arg0);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
				for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
					Static112.method1798(local91, local15, arg1, 0, arg2 + local106, arg5 + local102, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
	public static void method1569() {
		aClass22_684 = null;
		aBooleanArray18 = null;
		aClass22_680 = null;
		aClass22_681 = null;
		aClass22_683 = null;
		aClass22_685 = null;
		aClass22_682 = null;
		aCanvas1 = null;
	}
}
