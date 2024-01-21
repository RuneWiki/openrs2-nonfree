import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "J")
	public static long aLong104;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Lclient!ae;")
	public static Class5_Sub1 aClass5_Sub1_25;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "Lclient!gf;")
	public static Class1_Sub1_Sub2_Sub2_Sub1 aClass1_Sub1_Sub2_Sub2_Sub1_2;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1378 = Static106.method1849("Connecting to update server");

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1376 = aClass66_1378;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1377 = Static106.method1849(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
	public static int anInt2474 = 0;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1379 = Static106.method1849("Invalid username or password)3");

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "[Lclient!sc;")
	public static Class66[] aClass66Array21 = new Class66[500];

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1380 = aClass66_1379;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method1740() {
		Static1.anInt74 = -1;
		Static1.anInt77 = -1;
		Static59.anInt1826 = -1;
		Static112.aBoolean113 = false;
		Static40.anInt1278 = 0;
		Static5.anInt228 = 0;
		Static125.anInt2869 = 0;
		Static105.anInt2602 = 0;
		Static127.aClass1_Sub12_Sub1_2.anInt1694 = 0;
		Static81.anInt2190 = -1;
		Static52.anInt1607 = 0;
		Static133.aClass1_Sub12_Sub1_3.anInt1694 = 0;
		Static49.anInt1513 = 0;
		for (@Pc(35) int local35 = 0; local35 < Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1.length; local35++) {
			if (Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local35] != null) {
				Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local35].anInt1241 = -1;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3.length; local57++) {
			if (Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local57] != null) {
				Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local57].anInt1241 = -1;
			}
		}
		Static25.method532();
		Static18.method468(30);
		for (@Pc(88) int local88 = 0; local88 < 100; local88++) {
			Static128.aBooleanArray18[local88] = true;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLclient!sf;I)Lclient!i;")
	public static Class1_Sub1_Sub2_Sub3 method1742(@OriginalArg(1) Class5 arg0, @OriginalArg(2) int arg1) {
		return Static96.method1738(arg0, arg1) ? Static47.method1039() : null;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public static void method1743() {
		aClass66_1380 = null;
		aClass66_1376 = null;
		aClass5_Sub1_25 = null;
		aClass66Array21 = null;
		aClass66_1378 = null;
		aClass1_Sub1_Sub2_Sub2_Sub1_2 = null;
		aClass66_1377 = null;
		aClass66_1379 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ae;ZLclient!fa;I)V")
	public static void method1744(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class61 local9 = Static108.aClass61_3;
		synchronized (Static108.aClass61_3) {
			for (@Pc(16) Class1_Sub18 local16 = (Class1_Sub18) Static108.aClass61_3.method1748(); local16 != null; local16 = (Class1_Sub18) Static108.aClass61_3.method1760()) {
				if (local16.aLong130 == (long) arg2 && arg1 == local16.aClass22_12 && local16.anInt2185 == 0) {
					local7 = local16.aByteArray21;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(70) byte[] local70 = arg1.method560(arg2);
			arg0.method136(local70, arg1, true, arg2);
		} else {
			arg0.method136(local7, arg1, true, arg2);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!vd;")
	public static RuntimeException_Sub1 method1746(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString5 = local12.aString5 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}
