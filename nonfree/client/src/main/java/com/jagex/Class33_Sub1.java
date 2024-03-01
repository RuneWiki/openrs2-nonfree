package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adf")
public class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!adf", name = "l", descriptor = "I")
	int anInt823 = 0;

	@OriginalMember(owner = "client!adf", name = "<init>", descriptor = "(Lclient!ny;Lclient!aer;)V", line = 11)
	Class33_Sub1(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class49_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!adf", name = "a", descriptor = "(ZI)V", line = 15)
	@Override
	public void method24606(@OriginalArg(0) boolean arg0) {
		@Pc(17) int local17 = this.aClass49_2.aClass277_6.method25394(this.aClass6_5.method16772(), client.anInt3032 * 581921171) + this.aClass49_2.anInt1018 * -1445052455;
		@Pc(35) int local35 = this.aClass49_2.aClass276_6.method25383(this.aClass6_5.method16779(), client.anInt3131 * -645382887) + this.aClass49_2.anInt1019 * -1782123231;
		this.aClass6_5.method16792((float) (local17 + this.aClass6_5.method16772() / 2), (float) (local35 + this.aClass6_5.method16779() / 2), 4096, this.anInt823 * -1918493091);
		this.anInt823 += ((Class49_Sub1) this.aClass49_2).anInt1020 * 1927146809;
	}

	@OriginalMember(owner = "client!adf", name = "l", descriptor = "(Z)V", line = 15)
	@Override
	public void method24605(@OriginalArg(0) boolean arg0) {
		@Pc(17) int local17 = this.aClass49_2.aClass277_6.method25394(this.aClass6_5.method16772(), client.anInt3032 * 581921171) + this.aClass49_2.anInt1018 * -1445052455;
		@Pc(35) int local35 = this.aClass49_2.aClass276_6.method25383(this.aClass6_5.method16779(), client.anInt3131 * -645382887) + this.aClass49_2.anInt1019 * -1782123231;
		this.aClass6_5.method16792((float) (local17 + this.aClass6_5.method16772() / 2), (float) (local35 + this.aClass6_5.method16779() / 2), 4096, this.anInt823 * -1918493091);
		this.anInt823 += ((Class49_Sub1) this.aClass49_2).anInt1020 * 1927146809;
	}
}
