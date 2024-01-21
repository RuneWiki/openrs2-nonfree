import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!rd", name = "Ob", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_19;

	@OriginalMember(owner = "client!rd", name = "Ub", descriptor = "Lclient!je;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!rd", name = "vb", descriptor = "Lclient!jb;")
	public static Class34 aClass34_29 = new Class34(64);

	@OriginalMember(owner = "client!rd", name = "Bb", descriptor = "Lclient!v;")
	private static Class62 aClass62_1082 = Static45.method753(" is already on your friend list");

	@OriginalMember(owner = "client!rd", name = "Db", descriptor = "I")
	public static int anInt2404 = 2;

	@OriginalMember(owner = "client!rd", name = "Fb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1083 = Static45.method753("Abbrechen");

	@OriginalMember(owner = "client!rd", name = "Kb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1084 = aClass62_1082;

	@OriginalMember(owner = "client!rd", name = "Sb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1085 = Static45.method753("backright1");

	@OriginalMember(owner = "client!rd", name = "Tb", descriptor = "I")
	public static int anInt2413 = 0;

	@OriginalMember(owner = "client!rd", name = "Vb", descriptor = "I")
	public static int anInt2414 = 1;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V")
	public static void method1525() {
		aClass62_1082 = null;
		aClass62_1084 = null;
		aClass62_1085 = null;
		aClass3_Sub1_Sub1_Sub1_19 = null;
		aClass62_1083 = null;
		aClass37_1 = null;
		aClass34_29 = null;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)V")
	public static void method1527() {
		try {
			@Pc(7) Graphics local7 = Static44.aCanvas1.getGraphics();
			Static48.aClass9_27.method686(local7, 553, 205);
		} catch (@Pc(15) Exception local15) {
			Static44.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(JI)V")
	public static void method1530(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static24.anInt762 >= 100 && Static53.anInt1436 != 1 || Static24.anInt762 >= 200) {
			Static45.method757(Static41.aClass62_513, 0, Static94.aClass62_1139);
			return;
		}
		@Pc(35) Class62 local35 = Static19.method1855(arg0).method1681();
		for (@Pc(37) int local37 = 0; local37 < Static24.anInt762; local37++) {
			if (Static49.aLongArray15[local37] == arg0) {
				Static45.method757(Static41.aClass62_513, 0, Static49.method782(new Class62[] { local35, aClass62_1084 }));
				return;
			}
		}
		for (@Pc(82) int local82 = 0; local82 < Static20.anInt704; local82++) {
			if (Static108.aLongArray35[local82] == arg0) {
				Static45.method757(Static41.aClass62_513, 0, Static49.method782(new Class62[] { Static78.aClass62_912, local35, Static23.aClass62_314 }));
				return;
			}
		}
		if (local35.method1675(Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.aClass62_570)) {
			return;
		}
		Static64.aClass62Array10[Static24.anInt762] = local35;
		Static49.aLongArray15[Static24.anInt762] = arg0;
		Static58.anIntArray167[Static24.anInt762] = 0;
		Static52.aBoolean64 = true;
		Static24.anInt762++;
		Static63.aClass3_Sub8_Sub1_6.method1824(65);
		Static63.aClass3_Sub8_Sub1_6.method1763(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(Z)V")
	public static void method1531() {
		Static99.method1656();
		if (Static14.anInt554 == 1) {
			Static36.aClass3_Sub1_Sub1_Sub4Array23[Static38.anInt1137 / 100].method1751(Static33.anInt1048 - 8 - 4, Static46.anInt1370 + -8 + -4);
		}
		if (Static14.anInt554 == 2) {
			Static36.aClass3_Sub1_Sub1_Sub4Array23[Static38.anInt1137 / 100 + 4].method1751(Static33.anInt1048 - 8 - 4, Static46.anInt1370 - 12);
		}
		if (Static70.anInt1932 != -1) {
			Static64.method1078(Static70.anInt1932);
			Static38.method676(0, 0, 0, Static70.anInt1932, 512, -1, 4, 334);
		}
		if (Static38.anInt1133 != -1) {
			Static64.method1078(Static38.anInt1133);
			Static38.method676(0, 0, 0, Static38.anInt1133, 512, -1, 0, 334);
		}
		Static61.method1023();
		if (!Static40.aBoolean66) {
			Static33.method657();
			Static22.method493();
		} else if (Static6.anInt211 == 0) {
			Static49.method784();
		}
		if (Static15.anInt580 == 1) {
			Static58.aClass3_Sub1_Sub1_Sub4_2.method1751(472, 296);
		}
		@Pc(162) int local162;
		if (Static91.aBoolean150) {
			@Pc(120) byte local120 = 20;
			@Pc(122) int local122 = 16776960;
			if (Static100.anInt2469 < 30 && Static92.aBoolean151) {
				local122 = 16711680;
			}
			if (Static100.anInt2469 < 20 && !Static92.aBoolean151) {
				local122 = 16711680;
			}
			Static50.aClass3_Sub1_Sub1_Sub3_12.method1473(Static49.method782(new Class62[] { Static74.aClass62_863, Static99.method1662(Static100.anInt2469) }), 20, local122);
			local122 = 16776960;
			local162 = local120 + 15;
			@Pc(164) Runtime local164 = Runtime.getRuntime();
			@Pc(173) int local173 = (int) ((local164.totalMemory() - local164.freeMemory()) / 1024L);
			if (local173 > 32768 && Static92.aBoolean151) {
				local122 = 16711680;
			}
			if (local173 > 65536 && !Static92.aBoolean151) {
				local122 = 16711680;
			}
			Static50.aClass3_Sub1_Sub1_Sub3_12.method1473(Static49.method782(new Class62[] { Static8.aClass62_115, Static99.method1662(local173), Static46.aClass62_574 }), 35, local122);
			local162 += 15;
			if (Static40.aBoolean65) {
				Static50.aClass3_Sub1_Sub1_Sub3_12.method1473(Static13.aClass62_181, 50, 16711680);
				Static40.aBoolean65 = false;
				local162 += 15;
			}
			if (Static8.aBoolean13) {
				Static50.aClass3_Sub1_Sub1_Sub3_12.method1473(Static14.aClass62_216, local162, 16711680);
				local162 += 15;
				Static8.aBoolean13 = false;
			}
			if (Static59.aBoolean88) {
				Static50.aClass3_Sub1_Sub1_Sub3_12.method1473(Static106.aClass62_1280, local162, 16711680);
				local162 += 15;
				Static59.aBoolean88 = false;
			}
		}
		if (Static13.anInt465 == 0) {
			return;
		}
		@Pc(252) int local252 = Static13.anInt465 / 50;
		local162 = local252 / 60;
		@Pc(260) int local260 = local252 % 60;
		if (local260 < 10) {
			Static50.aClass3_Sub1_Sub1_Sub3_12.method1475(Static49.method782(new Class62[] { Static53.aClass62_615, Static99.method1662(local162), Static98.aClass62_1190, Static99.method1662(local260) }), 4, 329, 16776960);
		} else {
			Static50.aClass3_Sub1_Sub1_Sub3_12.method1475(Static49.method782(new Class62[] { Static53.aClass62_615, Static99.method1662(local162), Static41.aClass62_515, Static99.method1662(local260) }), 4, 329, 16776960);
		}
	}
}
