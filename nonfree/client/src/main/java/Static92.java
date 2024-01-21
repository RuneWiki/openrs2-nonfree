import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
	public static int anInt2321 = 0;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
	public static int anInt2322 = 0;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!af;")
	public static Class5 aClass5_1101 = Static45.method1937("<img=0>");

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!af;")
	public static Class5 aClass5_1102 = Static45.method1937(" <col=ffff00>");

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!af;")
	public static Class5 aClass5_1103 = Static45.method1937("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "[I")
	public static int[] anIntArray352 = new int[100];

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
	public static int anInt2325 = 0;

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
	public static int anInt2326 = 0;

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "[I")
	public static int[] anIntArray353 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method1583() {
		@Pc(7) Class62 local7 = Static73.aClass62_1;
		synchronized (Static73.aClass62_1) {
			Static56.anInt1346 = Static122.anInt3120;
			@Pc(15) int local15;
			if (Static95.anInt2355 < 0) {
				for (local15 = 0; local15 < 112; local15++) {
					Static102.aBooleanArray24[local15] = false;
				}
				Static95.anInt2355 = Static103.anInt2535;
			} else {
				while (Static95.anInt2355 != Static103.anInt2535) {
					local15 = Static102.anIntArray389[Static103.anInt2535];
					Static103.anInt2535 = Static103.anInt2535 + 1 & 0x7F;
					if (local15 >= 0) {
						Static102.aBooleanArray24[local15] = true;
					} else {
						Static102.aBooleanArray24[~local15] = false;
					}
				}
			}
			Static122.anInt3120 = Static121.anInt3118;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1584(@OriginalArg(0) Component arg0) {
		@Pc(11) Method local11 = Static88.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(25) Throwable local25) {
			}
		}
		arg0.addKeyListener(Static73.aClass62_1);
		arg0.addFocusListener(Static73.aClass62_1);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)Lclient!ad;")
	public static Class1_Sub3_Sub1_Sub1 method1585() {
		@Pc(12) Class1_Sub3_Sub1_Sub1 local12 = new Class1_Sub3_Sub1_Sub1(Static48.anIntArray196, Static109.anIntArray409, Static76.anIntArray296, Static27.anIntArray97, Static73.aByteArrayArray7);
		Static50.method890();
		return local12;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)I")
	public static int method1586(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
	public static void method1587() {
		anIntArray352 = null;
		anIntArray353 = null;
		aClass5_1102 = null;
		aClass5_1101 = null;
		aClass5_1103 = null;
	}
}
