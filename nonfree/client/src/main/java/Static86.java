import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
	public static int anInt1602 = 0;

	@OriginalMember(owner = "client!fi", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString57 = "Loaded fonts";

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
	public static int anInt1605 = 0;

	@OriginalMember(owner = "client!fi", name = "z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[200];

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
	public static void method1476() {
		if (Static342.anIntArray707 != null && Static313.anIntArray665 != null) {
			return;
		}
		Static313.anIntArray665 = new int[256];
		Static342.anIntArray707 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static342.anIntArray707[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static313.anIntArray665[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method1477(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(42) StringBuffer local42 = new StringBuffer(local10 + local8);
		for (@Pc(44) int local44 = 0; local44 < local8; local44++) {
			@Pc(50) char local50 = arg0.charAt(local44);
			if (local50 == '<') {
				local42.append("<lt>");
			} else if (local50 == '>') {
				local42.append("<gt>");
			} else {
				local42.append(local50);
			}
		}
		return local42.toString();
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	public static void method1478() {
		Static239.aClass70_109.method1405();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class6_Sub5 local7 = null;
		for (@Pc(12) Class6_Sub5 local12 = (Class6_Sub5) Static261.aClass211_30.method5594(); local12 != null; local12 = (Class6_Sub5) Static261.aClass211_30.method5582()) {
			if (arg7 == local12.anInt513 && arg6 == local12.anInt514 && arg2 == local12.anInt517 && arg5 == local12.anInt515) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class6_Sub5();
			local7.anInt515 = arg5;
			local7.anInt514 = arg6;
			local7.anInt517 = arg2;
			local7.anInt513 = arg7;
			Static326.method5426(local7);
			Static261.aClass211_30.method5585(local7);
		}
		local7.anInt506 = arg4;
		local7.anInt503 = arg8;
		local7.anInt501 = arg1;
		local7.anInt505 = arg0;
		local7.anInt509 = arg3;
	}
}
