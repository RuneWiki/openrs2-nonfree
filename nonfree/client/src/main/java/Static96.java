import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!fd", name = "S", descriptor = "Lclient!es;")
	public static Class73 aClass73_2;

	@OriginalMember(owner = "client!fd", name = "L", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_39 = new Class211(3, -2);

	@OriginalMember(owner = "client!fd", name = "P", descriptor = "[Z")
	public static final boolean[] aBooleanArray9 = new boolean[100];

	@OriginalMember(owner = "client!fd", name = "R", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_57 = new Class48(1, 8);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIII)Z")
	public static boolean method1396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static373.aByteArrayArrayArray16[0][arg1][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static373.aByteArrayArrayArray16[arg3][arg1][arg2] & 0x10) == 0) {
			return Static147.method2200(arg1, arg3, arg2) == arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!tn;")
	public static Class193 method1397(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class193_Sub2");
			@Pc(15) Class193 local15 = (Class193) local11.getDeclaredConstructor().newInstance();
			local15.method4807(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class193_Sub1 local26 = new Class193_Sub1();
			local26.method4807(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)V")
	public static void method1399(@OriginalArg(0) int arg0) {
		if (arg0 == Static56.anInt1154) {
			return;
		}
		Static92.anInt1675 = Static262.anInt6340 = Static5.anIntArray10[arg0];
		Static66.aClass164_2.method5390(50, (int) ((double) Static92.anInt1675 * 34.46D));
		Static51.anIntArrayArray15 = new int[Static92.anInt1675][Static262.anInt6340];
		Static8.anIntArrayArray1 = new int[Static92.anInt1675][Static262.anInt6340];
		Static384.anIntArrayArrayArray14 = new int[4][Static92.anInt1675 >> 3][Static262.anInt6340 >> 3];
		for (@Pc(47) int local47 = 0; local47 < 4; local47++) {
			Static257.aClass222Array1[local47] = Static26.method469(Static92.anInt1675, Static262.anInt6340);
		}
		Static383.aByteArrayArrayArray17 = new byte[4][Static92.anInt1675][Static262.anInt6340];
		Static323.method4726(Static92.anInt1675, Static262.anInt6340);
		Static173.method2546(Static92.anInt1675 >> 3, Static66.aClass164_2, Static262.anInt6340 >> 3);
		Static56.anInt1154 = arg0;
	}
}
