import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
	public static int anInt1684;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public static void method1616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(7) Class5_Sub19 local7 = new Class5_Sub19();
		local7.anInt1991 = arg5;
		local7.anInt2003 = arg1;
		local7.anInt2000 = arg6;
		local7.anInt1993 = arg0;
		local7.anInt1992 = arg7;
		local7.anInt2001 = arg10;
		local7.anInt1995 = arg2;
		local7.anInt1998 = arg3;
		local7.anInt1989 = arg4;
		local7.anInt1999 = arg8;
		local7.anInt2005 = arg9;
		local7.anInt1990 = arg11;
		Static32.aClass103_18.method2745(local7);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!vg;B)Ljava/lang/String;")
	public static String method1617(@OriginalArg(0) Class201 arg0) {
		if (Static45.method707(arg0).method5748() == 0) {
			return null;
		} else if (arg0.aString59 == null || arg0.aString59.trim().length() == 0) {
			return Static346.aBoolean577 ? "Hidden-use" : null;
		} else {
			return arg0.aString59;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ea;I)V")
	public static void method1618(@OriginalArg(0) Class55 arg0) {
		if (Static72.aClass103_34.method2753() == 0) {
			return;
		}
		@Pc(27) Class5_Sub8 local27;
		if (Static342.anInt6605 == 0 || Static342.anInt6605 == 2) {
			for (local27 = (Class5_Sub8) Static72.aClass103_34.method2756(); local27 != null; local27 = (Class5_Sub8) Static72.aClass103_34.method2748()) {
				Static48.method797(local27.anInt515, false, arg0, arg0, local27.anInt518, local27.aBoolean36 ? Static192.aClass4_Sub5_Sub2_Sub1_2.aClass31_2 : null, Static355.aClass18_4, local27.anInt516, local27.anInt513, false, local27.anInt522);
				local27.method6005();
			}
			Static300.method5274();
			return;
		}
		if (Static186.aClass55_8 == null) {
			@Pc(73) Canvas local73 = new Canvas();
			local73.setSize(36, 32);
			Static186.aClass55_8 = Static66.method5183(local73, Static182.aClass139_5, 0, 0, Static182.anInterface3_3);
			Static136.aClass18_2 = Static186.aClass55_8.method5180(Static349.method5944(Static294.aClass93_133, Static199.anInt3969), Static363.method2681(Static244.aClass93_93, Static199.anInt3969));
		}
		for (local27 = (Class5_Sub8) Static72.aClass103_34.method2756(); local27 != null; local27 = (Class5_Sub8) Static72.aClass103_34.method2748()) {
			Static48.method797(local27.anInt515, false, arg0, Static186.aClass55_8, local27.anInt518, local27.aBoolean36 ? Static192.aClass4_Sub5_Sub2_Sub1_2.aClass31_2 : null, Static136.aClass18_2, local27.anInt516, local27.anInt513, false, local27.anInt522);
			local27.method6005();
		}
	}
}
