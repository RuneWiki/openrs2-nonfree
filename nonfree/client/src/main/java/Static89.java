import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray9;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Lclient!bt;")
	public static Class34 aClass34_20;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_43 = new Class151(8, 5);

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray9 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "[F")
	public static final float[] aFloatArray4 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method1791() {
		Static669.method8921((long) Static177.anInt3088, Static582.aClass33_13);
		if (Static77.anInt1630 != -1) {
			Static245.method6855(Static77.anInt1630);
		}
		for (@Pc(18) int local18 = 0; local18 < Static463.anInt7418; local18++) {
			if (Static109.aBooleanArray4[local18]) {
				Static387.aBooleanArray12[local18] = true;
			}
			Static146.aBooleanArray6[local18] = Static109.aBooleanArray4[local18];
			Static109.aBooleanArray4[local18] = false;
		}
		Static308.anInt9999 = Static177.anInt3088;
		if (Static77.anInt1630 != -1) {
			Static463.anInt7418 = 0;
			Static559.method7423();
		}
		Static582.aClass33_13.la();
		Static585.method7690(Static582.aClass33_13);
		@Pc(65) int local65 = Static417.method5291();
		if (local65 == -1) {
			local65 = Static530.anInt8205;
		}
		if (local65 == -1) {
			local65 = Static203.anInt3317;
		}
		Static244.method3606(local65);
		Static88.anInt1794 = 0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method1794(@OriginalArg(0) Class33 arg0) {
		for (@Pc(6) Class3_Sub7 local6 = (Class3_Sub7) Static645.aClass236_10.method4958(); local6 != null; local6 = (Class3_Sub7) Static645.aClass236_10.method4950()) {
			if (local6.aBoolean654) {
				local6.method7309(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method1799(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) char[] local16 = new char[arg2];
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg1;
		@Pc(25) int local25 = arg1 + arg2;
		while (local20 < local25) {
			@Pc(34) int local34 = arg0[local20++] & 0xFF;
			@Pc(79) int local79;
			if (local34 >= 128) {
				if (local34 < 192) {
					local79 = 65533;
				} else if (local34 >= 224) {
					if (local34 < 240) {
						if (local20 + 1 < local25 && (arg0[local20] & 0xC0) == 128 && (arg0[local20 + 1] & 0xC0) == 128) {
							local79 = (local34 & 0xF) << 12 | arg0[local20++] << 6 & 0xFC0 | arg0[local20++] & 0x3F;
							if (local79 < 2048) {
								local79 = 65533;
							}
						} else {
							local79 = 65533;
						}
					} else if (local34 >= 248) {
						local79 = 65533;
					} else if (local20 + 2 < local25 && (arg0[local20] & 0xC0) == 128 && (arg0[local20 + 1] & 0xC0) == 128 && (arg0[local20 + 2] & 0xC0) == 128) {
						local79 = (local34 & 0x7) << 18 | arg0[local20++] << 12 & 0x3F000 | (arg0[local20++] & 0x3F) << 6 | arg0[local20++] & 0x3F;
						if (local79 >= 65536 && local79 <= 1114111) {
							local79 = 65533;
						} else {
							local79 = 65533;
						}
					} else {
						local79 = 65533;
					}
				} else if (local20 < local25 && (arg0[local20] & 0xC0) == 128) {
					local79 = arg0[local20++] & 0x3F | (local34 & 0x1F) << 6;
					if (local79 < 128) {
						local79 = 65533;
					}
				} else {
					local79 = 65533;
				}
			} else if (local34 == 0) {
				local79 = 65533;
			} else {
				local79 = local34;
			}
			local16[local18++] = (char) local79;
		}
		return new String(local16, 0, local18);
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)V")
	public static void method1800(@OriginalArg(0) int arg0) {
		Static253.anInt4127 = arg0;
		Static451.anInt7047 = -1;
		Static527.anInt8178 = -1;
		Static258.method3733();
	}
}
