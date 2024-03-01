package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public class Class412 implements Interface56 {

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "Lclient!qn;")
	static final Class412 aClass412_2 = new Class412(0);

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "Lclient!qn;")
	public static final Class412 aClass412_3 = new Class412(1);

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
	int anInt4823;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 25)
	public static void method27707(@OriginalArg(0) String arg0) {
		Class121.method22823(0, 0, "", "", "", arg0);
	}

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(I)V", line = 50)
	Class412(@OriginalArg(0) int arg0) {
		this.anInt4823 = arg0 * 1665214735;
	}

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "()I", line = 55)
	@Override
	public int method33764() {
		return this.anInt4823 * -166943249;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)I", line = 55)
	@Override
	public int method33765() {
		return this.anInt4823 * -166943249;
	}

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "()I", line = 55)
	@Override
	public int method33766() {
		return this.anInt4823 * -166943249;
	}

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "()I", line = 55)
	@Override
	public int method33767() {
		return this.anInt4823 * -166943249;
	}

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "(B)V", line = 152)
	public static void method27705() {
		@Pc(2) Class161 local2 = Class519.aClass161_58;
		synchronized (Class519.aClass161_58) {
			Class519.aClass161_58.method23224();
		}
	}

	@OriginalMember(owner = "client!qn", name = "ad", descriptor = "(IIIIS)V", line = 251)
	static void method27706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(8, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
		local4.anInt2695 = arg2 * 378120307;
		local4.anInt2676 = arg3 * -835820601;
	}

	@OriginalMember(owner = "client!qn", name = "jq", descriptor = "(IIIIIIIB)V", line = 6046)
	static final void method27703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg6 - 334;
		if (local3 < 0) {
			local3 = 0;
		} else if (local3 > 100) {
			local3 = 100;
		}
		@Pc(23) int local23 = local3 * (client.aShort151 - client.aShort149) / 100 + client.aShort149;
		@Pc(29) int local29 = arg5 * local23 >> 8;
		@Pc(35) int local35 = 16384 - arg3 & 0x3FFF;
		@Pc(41) int local41 = 16384 - arg4 & 0x3FFF;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(47) int local47 = local29;
		if (local35 != 0) {
			local45 = -local29 * Class317.anIntArray419[local35] >> 14;
			local47 = local29 * Class317.anIntArray420[local35] >> 14;
		}
		if (local41 != 0) {
			local43 = Class317.anIntArray419[local41] * local47 >> 14;
			local47 = local47 * Class317.anIntArray420[local41] >> 14;
		}
		Class586.anInt5460 = (arg0 - local43) * 1317181071;
		Class140.anInt3424 = (arg1 - local45) * -1930901799;
		Class149.anInt3434 = (arg2 - local47) * 1723080977;
		Class30.anInt2350 = arg3 * 1250124359;
		Class3_Sub35_Sub1.anInt2644 = arg4 * 1729985211;
		Class150.anInt3437 = 0;
	}

	@OriginalMember(owner = "client!qn", name = "abb", descriptor = "(Lclient!vs;I)V", line = 8998)
	static final void method27702(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		@Pc(26) int local26 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (local26 == -1) {
			throw new RuntimeException("");
		}
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local13 + (char) local26;
	}

	@OriginalMember(owner = "client!qn", name = "jr", descriptor = "(ZI)V", line = 9001)
	static final void method27704(@OriginalArg(0) boolean arg0) {
		@Pc(2) Class3_Sub41_Sub1 local2 = client.aClass82_2.aClass3_Sub41_Sub1_2;
		while (local2.method19827(client.aClass82_2.anInt2915 * -64841839) >= 15) {
			@Pc(17) int local17 = local2.method19825(15);
			if (local17 == 32767) {
				break;
			}
			@Pc(23) boolean local23 = false;
			@Pc(29) Class3_Sub29 local29 = (Class3_Sub29) client.aClass581_21.method33217((long) local17);
			@Pc(39) Class26_Sub1_Sub1_Sub1_Sub1 local39;
			if (local29 == null) {
				local39 = new Class26_Sub1_Sub1_Sub1_Sub1(client.aClass370_1.method26950());
				local39.anInt2355 = local17 * -400995907;
				local29 = new Class3_Sub29(local39);
				client.aClass581_21.method33241(local29, (long) local17);
				client.aClass3_Sub29Array1[(client.anInt3054 += -1735952035) * -453205259 - 1] = local29;
				local23 = true;
			}
			local39 = (Class26_Sub1_Sub1_Sub1_Sub1) local29.anObject2;
			client.anIntArray303[(client.anInt3163 += -914715223) * 1758488217 - 1] = local17;
			local39.anInt2378 = client.anInt3058 * 1663327699;
			if (local39.aClass571_1 != null && local39.aClass571_1.method33057()) {
				Class316.method25840(local39);
			}
			@Pc(106) int local106 = local2.method19825(1);
			if (local106 == 1) {
				client.anIntArray293[(client.anInt3057 += -130259787) * 2013817245 - 1] = local17;
			}
			local39.method15495(Class498.aClass579_1.method33185(local2.method19825(15)));
			@Pc(138) int local138;
			if (arg0) {
				local138 = local2.method19825(8);
				if (local138 > 127) {
					local138 -= 256;
				}
			} else {
				local138 = local2.method19825(5);
				if (local138 > 15) {
					local138 -= 32;
				}
			}
			@Pc(159) int local159;
			if (arg0) {
				local159 = local2.method19825(8);
				if (local159 > 127) {
					local159 -= 256;
				}
			} else {
				local159 = local2.method19825(5);
				if (local159 > 15) {
					local159 -= 32;
				}
			}
			@Pc(178) int local178 = local2.method19825(2);
			@Pc(189) int local189 = local2.method19825(3) + 4 << 11 & 0x3FFF;
			@Pc(194) int local194 = local2.method19825(1);
			local39.method16644(local39.aClass571_1.anInt5389 * 2130228951);
			local39.anInt2358 = (local39.aClass571_1.anInt5393 * 361716413 << 3) * -493317635;
			if (local23) {
				local39.method16634(local189, true);
			}
			local39.method15509(local178, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray241[0] + local138, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] + local159, local194 == 1, local39.method16630());
			if (local39.aClass571_1.method33057()) {
				Class148.method23119(local39.aByte101, local39.anIntArray241[0], local39.anIntArray239[0], 0, null, local39, null);
			}
			if (local23) {
				local39.method15517();
			}
		}
		local2.method19826();
	}
}
