import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public static int anInt2716;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1170 = Static59.method1195("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1165 = aClass60_1170;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1166 = Static59.method1195("::fpson");

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1167 = Static59.method1195("Enter your username (V password)3");

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1168 = Static59.method1195("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1169 = aClass60_1167;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
	public static int anInt2722 = 0;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1171 = Static59.method1195("backbase2");

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1172 = Static59.method1195("null");

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BII)I")
	public static int method1783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class3_Sub13 local17 = (Class3_Sub13) Static16.aClass82_1.method2305((long) arg0);
		if (local17 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < local17.anIntArray213.length; local31++) {
				if (arg1 == local17.anIntArray214[local31]) {
					local29 += local17.anIntArray213[local31];
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	public static void method1784() {
		aClass60_1165 = null;
		aClass60_1171 = null;
		aClass60_1172 = null;
		aClass60_1166 = null;
		aClass60_1169 = null;
		aClass60_1170 = null;
		aClass60_1167 = null;
		aClass60_1168 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBII)I")
	public static int method1786(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static60.aByteArrayArrayArray4[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static60.aByteArrayArrayArray4[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([Lclient!qf;III)Lclient!qf;")
	public static Class60 method1787(@OriginalArg(0) Class60[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg2; local9++) {
			if (arg0[local9 + arg1] == null) {
				arg0[arg1 + local9] = Static122.aClass60_259;
			}
			local7 += arg0[local9 + arg1].anInt2817;
		}
		@Pc(44) byte[] local44 = new byte[local7];
		@Pc(46) int local46 = 0;
		@Pc(56) Class60 local56;
		for (@Pc(48) int local48 = 0; local48 < arg2; local48++) {
			local56 = arg0[arg1 + local48];
			Static135.method1705(local56.aByteArray73, 0, local44, local46, local56.anInt2817);
			local46 += local56.anInt2817;
		}
		local56 = new Class60();
		local56.anInt2817 = local7;
		local56.aByteArray73 = local44;
		return local56;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Lclient!qf;")
	public static Class60 method1788(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static60.method1211(new Class60[] { Static127.aClass60_1158, Static65.method1341(arg0), Static79.aClass60_1052 });
		} else if (arg0 < 10000000) {
			return Static60.method1211(new Class60[] { Static38.aClass60_516, Static65.method1341(arg0 / 1000), Static17.aClass60_275, Static79.aClass60_1052 });
		} else {
			return Static60.method1211(new Class60[] { Static17.aClass60_277, Static65.method1341(arg0 / 1000000), Static98.aClass60_1200, Static79.aClass60_1052 });
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZIZZZ)Lclient!ha;")
	public static Class25_Sub1 method1789(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(5) Class13 local5 = null;
		if (Static57.aClass41_61 != null) {
			local5 = new Class13(arg0, Static57.aClass41_61, Static114.aClass41Array1[arg0], 1000000);
		}
		return new Class25_Sub1(local5, Static10.aClass13_1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)V")
	public static void method1790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (local20 = 0; local20 < 8; local20++) {
				Static51.anIntArrayArrayArray3[arg2][arg1 + local7][local20 + arg0] = 0;
			}
		}
		if (arg1 > 0) {
			for (local20 = 1; local20 < 8; local20++) {
				Static51.anIntArrayArrayArray3[arg2][arg1][local20 + arg0] = Static51.anIntArrayArrayArray3[arg2][arg1 - 1][arg0 + local20];
			}
		}
		if (arg0 > 0) {
			for (local20 = 1; local20 < 8; local20++) {
				Static51.anIntArrayArrayArray3[arg2][arg1 + local20][arg0] = Static51.anIntArrayArrayArray3[arg2][local20 + arg1][arg0 - 1];
			}
		}
		if (arg1 > 0 && Static51.anIntArrayArrayArray3[arg2][arg1 - 1][arg0] != 0) {
			Static51.anIntArrayArrayArray3[arg2][arg1][arg0] = Static51.anIntArrayArrayArray3[arg2][arg1 - 1][arg0];
		} else if (arg0 > 0 && Static51.anIntArrayArrayArray3[arg2][arg1][arg0 - 1] != 0) {
			Static51.anIntArrayArrayArray3[arg2][arg1][arg0] = Static51.anIntArrayArrayArray3[arg2][arg1][arg0 - 1];
		} else if (arg1 > 0 && arg0 > 0 && Static51.anIntArrayArrayArray3[arg2][arg1 - 1][arg0 - 1] != 0) {
			Static51.anIntArrayArrayArray3[arg2][arg1][arg0] = Static51.anIntArrayArrayArray3[arg2][arg1 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Color;IILclient!qf;)V")
	public static void method1791(@OriginalArg(0) Color arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60 arg2) {
		try {
			@Pc(2) Graphics local2 = Static2.aCanvas1.getGraphics();
			if (Static56.aFont1 == null) {
				Static56.aFont1 = new Font("Helvetica", 1, 13);
				Static36.aFontMetrics1 = Static2.aCanvas1.getFontMetrics(Static56.aFont1);
			}
			if (Static33.aBoolean35) {
				Static33.aBoolean35 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static120.anInt3263, Static23.anInt2584);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static45.anImage2 == null) {
					Static45.anImage2 = Static2.aCanvas1.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static45.anImage2.getGraphics();
				local47.setColor(arg0);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg1 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local47.setFont(Static56.aFont1);
				local47.setColor(Color.white);
				arg2.method1865((304 - arg2.method1857(Static36.aFontMetrics1)) / 2, 22, local47);
				local2.drawImage(Static45.anImage2, Static120.anInt3263 / 2 - 152, Static23.anInt2584 / 2 + -18, null);
			} catch (@Pc(134) Exception local134) {
				@Pc(140) int local140 = Static120.anInt3263 / 2 - 152;
				@Pc(146) int local146 = Static23.anInt2584 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(local140, local146, 303, 33);
				local2.fillRect(local140 + 2, local146 - -2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local140 + 1, local146 + 1, 301, 31);
				local2.fillRect(local140 + arg1 * 3 + 2, local146 + 2, 300 - arg1 * 3, 30);
				local2.setFont(Static56.aFont1);
				local2.setColor(Color.white);
				arg2.method1865((304 - arg2.method1857(Static36.aFontMetrics1)) / 2 + local140, local146 + 22, local2);
			}
		} catch (@Pc(223) Exception local223) {
			Static2.aCanvas1.repaint();
		}
	}
}
