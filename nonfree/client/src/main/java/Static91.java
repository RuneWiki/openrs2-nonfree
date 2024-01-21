import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_22;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "Lclient!u;")
	public static Class8_Sub1 aClass8_Sub1_21;

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_23;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!a;")
	public static Class1 aClass1_2448 = Static94.method1596(" weitere Optionen");

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!a;")
	public static Class1 aClass1_2449 = Static94.method1596("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
	public static final int anInt2346 = 3353893;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "[Lclient!ua;")
	public static Class62[] aClass62Array1 = new Class62[50];

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method1579() {
		aClass1_2448 = null;
		aClass62Array1 = null;
		aClass2_Sub1_Sub2_Sub2_22 = null;
		aClass8_Sub1_21 = null;
		aClass1_2449 = null;
		aClass2_Sub1_Sub2_Sub2_23 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([Lclient!a;Z)[Lclient!a;")
	public static Class1[] method1580(@OriginalArg(0) Class1[] arg0) {
		@Pc(10) Class1[] local10 = new Class1[5];
		for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
			local10[local16] = Static97.method1655(new Class1[] { Static43.method994(local16), Static34.aClass1_1236 });
			if (arg0 != null && arg0[local16] != null) {
				local10[local16] = Static97.method1655(new Class1[] { local10[local16], arg0[local16] });
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Lclient!na;")
	public static Class29 method1584() {
		try {
			return (Class29) Class.forName("Class29_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return new Class29_Sub1();
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
	public static void method1585() {
		Static112.anIntArray352 = null;
		Static28.anIntArray115 = null;
		Static46.anIntArray162 = null;
		Static10.anIntArrayArrayArray8 = null;
		Static42.anIntArrayArray9 = null;
		Static63.aByteArrayArrayArray5 = null;
		Static98.anIntArray312 = null;
		Static32.aByteArrayArrayArray4 = null;
		Static29.aByteArrayArrayArray3 = null;
		Static103.aByteArrayArrayArray9 = null;
		Static71.aByteArrayArrayArray6 = null;
		Static97.anIntArray308 = null;
	}
}
