import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1 aClass1_Sub1_Sub12_Sub1_5;

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "[I")
	public static int[] anIntArray312;

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "[Lclient!ta;")
	public static Class78[] aClass78Array1;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!ed;")
	private static Class23 aClass23_964 = Static169.method2903("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "Lclient!ed;")
	public static Class23 aClass23_963 = aClass23_964;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "[I")
	public static int[] anIntArray311 = new int[128];

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "Lclient!ed;")
	public static Class23 aClass23_965 = Static169.method2903("Lade Sprites )2 ");

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "Lclient!ed;")
	public static Class23 aClass23_966 = Static169.method2903(": ");

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "Lclient!ob;")
	public static Class60 aClass60_5 = null;

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "Lclient!ed;")
	public static Class23 aClass23_967 = Static169.method2903(" <col=00ff80>");

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[100];

	@OriginalMember(owner = "client!lg", name = "w", descriptor = "[Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1[] aClass1_Sub1_Sub12_Sub1Array5 = new Class1_Sub1_Sub12_Sub1[1000];

	@OriginalMember(owner = "client!lg", name = "y", descriptor = "Lclient!ed;")
	public static Class23 aClass23_968 = Static169.method2903("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLclient!na;)V")
	public static void method1673(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		arg0.anInt1835 = arg0.anInt1823;
		if (arg0.anInt1863 == 0) {
			arg0.anInt1814 = 0;
			return;
		}
		if (arg0.anInt1842 != -1 && arg0.anInt1846 == 0) {
			@Pc(28) Class1_Sub1_Sub18 local28 = Static157.method2652(arg0.anInt1842);
			if (arg0.anInt1839 > 0 && local28.anInt4303 == 0) {
				arg0.anInt1814++;
				return;
			}
			if (arg0.anInt1839 <= 0 && local28.anInt4301 == 0) {
				arg0.anInt1814++;
				return;
			}
		}
		@Pc(66) int local66 = arg0.anInt1838;
		@Pc(69) int local69 = arg0.anInt1825;
		@Pc(84) int local84 = arg0.anIntArray250[arg0.anInt1863 - 1] * 128 + arg0.anInt1824 * 64;
		@Pc(100) int local100 = arg0.anIntArray248[arg0.anInt1863 - 1] * 128 + arg0.anInt1824 * 64;
		if (local84 - local66 > 256 || local84 - local66 < -256 || local100 - local69 > 256 || local100 - local69 < -256) {
			arg0.anInt1825 = local100;
			arg0.anInt1838 = local84;
			return;
		}
		if (local66 >= local84) {
			if (local66 > local84) {
				if (local100 > local69) {
					arg0.anInt1860 = 768;
				} else if (local69 > local100) {
					arg0.anInt1860 = 256;
				} else {
					arg0.anInt1860 = 512;
				}
			} else if (local69 < local100) {
				arg0.anInt1860 = 1024;
			} else if (local69 > local100) {
				arg0.anInt1860 = 0;
			}
		} else if (local69 < local100) {
			arg0.anInt1860 = 1280;
		} else if (local69 <= local100) {
			arg0.anInt1860 = 1536;
		} else {
			arg0.anInt1860 = 1792;
		}
		@Pc(218) int local218 = arg0.anInt1864;
		@Pc(220) boolean local220 = true;
		@Pc(222) int local222 = 4;
		@Pc(231) int local231 = arg0.anInt1860 - arg0.anInt1843 & 0x7FF;
		if (local231 > 1024) {
			local231 -= 2048;
		}
		if (local231 >= -256 && local231 <= 256) {
			local218 = arg0.anInt1820;
		} else if (local231 >= 256 && local231 < 768) {
			local218 = arg0.anInt1829;
		} else if (local231 >= -768 && local231 <= -256) {
			local218 = arg0.anInt1850;
		}
		if (local218 == -1) {
			local218 = arg0.anInt1820;
		}
		arg0.anInt1835 = local218;
		if (arg0 instanceof Class1_Sub1_Sub1_Sub1_Sub2) {
			local220 = ((Class1_Sub1_Sub1_Sub1_Sub2) arg0).aClass1_Sub1_Sub9_1.aBoolean67;
		}
		if (local220) {
			if (arg0.anInt1843 != arg0.anInt1860 && arg0.anInt1865 == -1 && arg0.anInt1819 != 0) {
				local222 = 2;
			}
			if (arg0.anInt1863 > 2) {
				local222 = 6;
			}
			if (arg0.anInt1863 > 3) {
				local222 = 8;
			}
			if (arg0.anInt1814 > 0 && arg0.anInt1863 > 1) {
				local222 = 8;
				arg0.anInt1814--;
			}
		} else {
			if (arg0.anInt1863 > 1) {
				local222 = 6;
			}
			if (arg0.anInt1863 > 2) {
				local222 = 8;
			}
			if (arg0.anInt1814 > 0 && arg0.anInt1863 > 1) {
				arg0.anInt1814--;
				local222 = 8;
			}
		}
		if (arg0.aBooleanArray9[arg0.anInt1863 - 1]) {
			local222 <<= 0x1;
		}
		if (local69 < local100) {
			arg0.anInt1825 += local222;
			if (arg0.anInt1825 > local100) {
				arg0.anInt1825 = local100;
			}
		} else if (local69 > local100) {
			arg0.anInt1825 -= local222;
			if (arg0.anInt1825 < local100) {
				arg0.anInt1825 = local100;
			}
		}
		if (local84 > local66) {
			arg0.anInt1838 += local222;
			if (local84 < arg0.anInt1838) {
				arg0.anInt1838 = local84;
			}
		} else if (local84 < local66) {
			arg0.anInt1838 -= local222;
			if (arg0.anInt1838 < local84) {
				arg0.anInt1838 = local84;
			}
		}
		if (local84 == arg0.anInt1838 && local100 == arg0.anInt1825) {
			arg0.anInt1863--;
			if (arg0.anInt1839 > 0) {
				arg0.anInt1839--;
			}
		}
		if (local222 >= 8 && arg0.anInt1835 == arg0.anInt1820 && arg0.anInt1830 != -1) {
			arg0.anInt1835 = arg0.anInt1830;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public static void method1674() {
		aClass23_963 = null;
		aClass78Array1 = null;
		aClass1_Sub1_Sub12_Sub1_5 = null;
		anIntArray311 = null;
		aClass1_Sub1_Sub12_Sub1Array5 = null;
		aBooleanArray12 = null;
		aClass23_965 = null;
		aClass23_964 = null;
		anIntArray312 = null;
		aClass23_967 = null;
		aClass23_966 = null;
		aClass23_968 = null;
		aClass60_5 = null;
	}
}
