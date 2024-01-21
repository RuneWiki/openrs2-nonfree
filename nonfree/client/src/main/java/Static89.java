import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "[Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4[] aClass1_Sub1_Sub1_Sub4Array4;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
	public static int anInt2607;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Lclient!rf;")
	public static Class70 aClass70_864 = Static49.method1293("::fpsoff");

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Lclient!ad;")
	public static Class4 aClass4_9 = new Class4();

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "[Lclient!ud;")
	public static Class78[] aClass78Array1 = new Class78[50];

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V")
	public static void method1932(@OriginalArg(0) boolean arg0) {
		if (Static176.aClass43_44 == null) {
			return;
		}
		try {
			@Pc(16) Class1_Sub9 local16 = new Class1_Sub9(4);
			local16.method1260(arg0 ? 2 : 3);
			local16.method1226(0);
			Static176.aClass43_44.method2045(local16.aByteArray25, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				Static176.aClass43_44.method2042();
			} catch (@Pc(42) Exception local42) {
			}
			Static176.aClass43_44 = null;
			Static102.anInt2886++;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method1933() {
		aClass78Array1 = null;
		aClass1_Sub1_Sub1_Sub4Array4 = null;
		aClass70_864 = null;
		aClass4_9 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)Lclient!rf;")
	public static Class70 method1934(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static160.method3210(new Class70[] { Static54.aClass70_556, Static34.method873(arg0), Static161.aClass70_1433 });
		} else if (arg0 < 10000000) {
			return Static160.method3210(new Class70[] { Static57.aClass70_574, Static34.method873(arg0 / 1000), Static30.aClass70_327, Static161.aClass70_1433 });
		} else {
			return Static160.method3210(new Class70[] { Static162.aClass70_1461, Static34.method873(arg0 / 1000000), Static100.aClass70_923, Static161.aClass70_1433 });
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([BI)Lclient!ne;")
	public static Class1_Sub1_Sub1_Sub2_Sub1 method1935(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(25) Class1_Sub1_Sub1_Sub2_Sub1 local25 = new Class1_Sub1_Sub1_Sub2_Sub1(arg0, Static95.anIntArray257, Static119.anIntArray319, Static101.anIntArray272, Static53.anIntArray173, Static150.anIntArray375, Static179.aByteArrayArray10);
			Static111.method2288();
			return local25;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public static void method1936() {
		if (Static79.aBoolean91 && Static164.anInt4265 != Static56.anInt1784) {
			Static167.method3343(Static56.anInt1784, Static22.anInt597, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], Static108.anInt3053);
		} else if (Static56.anInt1784 != Static169.anInt4358) {
			Static169.anInt4358 = Static56.anInt1784;
			Static170.method3378(Static56.anInt1784);
		}
	}
}
