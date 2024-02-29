package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zb")
public final class Class685 {

	@OriginalMember(owner = "client!zb", name = "x", descriptor = "I")
	int anInt5847;

	@OriginalMember(owner = "client!zb", name = "f", descriptor = "I")
	int anInt5852;

	@OriginalMember(owner = "client!zb", name = "t", descriptor = "[B")
	byte[] aByteArray107;

	@OriginalMember(owner = "client!zb", name = "j", descriptor = "I")
	int anInt5854;

	@OriginalMember(owner = "client!zb", name = "z", descriptor = "B")
	byte aByte177;

	@OriginalMember(owner = "client!zb", name = "g", descriptor = "I")
	int anInt5856;

	@OriginalMember(owner = "client!zb", name = "i", descriptor = "I")
	int anInt5858;

	@OriginalMember(owner = "client!zb", name = "k", descriptor = "I")
	int anInt5859;

	@OriginalMember(owner = "client!zb", name = "u", descriptor = "I")
	int anInt5860;

	@OriginalMember(owner = "client!zb", name = "e", descriptor = "I")
	int anInt5861;

	@OriginalMember(owner = "client!zb", name = "d", descriptor = "[B")
	byte[] aByteArray109;

	@OriginalMember(owner = "client!zb", name = "n", descriptor = "I")
	int anInt5862;

	@OriginalMember(owner = "client!zb", name = "h", descriptor = "I")
	int anInt5863;

	@OriginalMember(owner = "client!zb", name = "o", descriptor = "I")
	int anInt5864;

	@OriginalMember(owner = "client!zb", name = "r", descriptor = "I")
	int anInt5865;

	@OriginalMember(owner = "client!zb", name = "at", descriptor = "I")
	int anInt5867;

	@OriginalMember(owner = "client!zb", name = "p", descriptor = "I")
	final int anInt5866 = 4096;

	@OriginalMember(owner = "client!zb", name = "c", descriptor = "I")
	final int anInt5848 = 16;

	@OriginalMember(owner = "client!zb", name = "v", descriptor = "I")
	final int anInt5849 = 258;

	@OriginalMember(owner = "client!zb", name = "l", descriptor = "I")
	final int anInt5850 = 6;

	@OriginalMember(owner = "client!zb", name = "y", descriptor = "I")
	final int anInt5851 = 50;

	@OriginalMember(owner = "client!zb", name = "w", descriptor = "I")
	final int anInt5857 = 18002;

	@OriginalMember(owner = "client!zb", name = "q", descriptor = "I")
	int anInt5853 = 0;

