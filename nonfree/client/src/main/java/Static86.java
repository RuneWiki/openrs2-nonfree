import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!p", name = "g", descriptor = "J")
	public static long aLong52;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "I")
	public static int anInt1611;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "I")
	public static int anInt1612;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!qf;")
	public static Class60 aClass60_715 = Static59.method1195(")1j");

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Lclient!qf;")
	private static Class60 aClass60_716 = Static59.method1195("Your friend list is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!qf;")
	private static Class60 aClass60_718 = Static59.method1195("Connection lost");

	@OriginalMember(owner = "client!p", name = "d", descriptor = "Lclient!qf;")
	public static Class60 aClass60_717 = aClass60_718;

	@OriginalMember(owner = "client!p", name = "q", descriptor = "Lclient!qf;")
	private static Class60 aClass60_723 = Static59.method1195("Report abuse");

	@OriginalMember(owner = "client!p", name = "h", descriptor = "Lclient!qf;")
	public static Class60 aClass60_719 = aClass60_723;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "[I")
	public static int[] anIntArray190 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Lclient!qf;")
	public static Class60 aClass60_720 = Static59.method1195("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Lclient!qf;")
	public static Class60 aClass60_721 = Static59.method1195("Icons redrawn");

	@OriginalMember(owner = "client!p", name = "o", descriptor = "I")
	public static int anInt1613 = 1;

	@OriginalMember(owner = "client!p", name = "p", descriptor = "Lclient!qf;")
	public static Class60 aClass60_722 = aClass60_716;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)I")
	public static int method1064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = 256 - arg1;
		return (local12 * (arg0 & 0xFF00FF) + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * local12 + ((arg2 & 0xFF00) * arg1) & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!mf;I)Lclient!mf;")
	public static Class3_Sub15 method1065(@OriginalArg(0) Class3_Sub15 arg0) {
		@Pc(12) Class3_Sub15 local12 = Static4.method88(arg0);
		if (local12 == null) {
			local12 = arg0.aClass3_Sub15_1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
	public static void method1066() {
		try {
			@Pc(13) Graphics local13 = Static2.aCanvas1.getGraphics();
			Static43.aClass16_37.method1664(17, 357, local13);
		} catch (@Pc(21) Exception local21) {
			Static2.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Lclient!mf;")
	public static Class3_Sub15 method1067(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static120.aClass3_Sub15ArrayArray1[local3] == null || Static120.aClass3_Sub15ArrayArray1[local3][local11] == null) {
			@Pc(30) boolean local30 = Static21.method563(local3);
			if (!local30) {
				return null;
			}
		}
		return Static120.aClass3_Sub15ArrayArray1[local3][local11];
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public static void method1068() {
		aClass60_718 = null;
		aClass60_722 = null;
		aClass60_720 = null;
		aClass60_715 = null;
		aClass60_723 = null;
		aClass60_717 = null;
		aClass60_716 = null;
		aClass60_721 = null;
		aClass60_719 = null;
		anIntArray190 = null;
	}
}
