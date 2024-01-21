import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1017 = Static108.method1915("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1022 = Static108.method1915("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1018 = aClass39_1022;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
	public static volatile int anInt2026 = -1;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1019 = Static108.method1915("No response from server)3");

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1020 = Static108.method1915("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1021 = aClass39_1019;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Lclient!jb;")
	public static Class33 aClass33_30 = new Class33(64);

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray21 = new int[104][104];

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1023 = Static108.method1915("VOLL");

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1025 = Static108.method1915("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1024 = aClass39_1025;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
	public static int anInt2030 = 0;

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "Z")
	public static boolean aBoolean170 = false;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1027 = Static108.method1915("flash2:");

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1026 = aClass39_1027;

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1028 = aClass39_1027;

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1029 = Static108.method1915("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1030 = Static108.method1915("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZIIIIII[Lclient!a;I)V")
	public static void method1432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class1_Sub1_Sub1[] arg8, @OriginalArg(10) int arg9) {
		for (@Pc(7) int local7 = 0; local7 < arg8.length; local7++) {
			@Pc(13) Class1_Sub1_Sub1 local13 = arg8[local7];
			if (local13 != null && (local13.anInt91 == 0 || local13.aBoolean16) && local13 != null && local13.anInt102 == arg1 && !Static96.method1613(local13)) {
				@Pc(45) int local45 = local13.anInt110 + arg2 - arg0;
				@Pc(50) int local50 = local45 + local13.anInt82;
				@Pc(57) int local57 = local13.anInt81 + arg7 - arg3;
				@Pc(64) int local64 = local57 <= arg7 ? arg7 : local57;
				@Pc(69) int local69 = local13.anInt101 + local57;
				@Pc(80) int local80 = arg6 <= local50 ? arg6 : local50;
				@Pc(87) int local87 = arg2 >= local45 ? arg2 : local45;
				@Pc(94) int local94 = local69 >= arg4 ? arg4 : local69;
				if (local13.anInt91 == 0) {
					method1432(local87 + local13.anInt95 - local45, local13.anInt72, local87, local64 + local13.anInt87 - local57, local94, arg5, local80, local64, arg8, arg9);
					if (local13.aClass1_Sub1_Sub1Array1 != null) {
						method1432(local13.anInt95 + local87 - local45, local13.anInt72, local87, local13.anInt87 + local64 - local57, local94, arg5, local80, local64, local13.aClass1_Sub1_Sub1Array1, arg9);
					}
				}
				if (local13.aBoolean16) {
					@Pc(180) boolean local180;
					if (local64 <= Static29.anInt971 && Static3.anInt150 >= local87 && local94 > Static29.anInt971 && Static3.anInt150 < local80) {
						local180 = true;
					} else {
						local180 = false;
					}
					@Pc(186) boolean local186 = false;
					if (Static91.anInt2130 == 1 && local64 <= Static89.anInt2109 && local87 <= Static38.anInt1157 && local94 > Static89.anInt2109 && Static38.anInt1157 < local80) {
						local186 = true;
					}
					@Pc(217) boolean local217 = false;
					if (anInt2030 == 1 && local180) {
						local217 = true;
					}
					if (local186 && Static66.aClass1_Sub1_Sub1_3 == null && (arg9 & 0x200) != 0 && !Static13.aBoolean47 && Static13.method287(local13) != null) {
						Static13.anInt525 = 0;
						Static66.aClass1_Sub1_Sub1_3 = local13;
						Static25.anInt844 = Static89.anInt2109 - local64;
						Static90.aBoolean178 = false;
						Static1.anInt59 = arg5;
						Static17.anInt583 = Static38.anInt1157 - local87;
					}
					if (Static66.aClass1_Sub1_Sub1_3 != null || Static13.aBoolean47) {
						local180 = false;
						local186 = false;
						local217 = false;
					}
					if (!local13.aBoolean9 && local186 && (arg9 & 0x1) != 0) {
						local13.aBoolean9 = true;
						if (local13.anObjectArray6 != null) {
							Static52.method962(local13.anObjectArray6, 0, null, Static38.anInt1157 - local45, local13, Static89.anInt2109 - local57);
						}
					}
					if (local13.aBoolean9 && local217 && (arg9 & 0x4) != 0 && local13.anObjectArray1 != null) {
						Static52.method962(local13.anObjectArray1, 0, null, Static3.anInt150 - local45, local13, Static29.anInt971 - local57);
					}
					if (local13.aBoolean9 && !local217 && (arg9 & 0x2) != 0) {
						local13.aBoolean9 = false;
						if (local13.anObjectArray19 != null) {
							Static52.method962(local13.anObjectArray19, 0, null, Static3.anInt150 - local45, local13, Static29.anInt971 - local57);
						}
					}
					if (local217 && (arg9 & 0x8) != 0 && local13.anObjectArray3 != null) {
						Static52.method962(local13.anObjectArray3, 0, null, Static3.anInt150 - local45, local13, Static29.anInt971 - local57);
					}
					if (!local13.aBoolean19 && local180 && (arg9 & 0x10) != 0) {
						local13.aBoolean19 = true;
						if (local13.anObjectArray9 != null) {
							Static52.method962(local13.anObjectArray9, 0, null, Static3.anInt150 - local45, local13, Static29.anInt971 - local57);
						}
					}
					if (local13.aBoolean19 && local180 && (arg9 & 0x40) != 0 && local13.anObjectArray12 != null) {
						Static52.method962(local13.anObjectArray12, 0, null, Static3.anInt150 - local45, local13, Static29.anInt971 - local57);
					}
					if (local13.aBoolean19 && !local180 && (arg9 & 0x20) != 0) {
						local13.aBoolean19 = false;
						if (local13.anObjectArray7 != null) {
							Static52.method962(local13.anObjectArray7, 0, null, Static3.anInt150 - local45, local13, Static29.anInt971 - local57);
						}
					}
					if (local13.anObjectArray4 != null && (arg9 & 0x80) != 0) {
						Static52.method962(local13.anObjectArray4, 0, null, 0, local13, 0);
					}
					if (local180 && Static50.anInt1383 != 0 && local13.anObjectArray18 != null && (arg9 & 0x400) != 0) {
						Static52.method962(local13.anObjectArray18, 0, null, Static50.anInt1383, local13, 0);
					}
					if ((arg9 & 0x100) != 0) {
						if (Static96.anInt2282 > local13.anInt92 && local13.anObjectArray11 != null) {
							Static52.method962(local13.anObjectArray11, 0, null, 0, local13, 0);
						}
						if (local13.anInt92 < Static17.anInt579 && local13.anObjectArray2 != null) {
							Static52.method962(local13.anObjectArray2, 0, null, 0, local13, 0);
						}
						if (local13.anInt92 < Static99.anInt2443 && local13.anObjectArray8 != null) {
							Static52.method962(local13.anObjectArray8, 0, null, 0, local13, 0);
						}
						local13.anInt92 = Static45.anInt1256;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!qf;)V")
	public static void method1433(@OriginalArg(1) Class1_Sub8 arg0) {
		if (arg0.aClass1_Sub16_5 != null) {
			arg0.aClass1_Sub16_5.anInt2189 = 0;
		}
		arg0.aBoolean196 = false;
		for (@Pc(23) Class1_Sub8 local23 = arg0.method1734(); local23 != null; local23 = arg0.method1738()) {
			method1433(local23);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1434(@OriginalArg(1) Component arg0) {
		@Pc(10) Method local10 = Static125.aMethod1;
		if (local10 != null) {
			try {
				local10.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		arg0.addKeyListener(Static98.aClass71_1);
		arg0.addFocusListener(Static98.aClass71_1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public static void method1435() {
		anIntArrayArray21 = null;
		aClass39_1020 = null;
		aClass39_1019 = null;
		aClass39_1018 = null;
		aClass33_30 = null;
		aClass39_1022 = null;
		aClass39_1027 = null;
		aClass39_1023 = null;
		aClass39_1017 = null;
		aClass39_1021 = null;
		aClass39_1025 = null;
		aClass39_1026 = null;
		aClass39_1028 = null;
		aClass39_1030 = null;
		aClass39_1024 = null;
		aClass39_1029 = null;
	}
}
