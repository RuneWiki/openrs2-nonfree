package com.jagex;

import java.util.LinkedList;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aha")
public class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!aha", name = "x", descriptor = "Ljava/util/Queue;")
	final Queue aQueue1 = new LinkedList();

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "()V", line = 15)
	Class56_Sub1() {
	}

	@OriginalMember(owner = "client!aha", name = "aa", descriptor = "(Lclient!ane;)V", line = 18)
	void method11924(@OriginalArg(0) Class3_Sub22_Sub2 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!aha", name = "af", descriptor = "(Lclient!ane;S)V", line = 18)
	void method11925(@OriginalArg(0) Class3_Sub22_Sub2 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!aha", name = "p", descriptor = "(II)Lclient!go;", line = 18)
	public static Class204 method11928(@OriginalArg(0) int arg0) {
		if (arg0 == Class204.aClass204_5.anInt3695 * 68540099) {
			return Class204.aClass204_5;
		} else if (Class204.aClass204_3.anInt3695 * 68540099 == arg0) {
			return Class204.aClass204_3;
		} else if (Class204.aClass204_7.anInt3695 * 68540099 == arg0) {
			return Class204.aClass204_7;
		} else if (arg0 == Class204.aClass204_6.anInt3695 * 68540099) {
			return Class204.aClass204_6;
		} else if (arg0 == Class204.aClass204_4.anInt3695 * 68540099) {
			return Class204.aClass204_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aha", name = "s", descriptor = "(I)V", line = 23)
	@Override
	void method12566() {
		@Pc(4) Class3_Sub22_Sub2 local4 = (Class3_Sub22_Sub2) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(14) Class3_Sub23 local14 = Class269.method25284(Class311.aClass311_5, client.aClass82_2.aClass577_2);
		local14.aClass3_Sub41_Sub1_1.method20353(local4.method19854() | local4.method19867() << 16);
		local14.aClass3_Sub41_Sub1_1.method20303(local4.method19880() << 1 | local4.method19871() & 0x1);
		local14.aClass3_Sub41_Sub1_1.method20312(this.method12570(local4, 65535));
		client.aClass82_2.method21601(local14);
		local4.method19859();
	}

	@OriginalMember(owner = "client!aha", name = "c", descriptor = "()V", line = 23)
	@Override
	void method12574() {
		@Pc(4) Class3_Sub22_Sub2 local4 = (Class3_Sub22_Sub2) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(14) Class3_Sub23 local14 = Class269.method25284(Class311.aClass311_5, client.aClass82_2.aClass577_2);
		local14.aClass3_Sub41_Sub1_1.method20353(local4.method19854() | local4.method19867() << 16);
		local14.aClass3_Sub41_Sub1_1.method20303(local4.method19880() << 1 | local4.method19871() & 0x1);
		local14.aClass3_Sub41_Sub1_1.method20312(this.method12570(local4, 65535));
		client.aClass82_2.method21601(local14);
		local4.method19859();
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "()V", line = 23)
	@Override
	void method12573() {
		@Pc(4) Class3_Sub22_Sub2 local4 = (Class3_Sub22_Sub2) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(14) Class3_Sub23 local14 = Class269.method25284(Class311.aClass311_5, client.aClass82_2.aClass577_2);
		local14.aClass3_Sub41_Sub1_1.method20353(local4.method19854() | local4.method19867() << 16);
		local14.aClass3_Sub41_Sub1_1.method20303(local4.method19880() << 1 | local4.method19871() & 0x1);
		local14.aClass3_Sub41_Sub1_1.method20312(this.method12570(local4, 65535));
		client.aClass82_2.method21601(local14);
		local4.method19859();
	}

	@OriginalMember(owner = "client!aha", name = "u", descriptor = "(I)Z", line = 34)
	@Override
	boolean method12571() {
		return !this.aQueue1.isEmpty() || this.aLong90 * 3363890924204101801L < Class176.method23413() - 2000L;
	}

	@OriginalMember(owner = "client!aha", name = "z", descriptor = "()Z", line = 34)
	@Override
	boolean method12565() {
		return !this.aQueue1.isEmpty() || this.aLong90 * 3363890924204101801L < Class176.method23413() - 2000L;
	}

	@OriginalMember(owner = "client!aha", name = "y", descriptor = "(I)Lclient!agh;", line = 38)
	@Override
	Class3_Sub23 method12572() {
		return Class269.method25284(Class311.aClass311_22, client.aClass82_2.aClass577_2);
	}

	@OriginalMember(owner = "client!aha", name = "j", descriptor = "()Lclient!agh;", line = 38)
	@Override
	Class3_Sub23 method12586() {
		return Class269.method25284(Class311.aClass311_22, client.aClass82_2.aClass577_2);
	}

	@OriginalMember(owner = "client!aha", name = "ak", descriptor = "(Lclient!ahb;Lclient!ane;B)V", line = 42)
	void method11926(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class3_Sub22_Sub2 arg1) {
		arg0.method20250(arg1.method19871());
	}

	@OriginalMember(owner = "client!aha", name = "e", descriptor = "()I", line = 46)
	@Override
	int method12578() {
		return 1;
	}

	@OriginalMember(owner = "client!aha", name = "h", descriptor = "(I)I", line = 46)
	@Override
	int method12575() {
		return 1;
	}

	@OriginalMember(owner = "client!aha", name = "n", descriptor = "()I", line = 46)
	@Override
	int method12577() {
		return 1;
	}

	@OriginalMember(owner = "client!aha", name = "x", descriptor = "(Lclient!ahb;Lclient!agg;I)V", line = 50)
	@Override
	void method12569(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		this.method11926(arg0, (Class3_Sub22_Sub2) arg1);
	}

	@OriginalMember(owner = "client!aha", name = "r", descriptor = "(Lclient!ahb;Lclient!agg;)V", line = 50)
	@Override
	void method12568(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		this.method11926(arg0, (Class3_Sub22_Sub2) arg1);
	}

	@OriginalMember(owner = "client!aha", name = "d", descriptor = "(Lclient!ahb;Lclient!agg;)V", line = 50)
	@Override
	void method12579(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		this.method11926(arg0, (Class3_Sub22_Sub2) arg1);
	}

	@OriginalMember(owner = "client!aha", name = "q", descriptor = "(Lclient!ahb;Lclient!agg;)V", line = 50)
	@Override
	void method12580(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		this.method11926(arg0, (Class3_Sub22_Sub2) arg1);
	}

	@OriginalMember(owner = "client!aha", name = "m", descriptor = "(Lclient!ahb;Lclient!agg;)V", line = 50)
	@Override
	void method12581(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		this.method11926(arg0, (Class3_Sub22_Sub2) arg1);
	}

	@OriginalMember(owner = "client!aha", name = "abx", descriptor = "(Lclient!vs;I)V", line = 8922)
	static final void method11927(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5315 -= 1580027550;
		@Pc(14) String local14 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575];
		@Pc(25) String local25 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575 + 1];
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local14 + local25;
	}

	@OriginalMember(owner = "client!aha", name = "asr", descriptor = "(Lclient!vs;B)V", line = 12233)
	static final void method11929(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		if (local13 == -1) {
			return;
		}
		if (local23 > 255) {
			local23 = 255;
		} else if (local23 < 0) {
			local23 = 0;
		}
		Class442.method28253(local13, local23, false);
	}
}
