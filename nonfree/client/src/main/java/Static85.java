import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "[I")
	public static int[] anIntArray286;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
	public static int anInt2263;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "[Lclient!a;")
	public static Class1[] aClass1Array21;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "Lclient!wc;")
	public static Class4 aClass4_52;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
	public static int anInt2254 = 0;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "Lclient!i;")
	public static Class25 aClass25_6 = new Class25(4096);

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
	public static final int anInt2261 = 0;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "Lclient!a;")
	private static Class1 aClass1_2373 = Static94.method1596("glow3:");

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "Lclient!a;")
	public static Class1 aClass1_2367 = aClass1_2373;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
	public static int anInt2262 = 0;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "Lclient!a;")
	public static Class1 aClass1_2368 = Static94.method1596("(Y");

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Lclient!a;")
	private static Class1 aClass1_2370 = Static94.method1596("Enter name of player to add to list");

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "Lclient!a;")
	public static Class1 aClass1_2369 = aClass1_2370;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "J")
	public static long aLong74 = 0L;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
	public static int anInt2264 = -1;

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "Lclient!a;")
	private static Class1 aClass1_2371 = Static94.method1596("Accept trade");

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "Lclient!a;")
	public static Class1 aClass1_2372 = aClass1_2371;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "Lclient!a;")
	public static Class1 aClass1_2374 = Static94.method1596("@cr1@");

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)J")
	public static synchronized long method1534() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (Static103.aLong83 > local10) {
			Static103.aLong84 += Static103.aLong83 - local10;
		}
		Static103.aLong83 = local10;
		return local10 + Static103.aLong84;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method1535(@OriginalArg(1) KeyEvent arg0) {
		@Pc(14) int local14 = arg0.getKeyChar();
		if (local14 <= 0 || local14 >= 256) {
			local14 = -1;
		}
		return local14;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	public static void method1536() {
		aClass1_2371 = null;
		aClass1_2369 = null;
		aClass1_2367 = null;
		aClass1_2374 = null;
		aClass1_2370 = null;
		aClass1_2372 = null;
		anIntArray286 = null;
		aClass25_6 = null;
		aClass1Array21 = null;
		aClass4_52 = null;
		aClass1_2368 = null;
		aClass1_2373 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!a;ZLclient!a;)V")
	public static void method1537(@OriginalArg(1) Class1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class1 arg2) {
		if (Static80.aBoolean119) {
			Static80.aBoolean119 = false;
			Static96.method1628();
			Static76.method1441();
			Static90.method1576();
			Static37.method936();
			Static87.method1555(Static96.anInt2420, Static88.aClass2_Sub1_Sub2_Sub1_1, Static6.anInt409, Static63.anInt1889);
			Static11.method414(Static8.anInt514, Static80.anIntArray274, Static56.anInt1778 == -1, -1);
			Static66.aBoolean139 = true;
			Static20.aBoolean38 = true;
			Static10.aBoolean150 = true;
		}
		@Pc(38) short local38 = 151;
		Static110.method1795();
		@Pc(41) int local41 = local38 - 3;
		Static88.aClass2_Sub1_Sub2_Sub1_1.method371(arg0, 257, 148, 0);
		Static88.aClass2_Sub1_Sub2_Sub1_1.method371(arg0, 256, 147, 16777215);
		if (arg2 != null) {
			local41 += 15;
			if (arg1) {
				@Pc(66) int local66 = Static88.aClass2_Sub1_Sub2_Sub1_1.method370(arg2) + 4;
				Static92.method1120(257 - local66 / 2, 152, local66, 11, 0);
			}
			Static88.aClass2_Sub1_Sub2_Sub1_1.method371(arg2, 257, 163, 0);
			Static88.aClass2_Sub1_Sub2_Sub1_1.method371(arg2, 256, 162, 16777215);
		}
		Static2.method120();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public static void method1538() {
		Static10.aClass11_25.method435();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
	public static void method1539(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && Static63.anInt1888 == 0) {
			Static60.method1275();
		} else if (arg0 != -1 && arg0 != Static103.anInt2610 && Static53.anInt1755 != 0 && Static63.anInt1888 == 0) {
			Static60.method1276(Static53.anInt1755, arg0, Static90.aClass8_Sub1_20, 0);
		}
		Static103.anInt2610 = arg0;
	}
}
