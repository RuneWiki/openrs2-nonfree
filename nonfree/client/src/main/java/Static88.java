import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!er", name = "m", descriptor = "Lclient!jq;")
	public static Class1_Sub21 aClass1_Sub21_1;

	@OriginalMember(owner = "client!er", name = "t", descriptor = "I")
	public static int anInt1641;

	@OriginalMember(owner = "client!er", name = "p", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_53 = new Class48(69, 4);

	@OriginalMember(owner = "client!er", name = "q", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!er", name = "u", descriptor = "[I")
	public static final int[] anIntArray214 = new int[1000];

	@OriginalMember(owner = "client!er", name = "v", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_36 = new Class211(30, 5);

	@OriginalMember(owner = "client!er", name = "w", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_37 = new Class211(76, 2);

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
	public static String[] method1335(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static17.method193(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg1 != arg0.charAt(local30); local30++) {
			}
			local15[local22++] = arg0.substring(local24, local30);
			local24 = local30 + 1;
		}
		local15[local10] = arg0.substring(local24);
		return local15;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	public static void method1338() {
		Static264.aClass154_1.method3992();
		Static300.aClass182_1.method4111();
		if (Static202.aClass114_1 != null) {
			Static202.aClass114_1.method2986(Static177.aCanvas3);
		}
		Static305.aClient1.method799();
		Static177.aCanvas3.setBackground(Color.black);
		Static3.anInt15 = -1;
		Static264.aClass154_1 = Static308.method4588(Static177.aCanvas3);
		Static300.aClass182_1 = Static46.method709(Static177.aCanvas3);
		if (Static202.aClass114_1 != null) {
			Static202.aClass114_1.method2988(Static177.aCanvas3);
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
	public static void method1340() {
		Static215.anInt3678 = 0;
		Static358.aClass17_66.method205();
		Static65.aBoolean115 = false;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIII)I")
	public static int method1342(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20 = 65536 - Class13.anIntArray21[arg0 * 8192 / arg2] >> 1;
		return (arg1 * local20 >> 16) + ((65536 - local20) * arg3 >> 16);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
	public static void method1343() {
		for (@Pc(18) Class1_Sub18 local18 = (Class1_Sub18) Static67.aClass17_11.method202(); local18 != null; local18 = (Class1_Sub18) Static67.aClass17_11.method207()) {
			if (local18.aBoolean247) {
				local18.method2348();
			}
		}
		for (@Pc(38) Class1_Sub18 local38 = (Class1_Sub18) Static102.aClass17_30.method202(); local38 != null; local38 = (Class1_Sub18) Static102.aClass17_30.method207()) {
			if (local38.aBoolean247) {
				local38.method2348();
			}
		}
	}
}
