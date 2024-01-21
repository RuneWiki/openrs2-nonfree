import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!re", name = "r", descriptor = "I")
	public static int anInt1927;

	@OriginalMember(owner = "client!re", name = "t", descriptor = "Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1 aClass5_Sub1_Sub10_Sub1_17;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "I")
	public static int anInt1921 = 0;

	@OriginalMember(owner = "client!re", name = "e", descriptor = "Lclient!qa;")
	public static Class54 aClass54_31 = new Class54(64);

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Lclient!vc;")
	public static Class71 aClass71_942 = Static38.method736("(U(Y");

	@OriginalMember(owner = "client!re", name = "l", descriptor = "Lclient!vc;")
	public static Class71 aClass71_947 = Static38.method736("");

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!vc;")
	public static Class71 aClass71_943 = aClass71_947;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "Lclient!vc;")
	public static Class71 aClass71_944 = aClass71_947;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "Lclient!vc;")
	public static Class71 aClass71_945 = aClass71_947;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!vc;")
	public static Class71 aClass71_946 = aClass71_947;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "I")
	public static int anInt1925 = 0;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "Lclient!vc;")
	public static Class71 aClass71_948 = aClass71_947;

	@OriginalMember(owner = "client!re", name = "o", descriptor = "Lclient!vc;")
	public static Class71 aClass71_949 = aClass71_947;

	@OriginalMember(owner = "client!re", name = "p", descriptor = "Lclient!qa;")
	public static Class54 aClass54_32 = new Class54(64);

	@OriginalMember(owner = "client!re", name = "q", descriptor = "Lclient!qa;")
	public static Class54 aClass54_33 = new Class54(30);

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	public static int anInt1928 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/awt/Color;Lclient!vc;I)V")
	public static void method1273(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Class71 arg2) {
		try {
			@Pc(6) Graphics local6 = Static105.aCanvas1.getGraphics();
			if (Static88.aFont1 == null) {
				Static88.aFont1 = new Font("Helvetica", 1, 13);
				Static107.aFontMetrics1 = Static105.aCanvas1.getFontMetrics(Static88.aFont1);
			}
			if (Static73.aBoolean87) {
				Static73.aBoolean87 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static19.anInt630, Static26.anInt1438);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static70.anImage4 == null) {
					Static70.anImage4 = Static105.aCanvas1.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static70.anImage4.getGraphics();
				local51.setColor(arg1);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg0 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local51.setFont(Static88.aFont1);
				local51.setColor(Color.white);
				arg2.method1816(22, local51, (304 - arg2.method1809(Static107.aFontMetrics1)) / 2);
				local6.drawImage(Static70.anImage4, Static19.anInt630 / 2 - 152, Static26.anInt1438 / 2 - 18, null);
			} catch (@Pc(138) Exception local138) {
				@Pc(144) int local144 = Static26.anInt1438 / 2 - 18;
				@Pc(150) int local150 = Static19.anInt630 / 2 - 152;
				local6.setColor(arg1);
				local6.drawRect(local150, local144, 303, 33);
				local6.fillRect(local150 + 2, local144 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local150 + 1, local144 - -1, 301, 31);
				local6.fillRect(local150 + arg0 * 3 + 2, local144 - -2, 300 - arg0 * 3, 30);
				local6.setFont(Static88.aFont1);
				local6.setColor(Color.white);
				arg2.method1816(local144 + 22, local6, (304 - arg2.method1809(Static107.aFontMetrics1)) / 2 + local150);
			}
		} catch (@Pc(228) Exception local228) {
			Static105.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method1274() {
		@Pc(3) Class40 local3 = Static66.aClass40_1;
		synchronized (Static66.aClass40_1) {
			Static2.anInt1866 = Static20.anInt677;
			@Pc(18) int local18;
			if (Static87.anInt2054 >= 0) {
				while (Static39.anInt1032 != Static87.anInt2054) {
					local18 = Static24.anIntArray88[Static39.anInt1032];
					Static39.anInt1032 = Static39.anInt1032 + 1 & 0x7F;
					if (local18 < 0) {
						Static53.aBooleanArray11[~local18] = false;
					} else {
						Static53.aBooleanArray11[local18] = true;
					}
				}
			} else {
				for (local18 = 0; local18 < 112; local18++) {
					Static53.aBooleanArray11[local18] = false;
				}
				Static87.anInt2054 = Static39.anInt1032;
			}
			Static20.anInt677 = Static16.anInt512;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!nb;Lclient!we;ZLclient!nb;)V")
	public static void method1276(@OriginalArg(1) Class24 arg0, @OriginalArg(2) Class5_Sub1_Sub10_Sub4 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class24 arg3) {
		Static85.aClass24_16 = arg0;
		Static91.aBoolean100 = arg2;
		Static77.aClass24_15 = arg3;
		Static69.anInt1703 = Static77.aClass24_15.method660(10);
		Static100.aClass5_Sub1_Sub10_Sub4_5 = arg1;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
	public static void method1279() {
		aClass71_949 = null;
		aClass71_947 = null;
		aClass5_Sub1_Sub10_Sub1_17 = null;
		aClass54_32 = null;
		aClass71_942 = null;
		aClass54_31 = null;
		aClass71_943 = null;
		aClass71_944 = null;
		aClass54_33 = null;
		aClass71_945 = null;
		aClass71_948 = null;
		aClass71_946 = null;
	}
}
