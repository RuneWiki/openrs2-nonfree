package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abc")
public class Class29 {

	@OriginalMember(owner = "client!abc", name = "p", descriptor = "Lclient!abc;")
	public static final Class29 aClass29_2 = new Class29();

	@OriginalMember(owner = "client!abc", name = "c", descriptor = "Lclient!abc;")
	public static final Class29 aClass29_1 = new Class29();

	@OriginalMember(owner = "client!abc", name = "v", descriptor = "Lclient!abc;")
	public static final Class29 aClass29_3 = new Class29();

	@OriginalMember(owner = "client!abc", name = "l", descriptor = "Lclient!abc;")
	public static final Class29 aClass29_4 = new Class29();

	@OriginalMember(owner = "client!abc", name = "<init>", descriptor = "()V", line = 10)
	Class29() {
	}

	@OriginalMember(owner = "client!abc", name = "p", descriptor = "([BZI)Ljava/lang/Object;", line = 12)
	public static Object method498(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0.length > 136) {
			@Pc(11) ByteBuffer local11 = ByteBuffer.allocateDirect(arg0.length);
			local11.position(0);
			local11.put(arg0);
			return local11;
		} else if (arg1) {
			return Arrays.copyOf(arg0, arg0.length);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!abc", name = "c", descriptor = "(I)Lclient!ow;", line = 170)
	public static Class455 method499() {
		@Pc(3) Class455 local3 = new Class455();
		local3.method29411(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		@Pc(23) float local23 = (float) (Math.random() * 0.5D + 0.5D) * 256.0F;
		local3.method29436(local23 - 128.0F, 0.0F, 0.0F);
		local3.method29420(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		return local3;
	}

	@OriginalMember(owner = "client!abc", name = "o", descriptor = "(Lclient!gm;Lclient!cd;IIIILclient!cy;DLclient!hw;Lclient!ht;I)V", line = 795)
	static void method500(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class83 arg6, @OriginalArg(7) double arg7, @OriginalArg(8) Class311 arg8, @OriginalArg(9) Class309 arg9) {
		if (arg6 == null) {
			return;
		}
		@Pc(22) int local22;
		if (Class11.anInt36 * -891094135 == 3) {
			local22 = (int) ((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) + client.anInt3462 * -2045337339 & 0x3FFF;
		} else if (Class11.anInt36 * -891094135 == 5) {
			local22 = (int) client.aFloat247 & 0x3FFF;
		} else {
			local22 = (int) client.aFloat247 + client.anInt3462 * -2045337339 & 0x3FFF;
		}
		@Pc(59) int local59 = Math.max(arg0.anInt3874 * -881188269 / 2, arg0.anInt3875 * -1279656873 / 2) + 10;
		@Pc(67) int local67 = arg4 * arg4 + arg5 * arg5;
		if (local67 > local59 * local59) {
			return;
		}
		@Pc(77) int local77 = Class436.anIntArray464[local22];
		@Pc(81) int local81 = Class436.anIntArray463[local22];
		if (Class11.anInt36 * -891094135 != 5) {
			local77 = local77 * 256 / (client.anInt3380 * -2002513841 + 256);
			local81 = local81 * 256 / (client.anInt3380 * -2002513841 + 256);
		}
		@Pc(116) int local116 = local81 * arg4 + local77 * arg5 >> 14;
		@Pc(126) int local126 = local81 * arg5 - local77 * arg4 >> 14;
		@Pc(130) double local130 = arg7 / 100.0D;
		switch(arg8.anInt4060 * -1448550931) {
			case 0:
				arg2 = arg2 + arg0.anInt3874 * -881188269 / 2 + local116 - (int) ((double) arg6.method18121() * local130);
				break;
			case 1:
				arg2 = arg0.anInt3874 * -881188269 / 2 + arg2 + local116 - (int) ((double) (arg6.method18121() / 2) * local130);
				break;
			case 2:
				arg2 = arg0.anInt3874 * -881188269 / 2 + arg2 + local116;
		}
		switch(arg9.anInt4057 * -1863758235) {
			case 0:
				arg3 = arg3 + arg0.anInt3875 * -1279656873 / 2 - local126 - (int) ((double) arg6.method18198() * local130);
				break;
			case 1:
				arg3 = arg0.anInt3875 * -1279656873 / 2 + arg3 - local126;
				break;
			case 2:
				arg3 = arg0.anInt3875 * -1279656873 / 2 + arg3 - local126 - (int) ((double) (arg6.method18198() / 2) * local130);
		}
		if (arg1 == null) {
			if (local130 == 1.0D) {
				arg6.method18123(arg2, arg3);
			}
			arg6.method18125(arg2, arg3, (int) ((double) arg6.method18121() * local130), (int) ((double) arg6.method18198() * local130));
		} else if (local130 == 1.0D) {
			arg6.method18197(arg2, arg3, arg1, arg2, arg3);
		} else {
			arg6.method18125(arg2, arg3, (int) ((double) arg6.method18121() * local130), (int) ((double) arg6.method18198() * local130));
		}
	}

	@OriginalMember(owner = "client!abc", name = "he", descriptor = "(Lclient!yf;I)V", line = 5940)
	static final void method501(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class294.method27029(local11, local14, arg0, Class283.aClass283_4);
	}

	@OriginalMember(owner = "client!abc", name = "ls", descriptor = "(Lclient!yf;I)V", line = 6626)
	static final void method502(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class659.method33072(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!abc", name = "va", descriptor = "(Lclient!yf;I)V", line = 8471)
	static final void method503(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class4.method35(local13, local23, true);
	}

	@OriginalMember(owner = "client!abc", name = "mf", descriptor = "(Ljava/lang/String;I)V", line = 12019)
	public static final void method504(@OriginalArg(0) String arg0) {
		if (arg0.equals("")) {
			return;
		}
		@Pc(7) Class82 local7 = Class230.method25826();
		@Pc(13) Class77_Sub20 local13 = Class365.method28132(Class414.aClass414_72, local7.aClass16_1);
		local13.aClass77_Sub39_Sub1_2.method22403(Class664.method33107(arg0));
		local13.aClass77_Sub39_Sub1_2.method22440(arg0);
		local7.method2004(local13);
	}

	@OriginalMember(owner = "client!abc", name = "axq", descriptor = "(Lclient!yf;I)V", line = 13398)
	static final void method505(@OriginalArg(0) Class665 arg0) {
		@Pc(3) Class104_Sub1_Sub1_Sub1_Sub1 local3 = (Class104_Sub1_Sub1_Sub1_Sub1) arg0.aClass104_Sub1_Sub1_Sub1_4;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local3.anInt2754 * 1691897137;
	}
}
