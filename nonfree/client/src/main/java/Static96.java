import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!tc", name = "G", descriptor = "Lclient!kb;")
	public static Class9 aClass9_50;

	@OriginalMember(owner = "client!tc", name = "L", descriptor = "Lclient!mb;")
	public static Class42 aClass42_69;

	@OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
	public static int anInt2555;

	@OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
	public static int anInt2559;

	@OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
	public static final int anInt2554 = 50;

	@OriginalMember(owner = "client!tc", name = "X", descriptor = "Lclient!v;")
	private static Class62 aClass62_1173 = Static45.method753("Accept challenge");

	@OriginalMember(owner = "client!tc", name = "J", descriptor = "Lclient!v;")
	public static Class62 aClass62_1168 = aClass62_1173;

	@OriginalMember(owner = "client!tc", name = "K", descriptor = "Lclient!v;")
	private static Class62 aClass62_1169 = Static45.method753("Connecting to friendserver");

	@OriginalMember(owner = "client!tc", name = "P", descriptor = "Lclient!v;")
	public static Class62 aClass62_1170 = Static45.method753("titlebox");

	@OriginalMember(owner = "client!tc", name = "Q", descriptor = "Lclient!v;")
	private static Class62 aClass62_1171 = Static45.method753("Attack");

	@OriginalMember(owner = "client!tc", name = "U", descriptor = "Lclient!v;")
	public static Class62 aClass62_1172 = aClass62_1169;

	@OriginalMember(owner = "client!tc", name = "Y", descriptor = "[Lclient!d;")
	public static Class13[] aClass13Array1 = new Class13[12];

	@OriginalMember(owner = "client!tc", name = "Z", descriptor = "Lclient!v;")
	public static Class62 aClass62_1174 = aClass62_1171;

	@OriginalMember(owner = "client!tc", name = "ab", descriptor = "Lclient!v;")
	public static Class62 aClass62_1175 = Static45.method753("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!tc", name = "bb", descriptor = "I")
	public static int anInt2562 = -1;

	@OriginalMember(owner = "client!tc", name = "db", descriptor = "Lclient!v;")
	public static Class62 aClass62_1176 = Static45.method753("Nehmen");

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!jc;ZI)Z")
	public static boolean method1631(@OriginalArg(0) Class35 arg0, @OriginalArg(1) boolean arg1) {
		Static22.anInt745 = 20;
		try {
			Static55.aClass38_1 = (Class38) Class.forName("Class38_Sub1_Sub1").getDeclaredConstructor().newInstance();
			return true;
		} catch (@Pc(18) Throwable local18) {
			@Pc(22) Interface2 local22 = arg0.method768();
			if (local22 != null) {
				Static55.aClass38_1 = new Class38_Sub1_Sub2(arg0, local22);
				return true;
			} else if (arg1) {
				Static55.aClass38_1 = new Class38_Sub2(arg0);
				return true;
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
	public static void method1632() {
		aClass62_1170 = null;
		aClass62_1172 = null;
		aClass62_1171 = null;
		aClass62_1175 = null;
		aClass62_1168 = null;
		aClass62_1169 = null;
		aClass9_50 = null;
		aClass62_1176 = null;
		aClass62_1173 = null;
		aClass13Array1 = null;
		aClass42_69 = null;
		aClass62_1174 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZB)Lclient!v;")
	public static Class62 method1633(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = 1;
		for (@Pc(21) int local21 = arg0 / 10; local21 != 0; local21 /= 10) {
			local17++;
		}
		@Pc(32) int local32 = local17;
		if (arg0 < 0) {
			local32 = local17 + 1;
		}
		@Pc(48) byte[] local48 = new byte[local32];
		if (arg0 < 0) {
			local48[0] = 45;
		}
		for (@Pc(64) int local64 = 0; local64 < local17; local64++) {
			@Pc(70) int local70 = arg0 % 10;
			arg0 /= 10;
			if (local70 < 0) {
				local70 = -local70;
			}
			if (local70 > 9) {
				local70 += 39;
			}
			local48[local32 - local64 - 1] = (byte) (local70 + 48);
		}
		@Pc(104) Class62 local104 = new Class62();
		local104.anInt2649 = local32;
		local104.aByteArray25 = local48;
		return local104;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
	public static void method1634() {
		for (@Pc(15) Class3_Sub2 local15 = (Class3_Sub2) Static108.aClass24_82.method534(); local15 != null; local15 = (Class3_Sub2) Static108.aClass24_82.method525()) {
			if (local15.anInt176 == -1) {
				local15.anInt191 = 0;
				Static7.method175(local15);
			} else {
				local15.method1852();
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1635(@OriginalArg(1) Component arg0) {
		try {
			@Pc(1) Method local1 = Static47.aMethod1;
			if (local1 != null) {
				local1.invoke(arg0, Boolean.FALSE);
			}
		} catch (@Pc(20) Throwable local20) {
		}
		arg0.addKeyListener(Static12.aClass29_1);
		arg0.addFocusListener(Static12.aClass29_1);
	}
}
