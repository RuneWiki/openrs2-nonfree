import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "J")
	public static long aLong12;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
	public static int[] anIntArray25 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!cd;")
	public static Class13 aClass13_4 = new Class13();

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
	public static int anInt256 = 10;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[100];

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "Lclient!pe;")
	public static Class65 aClass65_104 = Static119.method1462("nav");

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { new short[0], { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "Lclient!pe;")
	public static Class65 aClass65_105 = Static119.method1462("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "Lclient!pe;")
	public static Class65 aClass65_106 = Static119.method1462("Mitglieder)2Welt");

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method169() {
		for (@Pc(6) Class2_Sub14 local6 = (Class2_Sub14) Static12.aClass13_5.method270(); local6 != null; local6 = (Class2_Sub14) Static12.aClass13_5.method273()) {
			if (local6.aClass2_Sub2_Sub1_1 != null) {
				Static104.aClass2_Sub2_Sub4_33.method1775(local6.aClass2_Sub2_Sub1_1);
				local6.aClass2_Sub2_Sub1_1 = null;
			}
			if (local6.aClass2_Sub2_Sub1_2 != null) {
				Static104.aClass2_Sub2_Sub4_33.method1775(local6.aClass2_Sub2_Sub1_2);
				local6.aClass2_Sub2_Sub1_2 = null;
			}
		}
		Static12.aClass13_5.method275();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method170(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static49.aClass39_1);
		arg0.addMouseMotionListener(Static49.aClass39_1);
		arg0.addFocusListener(Static49.aClass39_1);
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	public static void method173() {
		aClass13_4 = null;
		aClass65_106 = null;
		aShortArrayArray1 = null;
		aClass65_105 = null;
		anIntArray25 = null;
		aClass65_104 = null;
		aBooleanArray3 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)Lclient!ge;")
	public static Class2_Sub1_Sub5 method174(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub5 local10 = (Class2_Sub1_Sub5) Static117.aClass8_57.method172((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static5.method125(Static17.aClass56_8, Static99.aClass56_32, arg0);
		if (local10 != null) {
			Static117.aClass8_57.method176((long) arg0, local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
	public static void method175() {
		Static16.aClass13_14 = new Class13();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)I")
	public static int method178(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static88.aByteArrayArrayArray3[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static88.aByteArrayArrayArray3[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
