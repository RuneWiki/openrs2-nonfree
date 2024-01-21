import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!of", name = "t", descriptor = "[I")
	public static int[] anIntArray280;

	@OriginalMember(owner = "client!of", name = "u", descriptor = "[Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1[] aClass2_Sub1_Sub9_Sub1Array10;

	@OriginalMember(owner = "client!of", name = "y", descriptor = "I")
	public static int anInt2120;

	@OriginalMember(owner = "client!of", name = "z", descriptor = "Lclient!kc;")
	public static Class22 aClass22_16;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "Lclient!wd;")
	private static Class80 aClass80_833 = Static2.method59("Loading )2 please wait)3");

	@OriginalMember(owner = "client!of", name = "j", descriptor = "Lclient!wd;")
	public static Class80 aClass80_834 = Static2.method59("compass");

	@OriginalMember(owner = "client!of", name = "k", descriptor = "I")
	public static int anInt2112 = 0;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "I")
	public static int anInt2114 = 0;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "Lclient!wd;")
	public static Class80 aClass80_835 = aClass80_833;

	@OriginalMember(owner = "client!of", name = "x", descriptor = "Lclient!i;")
	public static Class32 aClass32_41 = new Class32(50);

	@OriginalMember(owner = "client!of", name = "A", descriptor = "Lclient!wd;")
	public static Class80 aClass80_836 = Static2.method59("backleft1");

	@OriginalMember(owner = "client!of", name = "B", descriptor = "[I")
	public static int[] anIntArray281 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method1280(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 <= 0 || local6 >= 256) {
			local6 = -1;
		}
		return local6;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BII)I")
	public static int method1282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class2_Sub18 local14 = (Class2_Sub18) Static104.aClass41_12.method1056((long) arg0);
		if (local14 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local14.anIntArray364.length) {
			return local14.anIntArray364[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	public static void method1283() {
		aClass22_16 = null;
		aClass80_836 = null;
		aClass32_41 = null;
		anIntArray281 = null;
		anIntArray280 = null;
		aClass80_833 = null;
		aClass80_834 = null;
		aClass2_Sub1_Sub9_Sub1Array10 = null;
		aClass80_835 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V")
	public static void method1284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class58 local11 = Static45.aClass58ArrayArrayArray3[Static16.anInt444][arg0][arg1];
		if (local11 == null) {
			Static93.aClass64_1.method1606(Static16.anInt444, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class2_Sub1_Sub1_Sub5 local23 = null;
		@Pc(36) Class2_Sub1_Sub1_Sub5 local36;
		for (local36 = (Class2_Sub1_Sub1_Sub5) local11.method1285(); local36 != null; local36 = (Class2_Sub1_Sub1_Sub5) local11.method1281()) {
			@Pc(42) Class2_Sub1_Sub5 local42 = Static4.method95(local36.anInt960);
			@Pc(45) int local45 = local42.anInt782;
			if (local42.anInt792 == 1) {
				local45 *= local36.anInt961 + 1;
			}
			if (local45 > local21) {
				local21 = local45;
				local23 = local36;
			}
		}
		if (local23 == null) {
			Static93.aClass64_1.method1606(Static16.anInt444, arg0, arg1);
			return;
		}
		local11.method1289(local23);
		local36 = (Class2_Sub1_Sub1_Sub5) local11.method1285();
		@Pc(91) Class2_Sub1_Sub1_Sub5 local91 = null;
		@Pc(93) Class2_Sub1_Sub1_Sub5 local93 = null;
		while (local36 != null) {
			if (local36.anInt960 != local23.anInt960) {
				if (local91 == null) {
					local91 = local36;
				}
				if (local91.anInt960 != local36.anInt960 && local93 == null) {
					local93 = local36;
				}
			}
			local36 = (Class2_Sub1_Sub1_Sub5) local11.method1281();
		}
		@Pc(131) int local131 = (arg1 << 7) + arg0 + 1610612736;
		Static93.aClass64_1.method1623(Static16.anInt444, arg0, arg1, Static24.method513(arg0 * 128 + 64, Static16.anInt444, arg1 * 128 + 64), local23, local131, local91, local93);
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)Lclient!p;")
	public static Class59 method1287() {
		try {
			return (Class59) Class.forName("Class59_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}
}
