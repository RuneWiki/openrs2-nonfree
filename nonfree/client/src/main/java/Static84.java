import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!cha", name = "i", descriptor = "I")
	public static int anInt1419;

	@OriginalMember(owner = "client!cha", name = "n", descriptor = "I")
	public static int anInt1426;

	@OriginalMember(owner = "client!cha", name = "h", descriptor = "I")
	public static int anInt1420 = 0;

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(II)V")
	public static void method1246(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static39.aBooleanArray5[arg0]) {
			Static240.aClass254_166.method6086(arg0);
			Static581.aClass273ArrayArray2[arg0] = null;
			Static39.aClass273ArrayArray1[arg0] = null;
			Static39.aBooleanArray5[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(IIZIIB)V")
	public static void method1247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static249.aFrame1 != null && (arg3 != 3 || arg4 != Static310.anInt4754 || Static595.anInt7809 != arg1)) {
			Static94.method1458(Static249.aFrame1, Static135.aClass389_2);
			Static249.aFrame1 = null;
		}
		if (arg3 == 3 && Static249.aFrame1 == null) {
			Static249.aFrame1 = Static161.method2377(0, Static135.aClass389_2, arg4, arg1);
			if (Static249.aFrame1 != null) {
				Static310.anInt4754 = arg4;
				Static595.anInt7809 = arg1;
				Static610.method9380();
			}
		}
		if (arg3 == 3 && Static249.aFrame1 == null) {
			method1247(arg0, -1, true, Static650.aClass2_Sub30_29.aClass11_Sub30_1.method9623(), -1);
			return;
		}
		@Pc(90) Container local90;
		@Pc(101) Insets local101;
		if (Static249.aFrame1 != null) {
			Static34.anInt8577 = arg4;
			local90 = Static249.aFrame1;
			Static121.anInt2049 = arg1;
		} else if (Static516.aFrame2 == null) {
			if (Static214.anApplet1 == null) {
				local90 = Static273.anApplet_Sub1_1;
			} else {
				local90 = Static214.anApplet1;
			}
			Static34.anInt8577 = local90.getSize().width;
			Static121.anInt2049 = local90.getSize().height;
		} else {
			local101 = Static516.aFrame2.getInsets();
			Static34.anInt8577 = Static516.aFrame2.getSize().width - local101.left - local101.right;
			Static121.anInt2049 = Static516.aFrame2.getSize().height - local101.top - local101.bottom;
			local90 = Static516.aFrame2;
		}
		if (arg3 == 1) {
			Static251.anInt3953 = (Static34.anInt8577 - Static33.anInt443) / 2;
			Static295.anInt4558 = Static277.anInt4340;
			Static151.anInt7983 = Static33.anInt443;
			Static477.anInt7668 = 0;
		} else {
			Static255.method3620();
		}
		if (Static229.aClass386_6 != Static661.aClass386_10) {
			@Pc(187) boolean local187;
			if (Static151.anInt7983 < 1024 && Static295.anInt4558 < 768) {
				local187 = true;
			} else {
				local187 = false;
			}
		}
		if (arg2) {
			Static50.method740();
		} else {
			Static316.aCanvas1.setSize(Static151.anInt7983, Static295.anInt4558);
			if (Static392.aBoolean549) {
				Static108.method1601(Static316.aCanvas1);
			} else {
				Static396.aClass145_6.method9662(Static316.aCanvas1, Static151.anInt7983, Static295.anInt4558);
			}
			if (local90 == Static516.aFrame2) {
				local101 = Static516.aFrame2.getInsets();
				Static316.aCanvas1.setLocation(local101.left + Static251.anInt3953, Static477.anInt7668 + local101.top);
			} else {
				Static316.aCanvas1.setLocation(Static251.anInt3953, Static477.anInt7668);
			}
		}
		if (arg3 < 2) {
			Static301.aBoolean883 = false;
		} else {
			Static301.aBoolean883 = true;
		}
		if (Static542.anInt8552 != -1) {
			Static445.method6516(true);
		}
		if (Static487.aClass221_2.aClass5_2 != null && Static424.method6174(Static357.anInt5722)) {
			Static237.method9870();
		}
		for (@Pc(283) int local283 = 0; local283 < 100; local283++) {
			Static537.aBooleanArray25[local283] = true;
		}
		Static616.aBoolean813 = true;
	}
}
