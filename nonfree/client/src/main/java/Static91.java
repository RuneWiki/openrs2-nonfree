import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
	public static int anInt1908;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "[S")
	public static short[] aShortArray26 = new short[256];

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	public static int anInt1907 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZIIZI)V")
	public static void method1653(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static373.aFrame5 != null && (arg4 != 3 || arg2 != Static38.aClass135_Sub1_1.anInt5095 || arg0 != Static38.aClass135_Sub1_1.anInt5099)) {
			Static410.method5508(Static77.aClass180_1, Static373.aFrame5);
			Static373.aFrame5 = null;
		}
		if (arg4 == 3 && Static373.aFrame5 == null) {
			Static373.aFrame5 = Static338.method4756(Static77.aClass180_1, 0, arg2, arg0);
			if (Static373.aFrame5 != null) {
				Static38.aClass135_Sub1_1.anInt5099 = arg0;
				Static38.aClass135_Sub1_1.anInt5095 = arg2;
				Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
			}
		}
		if (arg4 == 3 && Static373.aFrame5 == null) {
			method1653(-1, true, -1, arg3, Static38.aClass135_Sub1_1.anInt5090);
			return;
		}
		@Pc(76) Container local76;
		@Pc(88) Insets local88;
		if (Static373.aFrame5 != null) {
			local76 = Static373.aFrame5;
			Static107.anInt2270 = arg0;
			Static299.anInt700 = arg2;
		} else if (Static285.aFrame4 == null) {
			local76 = Static77.aClass180_1.anApplet1;
			Static299.anInt700 = local76.getSize().width;
			Static107.anInt2270 = local76.getSize().height;
		} else {
			local88 = Static285.aFrame4.getInsets();
			Static299.anInt700 = Static285.aFrame4.getSize().width - local88.left - local88.right;
			@Pc(107) int local107 = local88.top + local88.bottom;
			Static107.anInt2270 = Static285.aFrame4.getSize().height - local107;
			local76 = Static285.aFrame4;
		}
		@Pc(138) int local138;
		if (arg4 == 1) {
			Static34.anInt715 = Static270.anInt4804;
			Static308.anInt5300 = 0;
			Static95.anInt1971 = Static392.anInt6303;
			Static202.anInt3872 = (Static299.anInt700 - Static392.anInt6303) / 2;
		} else if (Static79.anInt1766 < 96 && Static143.anInt2766 == 0) {
			local138 = Static299.anInt700 > 1024 ? 1024 : Static299.anInt700;
			Static202.anInt3872 = (Static299.anInt700 - local138) / 2;
			@Pc(152) int local152 = Static107.anInt2270 <= 768 ? Static107.anInt2270 : 768;
			Static95.anInt1971 = local138;
			Static34.anInt715 = local152;
			Static308.anInt5300 = 0;
		} else {
			Static308.anInt5300 = 0;
			Static34.anInt715 = Static107.anInt2270;
			Static202.anInt3872 = 0;
			Static95.anInt1971 = Static299.anInt700;
		}
		if (Static45.aClass137_10 != Static35.aClass137_11) {
			@Pc(195) boolean local195;
			if (Static95.anInt1971 < 1024 && Static34.anInt715 < 768) {
				local195 = true;
			} else {
				local195 = false;
			}
		}
		if (arg1) {
			Static214.method4407();
		} else {
			Static155.aCanvas4.setSize(Static95.anInt1971, Static34.anInt715);
			Static415.aClass39_11.method4498(Static155.aCanvas4);
			if (Static285.aFrame4 == local76) {
				local88 = Static285.aFrame4.getInsets();
				Static155.aCanvas4.setLocation(local88.left + Static202.anInt3872, local88.top - -Static308.anInt5300);
			} else {
				Static155.aCanvas4.setLocation(Static202.anInt3872, Static308.anInt5300);
			}
		}
		if (arg4 >= 2) {
			Static391.aBoolean440 = true;
		} else {
			Static391.aBoolean440 = false;
		}
		if (Static407.anInt6564 != -1) {
			Static292.method4245(true);
		}
		if (Static82.aClass229_1 != null && Static340.method4806(Static342.anInt5771)) {
			Static122.method2213();
		}
		for (local138 = 0; local138 < 100; local138++) {
			Static71.aBooleanArray25[local138] = true;
		}
		Static90.aBoolean117 = true;
	}
}
