import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
	public static int anInt3099;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
	public static int anInt3098 = 0;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "[Lclient!jg;")
	public static final Class42[] aClass42Array3 = new Class42[6];

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_865 = Static158.method3034("(Y<)4col>");

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
	public static int anInt3101 = 0;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
	public static int anInt3104 = 0;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_866 = Static158.method3034("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "Lclient!ob;")
	public static Class60 aClass60_867 = aClass60_866;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "[I")
	public static final int[] anIntArray355 = new int[50];

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_868 = Static158.method3034("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar4 = Calendar.getInstance();

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III[BII[Lclient!hi;III)V")
	public static void method2445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class35[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (local3 + arg3 > 0 && local3 + arg3 < 103 && local7 + arg7 > 0 && arg7 + local7 < 103) {
					arg5[arg4].anIntArrayArray14[local3 + arg3][arg7 + local7] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(89) Class2_Sub3 local89 = new Class2_Sub3(arg2);
		for (@Pc(91) int local91 = 0; local91 < 4; local91++) {
			for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
				for (@Pc(99) int local99 = 0; local99 < 64; local99++) {
					if (arg6 == local91 && arg8 <= local95 && arg8 + 8 > local95 && arg0 <= local99 && arg0 + 8 > local99) {
						Static95.method2245(0, arg3 + Static83.method1958(local95 & 0x7, arg1, local99 & 0x7), Static134.method2775(local99 & 0x7, local95 & 0x7, arg1) + arg7, arg4, 0, local89, arg1);
					} else {
						Static95.method2245(0, -1, -1, 0, 0, local89, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method2446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class2_Sub17 local7 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass74_1 != null && local7.aClass74_1.aLong127 == arg3) {
			return true;
		} else if (local7.aClass26_1 != null && local7.aClass26_1.aLong49 == arg3) {
			return true;
		} else if (local7.aClass52_1 != null && local7.aClass52_1.aLong105 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt3604; local46++) {
				if (local7.aClass6Array2[local46].aLong8 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIZI)I")
	public static int method2447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 <= arg2) {
			return arg1 < arg2 ? arg1 : arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
	public static void method2449() {
		Static90.aClass89_31.method3439();
	}
}
