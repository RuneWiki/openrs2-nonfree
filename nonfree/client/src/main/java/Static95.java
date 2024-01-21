import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Lclient!nd;")
	public static Class59 aClass59_16 = new Class59(64);

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Lclient!tg;")
	public static Class81 aClass81_731 = Static120.method2057("(U(Y");

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "[I")
	public static int[] anIntArray235 = new int[5];

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "Lclient!tg;")
	public static Class81 aClass81_732 = Static120.method2057("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method1587(@OriginalArg(1) KeyEvent arg0) {
		@Pc(13) int local13 = arg0.getKeyChar();
		if (local13 == 8364) {
			return 128;
		} else {
			if (local13 <= 0 || local13 >= 256) {
				local13 = -1;
			}
			return local13;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!td;IIIII)V")
	public static void method1589(@OriginalArg(0) Class1_Sub2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static77.anInt1828) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static8.anInt164) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static141.anInt709 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class1_Sub17 local62 = Static167.aClass1_Sub17ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static116.anIntArrayArrayArray4[local17][local23][local32] + Static116.anIntArrayArrayArray4[local17][local23 + 1][local32] + Static116.anIntArrayArrayArray4[local17][local23][local32 + 1] + Static116.anIntArrayArrayArray4[local17][local23 + 1][local32 + 1]) / 4 - (Static116.anIntArrayArrayArray4[arg1][arg2][arg3] + Static116.anIntArrayArrayArray4[arg1][arg2 + 1][arg3] + Static116.anIntArrayArrayArray4[arg1][arg2][arg3 + 1] + Static116.anIntArrayArrayArray4[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class22 local151 = local62.aClass22_1;
									if (local151 != null) {
										@Pc(161) Class1_Sub2_Sub1_Sub6 local161;
										if (local151.aClass1_Sub2_Sub1_1 instanceof Class1_Sub2_Sub1_Sub6) {
											local161 = (Class1_Sub2_Sub1_Sub6) local151.aClass1_Sub2_Sub1_1;
											Static159.method2763(arg0, local161, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass1_Sub2_Sub1_2 instanceof Class1_Sub2_Sub1_Sub6) {
											local161 = (Class1_Sub2_Sub1_Sub6) local151.aClass1_Sub2_Sub1_2;
											Static159.method2763(arg0, local161, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(225) int local225 = 0; local225 < local62.anInt1851; local225++) {
										@Pc(231) Class75 local231 = local62.aClass75Array2[local225];
										if (local231 != null && local231.aClass1_Sub2_Sub1_7 instanceof Class1_Sub2_Sub1_Sub6) {
											@Pc(241) Class1_Sub2_Sub1_Sub6 local241 = (Class1_Sub2_Sub1_Sub6) local231.aClass1_Sub2_Sub1_7;
											@Pc(249) int local249 = local231.anInt3161 + 1 - local231.anInt3164;
											@Pc(257) int local257 = local231.anInt3165 + 1 - local231.anInt3158;
											Static159.method2763(arg0, local241, (local231.anInt3164 - arg2) * 128 + (local249 - arg4) * 64, local148, (local231.anInt3158 - arg3) * 128 + (local257 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method1590() {
		aClass59_16 = null;
		aClass81_731 = null;
		aClass81_732 = null;
		anIntArray235 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[B)Lclient!na;")
	public static Class1_Sub2_Sub2_Sub2_Sub1 method1592(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(23) Class1_Sub2_Sub2_Sub2_Sub1 local23 = new Class1_Sub2_Sub2_Sub2_Sub1(arg0, Static155.anIntArray369, Static25.anIntArray37, Static73.anIntArray155, Static161.anIntArray386, Static73.anIntArray156, Static178.aByteArrayArray10);
			Static176.method3057();
			return local23;
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	public static void method1593() {
		Static94.aClass36_1.method2681();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Static179.aLongArray10[local15] = 0L;
		}
		for (@Pc(27) int local27 = 0; local27 < 32; local27++) {
			Static104.aLongArray5[local27] = 0L;
		}
		Static2.anInt47 = 0;
	}
}
