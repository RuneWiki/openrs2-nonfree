package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahf")
public class Class56_Sub2 extends Class56 {

	@OriginalMember(owner = "client!ahf", name = "<init>", descriptor = "()V", line = 11)
	Class56_Sub2() {
	}

	@OriginalMember(owner = "client!ahf", name = "s", descriptor = "(I)V", line = 14)
	@Override
	void method12566() {
		@Pc(3) Class3_Sub22 local3 = this.method12595();
		if (local3 == null) {
			return;
		}
		@Pc(11) int local11 = this.method12570(local3, 32767);
		@Pc(15) int local15 = local3.method19867();
		if (local15 < 0) {
			local15 = 0;
		} else if (local15 > 65535) {
			local15 = 65535;
		}
		@Pc(29) int local29 = local3.method19854();
		if (local29 < 0) {
			local29 = 0;
		} else if (local29 > 65535) {
			local29 = 65535;
		}
		@Pc(41) byte local41 = 0;
		if (local3.method19853() == 2) {
			local41 = 1;
		}
		@Pc(54) Class3_Sub23 local54 = Class269.method25284(Class311.aClass311_6, client.aClass82_2.aClass577_2);
		local54.aClass3_Sub41_Sub1_1.method20251(local11 | local41 << 15);
		local54.aClass3_Sub41_Sub1_1.method20254(local29 | local15 << 16);
		client.aClass82_2.method21601(local54);
	}

	@OriginalMember(owner = "client!ahf", name = "c", descriptor = "()V", line = 14)
	@Override
	void method12574() {
		@Pc(3) Class3_Sub22 local3 = this.method12595();
		if (local3 == null) {
			return;
		}
		@Pc(11) int local11 = this.method12570(local3, 32767);
		@Pc(15) int local15 = local3.method19867();
		if (local15 < 0) {
			local15 = 0;
		} else if (local15 > 65535) {
			local15 = 65535;
		}
		@Pc(29) int local29 = local3.method19854();
		if (local29 < 0) {
			local29 = 0;
		} else if (local29 > 65535) {
			local29 = 65535;
		}
		@Pc(41) byte local41 = 0;
		if (local3.method19853() == 2) {
			local41 = 1;
		}
		@Pc(54) Class3_Sub23 local54 = Class269.method25284(Class311.aClass311_6, client.aClass82_2.aClass577_2);
		local54.aClass3_Sub41_Sub1_1.method20251(local11 | local41 << 15);
		local54.aClass3_Sub41_Sub1_1.method20254(local29 | local15 << 16);
		client.aClass82_2.method21601(local54);
	}

	@OriginalMember(owner = "client!ahf", name = "b", descriptor = "()V", line = 14)
	@Override
	void method12573() {
		@Pc(3) Class3_Sub22 local3 = this.method12595();
		if (local3 == null) {
			return;
		}
		@Pc(11) int local11 = this.method12570(local3, 32767);
		@Pc(15) int local15 = local3.method19867();
		if (local15 < 0) {
			local15 = 0;
		} else if (local15 > 65535) {
			local15 = 65535;
		}
		@Pc(29) int local29 = local3.method19854();
		if (local29 < 0) {
			local29 = 0;
		} else if (local29 > 65535) {
			local29 = 65535;
		}
		@Pc(41) byte local41 = 0;
		if (local3.method19853() == 2) {
			local41 = 1;
		}
		@Pc(54) Class3_Sub23 local54 = Class269.method25284(Class311.aClass311_6, client.aClass82_2.aClass577_2);
		local54.aClass3_Sub41_Sub1_1.method20251(local11 | local41 << 15);
		local54.aClass3_Sub41_Sub1_1.method20254(local29 | local15 << 16);
		client.aClass82_2.method21601(local54);
	}

	@OriginalMember(owner = "client!ahf", name = "u", descriptor = "(I)Z", line = 34)
	@Override
	boolean method12571() {
		return this.method12595() != null || this.aLong90 * 3363890924204101801L < Class176.method23413() - 2000L;
	}

	@OriginalMember(owner = "client!ahf", name = "z", descriptor = "()Z", line = 34)
	@Override
	boolean method12565() {
		return this.method12595() != null || this.aLong90 * 3363890924204101801L < Class176.method23413() - 2000L;
	}

	@OriginalMember(owner = "client!ahf", name = "af", descriptor = "(B)Lclient!agg;", line = 38)
	Class3_Sub22 method12595() {
		return (Class3_Sub22) client.aClass553_43.method32768();
	}

	@OriginalMember(owner = "client!ahf", name = "ak", descriptor = "()Lclient!agg;", line = 38)
	Class3_Sub22 method12596() {
		return (Class3_Sub22) client.aClass553_43.method32768();
	}

	@OriginalMember(owner = "client!ahf", name = "aa", descriptor = "()Lclient!agg;", line = 38)
	Class3_Sub22 method12597() {
		return (Class3_Sub22) client.aClass553_43.method32768();
	}

	@OriginalMember(owner = "client!ahf", name = "y", descriptor = "(I)Lclient!agh;", line = 43)
	@Override
	Class3_Sub23 method12572() {
		return Class269.method25284(Class311.aClass311_9, client.aClass82_2.aClass577_2);
	}

	@OriginalMember(owner = "client!ahf", name = "j", descriptor = "()Lclient!agh;", line = 43)
	@Override
	Class3_Sub23 method12586() {
		return Class269.method25284(Class311.aClass311_9, client.aClass82_2.aClass577_2);
	}

	@OriginalMember(owner = "client!ahf", name = "x", descriptor = "(Lclient!ahb;Lclient!agg;I)V", line = 46)
	@Override
	void method12569(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class3_Sub22 arg1) {
	}

	@OriginalMember(owner = "client!ahf", name = "r", descriptor = "(Lclient!ahb;Lclient!agg;)V", line = 46)
	@Override
	void method12568(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class3_Sub22 arg1) {
	}

	@OriginalMember(owner = "client!ahf", name = "d", descriptor = "(Lclient!ahb;Lclient!agg;)V", line = 46)
	@Override
	void method12579(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class3_Sub22 arg1) {
	}

	@OriginalMember(owner = "client!ahf", name = "m", descriptor = "(Lclient!ahb;Lclient!agg;)V", line = 46)
	@Override
	void method12581(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class3_Sub22 arg1) {
	}

	@OriginalMember(owner = "client!ahf", name = "q", descriptor = "(Lclient!ahb;Lclient!agg;)V", line = 46)
	@Override
	void method12580(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class3_Sub22 arg1) {
	}

	@OriginalMember(owner = "client!ahf", name = "h", descriptor = "(I)I", line = 49)
	@Override
	int method12575() {
		return 0;
	}

	@OriginalMember(owner = "client!ahf", name = "n", descriptor = "()I", line = 49)
	@Override
	int method12577() {
		return 0;
	}

	@OriginalMember(owner = "client!ahf", name = "e", descriptor = "()I", line = 49)
	@Override
	int method12578() {
		return 0;
	}

	@OriginalMember(owner = "client!ahf", name = "a", descriptor = "(I)Z", line = 152)
	static boolean method12598() {
		return Class21_Sub1.method3215(Class44.aClass483_5.aClass468_2);
	}
}
