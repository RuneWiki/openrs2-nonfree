import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!bc;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	public static int anInt2451;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Lclient!ed;")
	public static Class23 aClass23_921 = Static169.method2903("<col=ffff00>*V");

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Lclient!ed;")
	public static Class23 aClass23_922 = Static169.method2903("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Lclient!ed;")
	public static Class23 aClass23_923 = Static169.method2903("weiss:");

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "J")
	public static long aLong75 = 0L;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Lclient!ed;")
	public static Class23 aClass23_924 = Static169.method2903("rot:");

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "[Lclient!ea;")
	public static Class21[] aClass21Array1 = new Class21[16];

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "Lclient!ed;")
	public static Class23 aClass23_925 = Static169.method2903("::errortest");

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method1625() {
		Static60.aByteArrayArrayArray109 = null;
		Static74.aByteArrayArrayArray45 = null;
		Static154.aByteArrayArrayArray91 = null;
		Static142.anIntArray477 = null;
		Static177.aByteArrayArrayArray104 = null;
		Static157.anIntArray519 = null;
		Static9.anIntArray55 = null;
		Static144.anIntArrayArrayArray4 = null;
		Static22.anIntArray96 = null;
		Static44.anIntArray147 = null;
		Static36.aByteArrayArrayArray24 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
	public static int method1626(@OriginalArg(1) KeyEvent arg0) {
		@Pc(12) int local12 = arg0.getKeyChar();
		if (local12 == 8364) {
			return 128;
		} else {
			if (local12 <= 0 || local12 >= 256) {
				local12 = -1;
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)V")
	public static void method1627(@OriginalArg(1) int arg0) {
		Static80.anInt2165 += arg0 * 128;
		@Pc(25) int local25;
		if (Static75.anIntArray269.length < Static80.anInt2165) {
			Static80.anInt2165 -= Static75.anIntArray269.length;
			local25 = (int) (Math.random() * 12.0D);
			Static115.method2047(Static53.aClass1_Sub1_Sub12_Sub4Array4[local25]);
		}
		local25 = 0;
		@Pc(47) int local47 = arg0 * 128;
		@Pc(54) int local54 = (256 - arg0) * 128;
		@Pc(80) int local80;
		for (@Pc(56) int local56 = 0; local56 < local54; local56++) {
			local80 = Static14.anIntArray64[local25 + local47] - Static75.anIntArray269[Static75.anIntArray269.length - 1 & Static80.anInt2165 + local25] * arg0 / 6;
			if (local80 < 0) {
				local80 = 0;
			}
			Static14.anIntArray64[local25++] = local80;
		}
		@Pc(108) int local108;
		@Pc(110) int local110;
		@Pc(117) int local117;
		for (local80 = 256 - arg0; local80 < 256; local80++) {
			local108 = local80 * 128;
			for (local110 = 0; local110 < 128; local110++) {
				local117 = (int) (Math.random() * 100.0D);
				if (local117 < 50 && local110 > 10 && local110 < 118) {
					Static14.anIntArray64[local108 + local110] = 255;
				} else {
					Static14.anIntArray64[local110 + local108] = 0;
				}
			}
		}
		if (Static32.anInt944 > 0) {
			Static32.anInt944 -= arg0 * 4;
		}
		if (Static93.anInt2446 > 0) {
			Static93.anInt2446 -= arg0 * 4;
		}
		if (Static93.anInt2446 == 0 && Static32.anInt944 == 0) {
			local108 = (int) (Math.random() * (double) (2000 / arg0));
			if (local108 == 0) {
				Static93.anInt2446 = 1024;
			}
			if (local108 == 1) {
				Static32.anInt944 = 1024;
			}
		}
		for (local108 = 0; local108 < 256 - arg0; local108++) {
			Static139.anIntArray472[local108] = Static139.anIntArray472[arg0 + local108];
		}
		for (local110 = 256 - arg0; local110 < 256; local110++) {
			Static139.anIntArray472[local110] = (int) (Math.sin((double) Static149.anInt3735 / 14.0D) * 16.0D + Math.sin((double) Static149.anInt3735 / 15.0D) * 14.0D + Math.sin((double) Static149.anInt3735 / 16.0D) * 12.0D);
			Static149.anInt3735++;
		}
		local117 = ((Static26.anInt845 & 0x1) + arg0) / 2;
		Static128.anInt3379 += arg0;
		if (local117 <= 0) {
			return;
		}
		@Pc(292) int local292;
		@Pc(299) int local299;
		for (@Pc(283) int local283 = 0; local283 < Static128.anInt3379 * 100; local283++) {
			local292 = (int) (Math.random() * 124.0D) + 2;
			local299 = (int) (Math.random() * 128.0D) + 128;
			Static14.anIntArray64[local292 + (local299 << 7)] = 192;
		}
		Static128.anInt3379 = 0;
		@Pc(323) int local323;
		@Pc(328) int local328;
		for (local292 = 0; local292 < 256; local292++) {
			local323 = local292 * 128;
			local299 = 0;
			for (local328 = -local117; local328 < 128; local328++) {
				if (local328 + local117 < 128) {
					local299 += Static14.anIntArray64[local117 + local323 + local328];
				}
				if (local328 - local117 - 1 >= 0) {
					local299 -= Static14.anIntArray64[local323 + local328 - local117 - 1];
				}
				if (local328 >= 0) {
					Static156.anIntArray516[local328 + local323] = local299 / (local117 * 2 + 1);
				}
			}
		}
		for (local299 = 0; local299 < 128; local299++) {
			local323 = 0;
			for (local328 = -local117; local328 < 256; local328++) {
				@Pc(407) int local407 = local328 * 128;
				if (local117 + local328 < 256) {
					local323 += Static156.anIntArray516[local407 + local299 + local117 * 128];
				}
				if (local328 - local117 - 1 >= 0) {
					local323 -= Static156.anIntArray516[local299 + local407 - (local117 + 1) * 128];
				}
				if (local328 >= 0) {
					Static14.anIntArray64[local299 + local407] = local323 / (local117 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
	public static void method1628() {
		Static19.anImage1 = null;
		Static99.aFont1 = null;
		Static55.aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method1629() {
		aClass23_924 = null;
		aClass23_922 = null;
		aClass23_921 = null;
		aClass9_1 = null;
		aClass21Array1 = null;
		aClass23_923 = null;
		aClass23_925 = null;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method1630() {
		Static163.aClass79_25.method2659();
		Static68.aClass79_10.method2659();
		Static97.aClass79_13.method2659();
		Static35.aClass79_4.method2659();
		Static140.aClass79_22.method2659();
	}
}
