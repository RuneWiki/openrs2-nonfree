package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
class Class154 implements Interface25 {

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "Lclient!gp;")
	static Class205 aClass205_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!eo", name = "this$0", descriptor = "Lclient!ft;")
	final Class183 this$0;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "(Ljava/lang/String;I)V", line = 72)
	public static void method23163(@OriginalArg(0) String arg0) {
		if (client.anInt3039 * 1115111877 != 16) {
			return;
		}
		@Pc(11) Class3_Sub23 local11 = Class269.method25284(Class311.aClass311_118, client.aClass82_1.aClass577_2);
		local11.aClass3_Sub41_Sub1_1.method20250(0);
		@Pc(22) int local22 = local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local11.aClass3_Sub41_Sub1_1.method20260(arg0);
		local11.aClass3_Sub41_Sub1_1.anInt2803 += -2137895021;
		local11.aClass3_Sub41_Sub1_1.method20296(Class338.anIntArray421, local22, local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237);
		local11.aClass3_Sub41_Sub1_1.method20266(local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local22);
		client.aClass82_1.method21601(local11);
		Class338.aClass564_1 = Class564.aClass564_3;
	}

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!ft;)V", line = 470)
	Class154(@OriginalArg(0) Class183 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "(S)F", line = 472)
	@Override
	public float method23202() {
		return (float) Class510.aClass3_Sub45_37.aClass60_Sub33_3.method14179() / 255.0F;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "()F", line = 472)
	@Override
	public float method23203() {
		return (float) Class510.aClass3_Sub45_37.aClass60_Sub33_3.method14179() / 255.0F;
	}

	@OriginalMember(owner = "client!eo", name = "v", descriptor = "(Lclient!fo;Lclient!ch;IIIILclient!co;B)V", line = 773)
	static void method23164(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class6 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(21) int local21;
		if (Class72.anInt2086 * 81180077 == 3) {
			local21 = (int) ((double) Class80.aClass23_Sub1_1.method5836() * 2607.5945876176133D) + client.anInt3081 * 732347007 & 0x3FFF;
		} else if (Class72.anInt2086 * 81180077 == 4) {
			local21 = (int) client.aFloat238 & 0x3FFF;
		} else {
			local21 = client.anInt3081 * 732347007 + (int) client.aFloat238 & 0x3FFF;
		}
		@Pc(58) int local58 = Math.max(arg0.anInt3498 * -1494060731 / 2, arg0.anInt3499 * -751005789 / 2) + 10;
		@Pc(66) int local66 = arg5 * arg5 + arg4 * arg4;
		if (local66 > local58 * local58) {
			return;
		}
		@Pc(76) int local76 = Class317.anIntArray419[local21];
		@Pc(80) int local80 = Class317.anIntArray420[local21];
		if (Class72.anInt2086 * 81180077 != 4) {
			local76 = local76 * 256 / (client.anInt3083 * 1898621565 + 256);
			local80 = local80 * 256 / (client.anInt3083 * 1898621565 + 256);
		}
		@Pc(115) int local115 = arg4 * local80 + local76 * arg5 >> 14;
		@Pc(125) int local125 = local80 * arg5 - arg4 * local76 >> 14;
		if (arg1 == null) {
			arg6.method16783(local115 + arg2 + arg0.anInt3498 * -1494060731 / 2 - arg6.method16772() / 2, arg0.anInt3499 * -751005789 / 2 + arg3 - local125 - arg6.method16779() / 2);
		} else {
			arg6.method16785(arg2 + arg0.anInt3498 * -1494060731 / 2 + local115 - arg6.method16772() / 2, arg3 + arg0.anInt3499 * -751005789 / 2 - local125 - arg6.method16779() / 2, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!eo", name = "aiv", descriptor = "(Lclient!vs;B)V", line = 10592)
	static final void method23161(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		Class80.method21596(arg0.anIntArray496[arg0.anInt5319 * 960738381], arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1], 0);
	}

	@OriginalMember(owner = "client!eo", name = "asw", descriptor = "(Lclient!vs;B)V", line = 12302)
	static final void method23162(@OriginalArg(0) Class536 arg0) {
		@Pc(1) boolean local1 = true;
		@Pc(15) String local15 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		if (client.aBoolean565) {
			try {
				@Pc(27) Object local27 = Class300.aClass300_7.method25650(new Object[] { local15 });
				if (local27 != null) {
					local1 = (Boolean) local27;
				}
			} catch (@Pc(36) Throwable local36) {
			}
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!eo", name = "avw", descriptor = "(Lclient!vs;S)V", line = 12700)
	static final void method23165(@OriginalArg(0) Class536 arg0) {
		Class30.method16449(arg0.aClass26_Sub1_Sub1_Sub1_4, arg0);
	}
}
