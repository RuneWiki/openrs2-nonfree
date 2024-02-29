package com.jagex;

import java.util.Comparator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
class Class477 implements Comparator {

	// $FF: synthetic field
	@OriginalMember(owner = "client!pv", name = "this$0", descriptor = "Lclient!qd;")
	final Class484 this$0;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!qd;)V", line = 7)
	Class477(@OriginalArg(0) Class484 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!pv", name = "p", descriptor = "(Lclient!pt;Lclient!pt;S)I", line = 9)
	int method29698(@OriginalArg(0) Class475 arg0, @OriginalArg(1) Class475 arg1) {
		if (arg0.aLong278 * -4949530321911881879L > arg1.aLong278 * -4949530321911881879L) {
			return 1;
		} else if (arg0.aLong278 * -4949530321911881879L < arg1.aLong278 * -4949530321911881879L) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(Lclient!pt;Lclient!pt;)I", line = 9)
	int method29699(@OriginalArg(0) Class475 arg0, @OriginalArg(1) Class475 arg1) {
		if (arg0.aLong278 * -4949530321911881879L > arg1.aLong278 * -4949530321911881879L) {
			return 1;
		} else if (arg0.aLong278 * -4949530321911881879L < arg1.aLong278 * -4949530321911881879L) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pv", name = "compare", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 15)
	@Override
	public int compare(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method29698((Class475) arg0, (Class475) arg1);
	}

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 15)
	public int method29700(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method29698((Class475) arg0, (Class475) arg1);
	}

	@OriginalMember(owner = "client!pv", name = "y", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 15)
	public int method29701(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method29698((Class475) arg0, (Class475) arg1);
	}

	@OriginalMember(owner = "client!pv", name = "w", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 15)
	public int method29702(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method29698((Class475) arg0, (Class475) arg1);
	}

	@OriginalMember(owner = "client!pv", name = "t", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 15)
	public int method29703(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method29698((Class475) arg0, (Class475) arg1);
	}

	@OriginalMember(owner = "client!pv", name = "hf", descriptor = "(Ljava/lang/Object;)Z", line = 19)
	public boolean method29704(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!pv", name = "ha", descriptor = "(Ljava/lang/Object;)Z", line = 19)
	public boolean method29705(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!pv", name = "hi", descriptor = "(Ljava/lang/Object;)Z", line = 19)
	public boolean method29706(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!pv", name = "hn", descriptor = "(Ljava/lang/Object;)Z", line = 19)
	public boolean method29707(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!pv", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 19)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "(CLclient!yi;I)I", line = 104)
	static int method29708(@OriginalArg(0) char arg0, @OriginalArg(1) Class667 arg1) {
		@Pc(3) int local3 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local3 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == Class667.aClass667_8) {
			local3 = 1762;
		}
		return local3;
	}

	@OriginalMember(owner = "client!pv", name = "cw", descriptor = "(Lclient!yf;B)V", line = 4882)
	static final void method29709(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class345.method27830(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!pv", name = "vb", descriptor = "(Lclient!yf;I)V", line = 8375)
	static final void method29710(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass503_7.method30242();
	}

	@OriginalMember(owner = "client!pv", name = "jm", descriptor = "(I)V", line = 9524)
	static final void method29711() {
		@Pc(2) Class77_Sub39_Sub1 local2 = client.aClass82_2.aClass77_Sub39_Sub1_1;
		local2.method22187();
		@Pc(10) int local10 = local2.method22189(8);
		@Pc(17) int local17;
		if (local10 < client.anInt3527 * -1125820437) {
			for (local17 = local10; local17 < client.anInt3527 * -1125820437; local17++) {
				client.anIntArray318[(client.anInt3412 += -1796285973) * 289244867 - 1] = client.anIntArray317[local17];
			}
		}
		if (local10 > client.anInt3527 * -1125820437) {
			throw new RuntimeException();
		}
		client.anInt3527 = 0;
		for (local17 = 0; local17 < local10; local17++) {
			@Pc(58) int local58 = client.anIntArray317[local17];
			@Pc(66) Class104_Sub1_Sub1_Sub1_Sub1 local66 = (Class104_Sub1_Sub1_Sub1_Sub1) ((Class77_Sub6) client.aClass12_22.method173((long) local58)).anObject5;
			@Pc(71) int local71 = local2.method22189(1);
			if (local71 == 0) {
				client.anIntArray317[(client.anInt3527 += 590354627) * -1125820437 - 1] = local58;
				local66.anInt2894 = client.anInt3411 * -526016129;
			} else {
				@Pc(96) int local96 = local2.method22189(2);
				if (local96 == 0) {
					client.anIntArray317[(client.anInt3527 += 590354627) * -1125820437 - 1] = local58;
					local66.anInt2894 = client.anInt3411 * -526016129;
					client.anIntArray341[(client.anInt3410 += 382245089) * 1422306081 - 1] = local58;
				} else {
					@Pc(159) Class681 local159;
					if (local96 == 1) {
						client.anIntArray317[(client.anInt3527 += 590354627) * -1125820437 - 1] = local58;
						local66.anInt2894 = client.anInt3411 * -526016129;
						local159 = (Class681) Class457.method29479(Class254.method26200(), local2.method22189(3));
						local66.method19821(local159, Class671.aClass671_4.aByte175);
						@Pc(170) int local170 = local2.method22189(1);
						if (local170 == 1) {
							client.anIntArray341[(client.anInt3410 += 382245089) * 1422306081 - 1] = local58;
						}
					} else if (local96 == 2) {
						client.anIntArray317[(client.anInt3527 += 590354627) * -1125820437 - 1] = local58;
						local66.anInt2894 = client.anInt3411 * -526016129;
						if (local2.method22189(1) == 1) {
							local159 = (Class681) Class457.method29479(Class254.method26200(), local2.method22189(3));
							local66.method19821(local159, Class671.aClass671_5.aByte175);
							@Pc(238) Class681 local238 = (Class681) Class457.method29479(Class254.method26200(), local2.method22189(3));
							local66.method19821(local238, Class671.aClass671_5.aByte175);
						} else {
							local159 = (Class681) Class457.method29479(Class254.method26200(), local2.method22189(3));
							local66.method19821(local159, Class671.aClass671_1.aByte175);
						}
						@Pc(266) int local266 = local2.method22189(1);
						if (local266 == 1) {
							client.anIntArray341[(client.anInt3410 += 382245089) * 1422306081 - 1] = local58;
						}
					} else if (local96 == 3) {
						client.anIntArray318[(client.anInt3412 += -1796285973) * 289244867 - 1] = local58;
					}
				}
			}
		}
	}
}