	@OriginalMember(owner = "client!zb", name = "s", descriptor = "I")
	int anInt5855 = 0;

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "[I")
	int[] anIntArray539 = new int[256];

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "[I")
	int[] anIntArray540 = new int[257];

	@OriginalMember(owner = "client!zb", name = "aj", descriptor = "[Z")
	boolean[] aBooleanArray34 = new boolean[256];

	@OriginalMember(owner = "client!zb", name = "ai", descriptor = "[Z")
	boolean[] aBooleanArray35 = new boolean[16];

	@OriginalMember(owner = "client!zb", name = "ag", descriptor = "[B")
	byte[] aByteArray108 = new byte[256];

	@OriginalMember(owner = "client!zb", name = "al", descriptor = "[B")
	byte[] aByteArray110 = new byte[4096];

	@OriginalMember(owner = "client!zb", name = "ao", descriptor = "[I")
	int[] anIntArray541 = new int[16];

	@OriginalMember(owner = "client!zb", name = "ak", descriptor = "[B")
	byte[] aByteArray112 = new byte[18002];

	@OriginalMember(owner = "client!zb", name = "au", descriptor = "[B")
	byte[] aByteArray111 = new byte[18002];

	@OriginalMember(owner = "client!zb", name = "ax", descriptor = "[[B")
	byte[][] aByteArrayArray25 = new byte[6][258];

	@OriginalMember(owner = "client!zb", name = "ar", descriptor = "[[I")
	int[][] anIntArrayArray66 = new int[6][258];

	@OriginalMember(owner = "client!zb", name = "ad", descriptor = "[[I")
	int[][] anIntArrayArray67 = new int[6][258];

	@OriginalMember(owner = "client!zb", name = "ac", descriptor = "[[I")
	int[][] anIntArrayArray65 = new int[6][258];

	@OriginalMember(owner = "client!zb", name = "av", descriptor = "[I")
	int[] anIntArray542 = new int[6];

	@OriginalMember(owner = "client!zb", name = "<init>", descriptor = "()V", line = 44)
	Class685() {
	}

	@OriginalMember(owner = "client!zb", name = "v", descriptor = "(Ljava/lang/String;ZLclient!dx;Lclient!dj;Lclient!aar;B)V", line = 86)
	public static void method36274(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) Class94 arg3, @OriginalArg(4) Class17 arg4) {
		@Pc(8) boolean local8 = !Class505.aBoolean774 || Class479.method29807();
		if (!local8) {
			return;
		}
		@Pc(30) int local30;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(90) int local90;
		if (Class505.aBoolean774 && local8) {
			@Pc(17) Class17 local17 = Class252.aClass17_9;
			@Pc(23) Class94 local23 = arg2.method20111(local17, Class222.aClass89_Sub2Array1, true);
			local30 = local17.method308(arg0, 250, null);
			local41 = local17.method312(arg0, 250, local17.anInt50 * -1062735011, null);
			@Pc(44) int local44 = Class229.aClass89_3.method6682();
			local48 = local44 + 4;
			local30 += local48 * 2;
			local41 += local48 * 2;
			if (local30 < Class173.anInt3294 * 2090728523) {
				local30 = Class173.anInt3294 * 2090728523;
			}
			if (local41 < Class67.anInt199 * 1207520599) {
				local41 = Class67.anInt199 * 1207520599;
			}
			local90 = Class133.aClass410_7.method28569(local30, client.anInt3394 * -321474631) + Class133.anInt1560 * 111236059;
			@Pc(102) int local102 = Class133.aClass402_7.method28502(local41, client.anInt3464 * 43072843) + Class133.anInt1562 * -1939452853;
			arg2.method20076(Class67.aClass89_1, false).method18179(local90 + Class143_Sub23.aClass89_2.method6682(), local102 + Class143_Sub23.aClass89_2.method6683(), local30 - Class143_Sub23.aClass89_2.method6682() * 2, local41 - Class143_Sub23.aClass89_2.method6683() * 2, 1, -1, 0);
			arg2.method20076(Class143_Sub23.aClass89_2, true).method18123(local90, local102);
			Class143_Sub23.aClass89_2.method6726();
			arg2.method20076(Class143_Sub23.aClass89_2, true).method18123(local30 + local90 - local44, local102);
			Class143_Sub23.aClass89_2.method6699();
			arg2.method20076(Class143_Sub23.aClass89_2, true).method18123(local30 + local90 - local44, local102 + local41 - local44);
			Class143_Sub23.aClass89_2.method6726();
			arg2.method20076(Class143_Sub23.aClass89_2, true).method18123(local90, local102 + local41 - local44);
			Class143_Sub23.aClass89_2.method6699();
			arg2.method20076(Class229.aClass89_3, true).method18133(local90, local102 + Class143_Sub23.aClass89_2.method6683(), local44, local41 - Class143_Sub23.aClass89_2.method6683() * 2);
			Class229.aClass89_3.method6691();
			arg2.method20076(Class229.aClass89_3, true).method18133(local90 + Class143_Sub23.aClass89_2.method6682(), local102, local30 - Class143_Sub23.aClass89_2.method6682() * 2, local44);
			Class229.aClass89_3.method6691();
			arg2.method20076(Class229.aClass89_3, true).method18133(local30 + local90 - local44, local102 + Class143_Sub23.aClass89_2.method6683(), local44, local41 - Class143_Sub23.aClass89_2.method6683() * 2);
			Class229.aClass89_3.method6691();
			arg2.method20076(Class229.aClass89_3, true).method18133(local90 + Class143_Sub23.aClass89_2.method6682(), local41 + local102 - local44, local30 - Class143_Sub23.aClass89_2.method6682() * 2, local44);
			Class229.aClass89_3.method6691();
			local23.method7614(arg0, local90 + local48, local102 + local48, local30 - local48 * 2, local41 - local48 * 2, Class367.anInt4548 * 2043737895 | 0xFF000000, -1, 1, 1, 0, null, null, null, 0, 0);
			Class341.method27765(local90, local102, local30, local41);
		} else {
			local30 = arg4.method308(arg0, 250, null);
			local41 = arg4.method309(arg0, 250, null) * 13;
			@Pc(326) byte local326 = 4;
			local48 = local326 + 6;
			local90 = local326 + 6;
			arg2.method20088(local48 - local326, local90 - local326, local326 + local30 + local326, local326 + local326 + local41, -16777216, 0);
			arg2.method20087(local48 - local326, local90 - local326, local326 + local30 + local326, local326 + local326 + local41, -1, 0);
			arg3.method7614(arg0, local48, local90, local30, local41, -1, -1, 1, 1, 0, null, null, null, 0, 0);
			Class341.method27765(local48 - local326, local90 - local326, local30 + local326 + local326, local326 + local41 + local326);
		}
		if (!arg1) {
			return;
		}
		try {
			arg2.method20012();
			arg2.method19926();
		} catch (@Pc(420) Exception_Sub7 local420) {
		}
	}

	@OriginalMember(owner = "client!zb", name = "f", descriptor = "(Lclient!dx;Lclient!xn;I)I", line = 1568)
	static final int method36275(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class649 arg1) {
		if (arg1.anInt5731 * 33386845 != -1) {
			return arg1.anInt5731 * 33386845;
		}
		if (arg1.anInt5730 * 1884378951 != -1) {
			@Pc(25) Class215 local25 = arg0.aClass209_9.method25584(arg1.anInt5730 * 1884378951);
			if (!local25.aBoolean641) {
				return local25.aShort162;
			}
		}
		return arg1.anInt5729 * -2044484027;
	}

	@OriginalMember(owner = "client!zb", name = "gp", descriptor = "(Lclient!yf;B)V", line = 5658)
	static final void method36276(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class212.method25611(local11, local14, arg0);
	}
}
