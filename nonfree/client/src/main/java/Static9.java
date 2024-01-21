import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "Lclient!i;")
	public static Class2_Sub1_Sub7 aClass2_Sub1_Sub7_1;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
	public static int anInt253;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "Lclient!cd;")
	private static Class10 aClass10_127 = Static51.method932("FULL");

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "Lclient!cd;")
	public static Class10 aClass10_128 = Static51.method932("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
	public static int anInt248 = 0;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "Lclient!cd;")
	public static Class10 aClass10_129 = Static51.method932(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "Lclient!cd;")
	public static Class10 aClass10_130 = aClass10_127;

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
	public static int anInt254 = 0;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)Lclient!cd;")
	public static Class10 method163(@OriginalArg(0) int arg0) {
		return Static75.aClass10Array12[arg0].method340() <= 0 ? Static80.aClass10Array14[arg0] : Static3.method36(new Class10[] { Static80.aClass10Array14[arg0], Static163.aClass10_1520, Static75.aClass10Array12[arg0] });
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBII)I")
	public static int method164(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBLjava/awt/Color;Lclient!cd;)V")
	public static void method165(@OriginalArg(0) int arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) Class10 arg2) {
		try {
			@Pc(2) Graphics local2 = Static25.aCanvas1.getGraphics();
			if (Static69.aFont1 == null) {
				Static69.aFont1 = new Font("Helvetica", 1, 13);
				Static66.aFontMetrics1 = Static25.aCanvas1.getFontMetrics(Static69.aFont1);
			}
			if (Static20.aBoolean18) {
				Static20.aBoolean18 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static44.anInt1028, Static65.anInt1588);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static147.anImage105 == null) {
					Static147.anImage105 = Static25.aCanvas1.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static147.anImage105.getGraphics();
				local47.setColor(arg1);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg0 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local47.setFont(Static69.aFont1);
				local47.setColor(Color.white);
				arg2.method345(local47, 22, (304 - arg2.method337(Static66.aFontMetrics1)) / 2);
				local2.drawImage(Static147.anImage105, Static44.anInt1028 / 2 - 152, Static65.anInt1588 / 2 + -18, null);
			} catch (@Pc(129) Exception local129) {
				@Pc(135) int local135 = Static44.anInt1028 / 2 - 152;
				@Pc(141) int local141 = Static65.anInt1588 / 2 - 18;
				local2.setColor(arg1);
				local2.drawRect(local135, local141, 303, 33);
				local2.fillRect(local135 + 2, local141 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local135 + 1, local141 + 1, 301, 31);
				local2.fillRect(local135 + arg0 * 3 + 2, local141 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Static69.aFont1);
				local2.setColor(Color.white);
				arg2.method345(local2, local141 + 22, local135 - -((304 - arg2.method337(Static66.aFontMetrics1)) / 2));
			}
		} catch (@Pc(220) Exception local220) {
			Static25.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)Z")
	public static boolean method166() {
		try {
			if (Static168.anInt3655 == 2) {
				if (Static79.aClass2_Sub12_1 == null) {
					Static79.aClass2_Sub12_1 = Static183.method1508(Static111.aClass29_49, Static83.anInt1906, Static55.anInt1427);
					if (Static79.aClass2_Sub12_1 == null) {
						return false;
					}
				}
				if (Static18.aClass24_1 == null) {
					Static18.aClass24_1 = new Class24(Static2.aClass29_1, Static176.aClass29_72);
				}
				if (Static178.aClass2_Sub5_Sub4_2.method2667(Static79.aClass2_Sub12_1, Static18.aClass24_1, Static130.aClass29_56)) {
					Static178.aClass2_Sub5_Sub4_2.method2670();
					Static178.aClass2_Sub5_Sub4_2.method2684(Static70.anInt1667);
					Static178.aClass2_Sub5_Sub4_2.method2663(Static92.aBoolean91, Static79.aClass2_Sub12_1);
					Static79.aClass2_Sub12_1 = null;
					Static18.aClass24_1 = null;
					Static111.aClass29_49 = null;
					Static168.anInt3655 = 0;
					return true;
				}
			}
		} catch (@Pc(67) Exception local67) {
			local67.printStackTrace();
			Static178.aClass2_Sub5_Sub4_2.method2691();
			Static79.aClass2_Sub12_1 = null;
			Static168.anInt3655 = 0;
			Static18.aClass24_1 = null;
			Static111.aClass29_49 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
	public static void method167() {
		aClass10_128 = null;
		aClass10_129 = null;
		aByteArrayArrayArray1 = null;
		aClass10_127 = null;
		aClass10_130 = null;
		aClass2_Sub1_Sub7_1 = null;
	}
}
