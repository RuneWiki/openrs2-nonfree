import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ua", name = "V", descriptor = "Lclient!jd;")
	public static Class36 aClass36_67;

	@OriginalMember(owner = "client!ua", name = "Z", descriptor = "Lclient!ta;")
	public static Class36_Sub1 aClass36_Sub1_22;

	@OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
	public static int anInt2694 = 0;

	@OriginalMember(owner = "client!ua", name = "T", descriptor = "Z")
	public static boolean aBoolean124 = true;

	@OriginalMember(owner = "client!ua", name = "U", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1225 = Static2.method66("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!ua", name = "W", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1226 = Static2.method66("Versteckt");

	@OriginalMember(owner = "client!ua", name = "X", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1227 = Static2.method66(" is already on your ignore list");

	@OriginalMember(owner = "client!ua", name = "Y", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1228 = Static2.method66("blinken2:");

	@OriginalMember(owner = "client!ua", name = "ab", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1229 = Static2.method66("@cya@");

	@OriginalMember(owner = "client!ua", name = "bb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1230 = Static2.method66("Wir vermuten ihr Spielkonto wurde gestohlen");

	@OriginalMember(owner = "client!ua", name = "db", descriptor = "Z")
	public static boolean aBoolean125 = false;

	@OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
	public static int anInt2696 = -1;

	@OriginalMember(owner = "client!ua", name = "jb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1231 = aClass39_1227;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)V")
	public static void method1904() {
		Static83.method1612(false, null, 10, 0);
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)Z")
	public static boolean method1905() {
		@Pc(5) Class55 local5 = Static45.aClass55_1;
		synchronized (Static45.aClass55_1) {
			if (Static71.anInt2019 == Static68.anInt1994) {
				return false;
			} else {
				Static107.anInt2655 = Static67.anIntArray243[Static71.anInt2019];
				Static57.anInt1639 = Static5.anIntArray16[Static71.anInt2019];
				Static71.anInt2019 = Static71.anInt2019 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(B)V")
	public static void method1906() {
		aClass39_1229 = null;
		aClass39_1228 = null;
		aClass36_Sub1_22 = null;
		aClass39_1231 = null;
		aClass39_1230 = null;
		aClass36_67 = null;
		aClass39_1227 = null;
		aClass39_1226 = null;
		aClass39_1225 = null;
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
	public static void method1907() {
		@Pc(1) Object local1 = Static39.anObject4;
		synchronized (Static39.anObject4) {
			if (Static31.anInt1813 != 0) {
				Static31.anInt1813 = 1;
				try {
					Static39.anObject4.wait();
				} catch (@Pc(16) InterruptedException local16) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ke;ILjava/awt/Color;I)V")
	public static void method1908(@OriginalArg(0) Class39 arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(2) Graphics local2 = Static7.aCanvas1.getGraphics();
			if (Static76.aFont1 == null) {
				Static76.aFont1 = new Font("Helvetica", 1, 13);
				Static104.aFontMetrics1 = Static7.aCanvas1.getFontMetrics(Static76.aFont1);
			}
			if (Static5.aBoolean2) {
				Static5.aBoolean2 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static21.anInt2665, Static27.anInt812);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static69.anImage1 == null) {
					Static69.anImage1 = Static7.aCanvas1.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static69.anImage1.getGraphics();
				local47.setColor(arg1);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg2 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local47.setFont(Static76.aFont1);
				local47.setColor(Color.white);
				arg0.method1098((304 - arg0.method1101(Static104.aFontMetrics1)) / 2, 22, local47);
				local2.drawImage(Static69.anImage1, Static21.anInt2665 / 2 - 152, Static27.anInt812 / 2 + -18, null);
			} catch (@Pc(132) Exception local132) {
				@Pc(138) int local138 = Static21.anInt2665 / 2 - 152;
				@Pc(144) int local144 = Static27.anInt812 / 2 - 18;
				local2.setColor(arg1);
				local2.drawRect(local138, local144, 303, 33);
				local2.fillRect(local138 + 2, local144 + 2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local138 + 1, local144 + 1, 301, 31);
				local2.fillRect(arg2 * 3 + local138 + 2, local144 + 2, 300 - arg2 * 3, 30);
				local2.setFont(Static76.aFont1);
				local2.setColor(Color.white);
				arg0.method1098((304 - arg0.method1101(Static104.aFontMetrics1)) / 2 + local138, local144 + 22, local2);
			}
		} catch (@Pc(223) Exception local223) {
			Static7.aCanvas1.repaint();
		}
	}
}
