package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alt")
public class Class163_Sub2 extends Class163 {

	@OriginalMember(owner = "client!alt", name = "<init>", descriptor = "()V", line = 11)
	Class163_Sub2() {
	}

	@OriginalMember(owner = "client!alt", name = "l", descriptor = "(I)V", line = 14)
	@Override
	void method14912() {
		@Pc(3) Class93_Sub23 local3 = this.method14929();
		if (local3 == null) {
			return;
		}
		@Pc(11) int local11 = this.method14904(local3, 32767);
		@Pc(15) int local15 = local3.method22874();
		if (local15 < 0) {
			local15 = 0;
		} else if (local15 > 65535) {
			local15 = 65535;
		}
		@Pc(29) int local29 = local3.method22873();
		if (local29 < 0) {
			local29 = 0;
		} else if (local29 > 65535) {
			local29 = 65535;
		}
		@Pc(41) byte local41 = 0;
		if (local3.method22890() == 2) {
			local41 = 1;
		}
		@Pc(54) Class93_Sub22 local54 = Class102.method2592(Class446.aClass446_47, client.aClass175_2.aClass24_2);
		local54.aClass93_Sub41_Sub2_1.method22395(local29 | local15 << 16);
		local54.aClass93_Sub41_Sub2_1.method22456(local11 | local41 << 15);
		client.aClass175_2.method24351(local54);
	}

	@OriginalMember(owner = "client!alt", name = "p", descriptor = "()V", line = 14)
	@Override
	void method14910() {
		@Pc(3) Class93_Sub23 local3 = this.method14929();
		if (local3 == null) {
			return;
		}
		@Pc(11) int local11 = this.method14904(local3, 32767);
		@Pc(15) int local15 = local3.method22874();
		if (local15 < 0) {
			local15 = 0;
		} else if (local15 > 65535) {
			local15 = 65535;
		}
		@Pc(29) int local29 = local3.method22873();
		if (local29 < 0) {
			local29 = 0;
		} else if (local29 > 65535) {
			local29 = 65535;
		}
		@Pc(41) byte local41 = 0;
		if (local3.method22890() == 2) {
			local41 = 1;
		}
		@Pc(54) Class93_Sub22 local54 = Class102.method2592(Class446.aClass446_47, client.aClass175_2.aClass24_2);
		local54.aClass93_Sub41_Sub2_1.method22395(local29 | local15 << 16);
		local54.aClass93_Sub41_Sub2_1.method22456(local11 | local41 << 15);
		client.aClass175_2.method24351(local54);
	}

	@OriginalMember(owner = "client!alt", name = "d", descriptor = "()V", line = 14)
	@Override
	void method14911() {
		@Pc(3) Class93_Sub23 local3 = this.method14929();
		if (local3 == null) {
			return;
		}
		@Pc(11) int local11 = this.method14904(local3, 32767);
		@Pc(15) int local15 = local3.method22874();
		if (local15 < 0) {
			local15 = 0;
		} else if (local15 > 65535) {
			local15 = 65535;
		}
		@Pc(29) int local29 = local3.method22873();
		if (local29 < 0) {
			local29 = 0;
		} else if (local29 > 65535) {
			local29 = 65535;
		}
		@Pc(41) byte local41 = 0;
		if (local3.method22890() == 2) {
			local41 = 1;
		}
		@Pc(54) Class93_Sub22 local54 = Class102.method2592(Class446.aClass446_47, client.aClass175_2.aClass24_2);
		local54.aClass93_Sub41_Sub2_1.method22395(local29 | local15 << 16);
		local54.aClass93_Sub41_Sub2_1.method22456(local11 | local41 << 15);
		client.aClass175_2.method24351(local54);
	}

	@OriginalMember(owner = "client!alt", name = "u", descriptor = "(I)Z", line = 34)
	@Override
	boolean method14914() {
		return this.method14929() != null || this.aLong106 * -1130360274060180351L < Class305.method26796() - 2000L;
	}

	@OriginalMember(owner = "client!alt", name = "c", descriptor = "()Z", line = 34)
	@Override
	boolean method14900() {
		return this.method14929() != null || this.aLong106 * -1130360274060180351L < Class305.method26796() - 2000L;
	}

	@OriginalMember(owner = "client!alt", name = "ag", descriptor = "()Lclient!akm;", line = 38)
	Class93_Sub23 method14925() {
		return (Class93_Sub23) client.aClass22_45.method445();
	}

	@OriginalMember(owner = "client!alt", name = "j", descriptor = "()Lclient!akm;", line = 38)
	Class93_Sub23 method14926() {
		return (Class93_Sub23) client.aClass22_45.method445();
	}

	@OriginalMember(owner = "client!alt", name = "ah", descriptor = "()Lclient!akm;", line = 38)
	Class93_Sub23 method14927() {
		return (Class93_Sub23) client.aClass22_45.method445();
	}

	@OriginalMember(owner = "client!alt", name = "t", descriptor = "()Lclient!akm;", line = 38)
	Class93_Sub23 method14928() {
		return (Class93_Sub23) client.aClass22_45.method445();
	}

	@OriginalMember(owner = "client!alt", name = "i", descriptor = "(I)Lclient!akm;", line = 38)
	Class93_Sub23 method14929() {
		return (Class93_Sub23) client.aClass22_45.method445();
	}

	@OriginalMember(owner = "client!alt", name = "ae", descriptor = "()Lclient!akm;", line = 38)
	Class93_Sub23 method14930() {
		return (Class93_Sub23) client.aClass22_45.method445();
	}

	@OriginalMember(owner = "client!alt", name = "r", descriptor = "()Lclient!akl;", line = 43)
	@Override
	Class93_Sub22 method14913() {
		return Class102.method2592(Class446.aClass446_99, client.aClass175_2.aClass24_2);
	}

	@OriginalMember(owner = "client!alt", name = "z", descriptor = "(S)Lclient!akl;", line = 43)
	@Override
	Class93_Sub22 method14909() {
		return Class102.method2592(Class446.aClass446_99, client.aClass175_2.aClass24_2);
	}

	@OriginalMember(owner = "client!alt", name = "w", descriptor = "(Lclient!alw;Lclient!akm;I)V", line = 46)
	@Override
	void method14906(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23 arg1) {
	}

	@OriginalMember(owner = "client!alt", name = "o", descriptor = "(Lclient!alw;Lclient!akm;)V", line = 46)
	@Override
	void method14915(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23 arg1) {
	}

	@OriginalMember(owner = "client!alt", name = "s", descriptor = "(Lclient!alw;Lclient!akm;)V", line = 46)
	@Override
	void method14916(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23 arg1) {
	}

	@OriginalMember(owner = "client!alt", name = "f", descriptor = "(I)I", line = 49)
	@Override
	int method14905() {
		return 0;
	}

	@OriginalMember(owner = "client!alt", name = "v", descriptor = "()I", line = 49)
	@Override
	int method14901() {
		return 0;
	}
}
